package ru.mirea.task13.MyList;

import java.lang.reflect.Array;

public class myList {
    public static void main(String[] args) {
        MyArr<Integer> arr = new MyArr<Integer>(Integer.class, 10);
        for(int i=0; i<10; i++){
            arr.add((int)(Math.random()*10));
        }
        System.out.println("Исходный список: " + arr.toString());

        System.out.println("Четвертый элемент списка равен: " + arr.get(4));

        arr.set(8, 5);
        System.out.println("Установливаем число 5 на 8 место: " + arr.toString());

        arr.remove(5);
        System.out.println("Удаляем элемент со значением 5: " + arr.toString());
    }
}


class MyArr<T> {
    private final int size;
    private int actual_size = 0;
    private final T[] array;

    public MyArr(Class<T> c, int size){
        this.size = size;
        array = (T[]) Array.newInstance(c, size);
    }

    public T get(int index){
        return array[index];
    }

    public int size(){
        return actual_size;
    }

    public void add(T item){
        int i = 0;
        while (i < size && array[i] != null){
            ++i;
        }
        if (size == i){
            System.out.println("Не достаточно места");
            return;
        }
        actual_size = i;

        array[i] = item;
    }

    public void set(int index, T item){
        array[index] = item;
    }

    public void remove(T item){
        int i = 0;
        while (i < size && array[i] != item){
            ++i;
        }

        if (size == i) {
            System.out.println("Элемент не надо");
            return;
        }

        if (size - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, size - 1 - i);

        array[size - 1] = null;
        actual_size--;

    }

    @Override
    public String toString() {
        String out = "[" + array[0];
        for(int i=1; i<actual_size; i++){
            out+=", " + array[i];
        }
        out+="]";
        return out;
    }
}