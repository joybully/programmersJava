import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menuInput;
        boolean flag = true;
        while(flag){
            String screen;
            Screen scene = new Screen();
            screen = scene.getFirstPage();
            System.out.print(screen);
            menuInput = scanner.nextLine();
            screen = scene.getPage(menuInput);
            System.out.println(screen);
            if(screen.trim().equals("flag = false")) flag = false;
        }

    }
}
