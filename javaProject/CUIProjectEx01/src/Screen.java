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
    String getFirstPage(){
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

    String getPage(String menuInput){
        StringBuilder result = new StringBuilder();
        switch( menuInput ) {
            case "1":
                result.append("\n").append("                                회원정보목록").append("\n");
                // 회원정보목록
                result.append(LINE);
                result.append("번호     이름    연락처             이쪽지              그룹    생년월일      등록일\n");
                result.append(LINE);
                // 메서드
                Util u = new Util();
                result.append(u.selectMember());
                break;

            case "2":
                result.append("\n").append("                                회원정보등록\n").append("\n");
                break;
            case "3":
                result.append("\n").append("                                회원정보수정\n").append("\n");
                break;
            case "4":
                result.append("\n").append("                                회원정보삭제\n").append("\n");
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

/*System.out.println( "                           회원 관리 프로그램" );

    whileLoop:
            while ( true ) {
        System.out.println("========================================================================");
        System.out.println();
        System.out.println( "1. 회원정보목록" );
        System.out.println( "2. 회원정보등록" );
        System.out.println( "3. 회원정보수정" );
        System.out.println( "4. 회원정보삭제" );
        System.out.println();
        System.out.println( "5. 쪽지 보내기" );
        System.out.println();
        System.out.println( "6. 종료" );
        System.out.println();
        System.out.println("========================================================================");
        System.out.println();
        System.out.print( "메뉴를 입력하세요 : " );

        menuInput = scanner.nextLine();

        switch( menuInput ) {
            case "1":
                System.out.println();
                System.out.println( "회원정보목록" );
                // 회원정보목록 흐흠
                // 메서드
                Util u = new Util();
                u.selectMember();
                System.out.println();
                break;

            case "2":
                System.out.println();
                System.out.println( "회원정보등록" );
                System.out.println();
                break;
            case "3":
                System.out.println();
                System.out.println( "회원정보수정" );
                System.out.println();
                break;
            case "4":
                System.out.println();
                System.out.println( "회원정보삭제" );
                System.out.println();
                break;
            case "5":
                System.out.println();
                System.out.println( "쪽지 보내기" );
                System.out.println();
                break;
            case "6":
                scanner.close();
                break whileLoop;
            default:
                System.out.println();
                System.out.println( "잘못된 값을 입력하셨습니다." );
                System.out.println( "입력은 1~5, 6 을 입력해주세요." );
                System.out.println();
                break;
        }
    }
        System.out.println();
        System.out.println( "시스템을 종료합니다." );
        System.out.println();*/
}
