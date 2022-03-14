package com.company;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calculation {
    public static void main(String[] args) throws IOException{

        float firstNumberArslan, secondNumberArslan, sum , subtraction, product, quotient;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum , difference , product and quotient for two numbers.");
        System.out.println("Enter the first number(and press Enter): ");
        firstNumberArslan= Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press Enter): ");
        secondNumberArslan= Float.parseFloat(br.readLine());

        sum = firstNumberArslan+ secondNumberArslan;
        subtraction = firstNumberArslan - secondNumberArslan;
        product= firstNumberArslan * secondNumberArslan;
        quotient = firstNumberArslan / secondNumberArslan ;

        System.out.printf("You've entered two numbers , the first is : " + "%2.2f" , firstNumberArslan);
        System.out.printf(" and the Second number is: " + "%2.2f" , secondNumberArslan);


        System.out.println(); //blank area

        System.out.printf("Sum = " + "%2.2f, \n", + sum);
        System.out.printf("Difference = " + "%2.2f, \n", + subtraction);
        System.out.printf("Product = " + "%2.2f, \n", + product);
        System.out.printf("Quotient = " + "%2.2f, \n", +  quotient);

    }

}
