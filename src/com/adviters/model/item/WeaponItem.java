package com.adviters.model.item;

import com.adviters.enums.WeaponCategory;

public class WeaponItem extends Item {
    private int capacity;
    private WeaponCategory category;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCategory(WeaponCategory category) {
        this.category = category;
    }

    public WeaponCategory getCategory() {
        return category;
    }

    public int getCapacity() {
        return capacity;
    }

    public WeaponItem(String name, int quantity, int capacity, WeaponCategory category) {
        super(name, quantity);
        setCapacity(capacity);
        setCategory(category);
    }

    @Override
    public void showItemInfo() {
        System.out.println("Nombre: " + this.getName() + ", cantidad: " + this.getQuantity() +
                ", categoría: " + this.getCategory().getDesc() + ", capacidad: " + this.getCapacity());
    }
}
