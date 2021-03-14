import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {
    @Test
    @DisplayName("ReaderTest1: inputTest1: n")
    void readerTest1(){
        List inputTest1 = Reader.readFromInput("src/test/resources/inputTest1.txt");
        int actual = (int)inputTest1.get(0);
        int expected = 7;
        assertEquals(actual,expected);
    }
    @Test
    @DisplayName("ReaderTest2: inputTest1: length")
    void readerTest2(){
        List inputTest1 = Reader.readFromInput("src/test/resources/inputTest1.txt");
        int actual = inputTest1.size();
        int expected = 8;
        assertEquals(actual,expected);
    }

    @Test
    @DisplayName("ReaderTest3: inputTest2: n")
    void readerTest3(){
        List inputTest1 = Reader.readFromInput("src/test/resources/inputTest2.txt");
        int actual = (int)inputTest1.get(0);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    @DisplayName("ReaderTest4: inputTest2: length")
    void readerTest4(){
        List inputTest1 = Reader.readFromInput("src/test/resources/inputTest2.txt");
        int actual = inputTest1.size();
        int expected = 11;
        assertEquals(actual,expected);
    }

    @Test
    @DisplayName("ReaderTest5: inputTest3: n")
    void readerTest5(){
        List inputTest1 = Reader.readFromInput("src/test/resources/inputTest3.txt");
        int actual = (int)inputTest1.get(0);
        int expected = 61;
        assertEquals(actual,expected);
    }
    @Test
    @DisplayName("ReaderTest6: inputTest3: length")
    void readerTest6(){
        List inputTest1 = Reader.readFromInput("src/test/resources/inputTest3.txt");
        int actual = inputTest1.size();
        int expected = 62;
        assertEquals(actual,expected);
    }
}