package com.adviters.model.item;

// hacemos la clase abstracta para que no puedan inicializarla
public abstract class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity)
    {
        setName(name);
        setQuantity(quantity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    // método abstracto, voy a sobreescribirlo en las clases hijas.
    public abstract void showItemInfo();

    public String getName() {
        return name;
    }
}
