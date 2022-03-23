package com.adviters.model.item;

public class KeyItem extends Item {
    private boolean reusable;

    public KeyItem(String name, int quantity, boolean canReuse) {
        super(name, quantity);
        setReusable(canReuse);
    }

    public void setReusable(boolean reusable) {
        this.reusable = reusable;
    }

    public String isReusable() {
        return this.reusable ? "Si" : "No";
    }

    @Override
    public void showItemInfo() {
        System.out.println("Nombre: " + this.getName() + ", cantidad: " + this.getQuantity() +
                ", es reutilizable?: " + this.isReusable());
    }
}
