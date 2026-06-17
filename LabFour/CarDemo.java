class Car { 
String brand; 
String model; 
double price; 
Car(String brand, String model, double price) { 
this.brand = brand; 
this.model = model; 
this.price = price; 
} 
void displayCar() { 
System.out.println("Car Brand: " + brand); 
System.out.println("Car Model: " + model); 
System.out.println("Car Price: $" + price); 
System.out.println("--------------------------"); 
} 
} 
public class CarDemo { 
public static void main(String[] args) { 
Car car1 = new Car("Toyota", "Corolla", 25000); 
Car car2 = new Car("Honda", "Civic", 27000); 
car1.displayCar(); 
car2.displayCar(); 
} 
} 
