public class ScreenEx01 {
    private final String LINE = "========================================================================\n";
    private final String READ = "1. 회원정보목록\n";
    private final String CREATE = "2. 회원정보등록\n";
    private final String UPDATE = "3. 회원정보수정\n";
    private final String DELETE = "4. 회원정보삭제\n";
    private final String MSG = "5. 쪽지 보내기\n";
    private final String EXIT = "6. 종료\n";
    private final String MENU = "메뉴를 입력하세요 : ";
    private String title;
    StringBuilder getFirstPage(){
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
        return result;
    }

    StringBuilder getListpage(){
        StringBuilder result = new StringBuilder();
        result.append()
    }
}
