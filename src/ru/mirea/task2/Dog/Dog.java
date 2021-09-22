package ru.mirea.task2.Dog;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name){
        this.name = name;
        age = 0;
    }
    public Dog(){
        name = "Lack";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return "Кличка собаки: "+this.name+"; возраст: "+this.age;
    }
    public void intoHumanAge(){
        System.out.println("Возраст собаки по кличке "+name+" по 'человеческим' годам равен "+age*7+" годам");
    }
}

