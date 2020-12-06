package com.eldus;


import java.util.Random;

public class Main {

    public static int[] squareSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
        bubbleSort(arr);
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static boolean validator(String jewels, String stones) {
        char[] charArray = jewels.toCharArray();
        if (!jewels.matches("[A-Za-z]+") || !stones.matches("[A-Za-z]+")) {
            return false;                                                           //Проверка на A..Za..z
        }
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {    //Проверка
                if (charArray[i] == charArray[j]) {             //Символов
                    return false;                               //На уникальность
                }
            }
        }
        return true;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        validator(jewels, stones);
        int numJewels = 0;
        for (char c1 : stones.toCharArray()) {
            for (char c2 : jewels.toCharArray()) {
                if (c1 == c2) {
                    numJewels++;
                    break;
                }
            }
        }
        return numJewels;
    }

    public static void main(String[] args) {
        //Задание с гитом
        System.out.println("Hello World");
        int k;
        k = 10;
        String s;
        String d;
        //----------------
        System.out.println(numJewelsInStones("aAbc", "caсAcA"));
        //----------------
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) - 50;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        squareSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
