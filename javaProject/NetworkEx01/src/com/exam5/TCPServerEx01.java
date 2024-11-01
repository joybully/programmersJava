package com.exam5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {
    public static void main(String[] args) {
        // 무한 대기중 서버
        ServerSocket serverSocket = null;
        Socket socket = null;

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 준비되었습니다.");
            while(true){
                try {
                    socket = serverSocket.accept();
                    System.out.println("클라이언트가 연결되었습니다.");

                    br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
                    bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));

                    bw.write(br.readLine() + System.lineSeparator());

                    bw.flush();

                    System.out.println("전송완료");
                } catch (IOException e1) {
                    System.out.println("[에러] : " + e1.getMessage());
                } finally {
                    if(br!=null){try{br.close();}catch(IOException e){}}
                    if(bw!=null){try{bw.close();}catch(IOException e){}}
                    if(socket!=null){try{socket.close();}catch(IOException e){}}
                }
            }
        } catch (IOException e2) {
            System.out.println("[에러] : " + e2.getMessage());
        } finally {
            if(serverSocket!=null){try{serverSocket.close();}catch(IOException e){}}
        }
    }
}
