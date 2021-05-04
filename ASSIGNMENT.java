
package test.pkg2;

import static test.pkg2.Variable.C1;
import static test.pkg2.Variable.C2;
import static test.pkg2.Variable.C3;
import static test.pkg2.Variable.W;
import static test.pkg2.Variable.c;
import static test.pkg2.Variable.choice;
import static test.pkg2.Variable.Counter;
import static test.pkg2.Variable.Number;
import static test.pkg2.Variable.counter1;
import static test.pkg2.Variable.counter2;
import static test.pkg2.Variable.counter3;
import static test.pkg2.Variable.counter4;
import java.util.Scanner;

public class ASSIGNMENT {

           
    public static void main(String[] args) {
        
        display();
    }
    
    public static void display(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("\u001B[35;47m _________WELCOME TO FAY!_________ \u001B[0m");
        System.out.println("\u001B[35;47m|                                 |\u001B[0m");
        System.out.printf("\u001B[35;47m|     [ %3d ]\t\t[ %d ]     |\u001B[0m\n", Number[0], Counter[0]);
        System.out.printf("\u001B[35;47m|     [ %3d ]\t\t[ %d ]     |\u001B[0m\n", Number[1], Counter[1]);
        System.out.printf("\u001B[35;47m|     [ %3d ]\t\t[ %d ]     |\u001B[0m\n", Number[2], Counter[2]);
        System.out.printf("\u001B[35;47m|     [ %3d ]\t\t[ %d ]     |\u001B[0m\n", Number[3], Counter[3]);
        System.out.println("\u001B[35;47m --------------------------------- \u001B[0m\n");
        
        System.out.println("");
        
        while(true)
        {
            System.out.print("Enter 1 to get to main menu : ");
            choice=input.nextInt();
            
            if(choice==1){
            menu();}
            
            else{
                System.out.println("Invalid input. Please enter again.");}
        }

       
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("**************MAIN MENU**************\n");
        System.out.println("1- Customer");
        System.out.println("2- Staff\n");
        System.out.println("[ENTER 1 FOR CUSTOMER MENU]");
        System.out.println("[ENTER 2 FOR STAFF ACCESS]");
        
        
        while(true)
        {
            System.out.print("Enter your choice : ");
            choice=input.nextInt();
        
            switch (choice) {
                case 1:
                    Customer();
                    break;
                case 2:
                    Staff();
                    break;
                default:
                    System.out.println("Invalid input. Please enter again.");
                    break;
            }
        }
        
    }
    
    private static void Customer() {
        int i;
        char choice;
        
        Variable a = new Variable();
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("***********CUSTOMER'S MENU***********\n");
        System.out.println("A-General Inquiries");
        System.out.println("B-Technical Assistance");
        System.out.println("C-Billing/Payment\n");
        
        while(true){
        System.out.print("Enter your choice : ");
        choice=input.next().charAt(0);
        if(choice>='A'&&choice<='C'||choice>='a'&&choice<='c')
            break;
        else
            System.out.println("Invalid input. Please enter again.");
       }
        
        for(int j=0; j<41; j++){
            if(W[j]<=0)
            {
               if(choice=='A'||choice=='a'){
                C1++;
                W[j]=C1;
                a.quenumber(C1);
                break;}
               
               if(choice=='B'||choice=='b'){
                C2++;
                W[j]=C2;
                a.quenumber(C2);
                break;}
               
               if(choice=='C'||choice=='c'){
                C3++;
                W[j]=C3;
                a.quenumber(C3);
                break;}
            }
        }
                                     
        display();
    }

