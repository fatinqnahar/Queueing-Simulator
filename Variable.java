/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pkg2;

/**
 *
 * @author user
 */
public class Variable {
    public static int C1=100, C2=200, C3=300;
    public static int [] W = new int [41];
    public static int [] c = new int [4];
    public static int [] Number = new int [5];
    public static int [] Counter = new int [5];
    public static int choice=1;
    public static int counter1=1;
    public static int counter2=1;
    public static int counter3=1;
    public static int counter4=1;
    private static int counter;
  
    public  int counter(){
    counter++;
    return counter;
    }
    
    public void reset (){
        counter=0;
    }
    
    public void quenumber(int x){
        System.out.println("---------------------------------------");
        System.out.printf("|               %d                    |\n", x);
        System.out.println("| Your number will be called in awhile.|");
        System.out.println("|             Please wait.             |");
        System.out.println("---------------------------------------");
    }
}

