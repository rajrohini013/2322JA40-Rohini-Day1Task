package day5;

import java.util.*;

public class StudentAverage {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Ram", 80);
        marks.put("Sita", 90);
        marks.put("Ravi", 70);

        int total = 0;
        for (int m : marks.values()) {
            total += m;
        }

        double avg = (double) total / marks.size();

        System.out.println("Average marks = " + avg);
    }
}
