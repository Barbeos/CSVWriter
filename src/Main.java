import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
    	Cars car = new Cars(2,"hub");
    	ArrayList<String[]> line = new ArrayList<String[]>();
    	CSVWriter cSVWriter = new CSVWriter("beef.sav", false);
    	CSVReader cSVReader = new CSVReader();

        cSVWriter.writeLine(Arrays.asList(15.7786, car.wheel, "gttc", "jhkd"));
        
        cSVWriter.writeLine(Arrays.asList(car.name, car.wheel, "c", "d"));

        cSVWriter.writeLine(Arrays.asList(3,4,8,7.456546,7.456, "sfgs"));
        cSVWriter.writeLine(Arrays.asList(car));
       
        cSVWriter.closeWriter();
        
        line =cSVReader.cSVReader("beef.sav");
        
		 for(String[] s: line) {
			 for(String k: s) {
				 System.out.println(k);
			 }
			 
		 }

    }
}