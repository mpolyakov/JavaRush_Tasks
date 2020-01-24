//������ ���, ����� ������������ ������ Human ���� ���������.

package com.javarush.task.task20.task2006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

/* 
��� �������������?
*/
public class Solution  {
    public static class Human implements Serializable {
        public String name;
        public List<String> assets = new ArrayList<>();

        public Human()  {
        }

        public Human(String name, String... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
    }

    public static void main(String[] args) {

    }
}
