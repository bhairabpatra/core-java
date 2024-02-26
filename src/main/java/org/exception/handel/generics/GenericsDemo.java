package org.exception.handel.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo<T> {

    T name;

    public GenericsDemo(T data) {
        this.name = data;
    }

    public T  getName() {
        return name;
    }

    public static void main(String[] args) {

        GenericsDemo genericsDemo = new GenericsDemo("Bhairab");
        System.out.println(genericsDemo.getName());

        GenericsDemo genericsDemo1 = new GenericsDemo(22);
        System.out.println(genericsDemo1.getName());

        GenericsDemo genericsDemo2 = new GenericsDemo(22.5);
        System.out.println(genericsDemo2.getName());

        List<Integer> arrayList = Arrays.asList(2, 36, 6, 3, 7, 8);
        GenericsDemo genericsDemo3 = new GenericsDemo(arrayList);
        System.out.println(genericsDemo3.getName());

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("bhairab");
        arrayList1.add("muna");
        arrayList1.add("Runa");

        GenericsDemo genericsDemo4 = new GenericsDemo(arrayList1);
        System.out.println(genericsDemo4.getName());


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("muna", "12"));
        students.add(new Student("runa", "12"));
        students.add(new Student("kuna", "12"));


        GenericsDemo genericsDemo5 = new GenericsDemo(students);
        System.out.println(genericsDemo5.getName());

    }


}
