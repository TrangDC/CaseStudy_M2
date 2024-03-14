package Method;
import Interface.Regex_Number;
import src.Game;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddService implements Regex_Number {

    private ArrayList<Game> gameList;

    public AddService(ArrayList<Game> gameList) {
        this.gameList = gameList;
    }

    public void addGamesFromUserInput(Scanner scanner) throws InputMismatchException {
        System.out.println("Bạn muốn thêm bao nhiêu game:");
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            scanner.nextLine();
            System.out.println("Nhập tên game:");
            String title = validateInput(scanner, TitleRegex, TitleErrorMessage);
            System.out.println("Nhập thể loại game:");
            String genre = validateInput(scanner, GenreRegex, GenreErrorMessage);
            System.out.println("Nhập giá game:");
            String price = validateInput(scanner, PriceRegex, PriceErrorMessage);
            System.out.println("Nhập số điểm đánh giá (từ 0 đến 10):");
            String rating = validateInput(scanner, RatingRegex, RatingErrorMessage);
            System.out.println("Nhập ngày phát hành (theo định dạng yyyy-mm-dd):");
            String releaseDate = validateInput(scanner, YMDRegex, DateErrorMessage);

            Game data = new Game(title, genre, price, rating, releaseDate);

            for (Game game: gameList) {
                if (game.getTitle().equals(title)) {
                    System.out.println("Đã có game trùng lặp. Vui lòng nhập lại");
                    return;
                }
            }
            gameList.add(data);
            System.out.println("Đã thêm thành công");
            i++;
        }
    }

    private String validateInput(Scanner scanner, String regex, String errorMessage) {
        String input;
        do {
            input = scanner.nextLine();
            if (!input.matches(regex)) {
                System.out.println(errorMessage);
            }
        } while (!input.matches(regex));
        return input;
    }
}

