package Method;
import src.Game;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UploadService {
    private ArrayList<Game> listGames;

    public UploadService(ArrayList<Game> listGames) {
        this.listGames = listGames;
    }

    public void loadFromFile(Scanner scanner) throws FileNotFoundException {
        scanner.nextLine();
        System.out.println("Nhập đường dẫn file:");
        String filepath = null;
        try {
            filepath = scanner.nextLine();
            String line = null;

            FileReader fileReader = new FileReader(filepath);
            BufferedReader reader = new BufferedReader(fileReader);

            while ((line = reader.readLine()) != null) {
                String[] temp = line.split(",");
                String title = temp[0];
                String genre = temp[1];
                String price = temp[2];
                String rating = temp[3];
                String releaseDate = temp[4];
                String totalDownloads = temp[5];

                Game data = new Game(title, genre, price, rating, releaseDate, totalDownloads);

                if (!isGameExists(data)) {
                    listGames.add(data);
                } else {
                    System.out.println("Game " + title + " đã tồn tại trong danh sách.");
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không thể tìm thấy " + filepath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean isGameExists(Game game) {
        for (Game existingGame : listGames) {
            if (existingGame.getTitle().equals(game.getTitle())) {
                existingGame.setTotalDownloads(game.getTotalDownloads());
                return true;
            }
        }
        return false;
    }
}
