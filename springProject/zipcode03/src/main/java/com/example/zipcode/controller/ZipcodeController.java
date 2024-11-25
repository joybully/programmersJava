package com.example.zipcode.controller;

import com.example.zipcode.model.ZipcodeDAO;
import com.example.zipcode.model.ZipcodeTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ZipcodeController {

    // log 형태로 디버깅
    private final Logger logger = LoggerFactory.getLogger(ZipcodeController.class);

    @Autowired
    private ZipcodeDAO zipcodeDAO;

    @RequestMapping("/zipcode.do")
    public String zipcode() {
        return "zipcode";
    }

    @RequestMapping("/zipcode_ok.do")
    public String zipcode_ok(String strDong, Model model) {

        ArrayList<ZipcodeTO> lists = zipcodeDAO.zipcode_ok(strDong);
        // System.out.println(lists.size());
        logger.info("logger:{}", "zipcode_ok : " + lists.size());
        model.addAttribute("lists", lists);
        return "zipcode_ok";
    }
}
