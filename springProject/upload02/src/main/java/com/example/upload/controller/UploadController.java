package com.example.upload.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class UploadController {
    @RequestMapping("/upload_form")
    public String upload_form() {
        return "upload_form";
    }

    @RequestMapping("/upload_ok")
    public String upload_ok(
            MultipartFile upload,
            String userid,
            String userpw,
            Model model) {
        System.out.println(userid);
        System.out.println(userpw);
        String file = "";
        if (!upload.isEmpty()) {
            try {
                String fileName = upload.getOriginalFilename().substring(0, upload.getOriginalFilename().lastIndexOf("."));
                String extension = upload.getOriginalFilename().substring(upload.getOriginalFilename().lastIndexOf("."));
                file = fileName + "-" + System.nanoTime() + extension;
                upload.transferTo(new File("C:\\java\\upload2", file));

            } catch (IOException e) {
                System.out.println("[에러] : " + e.getMessage());
            }
        } else {
            System.out.println("업로드 없음");
        }
        model.addAttribute("file", file);
        return "list";
    }

    @RequestMapping("/download")
    public ResponseEntity<Object> download(@RequestParam("file") String strFile) throws IOException{
        String path = "c:/java/upload2/" + strFile;

        Path filePath = Paths.get(path);
        Resource resource = new InputStreamResource(Files.newInputStream(filePath));

        File file = new File(path);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentDisposition(ContentDisposition.builder("attachment").filename(file.getName()).build());
        return new ResponseEntity<Object>(resource, headers, HttpStatus.OK);
    }
}
