import org.mockito.internal.matchers.Null;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Result {
    public static final int ROUNDINGBOUNDARY = 37;
    public static final int UPPERBOUNDARY = 60;

    public static List<Integer> gradingStudents(List<Integer> grades){
        // This method takes a list of grades (first entry has to be the arraylength of the following entries)
        // If the list is either too short or too long null an Exception is thrown otherwise the array is modified
        // using modulo 5 as was specified. The first entry (n) is ignored/input is not trusted

        List<Integer> results = new ArrayList<>();

        if(grades == null){
            throw new NullPointerException("given array of grades is null");
        }

        if (grades.isEmpty() || grades.size() < 2){
            throw new IllegalArgumentException("given array of grades is either empty or too short (only 'n' entry)");
        }
        else if (grades.size() > UPPERBOUNDARY+1){
            throw new IllegalArgumentException("given array of grades is too long");
        }
        else{
            for(int grade : grades){
                if(grade < 0 || grade > 100){
                    results.add(-1);
                }
                else if(grade > 0 && grade < ROUNDINGBOUNDARY){
                    results.add(grade);
                }
                else if( (5 - grade % 5) == 2){
                    results.add(grade+2);
                }
                else if( (5 - grade % 5) == 1){
                    results.add(grade+1);
                }
                else{
                    results.add(grade);
                }
            }
            results.remove(0);
        }

        return results;
    }
}
