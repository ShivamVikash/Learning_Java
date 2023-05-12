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

      /*for(int i=1;i<=10;i++)
      {
         int t = n*i;
         System.out.println(t);
      }*/
   }
}
