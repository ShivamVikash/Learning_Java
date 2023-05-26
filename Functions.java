import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Functions{
    /* 
    //1. Print my name
    public static void printMyName( String name){
        System.out.println("My name is:" + name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name= sc.next();
        printMyName(name);
    }
    
    //2. Add two numbers and return sum
    public static int calculateSum( int n1, int n2){
        //int sum= n1+n2;
        //return sum;
        return (n1+n2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        //int sum= calculateSum(n1,n2);
        //System.out.println("Sum is:"+ sum);
        System.out.println("Sum is:"+ calculateSum(n1,n2));
    }
    
    //3. Function to multiply two numbers and return product
    public static int calculateProduct( int n1, int n2){
        int prdt= n1*n2;
        return prdt;
        //return (n1*n2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        int prdt= calculateProduct(n1,n2);
        System.out.println("Product is:"+ prdt);
        //System.out.println("Sum is:"+ calculateProduct(n1,n2));
    }
    
    //4. Factorial of a number
    public static void printFactorial( int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int fact=1;
        for(int i=n; i>=1; i--){
            fact=fact*i;
        }
        System.out.println("Factorial is:"+ fact);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt(); 
        printFactorial(n);
    }
    
    //Homework problem: Lecture 7
    //1. Check no. is prime or not
    public static void checkPrime( int n){
        int c=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
             c++;
            }
        }
        if(c==0){
          System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is non-prime");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt(); 
        checkPrime(n);
    }
    
    //2. Check number is even or not
    public static void checkEven(int n){
        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt(); 
        checkEven(n);
    }
    */
    //3. Print table of a given number
    public static void printTable( int n){
        int t=1;
        for(int i=1; i<=10; i++){
            t=n*i;
            System.out.println(t);
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for table");
        int n= sc.nextInt(); 
        printTable(n);
    }
}