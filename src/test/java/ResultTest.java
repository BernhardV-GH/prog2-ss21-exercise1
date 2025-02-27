import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResultTest {
    // Link to Repository: https://github.com/BernhardV-GH/prog2-ss21-exercise1

    @Test
    @DisplayName("Constraints Test 1: parameter 'grades' given is null")
    void constraintsTest1() {
        assertThrows(NullPointerException.class, () -> Result.gradingStudents(null));
    }

    @Test
    @DisplayName("Constraints Test 2: n < 1")
    void constraintsTest2() {
        List<Integer> input = Arrays.asList(0);
        assertThrows(IllegalArgumentException.class, () -> Result.gradingStudents(input));
    }

    @Test
    @DisplayName("Constraints Test 3: n < 0")
    void constraintsTest3() {
        List<Integer> input = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> Result.gradingStudents(input));
    }

    @Test
    @DisplayName("Constraints Test 4: n > 60")
    void constraintsTest4() {
        List<Integer> input = IntStream.range(0, 100).boxed().collect(Collectors.toList());
        assertThrows(IllegalArgumentException.class, () -> Result.gradingStudents(input));
    }

    @Test
    @DisplayName("Constraints Test 5: n = 61")
    void constraintsTest5() {
        List<Integer> input = IntStream.range(0, 62).boxed().collect(Collectors.toList());
        assertThrows(IllegalArgumentException.class, () -> Result.gradingStudents(input));
    }

    @Test
    @DisplayName("Constraints Test 6: grades[i] < 0 || grades [i] > 100")
    void constraintsTest6() {
        List<Integer> actual = Result.gradingStudents(Arrays.asList(5,-11,-1,55,100,111));
        assertEquals(Arrays.asList(-1,-1,55,100,-1), actual);
    }

    @Test
    @DisplayName("Grading Test 1 - no rounding < 38")
    void gradingTest1() {
        List<Integer> input = Arrays.asList(10,1,12,23,34,5,16,27,37,9,0);
        List<Integer> actual = Result.gradingStudents(input);
        assertEquals(Arrays.asList(1,12,23,34,5,16,27,37,9,0), actual);
    }

    @Test
    @DisplayName("Grading Test 2 - no rounding up if next multiple of 5 is '>= 3' away")
    void gradingTest2() {
        List<Integer> input = Arrays.asList(6,40,51,62,75,86,97);
        List<Integer> actual = Result.gradingStudents(input);
        assertEquals(Arrays.asList(40,51,62,75,86,97), actual);
    }

    @Test
    @DisplayName("Grading Test 3 - rounding up if next multiple of 5 is 2 away")
    void gradingTest3() {
        List<Integer> actual = Result.gradingStudents(Arrays.asList(13,38,43,48,53,58,63,68,73,78,83,88,93,98));
        List<Integer> expected = Arrays.asList(40,45,50,55,60,65,70,75,80,85,90,95,100);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Grading Test 4 - rounding up if next multiple of 5 is 1 away")
    void gradingTest4() {
        List<Integer> actual = Result.gradingStudents(Arrays.asList(13,39,44,49,54,59,64,69,74,79,84,89,94,99));
        List<Integer> expected = Arrays.asList(40,45,50,55,60,65,70,75,80,85,90,95,100);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Grading Test 5 - generic test combining tests above")
    void gradingTest5() {
        List<Integer> actual = Result.gradingStudents(Arrays.asList(11,0,11,22,33,44,55,66,77,88,99,111));
        List<Integer> expected = Arrays.asList(0,11,22,33,45,55,66,77,90,100,-1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Array Length Test - testing if first entry is ignored as it should be")
    void lengthTest(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(11,39,69,99));
        List<Integer> expected = Arrays.asList(40,70,100);
        assertEquals(expected,actual);
    }
}
