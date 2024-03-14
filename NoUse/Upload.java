//package Method;
//
//import Interface.Digital_Game_Store;
//import src.Game;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Upload extends Digital_Game_Store {
//    private ArrayList<Game> gameList;
//
//    public Upload(ArrayList<Game> gameList) {
//        this.gameList = gameList;
//    }
//
//    @Override
//    public void loadFromFile() throws IOException {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập đường dẫn file:");
//        try {
//            String filepath = input.nextLine();
//            String line = null;
//
//            FileReader fileReader = new FileReader(filepath);
//            BufferedReader reader = new BufferedReader(fileReader);
//
//            while ((line = reader.readLine()) != null) {
//                String[] temp = line.split(",");
//                String title = temp[0];
//                String id = temp[1];
//                String genre = temp[2];
//                Double price = Double.parseDouble(temp[3]);
//                Double rating = Double.parseDouble(temp[4]);
//                String releaseDate = temp[5];
//
//                gameList.add(new Game(title, id, genre, price, rating, releaseDate));
//            }
//            reader.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
