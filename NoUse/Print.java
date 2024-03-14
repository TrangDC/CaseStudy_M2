//package Method;
//import Interface.Digital_Game_Store;
//import src.Game;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Print extends Digital_Game_Store {
//    private ArrayList<Game> gameList;
//
//    public Print(ArrayList<Game> gameList) {
//        this.gameList = gameList;
//    }
//
//    @Override
//    public void printToFile() {
//        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Nhập đường dẫn file:");
//            String path = input.nextLine();
//            FileWriter file = new FileWriter(path);
//            PrintWriter fw = new PrintWriter(file);
//            for (Game game : gameList) {
//                fw.println(game);
//            }
//            System.out.println("Đã in ra thành công!");
//            fw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
