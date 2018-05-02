package com.github.koraxiss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum PacketType {
    _OPEN,
    _CLOSE,

    _OPEN_ENCR,
    _PUBLIC_KEY,
    _SYMMETRIC_KEY,
    _TEST_KEY,

    _OPEN_PROT,
    _SET_NAME,
    _ADD_CLIENT,
    _NEW_CLIENT,
    _REMOVE_CLIENT,
    _REMOVE_MY_CLIENT,
    _MY_LOCATION,
    _LOCATION,
    _ACK_OK,
    _ACK_ERR,
    _ALIVE;

    public static Map<Integer, PacketType> packetTypeMap = new HashMap<>();

    static {
        Map<Integer, PacketType> map = new HashMap<>();
        map.put(0, PacketType._OPEN);
        map.put(1, PacketType._CLOSE);

        map.put(2, PacketType._OPEN_ENCR);
        map.put(3, PacketType._PUBLIC_KEY);
        map.put(4, PacketType._SYMMETRIC_KEY);
        map.put(5, PacketType._TEST_KEY);

        map.put(6, PacketType._OPEN_PROT);
        map.put(7, PacketType._SET_NAME);
        map.put(8, PacketType._ADD_CLIENT);
        map.put(9, PacketType._NEW_CLIENT);
        map.put(10, PacketType._REMOVE_CLIENT);
        map.put(11, PacketType._REMOVE_MY_CLIENT);
        map.put(12, PacketType._MY_LOCATION);
        map.put(13, PacketType._LOCATION);
        map.put(14, PacketType._ACK_OK);
        map.put(15, PacketType._ACK_ERR);
        map.put(16, PacketType._ALIVE);

        packetTypeMap = Collections.unmodifiableMap(map);
    }
}