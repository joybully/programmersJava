import java.sql.SQLOutput;
import java.util.Scanner;

public class Screen {
    private final String LINE = "=============================================================================================\n";
    private final String READ = "1. 회원정보목록\n";
    private final String CREATE = "2. 회원정보등록\n";
    private final String UPDATE = "3. 회원정보수정\n";
    private final String DELETE = "4. 회원정보삭제\n";
    private final String MSG = "5. 쪽지 보내기\n";
    private final String EXIT = "6. 종료\n";
    private final String MENU = "메뉴를 입력하세요 : ";
    private String title;
    private Scanner sc = new Scanner(System.in);

    String getFirstPage() {
        this.title = "                              회원관리프로그램\n";
        StringBuilder result = new StringBuilder();
        result.append(title)
                .append(LINE)
                .append(READ)
                .append(CREATE)
                .append(UPDATE)
                .append(DELETE)
                .append("\n")
                .append(MSG)
                .append("\n")
                .append(EXIT)
                .append(LINE)
                .append(MENU);
        return result.toString();
    }

    String getPage(String menuInput) {
        StringBuilder result = new StringBuilder();
        switch (menuInput) {
            case "1":
                result.append("\n").append("                                회원정보목록").append("\n");
                // 회원정보목록
                result.append(LINE);
                result.append("번호     이름    연락처             이쪽지              그룹    생년월일      등록일\n");
                result.append(LINE);
                // 메서드
                Util u1 = new Util();
                result.append(u1.selectMember());
                break;

            case "2":
                System.out.println("\n                                회원정보등록\n\n등록할 회원정보를 입력해주세요\n");
                System.out.print(">> 이름 : ");
                String userName = sc.nextLine();
                System.out.print(">> 연락처 : ");
                String userPhone = sc.nextLine();
                System.out.print(">> 이쪽지 : ");
                String userEmail = sc.nextLine();
                System.out.print(">> 그룹 : ");
                String userGroup = sc.nextLine();
                System.out.print(">> 생년월일 : ");
                String userBirth = sc.nextLine();
                System.out.print("회원정보를 등록하시겠습니까(y/n)");
                String enroll = sc.nextLine().trim();
                if (!enroll.equals("y")) {
                    System.out.println("회원정보등록에 실패했습니다.");
                    result.setLength(0);
                    break;
                }
                Util u2 = new Util();
                result.append(u2.insertMember(userName, userPhone, userEmail, userGroup, userBirth));
                break;
            case "3":
                System.out.println("\n                                회원정보수정\n\n");
                Util u3 = new Util();
                System.out.print("수정할 회원의 등록번호를 입력해주세요 : ");
                String userNo = sc.nextLine();
                result.append("\n").append(u3.updateMember1(userNo)).append("\n회원정보수정을 계속하시겠습니까(y/n)?");
                System.out.print(result);
                String update;
                update = sc.nextLine().trim();
                if (!update.equals("y")) {
                    System.out.println("\n회원정보등록에 실패했습니다.");
                    result.setLength(0);
                    break;
                }
                System.out.println("\n** 입력하지 않으면 기존의 정보가 그대로 유지됩니다.");
                System.out.print(">> 수정할 이름 : ");String userName1 = sc.nextLine();
                System.out.print(">> 수정할 연락처 : ");String userPhone1 = sc.nextLine();
                System.out.print(">> 수정할 이쪽지 : ");String userEmail1 = sc.nextLine();
                System.out.print(">> 수정할 그룹 : ");String userGroup1 = sc.nextLine();
                System.out.print(">> 수정할 생년월일 : ");String userBirth1 = sc.nextLine();
                System.out.println('\n');
                System.out.println("회원정보를 수정하시겠습니까(y/n)");
                update = sc.nextLine().trim();
                if (!update.equals("y")) {
                    System.out.println("\n회원정보등록에 실패했습니다.");
                    result.setLength(0);
                    break;
                }
                System.out.print("\n");
                String update2 = u3.updateMember2(userNo, userName1, userPhone1, userEmail1, userGroup1, userBirth1);
                result.setLength(0);
                System.out.println(update2);
                break;
            case "4":
                System.out.println("\n                                회원정보삭제\n\n");
                Util u4 = new Util();
                System.out.print("수정할 회원의 등록번호를 입력해주세요 : ");
                String userNo1 = sc.nextLine();
                String result1 = u4.deleteMember1(userNo1);
                System.out.println(result1);
                if(result1.equals("입력하신 회원등록에 해당하는 회원은 존재하지 않습니다.")){
                    result.setLength(0);
                    break;
                }
                System.out.println("회원정보삭제를 계속하시겠습니까(y/n)");
                update = sc.nextLine().trim();
                if (!update.equals("y")) {
                    System.out.println("\n회원정보삭제에 실패했습니다.");
                    result.setLength(0);
                    break;
                }
                System.out.print("\n");
                result1 = u4.deleteMember2(userNo1);
                System.out.println(result1);
                break;
            case "5":
                result.append("\n").append("                                쪽지 보내기\n").append("\n");
                break;
            case "6":
                result.append("flag = false");
                break;
            default:
                result.append("\n").append("잘못된 값을 입력하셨습니다.\n").append("입력은 1~5, 6을 입력해주세요.\n\n");
                break;
        }
        return result.toString();
    }
}
