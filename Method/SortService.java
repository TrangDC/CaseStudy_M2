package Method;

import Comparator.*;
import Interface.Regex_Number;
import src.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortService implements Regex_Number {
    private ArrayList<Game> gameList;

    public SortService(ArrayList<Game> listGames) {
        this.gameList = listGames;
    }

    public void sortGameList(Scanner scanner) {
        do {
            System.out.println("Nhấn 1 để sắp xếp theo tên");
            System.out.println("Nhấn 2 để sắp xếp theo ID");
            System.out.println("Nhấn 3 để sắp xếp theo thể loại");
            System.out.println("Nhấn 4 để sắp xếp theo giá");
            System.out.println("Nhấn 5 để sắp xếp theo điểm xếp hạng");
            System.out.println("Nhấn 6 để sắp xếp theo ngày phát hành");
            System.out.println("Nhấn 7 để sắp xếp theo lượt tải");
            int button;
            boolean flag = true;
            button = scanner.nextInt();
            switch (button) {
                case One:
                    SortByTitle(flag, scanner);
                    return;
                case Two:
                    SortByID(flag, scanner);
                    return;
                case Three:
                    SortByGenre();
                    return;
                case Four:
                    SortByPrice(flag, scanner);
                    return;
                case Five:
                    SortByRating(flag, scanner);
                    return;
                case Six:
                    SortByDate(flag, scanner);
                    return;
                case Seven:
                    SortByDownload(flag, scanner);
                    return;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        } while (true);
    }

    private void SortByDownload(boolean flag, Scanner scanner) {
        while (flag) {
            System.out.println("1. Sắp xếp tăng dần");
            System.out.println("2. Sắp xếp giảm dần");
            int b1 = scanner.nextInt();
            switch (b1) {
                case One:
                    DownloadComparator downloadComparator = new DownloadComparator();
                    gameList.sort(downloadComparator);
                    flag = false;
                    break;
                case Two:
                    DownloadComparator downloadComparator1 = new DownloadComparator();
                    gameList.sort(downloadComparator1.reversed());
                    flag = false;
                    break;
            }
        }
    }

    private void SortByRating(boolean flag, Scanner scanner) {
        while (flag) {
            System.out.println("1. Sắp xếp tăng dần");
            System.out.println("2. Sắp xếp giảm dần");
            int b1 = scanner.nextInt();
            switch (b1) {
                case One:
                    RatingComparator ratingComparator = new RatingComparator();
                    gameList.sort(ratingComparator);
                    flag = false;
                    break;
                case Two:
                    RatingComparator ratingComparator1 = new RatingComparator();
                    gameList.sort(ratingComparator1.reversed());
                    flag = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }
    }

    private void SortByPrice(boolean flag, Scanner scanner) {
        while (flag) {
            System.out.println("1. Sắp xếp tăng dần");
            System.out.println("2. Sắp xếp giảm dần");
            int b1 = scanner.nextInt();
            switch (b1) {
                case One:
                    PriceComparator priceComparator = new PriceComparator();
                    Collections.sort(gameList, priceComparator);
                    flag = false;
                    break;
                case Two:
                    PriceComparator priceComparator1 = new PriceComparator();
                    Collections.sort(gameList, priceComparator1.reversed());
                    flag = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }
    }

    private void SortByGenre() {
        GenreComparator genreComparator = new GenreComparator();
        Collections.sort(gameList, genreComparator);
    }

    private void SortByID(boolean flag, Scanner scanner) {
        while (flag) {
            System.out.println("1. Sắp xếp tăng dần");
            System.out.println("2. Sắp xếp giảm dần");
            int b1 = scanner.nextInt();
            switch (b1) {
                case One:
                    IDComparator idComparator = new IDComparator();
                    Collections.sort(gameList, idComparator);
                    flag = false;
                    break;
                case Two:
                    IDComparator idComparator1 = new IDComparator();
                    Collections.sort(gameList, idComparator1.reversed());
                    flag = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }
    }

    private void SortByTitle(boolean flag, Scanner scanner) {
        while (flag) {
            System.out.println("1. Sắp xếp từ A-Z");
            System.out.println("2. Sắp xếp từ Z-A");
            int b1 = scanner.nextInt();
            switch (b1) {
                case One:
                    NameComparator nameComparator = new NameComparator();
                    Collections.sort(gameList, nameComparator);
                    flag = false;
                    break;
                case Two:
                    NameComparator nameComparator1 = new NameComparator();
                    Collections.sort(gameList, nameComparator1.reversed());
                    flag = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }
    }

    private void SortByDate(boolean flag, Scanner scanner) {
        while (flag) {
            System.out.println("1. Sắp xếp tăng dần");
            System.out.println("2. Sắp xếp giảm dần");
            int b1 = scanner.nextInt();
            switch (b1) {
                case One:
                    DateComparator dateComparator = new DateComparator();
                    Collections.sort(gameList, dateComparator);
                    flag = false;
                    break;
                case Two:
                    DateComparator dateComparator1 = new DateComparator();
                    Collections.sort(gameList, dateComparator1.reversed());
                    flag = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }
    }
}
