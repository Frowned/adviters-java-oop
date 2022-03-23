package com.adviters.model.item;

public class HealthItem extends Item {
    private int percent;

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public HealthItem(String name, int quantity, int percent) {
        // estamos asignándole nombre y cantidad al constructor de item.
        super(name, quantity);
        setPercent(percent);
    }

    @Override
    public void showItemInfo() {
        System.out.println("Nombre: " + this.getName() + ", cantidad: " + this.getQuantity() +
                ", porcentaje: " + this.getPercent());
    }
}
