////package Method;
////import Interface.Digital_Game_Store;
////import src.Game;
////import java.util.ArrayList;
////import java.util.Scanner;
////
////public class Edit extends Digital_Game_Store {
////    private ArrayList<Game> gameList;
////    public Edit(ArrayList<Game> gameList) {
////        this.gameList = gameList;
////    }
////    @Override
////    public void editGame() {
////        Scanner scanner = new Scanner(System.in);
////        int choice;
////        boolean flag = true;
////        System.out.println("Nhập mã ID của game cần cập nhật");
////        String id = scanner.nextLine();
////        for (Game game : gameList) {
////            if (game.getId().equals(id)) {
////                do {
////                    System.out.println("Ấn 1 để cập nhật tên");
////                    System.out.println("Ấn 2 để cập nhật thể loại");
////                    System.out.println("Ấn 3 để cập nhật giá tiền");
////                    System.out.println("Ấn 4 để cập nhật điểm đánh giá");
////                    System.out.println("Ấn 5 để cập nhật ngày phát hành");
////                    System.out.println("Ấn 0 để về menu chính");
////                    choice = scanner.nextInt();
////
////                    switch (choice) {
////                        case 1:
////                            //Sửa tên game;
////                            editName(scanner, game);
////                            break;
////                        case 2:
////                            //Sửa thể loại;
////                            editGenre(scanner, game);
////                            break;
////                        case 3:
////                            //Sửa giá tiền
////                            editPrice(scanner, game);
////                            break;
////                        case 4:
////                            //Sửa điểm đánh giá;
////                            editRating(scanner, game);
////                            break;
////                        case 5:
////                            editDate(scanner, game);
////                            break;
////                        case 0:
////                            return;
////                        default:
////                            System.out.println("Không hợp lệ");
////                            break;
////                    }
////                } while (true);
////            } else {
////                flag = false;
////            }
////        }
////        if (!flag) {
////            System.out.println("Không tìm được game cần cập nhật");
////        }
////    }
////
////    private static void editDate(Scanner scanner, Game game) {
////        scanner.nextLine();
////        System.out.println("Cập nhật ngày phát hành:");
////        String date = scanner.nextLine();
////        game.setReleaseDate(date);
////    }
////
////    private static void editName(Scanner scanner, Game game) {
////        scanner.nextLine();
////        System.out.println("Cập nhật tên mới:");
////        String name = scanner.nextLine();
////        game.setTitle(name);
////    }
////
////    private static void editGenre(Scanner scanner, Game game) {
////        scanner.nextLine();
////        System.out.println("Cập nhật thể loại:");
////        String genre = scanner.nextLine();
////        game.setGenre(genre);
////    }
////
////    private static void editPrice(Scanner scanner, Game game) {
////        scanner.nextDouble();
////        System.out.println("Cập nhật giá tiền:");
////        Double price = scanner.nextDouble();
////        game.setPrice(price);
////    }
////
////    private static void editRating(Scanner scanner, Game game) {
////        scanner.nextDouble();
////        System.out.println("Cập nhật điểm");
////        Double rating = scanner.nextDouble();
////        game.setRating(rating);
////    }
////}
//
//import java.time.LocalDate;
//import java.time.format.DateTimeParseException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class SearchService {
//    private ArrayList<Game> gameList;
//
//    public SearchService(ArrayList<Game> listGames) {
//        this.gameList = listGames;
//    }
//
//    public ArrayList<Game> searchAndDisplay(Scanner scanner) throws Exception {
//        scanner.nextLine();
//        int search;
//        do {
//            ArrayList<Game> result = new ArrayList<>();
//            System.out.println("Ấn 1 để tìm theo tên");
//            System.out.println("Ấn 2 để tìm theo thể loại");
//            System.out.println("Ấn 3 để tìm theo mức giá");
//            System.out.println("Ấn 4 để tìm theo mức điểm");
//            System.out.println("Ấn 5 để tìm theo ID");
//            System.out.println("Ấn 6 để tìm theo ngày phát hành");
//
//            search = scanner.nextInt();
//            switch (search) {
//                case 1:
//                    // Tìm theo tên
//                    searchByName(scanner, result);
//                    return result;
//                case 2:
//                    // Tìm theo thể loại
//                    searchByGenre(scanner, result);
//                    return result;
//                case 3:
//                    // Tìm theo mức giá
//                    searchByPrice(scanner, result);
//                    return result;
//                case 4:
//                    // Tìm theo mức điểm
//                    searchByRating(scanner, result);
//                    return result;
//                case 5:
//                    // Tìm theo ID
//                    searchByID(scanner, result);
//                    return result;
//                case 6:
//                    searchByDate(scanner, result);
//                    return result;
//                default:
//                    System.out.println("Không hợp lệ");
//            }
//        } while (true);
//    }
//
//    private void searchByName(Scanner scanner, ArrayList<Game> result) {
//        scanner.nextLine();
//        System.out.println("Nhập tên game cần tìm:");
//        String titleSearch = validateInput(scanner, "^[a-zA-Z0-9\\s]+$", "Tên game không hợp lệ.");
//        for (Game game : gameList) {
//            if (game.getTitle().contains(titleSearch)) {
//                result.add(game);
//            } else {
//                System.out.println("Không tìm thấy");
//            }
//        }
//    }
//
//    private void searchByGenre(Scanner scanner, ArrayList<Game> result) {
//        scanner.nextLine();
//        System.out.println("Nhập thể loại game cần tìm:");
//        String genreSearch = validateInput(scanner, "^[a-zA-Z\\s]+$", "Thể loại game không hợp lệ.");
//        for (Game game : gameList) {
//            if (game.getGenre().contains(genreSearch.toUpperCase())) {
//                result.add(game);
//            } else {
//                System.out.println("Không tìm thấy");
//            }
//        }
//    }
//
//    private void searchByPrice(Scanner scanner, ArrayList<Game> result) throws NumberFormatException {
//        try {
//            scanner.nextLine();
//            System.out.println("Nhập mức giá cao nhất:");
//            String maxRange = validateInput(scanner, "^[0-9]+(\\.[0-9]{1,2})?$", "Giá game không hợp lệ.");
//            System.out.println("Nhập mức giá nhỏ nhất:");
//            String minRange = validateInput(scanner, "^[0-9]+(\\.[0-9]{1,2})?$", "Giá game không hợp lệ.");
//            double max = Double.parseDouble(maxRange);
//            double min = Double.parseDouble(minRange);
//            for (Game game : gameList) {
//                double price = Double.parseDouble(game.getPrice());
//                if (price <= max && price >= min) {
//                    result.add(game);
//                }
//            }
//        } catch (NumberFormatException e) {
//            System.err.println("Lỗi: Nhập giá trị số hợp lệ.");
//        }
//    }
//
//    private void searchByRating(Scanner scanner, ArrayList<Game> result) throws NumberFormatException {
//        try {
//            scanner.nextLine();
//            System.out.println("Nhập mức điểm cao nhất:");
//            String maxScore = validateInput(scanner, "^[0-9]+(\\.[0-9])?$", "Số điểm đánh giá không hợp lệ.");
//            System.out.println("Nhập mức điểm nhỏ nhất:");
//            String minScore = validateInput(scanner, "^[0-9]+(\\.[0-9])?$", "Số điểm đánh giá không hợp lệ.");
//            double max = Double.parseDouble(maxScore);
//            double min = Double.parseDouble(minScore);
//            for (Game game : gameList) {
//                double rating = Double.parseDouble(game.getRating());
//                if (rating <= max && rating >= min) {
//                    result.add(game);
//                }
//            }
//        } catch (NumberFormatException e) {
//            System.err.println("Lỗi: Nhập giá trị số hợp lệ.");
//        }
//    }
//
//    private void searchByID(Scanner scanner, ArrayList<Game> result) {
//        scanner.nextLine();
//        System.out.println("Nhập mã ID cần tìm:");
//        String id = validateInput(scanner, "^[a-zA-Z0-9]+$", "ID không hợp lệ.");
//        for (Game game : gameList) {
//            if (id.contains(game.getId())) {
//                result.add(game);
//            } else {
//                System.out.println("Không tìm thấy.");
//            }
//        }
//    }
//
//    private void searchByDate(Scanner scanner, ArrayList<Game> result) throws Exception {
//        try {
//            scanner.nextLine();
//            System.out.println("Nhập khoảng thời gian tìm kiếm:");
//            System.out.println("Từ ngày: ");
//            String oldestDate = validateInput(scanner, "^\\d{4}-\\d{2}-\\d{2}$", "Ngày phát hành không hợp lệ.");
//            System.out.println("Đến ngày: ");
//            String newestDate = validateInput(scanner, "^\\d{4}-\\d{2}-\\d{2}$", "Ngày phát hành không hợp lệ.");
//            LocalDate od = LocalDate.parse(oldestDate);
//            LocalDate nd = LocalDate.parse(newestDate);
//            for (Game game : gameList) {
//                LocalDate date = LocalDate.parse(game.getReleaseDate());
//                int checkFirst = date.compareTo(od);
//                int checkLast = date.compareTo(nd);
//                if (checkFirst >= 0 && checkLast <= 0) {
//                    result.add(game);
//                }
//            }
//        } catch (NumberFormatException | DateTimeParseException e) {
//            System.err.println("Lỗi: Nhập định dạng ngày không hợp lệ.");
//        }
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
//
//    public void displayGame(ArrayList<Game> list) {
//        for (Game game : list) {
//            System.out.println("\n" + game);
//        }
//    }
//}
