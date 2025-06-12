package service;

import model.Subject;
import java.util.List;

public class GradeCalculator {

    // 등급을 평점으로 변환
    public static double convertGradeToScore(String grade) {
        return switch (grade.toUpperCase()) {
            case "A+" -> 4.5;
            case "A0" -> 4.0;
            case "B+" -> 3.5;
            case "B0" -> 3.0;
            case "C+" -> 2.5;
            case "C0" -> 2.0;
            case "D+" -> 1.5;
            case "D0" -> 1.0;
            case "F"  -> 0.0;
            default   -> -1.0;  // 잘못된 입력
        };
    }

    // 전체 GPA 계산
    public static double calculateGPA(List<Subject> subjects) {
        double totalScore = 0.0;
        int totalCredits = 0;

        for (Subject subject : subjects) {
            double score = convertGradeToScore(subject.getGrade());
            if (score < 0) {
                System.out.println("잘못된 성적 입력: " + subject.getGrade());
                continue;
            }

            totalScore += score * subject.getCredit();
            totalCredits += subject.getCredit();
        }

        return (totalCredits == 0) ? 0.0 : totalScore / totalCredits;
    }
}
