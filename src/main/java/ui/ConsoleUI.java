package ui;

import model.Subject;
import service.GradeCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Subject> subjects = new ArrayList<>();

        System.out.print("입력할 과목 수를 입력하세요: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 제거용

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("\n[과목 " + (i + 1) + "]");

            System.out.print("과목명: ");
            String name = scanner.nextLine();

            System.out.print("학점 수: ");
            int credit = scanner.nextInt();
            scanner.nextLine(); // 줄바꿈 제거

            System.out.print("성적 (예: A+, B0, C): ");
            String grade = scanner.nextLine();

            subjects.add(new Subject(name, credit, grade));
        }

        double gpa = GradeCalculator.calculateGPA(subjects);
        System.out.printf("\n 평점 평균(GPA): %.2f\n", gpa);
    }
}
