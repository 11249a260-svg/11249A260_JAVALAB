class Student {
    // Fields
    String name;
    int rollNumber;
    int marks;

    // Constructor
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
        System.out.println();
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 50)
            return 'D';
        else
            return 'F';
    }
}

class StudentDemo {
    public static void main(String[] args) {

        // Creating student objects
        Student s1 = new Student("Arun", 101, 85);
        Student s2 = new Student("Priya", 102, 72);

        // Displaying student details
        s1.displayInfo();
        s2.displayInfo();
    }
}
