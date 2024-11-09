//write   a program to print percentage and grade of a student 
class StudentGrade {
    public static void main(String[] args) {
        int totalMarks = 500;                  // Total marks for all subjects (int data type)
        int obtainedMarks = 420;               // Marks obtained by the student (int data type)

        // Calculate percentage (double data type)
        double percentage = (obtainedMarks * 100.0) / totalMarks;

        // Determine grade based on percentage (char data type)
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Print the results
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

