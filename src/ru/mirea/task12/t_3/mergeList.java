package ru.mirea.task12.t_3;

import java.util.Arrays;
import java.awt.*;

import java.util.Iterator;


public class mergeList {
    private Student[] OneList() {
        Student[] list_1 = new Student[4];
        list_1[0] = new Student(6, "Frank", 92);
        list_1[1] = new Student(2, "Genry", 45);
        list_1[2] = new Student(8, "Lily", 87);
        list_1[3] = new Student(3, "Celine", 99);
        return list_1;
    }
    private Student[] TwoList() {
        Student[] list_2 = new Student[4];
        list_2[0] = new Student(5, "Des", 66);
        list_2[1] = new Student(1, "Kolin", 90);
        list_2[2] = new Student(4, "Viki", 89);
        list_2[3] = new Student(5, "Leo", 67);
        return list_2;
    }
    public Student[] merge() {
        Student[] list_1 = OneList();
        Student[] list_2 = TwoList();
        Student[] list = new Student[list_1.length + list_2.length];
        for(int i = 0; i < list_1.length; i++)
            list[i] = list_1[i];
        for (int i = 0; i < list_2.length; i++)
            list[i + list_2.length] = list_2[i];
        return list;
    }
    public void MergeSort(Student[] arr, int start, int end) {

        if (end <= start)
            return;
        int mid = start + (end - start) / 2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid + 1, end);

        Student[] buf = Arrays.copyOf(arr, arr.length);

        for (int k = start; k <= end; k++)
            buf[k] = arr[k];

        int i = start, j = mid + 1;
        for (int k = start; k <= end; k++) {

            if (i > mid) {
                arr[k] = buf[j];
                j++;
            } else if (j > end) {
                arr[k] = buf[i];
                i++;
            } else if (buf[j].getID() < buf[i].getID()) {
                arr[k] = buf[j];
                j++;
            } else {
                arr[k] = buf[i];
                i++;
            }
        }
    }
    public void Test() {
        Student[] arr = merge();
        System.out.println("Lets display an array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        MergeSort(arr, 0, arr.length-1);
        System.out.println("After merge sort: ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main (String[] args) {
        mergeList l = new mergeList();
        l.Test();
    }
}

