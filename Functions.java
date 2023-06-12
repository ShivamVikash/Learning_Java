import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Functions{
    
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
    
    //JAVA EXERCISE 1
    //1. Input 3 no.'s from user and make a function to print average
    public static double printAverage(double a, double b, double c){             //public static void printAverage(double a, double b, double c){
        double avg=(a+b+c)/3.0;
        return avg;                                                             //System.out.println("Average of the numbers are: " + avg); 
    }                                                                           //return;
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Enter third number");
        double c = sc.nextDouble();
        double avg= printAverage(a,b,c);                                       //printAverage(a,b,c);
        System.out.println("Average of the numbers are: " + avg);
    }
     
    //2. Function to print sum of all odd no.'s from 1 to n
    public static void sumOdd(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2==1){
               sum=sum+i;
            }
        }
        System.out.println("Sum of odd number are: "+ sum);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        sumOdd(n);
    }
    
    //3. Function which takes two numbers and returns greatest of the two
    public static int returnGreatest(int n1, int n2){
        int g=0;
        if(n1>n2){
            g=n1;
            System.out.println(g+" is the greatest");
        }
        else if(n2>n1){
            g=n2;
            System.out.println(g+" is the greatest");
        }
        else{
            g=n1;
            System.out.println("Both are equal");
            
        }
        return g;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n1");
        int n1= sc.nextInt();
        System.out.println("Enter the value of n2");
        int n2= sc.nextInt();
        int g = returnGreatest(n1,n2);
        System.out.println(g+" is greater");
        
    }
    
    //4. Function that takes in radius as input and returns circumference as output
    public static double returnCircumference(double r){
        double c= 2*3.14*r;
        return c;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of radius");
        double r= sc.nextDouble();
        double c= returnCircumference(r);
        System.out.println("Circumference of the circle: "+ c);
    }
    
    
    //5. Function that takes age as input and returns whether person is eligible to vote
    public static String returnEligibility (int age){
        String s;
        if(age>=18){
           // System.out.println("The person is eligible to vote");
            s= "eligible";
        }
        else {
            //System.out.println("The person is not eligible to vote");
            s= "Not Eligible";
        }
        return s;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age");
        int age= sc.nextInt();
        String s= returnEligibility(age);
        System.out.println("The person is "+s+" to vote");
    }
    
    
    //6. Infinite loop using do while condition
    public static void main(String args[]){
        int i=1;
        do{
            System.out.println("Infinite loop");
            i++;
        }while(i>0);
    }
    
    //7. Program to input no. from the user and display the count
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of times you want to input the number");
        int n= sc.nextInt();
        int c1=0; int c2=0; int c3=0;
        for(int i=1; i<=n; i++){
            System.out.println("Enter your number");
            float num= sc.nextFloat();
            if(num>0.0){
                c1++;
            }
            else if(num<0.0){
                c2++;
            }
            else{
                c3++;
            }
        }
        System.out.println("No. of positive numbers entered: "+c1);
        System.out.println("No. of negative numbers entered: "+c2);
        System.out.println("No. of zeros entered: "+c3);
    }
    
    //8. Enter two numbers from the user and write a function to find value of one raised to power the other
    public static void findPower(float x, float n){
        float v= 1;
        for(int i=1; i<=n; i++){
            v=v*x;
        }
        System.out.println("Value of exponenet is: "+v);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of base");
        float x= sc.nextFloat();
        System.out.println("Enter the value of power");
        float n= sc.nextFloat();
        findPower(x,n);
    }
    
    //9. Function to calculate greatest common divisor
    public static void calculateGcd(int n1, int n2){
        if(n1>n2){
            if(n1%n2==0){
                System.out.println(n2+" is the greatest common divisor");
            }
            else{
                for(int i=n2; i>=1; i--){
                    if(n1%i==0 && n2%i==0){
                        System.out.println(i+" is the greatest common divisor");
                        break;
                    }
                }
            }
        }
        else{
            if(n2%n1==0){
                System.out.println(n1+" is the greatest common divisor");
            }
            else{
                for(int i=n1; i>=1; i--){
                    if(n1%i==0 && n2%i==0){
                        System.out.println(i+" is the greatest common divisor");
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int n1= sc.nextInt();
        System.out.println("Enter second number");
        int n2= sc.nextInt();
        calculateGcd(n1,n2);
    }
 
    //10. To print Fibonacci series of n terms
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit value of series");
        int n= sc.nextInt();
        int v1=0; int v2=1;
        System.out.print(v1+" ");
        System.out.print(v2+" ");
        for(int i=1; i<=n-2; i++){
            int s= v1+v2;
            System.out.print(s+" ");
            v1=v2;
            v2=s;
        }
    } 
    
    //ARRAYS
    //Lecture 10: 1. Take an array of names as input from the user and print them on the screen
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        String names[] = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name "+ (i+1));
            names[i]=sc.next();
        } 
        System.out.println("Nmaes are:");
        for(int i=0;i<n;i++){
           System.out.println(names[i]) ; 
        }
    }
     
    //3. Take an array of numbers as input and check if it is an array sorted in ascending order
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        boolean isAsc= true;
        //Array creation
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int arrayNo[] = new int[n];
        //Inputting values in the array
        for(int i=0;i<n;i++){
            System.out.println("Enter number at index "+ i);
            arrayNo[i]=sc.nextInt();
        } 
        //Displaying array
        System.out.print("Input array: ");
        for(int i=0;i<n;i++){
            System.out.print(arrayNo[i]+" ");
        }
        System.out.println();
        /* 
        //Checking ascending order
        int i=0;
         while(i<n-1){
            if(arrayNo[i]<arrayNo[i+1]){
                i++;
            }
            else{
                System.out.println("Array is not in ascending order");
                isAsc= false;
                break;
            }
        }
        if(isAsc== true){
            System.out.println("Array is in ascending order");
        }
        
        //Alternate method
         
        int j=0;
        for(int i=0; i<n-1; i++){
            j=i;
            while(j<n-1){
                if(arrayNo[i]< arrayNo[j+1]){
                  j++;
                }
                else{
                    System.out.println("Array is not in ascending order");
                    break;
                }
            }
            break;
        }  
    }
    
    //2. Find the maximum & minimum number in an array of integers.
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int arrayNo[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the no. at index "+ i);
            arrayNo[i]=sc.nextInt();
        }  
        //Displaying array
        System.out.print("Input array: ");
        for(int i=0;i<n;i++){
            System.out.print(arrayNo[i]+" ");
        }
        System.out.println();
        //Finding greatest and smallest no.'s
        int max=arrayNo[0];
        int min=arrayNo[0];
        for(int i=0;i<n;i++){
            if(arrayNo[i]<min){
                min=arrayNo[i];
            }
            if(arrayNo[i]>max){
                max=arrayNo[i];
            }
        }
        System.out.println("Greatest no. in the array: "+max);
        System.out.println("Smallest no. in the array: "+min);
    }
    
    //Alternate method
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int arrayNo[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the no. at index "+ i);
            arrayNo[i]=sc.nextInt();
        }  
        //Displaying array
        System.out.print("Input array: ");
        for(int i=0;i<n;i++){
            System.out.print(arrayNo[i]+" ");
        }
        System.out.println();
        //Integer.MAX_VALUE is a constant in the Integer class of java.lang package that stores maximum possible value for any integer variable, the value= 2^31-1 = 2147483647
        //Integer.MIN_VALUE is a constant in the Integer class of java.lang package that stores minimum possible value for any integer variable, the value= -2^31 = -2147483648
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE; 
        for(int i=0;i<n;i++){
            if(arrayNo[i]<min){
                min=arrayNo[i];
            }
            if(arrayNo[i]>max){
                max=arrayNo[i];
            }
        }
        System.out.println("Greatest no. in the array: "+max);
        System.out.println("Smallest no. in the array: "+min);
    }
    */
}

