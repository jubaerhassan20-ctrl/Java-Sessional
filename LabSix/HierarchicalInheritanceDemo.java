class Person {     
displayInfo() {  
void 
System.out.println("This is a person.");  
}  
}  
class Doctor extends Person {     
void treatPatient() {  
System.out.println("Doctor treats patients.");  
}  
}  
class Teacher extends Person {     
void teachStudents() {  
System.out.println("Teacher teaches students.");  
}  
}  
class Engineer extends Person {     
void developSystem() {  
System.out.println("Engineer develops systems.");  
}  
} public class HierarchicalInheritanceDemo 
{     public static void main(String[] args) {  
Doctor d = new Doctor();  
Teacher t = new Teacher();  
Engineer e = new Engineer();  
d.displayInfo();  
d.treatPatient();  
t.displayInfo();  
t.teachStudents();  
e.displayInfo();  
e.developSystem();  
} 
}  
