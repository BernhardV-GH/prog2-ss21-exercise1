import java.util.List;

public class App {
    public static void main(String[] args){

        System.out.println("Input File 1");
        List<Integer> grades = Reader.readFromInput("src/main/resources/input1.txt");
        System.out.println("source = " + grades);
        List<Integer> results = Result.gradingStudents(grades);
        System.out.println("result = " + results);
        System.out.println();

        System.out.println("Input File 2");
        grades = Reader.readFromInput("src/main/resources/input2.txt");
        System.out.println("source = " + grades);
        results = Result.gradingStudents(grades);
        System.out.println("result = " + results);
    }
}
