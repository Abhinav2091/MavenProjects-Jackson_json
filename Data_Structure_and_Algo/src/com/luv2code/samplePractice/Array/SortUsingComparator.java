package com.luv2code.samplePractice.Array;

import com.luv2code.samplePractice.commanService.Utility;

import java.util.*;

class Student {
    int rollNo;
    String name;
    String address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("rollNo=" + rollNo)
                .add("name='" + name + "'")
                .add("address='" + address + "'")
                .toString();
    }
}


class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b) {
        return a.rollNo - b.rollNo;
    }
}

class Sortbyname implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll name
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

public class SortUsingComparator {

    public static  void main(String ar[])
    {
        List<Student> studentArray = new ArrayList<>();
        studentArray.add(new Student(111, "bbbb", "london"));
        studentArray.add(new Student(131, "aaaa", "nyc"));
        studentArray.add(new Student(121, "cccc", "jaipur"));

        //Collections.sort(studentArray, new Sortbyroll());
        Collections.sort(studentArray, new Sortbyname());
        Utility.show(studentArray);
    }
}
