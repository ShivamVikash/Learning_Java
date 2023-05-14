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

      /*Efficient using loop
      for(int i=1;i<=10;i++)
      {
         int t = n*i;
         System.out.println(t);
      }
      */
      
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
   }
}
