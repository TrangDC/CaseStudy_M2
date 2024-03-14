package src;

import Interface.Regex_Number;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Method.*;

public class GameManager implements Regex_Number {
    private ArrayList<Game> listGames;
    private AddService addService;
    private RemoveService removeService;
    private ReadListService readListService;
    private EditService editService;
    private SortService sortService;
    private SearchService searchService;
    private PrintService printService;
    private UploadService uploadService;

    public GameManager() {
        this.listGames = new ArrayList<Game>();
        addService = new AddService(listGames);
        removeService = new RemoveService(listGames);
        readListService = new ReadListService(listGames);
        editService = new EditService(listGames);
        sortService = new SortService(listGames);
        searchService = new SearchService(listGames);
        printService = new PrintService(listGames);
        uploadService = new UploadService(listGames);
    }

    public void start() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        try {
            while (check) {
                System.out.println("\n----------App quản lý game digital------------");
                System.out.println("1. Thêm game vào danh sách");
                System.out.println("2. Xóa game khỏi danh sách");
                System.out.println("3. Hiện toàn bộ danh sách game");
                System.out.println("4. Cập nhật thông tin game");
                System.out.println("5. Sắp xếp danh sách game");
                System.out.println("6. Tìm kiếm game");
                System.out.println("7. In danh sách game ra file");
                System.out.println("8. Thêm game vào danh sách từ file");
                System.out.println("9. Thoát app.");

                int x = scanner.nextInt();
                switch (x) {
                    case One:
                        addService.addGamesFromUserInput(scanner);
                        break;
                    case Two:
                        removeService.removeGame(scanner);
                        break;
                    case Three:
                        readListService.readList();
                        break;
                    case Four:
                        editService.editGame(scanner);
                        break;
                    case Five:
                        sortService.sortGameList(scanner);
                        break;
                    case Six:
                        ArrayList<Game> result = searchService.searchAndDisplay(scanner);
                        searchService.displayGame(result);
                        break;
                    case Seven:
                        printService.printToFile();
                        break;
                    case Eight:
                        uploadService.loadFromFile(scanner);
                        break;
                    case Nine:
                        check = exitProgram();
                        break;
                    default:
                        System.out.println("Không hợp lệ. Vui lòng thử lại.");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Không hợp lệ. Vui lòng thử lại.");
            start();
        }
    }

    private boolean exitProgram() {
        System.out.println("Bái bai");
        return false;
    }
}
