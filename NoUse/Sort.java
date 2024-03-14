//package Method;
//
//import Comparator.*;
//import Interface.Digital_Game_Store;
//import src.Game;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class Sort extends Digital_Game_Store {
//    private ArrayList<Game> gameList;
//
//    public Sort(ArrayList<Game> gameList) {
//        this.gameList = gameList;
//    }
//
//    @Override
//    public void sortGameList() {
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Nhấn 1 để sắp xếp theo tên");
//            System.out.println("Nhấn 2 để sắp xếp theo ID");
//            System.out.println("Nhấn 3 để sắp xếp theo thể loại");
//            System.out.println("Nhấn 4 để sắp xếp theo giá");
//            System.out.println("Nhấn 5 để sắp xếp theo điểm xếp hạng");
//            System.out.println("Nhấn 6 để sắp xếp theo ngày phát hành");
//            int button;
//            boolean flag = true;
//            button = scanner.nextInt();
//            switch (button) {
//                case 1:
//                    SortByTitle(flag, scanner);
//                    return;
//                case 2:
//                    SortByID(flag, scanner);
//                    return;
//                case 3:
//                    SortByGenre();
//                    return;
//                case 4:
//                    SortByPrice(flag, scanner);
//                    return;
//                case 5:
//                    SortByRating(flag, scanner);
//                    return;
//                case 6:
//                    SortByDate(flag, scanner);
//                    return;
//                default:
//                    System.out.println("Không hợp lệ");
//                    break;
//            }
//        } while (true);
//    }
//    private void SortByRating(boolean flag, Scanner scanner) {
//        while (flag) {
//            System.out.println("1. Sắp xếp tăng dần");
//            System.out.println("2. Sắp xếp giảm dần");
//            int b1 = scanner.nextInt();
//            switch (b1) {
//                case 1:
//                    RatingComparator ratingComparator = new RatingComparator();
//                    Collections.sort(gameList, ratingComparator);
//                    flag = false;
//                    break;
//                case 2:
//                    RatingComparator ratingComparator1 = new RatingComparator();
//                    Collections.sort(gameList, ratingComparator1.reversed());
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Không hợp lệ");
//                    break;
//            }
//        }
//    }
//
//    private void SortByPrice(boolean flag, Scanner scanner) {
//        while (flag) {
//            System.out.println("1. Sắp xếp tăng dần");
//            System.out.println("2. Sắp xếp giảm dần");
//            int b1 = scanner.nextInt();
//            switch (b1) {
//                case 1:
//                    PriceComparator priceComparator = new PriceComparator();
//                    Collections.sort(gameList, priceComparator);
//                    flag = false;
//                    break;
//                case 2:
//                    PriceComparator priceComparator1 = new PriceComparator();
//                    Collections.sort(gameList, priceComparator1.reversed());
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Không hợp lệ");
//                    break;
//            }
//        }
//    }
//
//    private void SortByGenre() {
//        GenreComparator genreComparator = new GenreComparator();
//        Collections.sort(gameList, genreComparator);
//    }
//
//    private void SortByID(boolean flag, Scanner scanner) {
//        while (flag) {
//            System.out.println("1. Sắp xếp tăng dần");
//            System.out.println("2. Sắp xếp giảm dần");
//            int b1 = scanner.nextInt();
//            switch (b1) {
//                case 1:
//                    IDComparator idComparator = new IDComparator();
//                    Collections.sort(gameList, idComparator);
//                    flag = false;
//                    break;
//                case 2:
//                    IDComparator idComparator1 = new IDComparator();
//                    Collections.sort(gameList, idComparator1.reversed());
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Không hợp lệ");
//                    break;
//            }
//        }
//    }
//
//    private void SortByTitle(boolean flag, Scanner scanner) {
//        while (flag) {
//            System.out.println("1. Sắp xếp từ A-Z");
//            System.out.println("2. Sắp xếp từ Z-A");
//            int b1 = scanner.nextInt();
//            switch (b1) {
//                case 1:
//                    NameComparator nameComparator = new NameComparator();
//                    Collections.sort(gameList, nameComparator);
//                    flag = false;
//                    break;
//                case 2:
//                    NameComparator nameComparator1 = new NameComparator();
//                    Collections.sort(gameList, nameComparator1.reversed());
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Không hợp lệ");
//                    break;
//            }
//        }
//    }
//
//    private void SortByDate(boolean flag, Scanner scanner) {
//        while (flag) {
//            System.out.println("1. Sắp xếp tăng dần");
//            System.out.println("2. Sắp xếp giảm dần");
//            int b1 = scanner.nextInt();
//            switch (b1) {
//                case 1:
//                    DateComparator dateComparator = new DateComparator();
//                    Collections.sort(gameList, dateComparator);
//                    flag = false;
//                    break;
//                case 2:
//                    DateComparator dateComparator1 = new DateComparator();
//                    Collections.sort(gameList, dateComparator1.reversed());
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Không hợp lệ");
//                    break;
//            }
//        }
//    }
//}
