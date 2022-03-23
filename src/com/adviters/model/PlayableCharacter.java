package com.adviters.model;

import com.adviters.enums.Gender;
import com.adviters.enums.Health;

public class PlayableCharacter {
    private String name;
    private int age;
    // por defecto asignamos género masculino
    private Gender gender = Gender.H;
    private double height;
    private int weight;
    // por defecto asignamos FINE
    private Health health = Health.FINE;
    private Inventory inventory;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Health getHealth() {
        return health;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public PlayableCharacter(String name, int age, Gender gender, double height, int weight, Inventory inventory, Health health)
    {
        setName(name);
        setAge(age);
        setGender(gender);
        setHealth(health);
        setHeight(height);
        setWeight(weight);
        setInventory(inventory);
    }

    public PlayableCharacter(String name, int age, double height, int weight, Inventory inventory)
    {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setInventory(inventory);
    }

    public void showHealth()
    {
        // utilizamos la función format de la libreria String
        System.out.println(String.format("La salud de %s es %s", this.getName(), this.getHealth().getDesc()));
    }

    public void showCharacterInfo()
    {
        System.out.printf("Nombre: %s%n", this.getName());
        System.out.printf("Edad: %s%n", this.getAge());
        System.out.printf("Género: %s%n", this.getGender().getDesc());
        System.out.printf("Peso: %s%n", this.getWeight());
        System.out.printf("Altura: %s%n", this.getHeight());
        System.out.printf("Salud: %s%n", this.getHealth().getDesc());
    }
}
