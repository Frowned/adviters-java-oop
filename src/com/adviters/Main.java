package com.adviters;

import com.adviters.enums.Gender;
import com.adviters.enums.Health;
import com.adviters.model.Inventory;
import com.adviters.model.PlayableCharacter;
import java.util.Scanner;

public class Main {

    public static int validateAge(Scanner scanner){
        System.out.println("Por favor ingrese una edad válida: ");
        int age = scanner.nextInt();
        if(age > 18 && age < 50) {
            return age;
        }
        else
        {
            // llamo a la misma función
            return validateAge(scanner);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var inventory = new Inventory();
        double height = 0;

        // vamos a hacer las validaciones de distintas formas, la primera la haremos con un do while
        do {
            System.out.println("Por favor ingrese una altura válida: ");
            height = scanner.nextDouble();
        } while (height > 1.85 || height < 1.45);

        // vamos a validar la edad con una función recursiva
        int age = validateAge(scanner);
	    var myCharacter = new PlayableCharacter("Lautaro", age, Gender.H, height, 120, new Inventory(), Health.FINE);
        myCharacter.showCharacterInfo();
        myCharacter.getInventory().showInventory();
        myCharacter.showHealth();

        /*
            Resultado:
            Nombre: Lautaro
            Edad: 25
            Género: Hombre
            Peso: 120
            Altura: 1.84
            Salud: Bien
            Nombre: Old key, cantidad: 1, es reutilizable?: No
            Nombre: Ink ribbon, cantidad: 5, es reutilizable?: No
            Nombre: Green Herb, cantidad: 3, porcentaje: 35
            Nombre: Survival knife, cantidad: 1, categoría: Arma blanca, capacidad: 1
            La salud de Lautaro es Bien
         */
    }
}
