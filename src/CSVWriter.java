import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class CSVWriter {

    private static final char SEPARATOR = ',';

    public static void writeLine(Writer w, List<Object> values) throws IOException {
        writeLine(w, values, SEPARATOR, ' ');
    }

    public static void writeLine(Writer w, List<Object> values, char separators, char customQuote) throws IOException {
        boolean first = true;

        if (separators == ' ') {
            separators = SEPARATOR;
        }

        StringBuilder sb = new StringBuilder();
        for (Object value : values) {
            if (!first) {
                sb.append(separators);
            }
            if (customQuote == ' ') {
            	
                sb.append(changeType(value));
            } 
            first = false;
        }
        sb.append("\n");
        w.append(sb.toString());     
    }
   
    public static String changeType(Object value) {
    	return value.toString();
    }
}
