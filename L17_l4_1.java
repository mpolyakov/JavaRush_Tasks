package com.javarush.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
������������������ �������
*/

public class Solution {

    public static void main(String[] args) {
        

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("������ ����� ��������� ������� [" + note + "] �� ������� " + index);
            synchronized (notes){
                notes.add(index, note);
            }
            System.out.println("��� ��������� ������� [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("������ ����� ������� ������� � ������� " + index);
            String note;
            synchronized (notes){
                note = notes.remove(index);
            }
            System.out.println("��� ������� ������� [" + note + "] � ������� " + index);
        }
    }

}
