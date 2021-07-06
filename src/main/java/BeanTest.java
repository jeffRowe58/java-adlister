import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {

    public static void main(String[] args) {
        Album album = new Album();
        Author author = new Author();
        ArrayList<Quote> quotes = new ArrayList<>();


        Author author3 = new Author("Albert","Einstein");
        Author author2 = new Author("Michele", "Ruiz");
        Author author1 = new Author("Nelson", "Mandela");

        Quote quote1 = new Quote("It always seems impossible until it's done.", author1);

        Quote quote2 = new Quote("Everyone can rise above their circumstances and achieve success if they are dedicated to and passionate about what they do.", author1);

        Quote quote3 = new Quote("A winner is a dreamer who never gives up.", author1);

        Quote quote4 = new Quote("If people are doubting how far you can go, go so far that you can't hear them anymore", author2);

        Quote quote5 = new Quote("Anyone who has never made a mistake has never tried anything new.", author3);



        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);
        quotes.add(quote5);

        for (Quote quote : quotes) {
            System.out.println("\"" + quote.getContent() +"\"\n" + "~" + quote.getAuthor().getFirst_name() + " " + quote.getAuthor().getLast_name());
        }
    }
}
