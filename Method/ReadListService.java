package Method;

import src.Game;

import java.util.ArrayList;

public class ReadListService {
    private ArrayList<Game> gameList;

    public ReadListService(ArrayList<Game> gameList) {
        this.gameList = gameList;
    }

    public void readList() {
        for (Game game : gameList) {
            System.out.println(game);
        }
    }
}
