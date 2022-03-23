package com.adviters.enums;

public enum WeaponCategory {
    HEAVY_WEAPON("Arma pesada"),
    COLD_WEAPON("Arma blanca"),
    PRIMARY_WEAPON("Arma primaria"),
    SECONDARY_WEAPON("Arma secundaria");

    private final String desc;

    WeaponCategory(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
