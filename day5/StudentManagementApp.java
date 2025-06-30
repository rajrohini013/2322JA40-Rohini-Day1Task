package day5;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        
        Iterator<String> itr = students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
