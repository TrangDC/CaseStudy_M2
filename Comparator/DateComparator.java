package Comparator;
import src.Game;
import java.time.LocalDate;
import java.util.Comparator;

public class DateComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        LocalDate date1 = LocalDate.parse(o1.getReleaseDate());
        LocalDate date2 = LocalDate.parse(o2.getReleaseDate());
        return date1.compareTo(date2);
    }
}
