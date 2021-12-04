package ru.mirea.task23;

public class BreedDog {
    private String breed;
    private int size;
    private int year;

    public BreedDog(String breed, int size,int year) {
        this.breed = breed;
        this.size = size;
        this.year = year;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BreedDog that = (BreedDog) o;

        if (size != that.size) return false;
        return year == that.year;
    }

    @Override
    public int hashCode() {
        int result = breed == null ? 0 : breed.hashCode();
        result = 31 * result + size;
        result = 31 * result + year;
        return result;
    }
}


