package com.adviters.model;

import com.adviters.enums.WeaponCategory;
import com.adviters.model.item.HealthItem;
import com.adviters.model.item.Item;
import com.adviters.model.item.KeyItem;
import com.adviters.model.item.WeaponItem;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> itemList;

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public Inventory() {
        // en el constructor agrego 4 items por defecto
        var oldKey = new KeyItem("Old key", 1, false);
        var inkRibbon = new KeyItem("Ink ribbon", 5, false);
        var greenHerb = new HealthItem("Green Herb", 3, 35);
        var survivalKnife = new WeaponItem("Survival knife", 1, 1, WeaponCategory.COLD_WEAPON);
        this.itemList = new ArrayList<Item>();
        itemList.add(oldKey);
        itemList.add(inkRibbon);
        itemList.add(greenHerb);
        itemList.add(survivalKnife);
    }

    public void showInventory() {
        itemList.forEach(x -> x.showItemInfo());
    }

}
