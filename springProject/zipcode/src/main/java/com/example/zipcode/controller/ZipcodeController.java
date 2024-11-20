package com.example.zipcode.controller;

import com.example.zipcode.model.ZipcodeDAO;
import com.example.zipcode.model.ZipcodeTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ZipcodeController {
    @Autowired
    private ZipcodeDAO zipcodeDAO;

    @RequestMapping("/zipcode.do")
    public ModelAndView zipcode(){
        return new ModelAndView("zipcode");
    }

    @RequestMapping("/zipcode_ok.do")
    public String zipcode_ok(String dong, Model model) {
        List<ZipcodeTO> result = zipcodeDAO.zipcode_ok(dong);
        StringBuilder sbHtml = new StringBuilder();
        for(int i=0; i<result.size(); i++){
            ZipcodeTO to = result.get(i);
            sbHtml.append(String.format("[%s] %s %s %s %s %s#", to.getZipcode(), to.getSido(), to.getGugun(), to.getDong(), to.getRi(), to.getBunji()));
        }
        model.addAttribute("result", sbHtml.toString());
        return "zipcode_ok";
    }
}
