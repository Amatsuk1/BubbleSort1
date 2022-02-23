package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int check = 0;
        System.out.println("Введите длину массива:");
        int dlina = in.nextInt();

        int[] field = new int[dlina];
        System.out.println("Введите " + field.length + " число/а/ел массива:");
        for(int i = 0; i < field.length; i++) {
            System.out.println("Введите число номер " + (i+1) + " :");
            field[i] = in.nextInt();
        }
        while (check < field.length){
            if (check == field.length - 1) {
                for(int i = 0; i < field.length; i++){
                    System.out.println("Число в массиве под номером "+(i+1)+" - "+field[i]);
                }
                System.exit(0);
            }
             else{
                if (field[check] > field[check + 1]) {
                    int tempVal1 = field[check];
                    int tempVal2 = field[check + 1];
                    field[check + 1] = tempVal1;
                    field[check] = tempVal2;
                    check = 0;
                }
                else {
                    check++;
                }
            }

        }

    }
}
