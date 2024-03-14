package Comparator;

import src.Game;

import java.util.Comparator;

public class IDComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
