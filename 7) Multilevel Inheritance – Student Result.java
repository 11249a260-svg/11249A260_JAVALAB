class Student {
    int rollNo;
    String name;

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Display student information
    void displayStudent() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
    }
}

// Second level
class Marks extends Student {
    int m1, m2, m3, m4, m5;

    // Constructor
    Marks(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    // Display marks
    void displayMarks() {
        System.out.println("Subject 1   : " + m1);
        System.out.println("Subject 2   : " + m2);
        System.out.println("Subject 3   : " + m3);
        System.out.println("Subject 4   : " + m4);
        System.out.println("Subject 5   : " + m5);
    }
}

// Third level
class Result extends Marks {

    // Constructor
    Result(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name, m1, m2, m3, m4, m5);
    }

    // Calculate total
    int calculateTotal() {
        return m1 + m2 + m3 + m4 + m5;
    }

    // Calculate average
    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    // Calculate grade
    char calculateGrade() {
        double average = calculateAverage();

        if (average >= 90)
            return 'A';
        else if (average >= 75)
            return 'B';
        else if (average >= 60)
            return 'C';
        else if (average >= 50)
            return 'D';
        else
            return 'F';
    }

    // Display complete result
    void displayResult() {
        displayStudent();
        displayMarks();

        System.out.println("Total       : " + calculateTotal());
        System.out.println("Average     : " + calculateAverage());
        System.out.println("Grade       : " + calculateGrade());
    }
}

// Main class
class StudentResult {
    public static void main(String[] args) {

        Result student = new Result(
            101, "Arun", 85, 90, 78, 88, 92
        );

        student.displayResult();
    }
}
