/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is your name?" );
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println( "Hello, " + name + ", nice to meet you!");
    }
}
