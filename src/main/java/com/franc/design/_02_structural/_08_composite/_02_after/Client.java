package com.franc.design._02_structural._08_composite._02_after;

public class Client {

    public static void main(String[] args) {
        // 아이템 및 포션 셋팅
        Item blade = new Item("집행검", 4000);
        Potion potion = new Potion("물약", 200);

        // 가방 셋팅 => 아이템과 포션 등... 모든 Leaf 클래스를 담을 수 있다.
        Bag bag = new Bag();
        bag.add(blade);
        bag.add(potion);

        Client client = new Client();
        client.print(blade);   // 아이템의 가격 출력
        client.print(bag);     // 내 가방안의 가격 합을 출력

    }

    // 가격을 출력 => Leaf, Composite 구분없이 동일한 타입으로 취급한다.
    public void print(Component component) {
        System.out.println(component.getPrice());
    }
}
