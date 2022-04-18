package com.franc.design._02_structural._11_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

/** 자주 변하는 필드를 캐싱 => FlyweightFactory */
public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    // 기존에 동일한 값이 없으면 캐싱, 있으면 캐싱된 값을 재사용
    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
