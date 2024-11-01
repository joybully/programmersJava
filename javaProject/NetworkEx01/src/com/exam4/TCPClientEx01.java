package com.exam4;

import java.io.*;
import java.net.Socket;

public class TCPClientEx01 {
    public static void main(String[] args) {
        Socket socket = null;

        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            socket = new Socket("localhost", 7777);
            System.out.println("서버와 연결을 시작합니다.");

            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
            br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
            bw.write("안녕 Socket" + System.lineSeparator());

            bw.flush();
            System.out.println("[에코메세지] " + br.readLine());
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally {
            if(socket!=null){try{socket.close();}catch(IOException e){}}
            if(bw!=null){try{bw.close();}catch(IOException e){}}
        }

    }
}
