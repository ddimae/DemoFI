package demofinctinterfaces;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 5;
        int b = 10;
        System.out.println(sum(a, b));
        System.out.println(sum(7, -3));
        System.out.println(sum(3.2, 4.5));

        double[] arr = new double[]{-1.5, 2., -3.9};

        //#1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Math.sqrt(arr[i]));
        }
        //#2
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Math.pow(arr[i], 2));
        }
        //#3
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Math.ceil(arr[i]));
        }

        obrabotkaArray(arr,x->Math.sqrt(x));
        obrabotkaArray(arr,x->Math.abs(x));
        obrabotkaArray(arr,x->Math.ceil(x));
        obrabotkaArray(arr,x->Math.floor(x));
        obrabotkaArray(arr,x->Math.pow(x,2));

    }

    static double sum(double a, double b) {
        return a + b;
    }

    static void obrabotkaArray(double[] arr, UnaryOperator<Double> myOper) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(myOper.apply(arr[i]));
        }
    }


}