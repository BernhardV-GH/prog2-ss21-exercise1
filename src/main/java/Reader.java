import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    // This reader class reads from a given plaintext file and parses int values line by line into an ArrayList
    // Since the first value is always the length of the array coming after it, the reader makes sure this value
    // is returned correctly

    public static List<Integer> readFromInput(String filepath){
        String line = null;
        List<Integer> input = new ArrayList<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(true){
            try {
                if ((line = br.readLine()) == null)
                    break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            input.add(Integer.parseInt(line));
        }

        input.set(0, input.size()-1);

        return input;
    }
}
