/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bud.calculator;

import java.util.Scanner;

/**
 *
 * @author Wacan_CPE112
 */
public class BudCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Bud caclulator");
        System.out.println("Enter a Number");
        
        int bud1 =input.nextInt();
        String operation = input.next();
        int bud2 = input.nextInt();
        
        while (bud1+bud2 !=0){
            
            if (operation.equals("+")){
              System.out.println("answer=" + (bud1+bud2));}
            
            else if (operation.equals("-")){
              System.out.println("answer=" + (bud1-bud2));}
            
            else if (operation.equals("*")){
              System.out.println("answer=" + (bud1*bud2));}
            
            else if (operation.equals("/")){
              System.out.println("answer=" + (bud1/bud2));}
            
            else {
                System.out.println("Math error");
                
                
            }
            break;
        }
    }
    
}
