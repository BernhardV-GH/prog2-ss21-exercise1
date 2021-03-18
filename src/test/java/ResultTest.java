import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ResultTest {
    // Link to Repository: https://github.com/BernhardV-GH/prog2-ss21-exercise1

    @Test
    @DisplayName("Constraints Test 1: n < 1")
    void constraintsTest1() {
        List<Integer> input = Arrays.asList(0,1,2);
        assertNull(Result.gradingStudents(input));
    }

    @Test
    @DisplayName("Constraints Test 2: n < 0")
    void constraintsTest2() {
        List<Integer> input = Arrays.asList(-1,1,2);
        assertNull(Result.gradingStudents(input));
    }

    @Test
    @DisplayName("Constraints Test 3: n > 60")
    void constraintsTest3() {
        List<Integer> input = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        input.set(0, input.size());
        assertNull(Result.gradingStudents(input));
    }

    @Test
    @DisplayName("Constraints Test 4: grades[i] < 0 || grades [i] > 100")
    void constraintsTest4() {
        List<Integer> actual = Result.gradingStudents(Arrays.asList(5,-11,-1,55,100,111));
        assertEquals(Arrays.asList(-1,-1,55,100,-1), actual);
    }

    @Test
    @DisplayName("Constraints Test 5: parameter 'grades' given is null")
    void constraintsTest5() {
        assertNull(Result.gradingStudents(null));
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
}
