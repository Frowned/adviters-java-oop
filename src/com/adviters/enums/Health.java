package com.adviters.enums;

public enum Health {
    FINE("Bien"),
    WARNING("Cuidado"),
    DANGER("Peligro");

    private final String desc;

    Health(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
