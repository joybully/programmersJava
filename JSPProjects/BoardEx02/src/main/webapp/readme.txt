1. 데이터베이스 모델링
테이블&컬럼
=> ERD

번호       seq            int                    not null  primary key  auto_increment
제목       subject       varchar(150)       not null
글쓴이    writer         varchar(12)         not null
이메일    mail           varchar(50)
비밀번호 password    varchar(41)         not null
내용       content       varchar(2000)
조회       hit              int                    not null
아이피    wip            varchar(15)         not null
등록일    wdate         date                  not null

create table board1(
seq int not null primary key auto_increment,
subject varchar(150) not null,
writer varchar(12) not null,
mail varchar(50),
password varchar(41) not null,
content varchar(2000),
hit int not null,
wip varchar(15) not null,
wdate date not null
);

insert into board1 values(0, '제목', '이름', 'test@test.com', password('1234'), '내용', 0, '000.000.000.000', now());

데이터베이스명 : board
사용자 : board
비밀번호 : 123456

2. 페이지간의 흐름(페이지 네비게이션) => 다른 사이트 참조

DFD(Data Flow Diagram)

board_list1.jsp(목록)
    (~X) -> board_write1.jsp(쓰기)
		-> (테이블에 입력) -> (~글쓰기 내용) -> board_write1_ok.jsp(쓰기)
			-> (자동이동) -> board_list1.jsp
	(pk : seq) -> board_view1.jsp(상세보기)
		(~pk : seq) -> board_modify1.jsp(수정)
			-> (테이블에서 수정) ->(~seq+글 수정내용) -> board_modify1_ok.jsp(수정)
				-> (자동이동) -> board_view1.jsp
		(~pk : seq) -> board_delete1.jsp(삭제)
			-> (테이블에서 삭제) -> (~seq + password) -> board_delete1_ok.jsp(삭제)
				-> (자동이동)  -> board_list1.jsp

프로그램 순서
- 데이터베이스 연결 설정
1. board_write1.jsp -> board_write1_ok.jsp
2. board_write1_ok.jsp -> board_list1.jsp
3. board_list1.jsp -> board_view1.jsp
4. board_view1.jsp -> board_modify1.jsp(board_delete1.jsp)
5. board_list1.jsp