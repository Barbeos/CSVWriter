import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {
	private final char SEPARATOR = ',';
	FileWriter writer;
	public CSVWriter(String fileName, boolean append){
		 try {
			writer = new FileWriter(fileName, append);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeLine(List<Object> values){
		writeLine(values, SEPARATOR);
	}

	public void writeLine(List<Object> values, char separator){
		boolean first = false;

		if (separator == ' ') {
			separator = SEPARATOR;
		}

		StringBuilder sb = new StringBuilder();
		for (Object value : values) {

			if (first) {
				sb.append(separator);
			}

			sb.append(value.toString());

			first = true;
		}
		sb.append("\n");
		try {
			writer.append(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void closeWriter() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
