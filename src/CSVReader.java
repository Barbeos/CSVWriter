import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	ArrayList<String> strings;
	
	 public ArrayList<String[]> cSVReader(String fileName) {
		 try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			strings = new ArrayList<String>();	
			
			while(reader.ready()){
				strings.add(reader.readLine());
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 ArrayList<String[]> lines = new ArrayList<String[]>();
		 for(String s: strings) {
			 lines.add(s.split(","));
		 }
		 return lines;
	 }
			 
}
