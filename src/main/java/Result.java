import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> gradingStudents(List<Integer> grades){
        List<Integer> results = new ArrayList<>();

        if (grades.get(0) < 1 || grades.get(0) > 60){
            System.out.println("file is either empty (n < 1) or too long (n > 60)");
            return null;
        }
        else{
            grades.remove(0);
            for(int i = 0; i < grades.size(); i++){
                if(grades.get(i) < 0 || grades.get(i) > 100){
                    System.out.println("entry " + (i+1) + " is either '< 0' or '> 100'. Invalid entry set to '-1'");
                    results.add(-1);
                }
                else if(grades.get(i) > 0 && grades.get(i) < 40){
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
