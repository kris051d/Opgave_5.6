package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 0, b = 0, c = 0;
        double x;

        Scanner scan_a = new Scanner(System.in);
        Scanner scan_b = new Scanner(System.in);
        Scanner scan_c = new Scanner(System.in);
        if(!scan_a.hasNextInt()){
            String word = scan_a.next();
            System.err.println(word + " is not a number, restart the program.");
            System.exit(0);
        } else {
            a = scan_a.nextInt();
        }
        if(!scan_b.hasNextInt()){
            String word = scan_b.next();
            System.err.println(word + " is not a number, restart the program.");
            System.exit(0);
        } else {
            b = scan_b.nextInt();
        }
        if(!scan_c.hasNextInt()){
            String word = scan_c.next();
            System.err.println(word + " is not a number, restart the program.");
            System.exit(0);
        } else {
            c = scan_c.nextInt();
        }

        double quadratic = Math.pow(b, 2) - 4 * a * c;

        if (Math.sqrt(quadratic)>0){
            x = ((-b+Math.sqrt(quadratic))/(2*a));
            System.out.println(x);
            x = ((-b-Math.sqrt(quadratic))/(2*a));
            System.out.println(x);
        }
        else if(Math.sqrt(quadratic)==0){
            x = (float)-b/2*a;
            System.out.println(x);
        }
            else{
                System.out.println("The numbers dont apply to the rule Specifically, it should not divide by zero or take the square root of a negative number");
            }
        }
    }
