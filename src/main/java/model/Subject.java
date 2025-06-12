package model;

public class Subject {
    private String name;     // 과목 이름
    private int credit;      // 학점 수
    private String grade;    // 성적 등급 (예: A+, B0)

    // 생성자
    public Subject(String name, int credit, String grade) {
        this.name = name;
        this.credit = credit;
        this.grade = grade;
    }

    // Getter/Setter
    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // 디버깅용 출력
    @Override
    public String toString() {
        return name + " (" + credit + "학점): " + grade;
    }
}
