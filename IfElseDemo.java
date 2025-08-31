package yenipabka;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" eded daxil edin");
        double eded = sc.nextDouble();

        if (eded > 0) {
            System.out.println("eded musbettir");
        } else if (eded < 0) {
            System.out.println("eded menfidir");
        } else {
            System.out.println("eded sifira beraberdir");
        }
    }
}