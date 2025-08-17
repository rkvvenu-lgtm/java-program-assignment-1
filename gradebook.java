import java.util.Scanner;

class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("\n--- Student Report ---");
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);

        sc.close();
    }
}
