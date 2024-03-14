package Method;

import Interface.Regex_Number;
import src.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class EditService implements Regex_Number {
    private ArrayList<Game> gameList;
    public EditService(ArrayList<Game> listGames) {
        this.gameList = listGames;
    }
    public void editGame(Scanner scanner) {
        scanner.nextLine();
        int choice;
        boolean flag = true;
        System.out.println("Nhập mã ID của game cần cập nhật");
        String id = scanner.nextLine();
        for (Game game : gameList) {
            if (game.getId().equals(id)) {
                do {
                    System.out.println("Ấn 1 để cập nhật tên");
                    System.out.println("Ấn 2 để cập nhật thể loại");
                    System.out.println("Ấn 3 để cập nhật giá tiền");
                    System.out.println("Ấn 4 để cập nhật điểm đánh giá");
                    System.out.println("Ấn 5 để cập nhật ngày phát hành");
                    System.out.println("Ấn 0 để về menu chính");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case One:
                            //Sửa tên game;
                            editName(scanner, game);
                            break;
                        case Two:
                            //Sửa thể loại;
                            editGenre(scanner, game);
                            break;
                        case Three:
                            //Sửa giá tiền
                            editPrice(scanner, game);
                            break;
                        case Four:
                            //Sửa điểm đánh giá;
                            editRating(scanner, game);
                            break;
                        case Five:
                            editDate(scanner, game);
                            break;
                        case Zero:
                            return;
                        default:
                            System.out.println("Không hợp lệ");
                            break;
                    }
                } while (true);
            } else {
                System.out.println("Không tìm thấy id");
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Không tìm được game cần cập nhật");
        }
    }

    private static void editDate(Scanner scanner, Game game) {
        scanner.nextLine();
        System.out.println("Cập nhật ngày phát hành:");
        String date = validateInput(scanner, YMDRegex, DateErrorMessage);
        game.setReleaseDate(date);
    }

    private static void editName(Scanner scanner, Game game) {
        scanner.nextLine();
        System.out.println("Cập nhật tên mới:");
        String name = validateInput(scanner, TitleRegex, TitleErrorMessage);
        game.setTitle(name);
    }

    private static void editGenre(Scanner scanner, Game game) {
        scanner.nextLine();
        System.out.println("Cập nhật thể loại:");
        String genre = validateInput(scanner, GenreRegex, GenreErrorMessage);
        game.setGenre(genre);
    }

    private static void editPrice(Scanner scanner, Game game) {
        scanner.nextLine();
        System.out.println("Cập nhật giá tiền:");
        String price = validateInput(scanner, PriceRegex, PriceErrorMessage);
        game.setPrice(price);
    }

    private static void editRating(Scanner scanner, Game game) {
        scanner.nextLine();
        System.out.println("Cập nhật điểm:");
        String rating = validateInput(scanner, RatingRegex, RatingErrorMessage);
        game.setRating(rating);
    }

    private static String validateInput(Scanner scanner, String regex, String errorMessage) {
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
