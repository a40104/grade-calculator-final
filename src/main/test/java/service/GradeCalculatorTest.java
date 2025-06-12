package service;

import model.Subject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeCalculatorTest {

    @Test
    public void 평점_계산이_정확한지_테스트() {
        List<Subject> subjects = List.of(
                new Subject("자료구조", 3, "A+"),
                new Subject("운영체제", 2, "B0")
        );

        double result = GradeCalculator.calculateGPA(subjects);
        assertEquals(4.1, result, 0.01);  // 기대값과 실제값 비교
    }
}
