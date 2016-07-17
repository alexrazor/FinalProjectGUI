package com.goit.javaonline3.nod;

import java.util.Scanner;

public class Nod {
  
   public static int findNod(int firstNumber, int secondNumber) {
       int min;
       int nod = 0;
       
       if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
           min = Math.abs(secondNumber);
       } else {
           min = Math.abs(firstNumber);
       }

       for (int count = 1; count <= min; count++) {

            if(firstNumber % count == 0 && secondNumber % count == 0) {

                if (count > nod) {
                    nod = count;
                }
            }
        }
        return nod;
    }
}