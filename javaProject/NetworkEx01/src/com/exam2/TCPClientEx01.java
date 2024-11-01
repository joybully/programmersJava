package com.exam2;

import java.io.IOException;
import java.net.Socket;

public class TCPClientEx01 {
    public static void main(String[] args) {
        Socket socket = null;

        try {
            socket = new Socket("localhost", 7777);
            System.out.println("서버와 연결을 시작합니다.");
        } catch (IOException e) {
            System.out.println("[에러] : "+e.getMessage());
        } finally {
            if(socket!=null){try{socket.close();}catch(IOException e){}}
        }

    }
}
