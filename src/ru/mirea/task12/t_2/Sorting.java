package ru.mirea.task12.t_2;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        SortingStudentsByGPA[] sortArr = new SortingStudentsByGPA[4];
        sortArr[0] = new SortingStudentsByGPA("Dima", 97);
        sortArr[1] = new SortingStudentsByGPA("Anton", 100);
        sortArr[2] = new SortingStudentsByGPA("Ivan", 80);
        sortArr[3] = new SortingStudentsByGPA("Leonid", 88);
        Arrays.sort(sortArr, SortingStudentsByGPA.BallComparator);
        System.out.println("Comparator  по баллу:\n" + Arrays.toString(sortArr));
    }
}
