package com.goit.javaonline3.nod;

import java.util.Scanner;

/**
 * Created by Ler4enko on 17.07.2016.
 */
public class CustomScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {

        while(true) {

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("You entered incorrect value. Please try again");
                scanner.next();
            }
        }
    }

    public static void close() {
        scanner.close();
    }

}
