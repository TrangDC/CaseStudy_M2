package Comparator;

import src.Game;

import java.util.Comparator;

public class NameComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        String name1 = o1.getTitle().toUpperCase();
        String name2 = o2.getTitle().toUpperCase();
        return name1.compareTo(name2);

    }
}
