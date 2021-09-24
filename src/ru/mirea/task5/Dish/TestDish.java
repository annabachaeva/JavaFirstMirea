package ru.mirea.task5.Dish;

public class TestDish {
    public static void main(String[] args) {
        Material material = new Material("кастрюля ", "варка ", "алюминий ");
        material.showInf();
        Eco eco = new Eco("сковорода ", "жарка ", "многоразовая ");
        eco.showInf();
    }
}
