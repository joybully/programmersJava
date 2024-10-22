package com.lang1;

public class ProcessBuilderEx01 {
    public static void main(String[] args) throws Exception{
        ProcessBuilder pb1 = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        pb1.start();
        ProcessBuilder pb2 = new ProcessBuilder("C:\\Windows\\System32\\notepad.exe");
        pb2.start();

    }
}
