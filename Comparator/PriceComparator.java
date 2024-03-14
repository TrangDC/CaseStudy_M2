package Comparator;

import src.Game;

import java.util.Comparator;

public class PriceComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        Integer o1Price = Integer.parseInt(o1.getPrice());
        Integer o2Price = Integer.parseInt(o2.getPrice());
        return o1Price.compareTo(o2Price);
    }
}
