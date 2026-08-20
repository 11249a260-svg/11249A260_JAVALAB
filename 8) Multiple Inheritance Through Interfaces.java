interface Academic {
    void showMarks();
}

interface Sports {
    void showSportsMarks();
}

// Implementing multiple interfaces
class Student implements Academic, Sports {

    int marks = 85;
    int sportsMarks = 90;

    // Implement Academic method
    public void showMarks() {
        System.out.println("Academic Marks : " + marks);
    }

    // Implement Sports method
    public void showSportsMarks() {
        System.out.println("Sports Marks   : " + sportsMarks);
    }

    void displayResult() {
        int total = marks + sportsMarks;
        System.out.println("Total Marks    : " + total);
    }
}

class MultipleInheritance {
    public static void main(String[] args) {

        Student s = new Student();

        s.showMarks();
        s.showSportsMarks();
        s.displayResult();
    }
}
