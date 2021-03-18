import java.util.ArrayList;
import java.util.List;

public class Result {
    public static final int ROUNDINGBOUNDARY = 37;
    public static final int UPPERBOUND = 60;


    public static List<Integer> gradingStudents(List<Integer> grades){
        // This method takes a list of grades (first entry has to be the arraylength of the following entries)
        // If the list is either too short or too long null is returned otherwise the array is modified using modulo 5
        // as was specified. The first entry (n) is removed during this process. It isn't needed -> use .size() instead

        List<Integer> results = new ArrayList<>();

        if(grades == null){
            return null;
        }
        else if (grades.get(0) < 1 || grades.get(0) > UPPERBOUND){
            return null;
        }
        else{
            for(int i = 1; i < grades.size(); i++){
                if(grades.get(i) < 0 || grades.get(i) > 100){
                    results.add(-1);
                }
                else if(grades.get(i) > 0 && grades.get(i) < ROUNDINGBOUNDARY){
                    results.add(grades.get(i));
                }
                else if((5 - grades.get(i) % 5) == 2){
                    results.add(grades.get(i)+2);
                }
                else if((5 - grades.get(i) % 5) == 1){
                    results.add(grades.get(i)+1);
                }
                else{
                    results.add(grades.get(i));
                }
            }
        }

        return results;
    }
}
