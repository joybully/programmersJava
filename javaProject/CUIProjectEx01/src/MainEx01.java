import java.util.Scanner;

public class MainEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            ScreenEx01 page = new ScreenEx01();
            StringBuilder firstPage = page.getFirstPage();
            System.out.print(firstPage);
            String input = sc.nextLine();
            System.out.println(input);

        }
    }
}
