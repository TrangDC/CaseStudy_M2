//package Method;
//import Interface.Digital_Game_Store;
//import src.Game;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Remove extends Digital_Game_Store {
//    private ArrayList<Game> gameList;
//    public Remove(ArrayList<Game> gameList) {
//        this.gameList = gameList;
//    }
//    @Override
//    public void removeGame(Scanner scanner) {
//        scanner.nextLine();
//        System.out.println("Nhập mã ID game muốn xóa");
//        String id = String.valueOf(scanner.nextInt());
//        for (Game game : gameList) {
//            if (game.getId().equals(id)) {
//                System.out.println("Đã xóa thành công");
//                gameList.remove(game);
//                break;
//            }
//        }
//    }
//}
