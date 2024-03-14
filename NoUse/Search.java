////package Method;
////
////import Interface.Digital_Game_Store;
////import src.Game;
////
////import java.time.LocalDate;
////import java.util.ArrayList;
////import java.util.Scanner;
////
////public class Search extends Digital_Game_Store {
////    private ArrayList<Game> gameList;
////    public Search(ArrayList<Game> gameList) {
////        this.gameList = gameList;
////    }
////
////    @Override
////    public ArrayList<Game> searchGames() {
////        Scanner input = new Scanner(System.in);
////        int search;
////        do {
////            ArrayList<Game> result = new ArrayList<Game>();
////            System.out.println("Ấn 1 để tìm theo tên");
////            System.out.println("Ấn 2 để tìm theo thể loại");
////            System.out.println("Ấn 3 để tìm theo mức giá");
////            System.out.println("Ấn 4 để tìm theo mức điểm");
////            System.out.println("Ấn 5 để tìm theo ID");
////            System.out.println("Ấn 6 để tìm theo ngày phát hành");
////
////            search = input.nextInt();
////            switch (search) {
////                case 1:
////                    //tìm theo tên
////                    searchByName(input, result);
////                    return result;
////                case 2:
////                    //tìm theo thể loại
////                    searchByGenre(input, result);
////                    return result;
////                case 3:
////                    //tìm theo mức giá
////                    searchByPrice(input, result);
////                    return result;
////                case 4:
////                    //tìm theo mức điểm
////                    searchByRating(input, result);
////                    return result;
////                case 5:
////                    //tìm theo ID
////                    searchByID(input, result);
////                    return result;
////                case 6:
////                    searchByDate(input, result);
////                    return result;
////                default:
////                    System.out.println("Không hợp lệ");
////            }
////        } while (true);
////    }
////
////    private void searchByName(Scanner scanner, ArrayList<Game> result) {
////        scanner.nextLine();
////        System.out.println("Nhập tên game cần tìm");
////        String titleSearch = scanner.nextLine();
////        for (Game game : gameList) {
////            if (game.getTitle().equals(titleSearch)) {
////                result.add(game);
////            }
////        }
////    }
////
////    private void searchByGenre(Scanner scanner, ArrayList<Game> result) {
////        scanner.nextLine();
////        System.out.println("Nhập thể loại game cần tìm");
////        String genreSearch = scanner.nextLine();
////        for (Game game : gameList) {
////            if (game.getGenre().equals(genreSearch)) {
////                result.add(game);
////            }
////        }
////    }
////
////    private void searchByPrice(Scanner scanner, ArrayList<Game> result) {
////        scanner.nextLine();
////        System.out.println("Nhập mức giá cao nhất:");
////        String maxRange = scanner.nextLine();
////        System.out.println("Nhập mức giá nhỏ nhất:");
////        String minRange = scanner.nextLine();
////        double max = Double.parseDouble(maxRange);
////        double min = Double.parseDouble(minRange);
////        for (Game game : gameList) {
////            double price = game.getPrice();
////            if (price <= max && price >= min) {
////                result.add(game);
////            }
////        }
////    }
////
////    private void searchByRating(Scanner scanner, ArrayList<Game> result) {
////        scanner.nextLine();
////        System.out.println("Nhập mức điểm cao nhất:");
////        String maxScore = scanner.nextLine();
////        System.out.println("Nhập mức điểm nhỏ nhất:");
////        String minScore = scanner.nextLine();
////        double max = Double.parseDouble(maxScore);
////        double min = Double.parseDouble(minScore);
////        for (Game game : gameList) {
////            double rating = game.getRating();
////            if (rating <= max && rating >= min) {
////                result.add(game);
////            }
////        }
////    }
////
////    private void searchByID(Scanner scanner, ArrayList<Game> result) {
////        scanner.nextLine();
////        System.out.println("Nhập mã ID cần tìm");
////        String id = scanner.nextLine();
////        for (Game game : gameList) {
////            if (id.equals(game.getId())) {
////                result.add(game);
////            }
////        }
////    }
////
////    private void searchByDate(Scanner scanner, ArrayList<Game> result) {
////        scanner.nextLine();
////        System.out.println("Nhập khoảng thời gian tìm kiếm:");
////        System.out.println("Từ ngày: ");
////        String oldestDate = scanner.nextLine();
////        System.out.println("Đến ngày: ");
////        String newestDate = scanner.nextLine();
////        LocalDate od = LocalDate.parse(oldestDate);
////        LocalDate nd = LocalDate.parse(newestDate);
////        for (Game game : gameList) {
////            LocalDate date = LocalDate.parse(game.getReleaseDate());
////            int checkFirst = date.compareTo(od);
////            int checkLast = date.compareTo(nd);
////            if (checkFirst >= 0 && checkLast <= 0) {
////                result.add(game);
////            }
////        }
////    }
////
////    public void displayGame(ArrayList<Game> list) {
////        for (Game game : list) {
////            System.out.println("\n" + game);
////        }
////    }
////}
//
//import src.Game;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class EditService {
//    private ArrayList<Game> gameList;
//
//    public EditService(ArrayList<Game> listGames) {
//        this.gameList = listGames;
//    }
//
//    public void editGame(Scanner scanner) {
//        scanner.nextLine();
//        int choice;
//        boolean flag = true;
//        System.out.println("Nhập mã ID của game cần cập nhật");
//        String id = scanner.nextLine();
//        for (Game game : gameList) {
//            if (game.getId().equals(id)) {
//                do {
//                    System.out.println("Ấn 1 để cập nhật tên");
//                    System.out.println("Ấn 2 để cập nhật thể loại");
//                    System.out.println("Ấn 3 để cập nhật giá tiền");
//                    System.out.println("Ấn 4 để cập nhật điểm đánh giá");
//                    System.out.println("Ấn 5 để cập nhật ngày phát hành");
//                    System.out.println("Ấn 0 để về menu chính");
//                    choice = scanner.nextInt();
//
//                    switch (choice) {
//                        case 1:
//                            // Sửa tên game;
//                            editName(scanner, game);
//                            break;
//                        case 2:
//                            // Sửa thể loại;
//                            editGenre(scanner, game);
//                            break;
//                        case 3:
//                            // Sửa giá tiền
//                            editPrice(scanner, game);
//                            break;
//                        case 4:
//                            // Sửa điểm đánh giá;
//                            editRating(scanner, game);
//                            break;
//                        case 5:
//                            editDate(scanner, game);
//                            break;
//                        case 0:
//                            return;
//                        default:
//                            System.out.println("Không hợp lệ");
//                            break;
//                    }
//                } while (true);
//            } else {
//                flag = false;
//            }
//        }
//        if (!flag) {
//            System.out.println("Không tìm được game cần cập nhật");
//        }
//    }
//
//    private static void editDate(Scanner scanner, Game game) {
//        scanner.nextLine();
//        System.out.println("Cập nhật ngày phát hành:");
//        String date = validateInput(scanner, "^\\d{4}-\\d{2}-\\d{2}$", "Ngày phát hành không hợp lệ.");
//        game.setReleaseDate(date);
//    }
//
//    private static void editName(Scanner scanner, Game game) {
//        scanner.nextLine();
//        System.out.println("Cập nhật tên mới:");
//        String name = validateInput(scanner, "^[a-zA-Z0-9\\s]+$", "Tên game không hợp lệ.");
//        game.setTitle(name);
//    }
//
//    private static void editGenre(Scanner scanner, Game game) {
//        scanner.nextLine();
//        System.out.println("Cập nhật thể loại:");
//        String genre = validateInput(scanner, "^[a-zA-Z\\s]+$", "Thể loại không hợp lệ.");
//        game.setGenre(genre);
//    }
//
//    private static void editPrice(Scanner scanner, Game game) {
//        scanner.nextLine();
//        System.out.println("Cập nhật giá tiền:");
//        String price = validateInput(scanner, "^[0-9]+(\\.[0-9]{1,2})?$", "Giá tiền không hợp lệ.");
//        game.setPrice(price);
//    }
//
//    private static void editRating(Scanner scanner, Game game) {
//        scanner.nextLine();
//        System.out.println("Cập nhật điểm:");
//        String rating = validateInput(scanner, "^[0-9]+(\\.[0-9])?$", "Điểm đánh giá không hợp lệ.");
//        game.setRating(rating);
//    }
//
//    private String validateInput(Scanner scanner, String regex, String errorMessage) {
//        String input;
//        do {
//            input = scanner.nextLine();
//            if (!input.matches(regex)) {
//                System.out.println(errorMessage);
//            }
//        } while (!input.matches(regex));
//        return input;
//    }
//}
