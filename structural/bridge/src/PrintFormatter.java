import java.util.List;

public class PrintFormatter implements Formatter {
    public String format(String header, List<String> details){
        StringBuilder sb = new StringBuilder();
        sb.append(header).append("\n");

        for(String detail : details){
            sb.append(detail).append("\n");
        }

        return sb.toString();
    }
}