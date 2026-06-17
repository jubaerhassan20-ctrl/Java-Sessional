class IDCard { 
String name; 
String id; 
String department; 
String institution; 
IDCard(String name, String id, String department, String 
institution) { 
this.name = name; 
this.id = id; 
this.department = department; 
this.institution = institution; 
} 
void showID() { 
System.out.println("Name: " + name); 
System.out.println("ID: " + id); 
System.out.println("Department: " + department); 
System.out.println("Institution: " + institution); 
System.out.println("--------------------------"); 
} 
} 
public class IDCardDemo { 
public static void main(String[] args) { 
IDCard student1 = new IDCard( 
"Jubaer", 
"E253054", 
"Computer and Communication Engineering", 
"International Islamic University Chattogram" 
); 
IDCard student2 = new IDCard( 
"Adil", 
"E253067", 
"Computer and Communication Engineering", 
"International Islamic University Chattogram" 
); 
student1.showID(); 
student2.showID();
}
}
