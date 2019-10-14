package com.javarush.task.task15.task1503;

/* 
��� - �������
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public static void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public static void printlnDesire() {
            //add your code here
            
                System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
            
        }
    }

    public static class Constants {
        public static String WANT_STRING = "� ���� ������ �� ";
        public static String LUXURIOUS_CAR = "��������� ������";
        public static String CHEAP_CAR = "������� ������";
        public static String FERRARI_NAME = "�������";
        public static String LANOS_NAME = "������";
    }
    
    public static class LuxuriousCar {
        protected static void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
        
    }
    
    public static class CheapCar {
        private static void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }
}
