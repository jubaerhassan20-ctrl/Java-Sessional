import java.util.Scanner;6 
public class JavaLavtest { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
System.out.print("Enter first number: "); 
double num1 = input.nextDouble(); 
System.out.print("Enter second number: "); 
double num2 = input.nextDouble(); 
System.out.print("Enter operator (+, -, *, /): "); 
char op = input.next().charAt(0); 
switch(op) { 
case '+': 
System.out.println("Result: " + (num1 + num2)); 
break; 
case '-': 
System.out.println("Result: " + (num1 - num2)); 
break; 
case '*': 
System.out.println("Result: " + (num1 * num2)); 
break; 
case '/': 
if(num2 != 0) 
System.out.println("Result: " + (num1 / num2)); 
else 
System.out.println("Division by zero not allowed."); 
break; 
default: 
System.out.println("Invalid operator."); 
} 
input.close();
}
}
