package com.javarush.task.task12.task1205;

/* 
����������� � ��������
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //�������� ��� ���� �������
        if (o instanceof Cow) return "������";
        if (o instanceof Dog) return "������";
        if (o instanceof Whale) return "���";
        if (o instanceof Pig) return "����������� ��������";

        return "����������� ��������";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
