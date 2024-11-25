package com.example.board.dao;

import com.example.board.dto.BoardTO;
import com.example.board.mapper.BoardMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardDAO {

    //@Autowired
    private BoardMapper boardMapper;

    //@Autowired
    public BoardDAO(BoardMapper boardMapper) {this.boardMapper = boardMapper;}

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    // @Autowired
    // private JdbcTemplate jdbcTemplate;

    public ArrayList<BoardTO> boardList() {
        ArrayList<BoardTO> lists = boardMapper.list();
        logger.info("logger : {} ", "데이터 개수 : " + lists.size());
        return lists;
    }

    public int boardWriteOk(BoardTO to) {
        // flag는 처리에 대한 결과
        // flag가 0이면 정상
        // flag가 0이 아니면 비정상
        int flag = 1;
        //String sql = "insert into board1 values(0, ?, ?, ?, password(?), ?, 0, ?, now())";
        //int result = jdbcTemplate.update(sql, to.getSubject(), to.getWriter(), to.getMail(), to.getPassword(), to.getContent(), to.getWip());
        int result = boardMapper.write_ok(to);
        if (result == 1) {
            flag = 0;
        }
        return flag;
    }

    public BoardTO boardView(BoardTO to){
        boardMapper.view_hit(to);
        to = boardMapper.view(to);
        return to;
    }

    public BoardTO boardModify(BoardTO to){
        // String sql = "select seq, subject, writer, mail, content from board1 where seq=?";
        // to = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(BoardTO.class), to.getSeq());
        to = boardMapper.modify(to);
        return to;
    }

    public int boardModifyOk(BoardTO to) {
        int flag = 2;
        // String sql = "update board1 set subject=?, mail=?, content=? where seq=? and password=password(?)";
        // int result = jdbcTemplate.update(sql, to.getSubject(), to.getMail(), to.getContent(), to.getSeq(), to.getPassword());
        int result = boardMapper.modify_ok(to);
        if(result==0){
            flag=1;
        }else if(result==1){
            flag=0;
        }
        return flag;
    }

    public BoardTO boardDelete(BoardTO to){
        // String sql = "select seq, subject, writer from board1 where seq=?";
        // to = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(BoardTO.class), to.getSeq());
        to = boardMapper.delete(to);
        return to;
    }

    public int boardDeleteOk(BoardTO to) {
        int flag = 2;

        // String sql = "delete from board1 where seq=? and password=password(?)";
        // int result = jdbcTemplate.update(sql, to.getSeq(), to.getPassword());
        int result = boardMapper.delete_ok(to);

        if(result ==0){
            flag = 1;
        } else if(result == 1){
            flag = 0;
        }
        return flag;
    }
}
