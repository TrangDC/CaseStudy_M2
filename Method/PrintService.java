package Method;

import Interface.Regex_Number;
import src.Game;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintService implements Regex_Number {
    private ArrayList<Game> gameList;
    public PrintService(ArrayList<Game> listGames) {
        this.gameList = listGames;
    }
    public void printToFile() throws InputMismatchException{
        try {
            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.println("1. In ra file txt");
                System.out.println("2. In ra file dat");
                int choice = input.nextInt();
                switch (choice) {
                    case One:
                        PrintToText();
                        return;
                    case Two:
                        PrintToObject();
                        return;
                    default:
                        System.out.println("Mời nhập lại.");
                        return;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Mời bạn nhập lại");
            printToFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void PrintToObject() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Game_Management/File/data.dat"));
        oos.writeObject(gameList);
        System.out.println("Đã in ra thành công!");
        oos.close();
    }

    private void PrintToText() throws IOException {
        FileWriter file = new FileWriter("Game_Management/File/data.txt");
        PrintWriter fw = new PrintWriter(file);
        for (Game game : gameList) {
            fw.println(game);
        }
        System.out.println("Đã in ra thành công!");
        fw.close();
    }
}
