import java.io.FileWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
    	Cars car = new Cars(2,"hub");
        FileWriter writer = new FileWriter("beef.sav");

        CSVWriter.writeLine(writer, Arrays.asList("a", "2", "c", "d"));
        
        CSVWriter.writeLine(writer, Arrays.asList(car.name, car.wheel, "c", "d"));

        CSVWriter.writeLine(writer, Arrays.asList("aaa", "bbb", "cc\"c"));

        //writer.flush();
        writer.close();

    }

}