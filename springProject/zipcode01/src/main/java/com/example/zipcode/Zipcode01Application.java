package com.example.zipcode;

import com.example.zipcode.model.ZipcodeDAO;
import com.example.zipcode.model.ZipcodeTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Zipcode01Application implements CommandLineRunner {

    @Autowired
    private ZipcodeDAO dao;

    public static void main(String[] args) {
        SpringApplication.run(Zipcode01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ArrayList<ZipcodeTO> lists = dao.searchZipcode(args[0]);
        for(ZipcodeTO to:lists){
            System.out.printf("[%s] %s %s %s %s %s%n", to.getZipcode(),to.getSido(), to.getGugun(),to.getDong(),to.getRi(),to.getBunji());
        }
    }
}
