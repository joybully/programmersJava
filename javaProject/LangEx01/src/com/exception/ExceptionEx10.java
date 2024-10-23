package com.exception;

import java.io.IOException;

public class ExceptionEx10 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        // 에러난다
        // exception 처리를 안해줘서
        // pb.start();
        try {
            pb.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
