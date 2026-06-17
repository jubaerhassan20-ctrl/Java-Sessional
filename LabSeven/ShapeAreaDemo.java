class Shape { 
void area(int length, int width) { 
System.out.println("Area of Rectangle = " + (length * width)); 
} 
void area(double radius) { 
double circleArea = 3.1416 * radius * radius; 
System.out.println("Area of Circle = " + circleArea); 
} 
} 
public class ShapeAreaDemo { 
public static void main(String[] args) { 
Shape s = new Shape(); 
s.area(10, 5); 
s.area(7.0); 
} 
} 
