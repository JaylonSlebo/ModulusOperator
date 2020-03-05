package com.LickingHeights;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        testOddness();
        keepContained();
        lastdigit();







    }



     public static void testOddness() {

         int number;

         Scanner keyboard;
         keyboard = new Scanner(System.in);
         System.out.println("Type in any positive number");
         number = keyboard.nextInt();
         System.out.println(number + " is odd: " + (number % 2 != 0));


     }

            public static void keepContained(){


        int number;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.println("Type in any positive number");
        number = keyboard.nextInt();

        System.out.println("Number contained is: " + ((number%8)+5));












        }

        public static void lastdigit () {

        int number;
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        System.out.println("Type in a 4 digit number");
        number= keyboard.nextInt();
        System.out.println("The last digit of "+number + "is "+ number%10);





















        }}

