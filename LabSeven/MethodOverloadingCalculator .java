void calculate(int a, int b) 
{ 
System.out.println("Addition = " + (a + b)); 
} 
void calculate(double a, double b)
{ 
System.out.println("Subtraction = " + (a - b)); 
} 
void calculate(int a, int b, int c) 
{ 
System.out.println("Multiplication = " + (a * b * c)); 
} 
void calculate(float a, float b) 
{ 
System.out.println("Division = " + (a / b)); 
} 
} 
public class MethodOverloadingCalculator 
{ 
public static void main(String[] args) 
  { 
Calculator c = new Calculator(); 
c.calculate(10, 5); 
c.calculate(20.5, 10.5); 
c.calculate(2, 3, 4); 
c.calculate(20.0f, 5.0f);
}
}