    private static void Staff() {
        int i, choose = 0;
        String password = "COUNTER";
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("***********STAFF'S ACCESS***********\n");
        System.out.print("Please enter password:");
        String answer = input.next();
        while(!answer.matches(password))
        {   System.out.println("Incorrect password");
            System.out.print("Please enter your password again :");
            answer = input.next();}
    
        System.out.println("");
        System.out.println("");
        System.out.println("***********STAFF'S MENU***********\n");
        System.out.println("Choose Counter\n");
        System.out.println("1-Counter 1");
        System.out.println("2-Counter 2");
        System.out.println("3-Counter 3");
        System.out.println("4-Counter 4\n");
        while(true){
        System.out.print("Enter your counter : ");
        choice=input.nextInt();
        if(choice>=1&&choice<=4)
            break;
        else
            System.out.println("Invalid input. Please enter again.");
       }
        
        System.out.println("");
        System.out.println("");
        System.out.println("***********STAFF'S MENU***********\n");
        System.out.println("Choose your action\n");
        System.out.println("1-Call next number");
        System.out.println("2-Recall previous number");
                
       while(true){
        System.out.print("\nEnter your choice : ");
        choose=input.nextInt();
        if(choose>=1&&choose<=3)
            break;
        else
            System.out.println("Invalid input. Please enter again.");
       }
        
        switch (choose) {
            case 1:
                number(choice);
                break;
            case 2:
                recall(choice);
                break;
            default:
                System.out.println("Invalid input. Please enter again.");
                break;
        }
        
        display();
    }
    
    private static void number(int choice) {
        
        switch (choice) {
            case 1:
            case 2:
                for(int i=0;i<=40;i++){
                if(W[i]>100&&W[i]<200)
                {   c[choice-1]=W[i];
                    break;
                }}
                break;
                
            case 3:
                for(int i=0;i<=40;i++){
                if(W[i]>200&&W[i]<300)
                {   c[choice-1]=W[i];
                    break;
                }}
                break;
                
            case 4:
                for(int i=0;i<40;i++){
                if(W[i]>300&&W[i]<400)
                {   c[choice-1]=W[i];
                    break;
                }}
        }
        
        for(int i=0;i<40;i++){
            if(W[i]==c[0]||W[i]==c[1]||W[i]==c[2]||W[i]==c[3])
            {
                for(int j=i;j<40;j++)
                W[j]=W[j+1];
            }
        }
        
        if(Counter[0]<=0||Counter[1]<=0||Counter[2]<=0||Counter[3]<=0){
            for(int i=3;i>=0;i--){
            if(Counter[i]<=0)
            {
                if(choice==1){
                    Counter[i]=1;
                    Number[i]=c[0];}
                if(choice==2){
                    Counter[i]=2;
                    Number[i]=c[1];}
                if(choice==3){
                    Counter[i]=3;
                    Number[i]=c[2];}
                if(choice==4){
                    Counter[i]=4;
                    Number[i]=c[3];}
                break;
            }
            }}
        else{
            for(int j=0;j<4;j++){Counter[j]=Counter[j+1];}
            for(int h=0;h<4;h++){Number[h]=Number[h+1];}
            if(choice==1){
                Counter[3]=1;
                Number[3]=c[0];}
            if(choice==2){
                Counter[3]=2;
                Number[3]=c[1];}
            if(choice==3){
                Counter[3]=3;
                Number[3]=c[2];}
            if(choice==4){
                Counter[3]=4;
                Number[3]=c[3];}
            }
    }

    private static void recall(int choice) {
        
        for(int i=0;i<4;i++){
            Number[i]=Number[i+1];
            Counter[i]=Counter[i+1];
        }
    
        switch (choice){
            case 1:
                if(counter1<3){
                Number[3]=c[0];
                Counter[3]=1;
                counter1++;}
                else
                {
                System.out.println("The number have reached maximum calling times.");
                counter1=1;
                number(choice);
                }
                break;
            case 2:
                if(counter2<3){
                Number[3]=c[1];
                Counter[3]=2;
                counter2++;}
                else
                {
                System.out.println("The number have reached maximum calling times.");
                counter2=1;
                number(choice);
                }
                break;
            case 3:
                if(counter3<3){
                Number[3]=c[2];
                Counter[3]=3;
                counter3++;}
                else
                {
                System.out.println("The number have reached maximum calling times.");
                counter3=1;
                number(choice);
                }
                break;
            case 4:
                if(counter4<3){
                Number[3]=c[3];
                Counter[3]=4;
                counter4++;}
                else
                {
                System.out.println("The number have reached maximum calling times.");
                number(choice);
                counter4=1;
                }
                break;
            }
    }

}


