package com.javarush.task.task04.task0403;

/* 
��� ����� ����?
*/

public class Cat {
    private String name = "���������� ���";

    public void setName(String name) {
        //�������� ��� ��� ���
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("�����");
        System.out.println(cat.name);
    }
}