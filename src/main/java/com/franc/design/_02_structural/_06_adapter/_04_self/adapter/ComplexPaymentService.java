package com.franc.design._02_structural._06_adapter._04_self.adapter;

import com.franc.design._02_structural._06_adapter._04_self.adaptee.PointService;
import com.franc.design._02_structural._06_adapter._04_self.target.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ComplexPaymentService implements Payment {
    PointService pointService;
    List<Map<String, String>> dataList;

    public ComplexPaymentService(PointService pointService) {
        this.pointService = pointService;

        dataList = new ArrayList<>();
        Map<String, String> data = new HashMap<>();
        data.put("id", "user1");
        data.put("amount", "3500");
        dataList.add(data);

        data = new HashMap<>();
        data.put("id", "user2");
        data.put("amount", "5000");
        dataList.add(data);

        data = new HashMap<>();
        data.put("id", "user3");
        data.put("amount", "0");
        dataList.add(data);
    }

    @Override
    public int payment(String id, int price) {
        int remain = 0;
        int point = 0;

        point += pointService.getPoint(id);
        if(point > 0) {
            if(point >= price) {
                System.out.println("포인트 사용!!! - " + price);
                price = 0;
            } else {
                System.out.println("포인트 사용!!! - " + point);
                price -= point;
            }
        }

        remain = getAmount(id) - price;
        return remain;
    }

    @Override
    public int getAmount(String id) {
        int amount = 0;
        for (Map<String, String> resultMap : dataList) {
            if(resultMap.get("id").equals(id))
                amount = Integer.parseInt(resultMap.get("amount"));
        }
        return amount;
    }
}
