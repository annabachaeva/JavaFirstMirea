package ru.mirea.task5.Dish;

public abstract class Dish {
    private String title;
    private String appointment;

    public String getTitle() {
        return title;
    }
    public String getAppointment() {
        return appointment;
    }
    public Dish(String title, String appointment) {
        this.title = title;
        this.appointment = appointment;
    }
    public abstract void showInf();
}

class Material extends Dish {
    private String name_material;
    public Material(String title, String appointment, String name_material) {
        super(title, appointment);
        this.name_material = name_material;
    }
    public void showInf() {
        System.out.println("Название: " + super.getTitle() + "Назначение: "
                + super.getAppointment() + "Материал: " + name_material);
    }
}

class Eco extends Dish {
    private String eco_friends;
    public Eco(String title, String appointment, String eco_friends) {
        super(title, appointment);
        this.eco_friends = eco_friends;
    }
    public void showInf() {
        System.out.println("Название: " + super.getTitle() + "Назначение: "
                + super.getAppointment() + "Экологичность: " + eco_friends);
    }
}