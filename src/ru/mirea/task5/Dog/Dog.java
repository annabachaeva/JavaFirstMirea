package ru.mirea.task5.Dog;

public abstract class Dog {
    private String title;
    private String age;

    public String getTitle() {
        return title;
    }
    public String getAge() {
        return age;
    }
    public Dog(String title, String age) {
        this.title = title;
        this.age = age;
    }
    public abstract void showInf();
}

class Labrador extends Dog {
    private String poroda_labrador = "labrador";
    public Labrador(String title, String age, String poroda_labrador) {
        super(title, age);
        this.poroda_labrador = poroda_labrador;
    }
    public void showInf() {
        System.out.println("Name: " + super.getTitle() + "Age: "
                + super.getAge() + "Breed: " + poroda_labrador);
    }
}

class Bigle extends Dog {
    private String poroda_bigle = "bigle";
    public Bigle(String title, String age, String poroda_bigle) {
        super(title, age);
        this.poroda_bigle = poroda_bigle;
    }
    public void showInf() {
        System.out.println("Name: " + super.getTitle() + "Age: "
                + super.getAge() + "Breed: " + poroda_bigle);
    }
}
