package com.franc.design._02_structural._06_adapter._04_self.adaptee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PointService {

    List<Map<String, String>> dataList;

    public PointService() {
        dataList = new ArrayList<>();
        Map<String, String> data = new HashMap<>();
        data.put("id", "user1");
        data.put("point", "500");
        dataList.add(data);

        data = new HashMap<>();
        data.put("id", "user2");
        data.put("point", "0");
        dataList.add(data);

        data = new HashMap<>();
        data.put("id", "user3");
        data.put("point", "5000");
        dataList.add(data);
    }



    public int getPoint(String id) {
        int point = 0;

        for (Map<String, String> resultMap : dataList) {
            if(resultMap.get("id").equals(id))
                point = Integer.parseInt(resultMap.get("point"));
        }

        return point;
    }
}
