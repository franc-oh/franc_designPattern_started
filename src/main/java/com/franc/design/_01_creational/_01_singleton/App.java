package com.franc.design._01_creational._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        // Settings1 Test
        Settings1 settings11 = Settings1.getInstance();
        Settings1 settings12 = Settings1.getInstance();
        System.out.println(settings11 == settings12);

        // Settings2 Test
        Settings2 settings21 = Settings2.getInstance();
        Settings2 settings22 = Settings2.getInstance();
        System.out.println(settings21 == settings22);

        // Settings3 Test
        Settings3 settings31 = Settings3.getInstance();
        Settings3 settings32 = Settings3.getInstance();
        System.out.println(settings31 == settings32);

        // Settings4 Test
        Settings4 settings41 = Settings4.getInstance();
        Settings4 settings42 = Settings4.getInstance();
        System.out.println(settings41 == settings42);

        // Settings5 Test
        Settings5 settings51 = Settings5.getInstance();
        Settings5 settings52 = Settings5.getInstance();
        System.out.println(settings51 == settings52);

        // 싱글톤 깨기 1.리플렉션
        Constructor<Settings5> constructor = Settings5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings5 settings53 = constructor.newInstance();

        Settings5 settings54 = Settings5.getInstance();
        System.out.println(settings53 == settings54); // false

        // 싱글톤 깨기 2.직렬화/역직렬화
        Settings6 settings61 = Settings6.getInstance();
        Settings6 settings62;

        // 직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings61);
        }

        // 역직렬화
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings62 = (Settings6) in.readObject();
        }

        System.out.println(settings61 == settings62); // false




        // 안깨지는 싱글톤 - enum 1.리플렉션
        Settings7 settings71 = null;
        Constructor<?>[] declaredConstructors = Settings7.class.getDeclaredConstructors();
        for (Constructor<?> constructor1 : declaredConstructors) {
            constructor1.setAccessible(true);
            settings71 = (Settings7) constructor1.newInstance("INSTANCE");
        }

        Settings7 settings72 = Settings7.INSTANCE;
        System.out.println(settings71 == settings72); // 예외발생 (Cannot reflectively create enum objects)

        /// 안깨지는 싱글톤 - enum 2.직렬화/역직렬화
        Settings7 settings73 = Settings7.INSTANCE;
        Settings7 settings74;

        // 직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings2.obj"))) {
            out.writeObject(settings73);
        }

        // 역직렬화
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings2.obj"))) {
            settings74 = (Settings7) in.readObject();
        }

        System.out.println(settings73 == settings74); // true


        Runtime runtime = Runtime.getRuntime();

    }
}
