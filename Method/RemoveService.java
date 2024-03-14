package Method;

import src.Game;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveService {
    private ArrayList<Game> gameList;

    public RemoveService(ArrayList<Game> gameList) {
        this.gameList = gameList;
    }
    public void removeGame(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập mã ID game muốn xóa");
        String id = scanner.nextLine();
        for (Game game : gameList) {
            if (game.getId().equals(id)) {
                System.out.println("Đã xóa thành công");
                gameList.remove(game);
                break;
            }
        }
    }
}
