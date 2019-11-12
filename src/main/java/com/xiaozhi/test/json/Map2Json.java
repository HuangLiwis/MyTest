package com.xiaozhi.test.json;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import javax.sound.midi.Soundbank;

/**
 * Created by huangzh on 2018/4/4.
 */
public class Map2Json {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap();
        Map<String, Object> sonMap = new HashMap<>();
        Map<String, Object> son2Map = new HashMap<>();
        son2Map.put("son2key","value");
        sonMap.put("key", "value");
        sonMap.put("son2key",son2Map);
        map.put("father", sonMap);
        String a = new Gson().toJson(map);
        new Gson();
        System.out.println(a);
    }

}
