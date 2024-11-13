package com.example.model3;

import com.example.model1.ZipcodeDAO;
import com.example.model1.ZipcodeTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;

public class ZipcodeOkAction implements Action {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("ZipcodeOkAction called");
        String dong = req.getParameter("dong");
        System.out.println("dong : " + dong);

        ZipcodeDAO dao = new ZipcodeDAO();
        ArrayList<ZipcodeTO> lists = dao.zipcodeList(dong);
        System.out.println("갯수 : " + lists.size());

        req.setAttribute("lists", lists);
    }
}
