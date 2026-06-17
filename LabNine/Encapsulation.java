class Student {     
private String name;      
private String id;      
private double cgpa;     
public void setName(String name) {         
this.name = name;  
}  
public void setId(String id) {         
this.id = id;  
}  
public 
void setCgpa(double cgpa) {         
this.cgpa = cgpa;  
}  
public String getName() {         
return name;  
}  
public 
return id;  
}  
public 
String getId() {         
double getCgpa() {         
return cgpa;  
}  
} public class labNIne{    
public static void main(String[] args) {  
Student s = new Student();  
s.setName("Jubaer");  
s.setId(" E253054");  
s.setCgpa( 3.52);  
System.out.println( "Student Information:");  
System.out.println("Name :" + s.getName());  
System.out.println( "ID : "+ s.getId());  
System.out.println("CGPA :"+ s.getCgpa());  
}  
}  
