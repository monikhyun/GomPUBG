package com.mih.pubgproject.domain;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    private static final Map<String, String> mapNameMapping = new HashMap<>();

    static {
        mapNameMapping.put("Erangel_Main", "Erangel");
        mapNameMapping.put("Desert_Main", "Miramar");
        mapNameMapping.put("Savage_Main", "Sanhok");
        mapNameMapping.put("DihorOtok_Main", "Vikendi");
        mapNameMapping.put("Taego_Main", "Taego");
        mapNameMapping.put("Kiki_Main", "Deston");
    }
    public static String getMapName(String mapCode) {
        return mapNameMapping.getOrDefault(mapCode, "Unknown Map");
    }
}
