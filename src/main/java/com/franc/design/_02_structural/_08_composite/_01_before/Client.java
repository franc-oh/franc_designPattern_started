package com.franc.design._02_structural._08_composite._01_before;

/** 클라이언트 코드 */
public class Client {
    public static void main(String[] args) {
        // 아이템 셋팅
        Item blade = new Item("집행검", 4000);
        Item potion = new Item("물약", 200);

        // 가방 셋팅
        Bag bag = new Bag();
        bag.addItem(blade);
        bag.addItem(potion);

        Client client = new Client();
        client.printPriceItem(blade);   // 아이템의 가격 출력
        client.printPriceBag(bag);      // 내 가방안의 가격 합을 출력
    }

    // => 공통된 처리방법도 객체가 다르니 따로 구현해야 한다.
    // => 만약 Item 외에 다른 단일 객체가 생긴다면??

    // 아이템의 가격 출력
    public void printPriceItem(Item item) {
        System.out.println(item.getPrice());
    }

    // 내 가방안의 가격 합을 출력
    public void printPriceBag(Bag bag) {
        System.out.println(bag.getPrice());
    }
}
