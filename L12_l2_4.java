package com.javarush.task.task12.task1204;

/* 
�� �� �����, �� �� �����
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //�������� ��� ���� �������
        if (o instanceof Cat) System.out.println("�����");
        if (o instanceof Bird) System.out.println("�����");
        if (o instanceof Dog) System.out.println("������");
        if (o instanceof Lamp) System.out.println("�����");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}