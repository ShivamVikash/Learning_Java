class FirstClass 
{ 
   public static void main(String agrs[])
   {
      //learning to print output

      System.out.print("Hello \nWorld ");
      System.out.println("Hello World\n");

      //learning variables

      String name = "Alone Entity";
      int age = 19;
      double price = 3677129;
      age = 25;
      price = 77529963;
      System.out.println(name);
      System.out.println(age);
      System.out.println(price);
      
      int a = 10 ;
      int b= 25;
      int sum = a+b;
      System.out.println(sum);

      //Taking input forom user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number");
      int a1 = sc.nextInt();
      System.out.println("Enter second number");
      int b1 = sc.nextInt();
      sum = a1 + b1;
      System.out.println(sum);

      //HW questions
      //print area of circle
      System.out.println("Enter radius of circle");
      double r = sc.nextDouble();
      double area = 3.14*r*r;
      System.out.println(area);

      //print table for a no.
      //Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int n = sc.nextInt();
      int t1=n*1;
      int t2=n*2;
      int t3=n*3;
      int t4=n*4;
      int t5=n*5;
      int t6=n*6;
      int t7=n*7;
      int t8=n*8;
      int t9=n*9;
      int t10=n*10;
      System.out.println("The required table is");
      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t3);
      System.out.println(t4);
      System.out.println(t5);
      System.out.println(t6);
      System.out.println(t7);
      System.out.println(t8);
      System.out.println(t9);
      System.out.println(t10);

      //Efficient using loop
      for(int i=1;i<=10;i++)
      {
         int t = n*i;
         System.out.println(t);
      }
      
      
      //Conditional Statements: If Else
      //Number input by user is even or odd
      Scanner sc= new Scanner(System.in);
      int n =  sc.nextInt();
      if(n%2==0){
         System.out.println("Even");
      }
      else{
         System.out.println("Odd");
      }

      //Else-If : User input two numbers, if they are equal, greater or lesser
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a==b){
         System.out.println("Equal");
      } 
      else if(a>b){
         System.out.println("a is greater");
      }
      else{
         System.out.println("a is lesser");
      }

      //Switch-Break Statements
      int button =  sc.nextInt();
      switch(button)
      {
         case 1: System.out.println("Hello");
         break;
         case 2: System.out.println("Namaste");
         break;
         case 3: System.out.println("Bonjour");
         break;
         default: System.out.println("Invalid Button");
      }
      
      //Homework questions
      //make a calculator by taking two no.s from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first no.");
      int n1 = sc.nextInt();
      System.out.println("Enter the second no.");
      int n2 =sc.nextInt();
      System.out.println("Enter the operation case");
      int operation = sc.nextInt();
      switch(operation)
      {  
         case 1: System.out.println(n1+n2);
         break;
         case 2:System.out.println(n1-n2);
         break;
         case 3:System.out.println(n1*n2);
         break;
         case 4:System.out.println(n1/n2);
         break;
         case 5:System.out.println(n1%n2);
         break;
         default:System.out.println("Invalid operation case");
      }
      //Display the corresponding month of the no. input by the user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the month no.");
      int m = sc.nextInt();
      switch(m)
      {  
         case 1: System.out.println("january");
         break;
         case 2:System.out.println("February");
         break;
         case 3:System.out.println("march");
         break;
         case 4:System.out.println("april");
         break;
         case 5:System.out.println("may");
         break;
         case 6:System.out.println("june");
         break;
         case 7:System.out.println("july");
         break;
         case 8:System.out.println("august");
         break;
         case 9:System.out.println("september");
         break;
         case 10:System.out.println("october");
         break;
         case 11:System.out.println("november");
         break;
         case 12:System.out.println("december");
         break;
         default:System.out.println("Invalid month number");
      }
      
      //Learning loops
      int i;
      for(i = 0; i<11; i++){
         System.out.print(i);
      }
      System.out.println("");
      i=0;
      while(i<11){
         System.out.println(i);
         i++;
      }
      i=0;
      do{
         System.out.print(i);
         i++;
      }while(i<11);
      
      //Q: Sum of first n natural no.s
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the limit for which the sum is to be calculated");
      int n = sc.nextInt();
      int s=0;
      for(int i=1; i<=n ; i++)
      {
          s=s+i;
      }
      System.out.print("Sum is : ");
      System.out.println(s);
      
      //Print all even no.s till n
      System.out.println("Enter the limit for which no.s need to be printed");
      int n = sc.nextInt();
      for(int i=0;i<=n;i++){
         if(i%2==0){
            System.out.println(i);
         }
      }
      
      //Creating a menu driven class
      int x;
      Scanner sc = new Scanner(System.in);
      do{
         System.out.println("Please enter your choice out of 0 or 1");
         int c = sc.nextInt();
         x=c;
         if(c==1){
            System.out.println("Enter students marks");
            int marks=sc.nextInt();
            if(marks>=90){
               System.out.println("This is Good");
            }
            else if(marks>=60 && marks<=89){
               System.out.println("This is also Good");
            }
            else{
                System.out.println("This is Good as Well");
            }  
         }
         else{
            System.out.println("Stopped");
         }
      }while(x==1);
      
      //Program to display whether a no. is prime no. or not
      int c;int i=1;
      Scanner sc= new Scanner (System.in);
      System.out.println("No. of times you want to check prime or not");
      int k=sc.nextInt();
      while(i<=k){
         c=0;
         System.out.println("Enter the no.");
         int n= sc.nextInt();
         for(int j=1;j<=n;j++){
            if((n%j)==0){
              c++;
            }
         }
         if(c==2){
           System.out.println("Prime no.");
         }   
         else{
           System.out.println("Non-Prime no.");
         }
         i++;
      }
      // Alternate method
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      boolean isPrime = true;
      for(int i=2; i<=n/2 ; i++){
         if(n%i==0){
            isPrime = false;
            break;
         }
      }
      if(isPrime == true){
         if(n == 1){
            System.out.println("It is neither a prime or a composite number");
         }
         else{
            System.out.println("Number is prime");
         }
      }
      else{
         System.out.println("Number is not prime");
      }
      
      // Pattern Questions: 1. Solid Rectangle
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the no. of rows");
      int r = sc.nextInt();
      //System.out.println("Enter the no. of coulums");
      //int c = sc.nextInt();
      for(int i=1; i<=r;i++){
         for(int j = 1; j<=c; j++){
           System.out.print("*");
         }
         System.out.println();
      }
      
      //2. Hollow Rectangle
      for(int i=1;i<=r;i++){
         for(int j=1;j<=c;j++){
            if(i==1 || j==1 || i==r || j == c){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
      
      //3,4. Half Pyramid and inverted half pyramid
      
      //for(int i = 1; i<=r; i++){
      for(int i=r; i>=1; i--){
         for(int j=1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
      } 
      
      //5. Rotated half pyramid by 180 degrees
      for(int i=1;i<=r;i++){
         for(int j=1;j<=(r-i);j++){
            System.out.print(" ");
         }
         for(int k= 1; k<=i; k++){
            System.out.print("*");
         }
         System.out.println();
      }  
      
      // 6. Half Pyramid with numbers
      for(int i= 1; i<=r; i++){
         for(int j=1; j<=i; j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }
      
      //7. Inverted Half Pyramid with numbers
      for(int i=r; i>=1; i--){
         for(int j=1; j<=i;j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }
      
      // Alternate method 1
      for(int i=1; i<=r; i++){
         for(int j=1; j<=(r-i+1); j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }
      
      //Alternate method 2
      for(int i=0; i<r; i++){
         for(int j=1; j<=(r-i); j++){
            System.out.print(j+" ");
         }
         System.out.println();
      }
      
      //8. Floyd's Triangle
      int n=1;
      for(int i=1; i<=r; i++){
         for(int j =1; j<=i;j++){
            System.out.print(n+" ");
            n++;
         }
         System.out.println();
      }
      
      //9. 0-1 Triangle
      for(int i=1; i<=r; i++){
         for(int j=1; j<=i; j++){
            if((i+j)%2==0){
               System.out.print(1+" ");
            }
            else{
               System.out.print(0+" ");
            }
         }
         System.out.println();
      }
      
      // Homework Questions: Lecture 5
      // 1. Solid rhombus
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the no of rows of rhombus");
      int r = sc.nextInt();
      System.out.println("Enter the breath of rhombus");
      int c = sc.nextInt();
      for(int i =1; i<=r; i++){
         for(int j=1; j<=(r-i); j++){
            System.out.print(" ");
         }
         for(int k=1; k<=c; k++){
            System.out.print("*");
         }
         System.out.println();
      }
      
      //2. Number pyramid
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the no of rows of pyramid");
      int r = sc.nextInt();
      int n=1;
      for(int i =1; i<=r; i++){
         for(int j=1; j<=(r-i); j++){
            System.out.print(" ");
         }
         for(int k=1; k<=i; k++){
            System.out.print(n+" ");
         }
         n++;
         System.out.println();
      }
      
      //3. palindrome pyramid
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the no of rows of pyramid");
      int r = sc.nextInt();
      int n;
      for(int i =1; i<=r; i++){
         n=i;
         for(int j=1; j<=(r-i); j++){
            System.out.print(" ");
         }
         for(int k=1; k<=i; k++){
            System.out.print(n);
            n=n-1;
         }
         n+=2;
         for(int l=2; l<=i; l++){
            System.out.print(n);
            n++;
         }
         System.out.println();
      }
      // Alternate method: Palindrome pyramid
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the no of rows of pyramid");
      int r = sc.nextInt();
      for(int i =1; i<=r; i++){
         for(int j=1; j<=(r-i); j++){
            System.out.print(" ");
         }
         for(int j= i; j>=1; j--){
            System.out.print(j);
         }
         for(int j =2; j<=i; j++){
            System.out.print(j);
         }
         System.out.println();
      }
      
      //Advanced pattern questions
      // 10. Butterfly pattern
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      for(int i =1; i<=r; i++){
         for(int j =1; j<=i; j++){
            System.out.print("*");
         }
         for(int j =1; j<=2*(r-i); j++){
            System.out.print(" ");
         }
         for(int j =1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
      }
      for(int i =r; i>=1; i--){
         for(int j =1; j<=i; j++){
            System.out.print("*");
         }
         for(int j =1; j<=2*(r-i); j++){
            System.out.print(" ");
         }
         for(int j =1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
      }
      
      //14. Diamond pattern
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the no of rows of pyramid");
      int r = sc.nextInt();
      for(int i =1; i<=r; i++){
         for(int j=1; j<=(r-i); j++){
            System.out.print(" ");
         }
         for(int j=1; j<=(2*i-1); j++){
            System.out.print("*");
         }
         System.out.println();
      }
      for(int i=r; i>=1; i--){
            for(int j=1;j<=r-i; j++){
               System.out.print(" ");
            }
            for(int j= 1; j<=(2*i-1); j++){
               System.out.print("*");
            }
         System.out.println();
      }
   
       //Homework problem: Advance pattern questions

      //1. Hollow Butterfly pattern
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      for(int i =1; i<=r; i++){
         for(int j =1; j<=i; j++){
            if(j==1 || j==i){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         for(int j =1; j<=2*(r-i); j++){
            System.out.print(" ");
         }
         for(int j =1; j<=i; j++){
            if(j==1 || j==i){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }  
         }
         System.out.println();
      }
      for(int i =r; i>=1; i--){
         for(int j =1; j<=i; j++){
            if(j==1 || j==i){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         for(int j =1; j<=2*(r-i); j++){
            System.out.print(" ");
         }
         for(int j =1; j<=i; j++){
            if(j==1 || j==i){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
      
       //2. Hollow Rhombus
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the no. of rows");
       int r= sc.nextInt();
       for(int i =1; i<=r; i++){
         for(int j=1; j<=r-i; j++){
            System.out.print(" ");
         }
         for(int j=1; j<=r; j++){
            if(i==1 || j==1 || i==r || j==r){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         System.out.println();
       }
       
       //3. Pascal's Triangle
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the no. of rows");
       int r= sc.nextInt();
       int n=11;
       int m=1;
       for(int i = 1; i<=r; i++){
        System.out.println(m);
        m=m*n;
      }
      
       //4. Half number pyramid
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the no. of rows");
       int r= sc.nextInt();
       for(int i = 1; i<=r; i++){
          for(int j =1; j<=i; j++){
             System.out.print(j);
          }
          System.out.println();
      }

      //5. Inverted Half pyramid
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the no. of rows");
       int r= sc.nextInt();
       int n=1;
       for(int i = r; i>=1; i--){
          for(int j =1; j<=i; j++){
             System.out.print(n);
          }
          n++;
          System.out.println();
      }
   }
}
