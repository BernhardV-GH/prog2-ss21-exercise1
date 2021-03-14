import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
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

        return input;
    }
}
