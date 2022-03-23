package com.adviters.enums;

public enum Gender {
    H("Hombre"), M("Mujer");
    private final String desc;
    Gender(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
