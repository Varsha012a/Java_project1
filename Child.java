class Parent {
 void display() {
 System.out.println("This is the Parent class.");
 }
}
class Child extends Parent {
 void displayChild() {
 System.out.println("This is the Child class.");
 }
}
public class Main {
 public static void main(String[] args) 
Child obj = new Child();
 obj.display(); // Output: This is the Parent class.
 obj.displayChild(); // Output: This is the Child class.
 }
}
