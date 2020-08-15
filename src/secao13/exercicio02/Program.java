package secao13.exercicio02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
                            "Traveling to New Zealand", 
                            "I'm going to visit this wonderful country!", 
                            12);
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), 
                            "Good night guys", 
                            "See you tomorrow", 
                            5);

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        p1.addComment(c1);
        p1.addComment(c2);
        p2.addComment(c3);
        p2.addComment(c4);

        // Alternate way to add comments
        // p1.getComments().addAll(Arrays.asList(c1, c2));
        // p2.getComments().addAll(Arrays.asList(c3, c4));

        System.out.println(p1);       
        System.out.println(p2);       
    }
}