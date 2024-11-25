package com.example.board.dao;

import com.example.board.dto.BoardTO;
import com.example.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BoardDAO {

    @Autowired
    private BoardMapper boardMapper;

    public ArrayList<BoardTO> boardList() {
        return boardMapper.list();
    }

    public BoardTO boardView(BoardTO to) {
        boardMapper.view_hit(to);
        return boardMapper.view(to);
    }

    public int boardWriteOk(BoardTO to) {
        int flag = 1;

        int result = boardMapper.write_ok(to);

        if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

    public BoardTO boardModify(BoardTO to) {
        return boardMapper.modify(to);
    }

    public int boardModifyOK(BoardTO to) {
        int flag = 2;

        int result = boardMapper.modify_ok(to);

        if( result == 0 ) {
            flag = 1;
        } else if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

    public  BoardTO boardDelete(BoardTO to) {
        return boardMapper.delete(to);
    }

    public int boardDeleteOK(BoardTO to) {
        int flag = 2;

        int result = boardMapper.delete_ok(to);

        if( result == 0 ) {
            flag = 1;
        } else if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

}
