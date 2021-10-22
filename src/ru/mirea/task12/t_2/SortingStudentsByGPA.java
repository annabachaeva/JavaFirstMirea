package ru.mirea.task12.t_2;

import java.util.Comparator;
import java.lang.*;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{
    private String name;
    private int ball;
    public String getName() {
        return name;
    }
    public int getBall() {
        return ball;
    }
    public SortingStudentsByGPA(String name, int ball) {
        this.name = name;
        this.ball = ball;
    }
    //@Override
    public int compareTo(SortingStudentsByGPA ssbg) {
        return (this.ball - ssbg.ball);
    }
    @Override
    public String toString() {
        return "Name = " + this.name + ", Ball = " + this.ball;
    }
    public static Comparator<SortingStudentsByGPA> BallComparator = new Comparator<SortingStudentsByGPA>() {
        @Override
        public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
            return o1.getBall() > o2.getBall() ? -1 :(o1.getBall() < o2.getBall() ? 1 : 0);
        }
    };
}
