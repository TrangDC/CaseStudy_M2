package Comparator;

import src.Game;

import java.util.Comparator;

public class DownloadComparator implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        Integer o1Number = Integer.parseInt(o1.getTotalDownloads());
        Integer o2Number = Integer.parseInt(o2.getTotalDownloads());
        return o1Number.compareTo(o2Number);
    }
}
