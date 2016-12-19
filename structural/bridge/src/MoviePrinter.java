import java.util.List;
import java.util.ArrayList;

public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie){
        this.movie = movie;
    }

    protected List<String> getDetails(){
        List<String> details = new ArrayList<>();

        details.add("Tilte: " + movie.getTitle());
        details.add("Year: " + movie.getYear());

        return details;
    }

    protected String getHeader(){
        return movie.getClassification();
    }
}
