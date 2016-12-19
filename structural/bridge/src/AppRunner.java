public class AppRunner {
    public static void main(String[] args){
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("Vegas 1984");
        movie.setYear("2002");

        Formatter printFormatter = new PrintFormatter();
        Formatter htmlFormatter = new HtmlFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        System.out.println(moviePrinter.print(printFormatter));
        System.out.println(moviePrinter.print(htmlFormatter));
    }
}