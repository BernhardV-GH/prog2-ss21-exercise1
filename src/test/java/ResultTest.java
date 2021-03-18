import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ResultTest {
    // Link to Repository: https://github.com/BernhardV-GH/prog2-ss21-exercise1

    @Test
    @DisplayName("Constraints Test 1: n < 1")
    void constraintsTest1() {
        List<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(1);
        input.add(2);
        List<Integer> actual = Result.gradingStudents(input);
        List<Integer> expected = null;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Constraints Test 2: n < 0")
    void constraintsTest2() {
        List<Integer> input = new ArrayList<>();
        input.add(-1);
        input.add(1);
        input.add(2);
        List<Integer> actual = Result.gradingStudents(input);
        List<Integer> expected = null;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Constraints Test 3: n > 60")
    void constraintsTest3() {
        List<Integer> input = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            input.add(i);
        }
        input.set(0, input.size());
        List<Integer> actual = Result.gradingStudents(input);
        List<Integer> expected = null;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Constraints Test 4: grades[i] < 0 || grades [i] > 100")
    void constraintsTest4() {
        List<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(-11);
        input.add(-1);
        input.add(55);
        input.add(100);
        input.add(111);

        List<Integer> actual = Result.gradingStudents(input);

        List<Integer> expected = new ArrayList<>();
        expected.add(-1);
        expected.add(-1);
        expected.add(55);
        expected.add(100);
        expected.add(-1);

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Constraints Test 5: parameter 'grades' given is null")
    void constraintsTest5() {
        List<Integer> actual = Result.gradingStudents(null);
        List<Integer> expected = null;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Grading Test 1 - no rounding < 40")
    void gradingTest1() {
        List<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(1);
        input.add(12);
        input.add(23);
        input.add(34);
        input.add(5);
        input.add(16);
        input.add(27);
        input.add(38);
        input.add(9);
        input.add(0);

        List<Integer> actual = Result.gradingStudents(input);
        input.remove(0);

        assertEquals(input, actual);
    }

    @Test
    @DisplayName("Grading Test 2 - no rounding up if next multiple of 5 is '>= 3' away")
    void gradingTest2() {
        List<Integer> input = new ArrayList<>();
        input.add(6);
        input.add(40);
        input.add(51);
        input.add(62);
        input.add(75);
        input.add(86);
        input.add(97);

        List<Integer> actual = Result.gradingStudents(input);
        input.remove(0);

        assertEquals(input, actual);
    }

    @Test
    @DisplayName("Grading Test 3 - rounding up if next multiple of 5 is 2 away")
    void gradingTest3() {
        List<Integer> input = new ArrayList<>();
        input.add(12);

        input.add(43);
        input.add(48);
        input.add(53);
        input.add(58);
        input.add(63);
        input.add(68);
        input.add(73);
        input.add(78);
        input.add(83);
        input.add(88);
        input.add(93);
        input.add(98);

        List<Integer> expected = new ArrayList<>();
        int tmp = 45;
        for(int i = 0; i < 12; i++){
            expected.add(tmp);
            tmp+=5;
        }

        List<Integer> actual = Result.gradingStudents(input);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Grading Test 4 - rounding up if next multiple of 5 is 1 away")
    void gradingTest4() {
        List<Integer> input = new ArrayList<>();
        input.add(12);

        input.add(44);
        input.add(49);
        input.add(54);
        input.add(59);
        input.add(64);
        input.add(69);
        input.add(74);
        input.add(79);
        input.add(84);
        input.add(89);
        input.add(94);
        input.add(99);

        List<Integer> expected = new ArrayList<>();
        int tmp = 45;
        for(int i = 0; i < 12; i++){
            expected.add(tmp);
            tmp+=5;
        }

        List<Integer> actual = Result.gradingStudents(input);

        assertEquals(expected, actual);
    }
}
