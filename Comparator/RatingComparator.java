package Comparator;

import src.Game;

import java.util.Comparator;

public class RatingComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        return o1.getRating().compareTo(o2.getRating());
    }
}
