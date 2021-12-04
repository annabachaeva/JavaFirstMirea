package ru.mirea.task23;

public class Main {

    public static void main(String[] args) {

        BreedDog labrador = new BreedDog("Labrador", 60, 6);
        BreedDog pikines = new BreedDog("Pikines", 30, 3);
        BreedDog shepheard = new BreedDog("Shepheard", 60, 6);
        BreedDog dachshund = new BreedDog("Dachshund", 15, 4);
        BreedDog beagle = new BreedDog("Beagle", 30, 3);

        System.out.println("Объект 'labrador' равен объекту 'pikines' ?");
        System.out.println(labrador.equals(pikines));
        System.out.println("Объект 'labrador' равен объекту 'shepheard' ?");
        System.out.println(labrador.equals(shepheard));
        System.out.println("Объект 'pikines' равен объекту 'beagle' ?");
        System.out.println(pikines.equals(beagle));
        System.out.println("Объект 'dachshund' равен объекту 'beagle' ?");
        System.out.println(dachshund.equals(beagle));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(labrador.hashCode());
        System.out.println(pikines.hashCode());
        System.out.println(shepheard.hashCode());
        System.out.println(dachshund.hashCode());
        System.out.println(beagle.hashCode());
    }
}
