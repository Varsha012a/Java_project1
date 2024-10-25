class Student {
    int rollNumber;
    String name;
    String mobileNumber;
    
    public Student(int rollNumber, String name, String mobileNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
    
    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student student1 = new Student(1, "John", "1234567890");
        Student student2 = new Student(2, "Alice", "9876543210");
        Student student3 = new Student(3, "Bob", "5678901234");
        Student student4 = new Student(4, "Emma", "7890123456");
        Student student5 = new Student(5, "Mike", "3456789012");
        
        // Displaying information of students
        System.out.println("Student Information:");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();
    }
}