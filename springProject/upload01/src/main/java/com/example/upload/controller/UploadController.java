package com.example.upload.controller;

import jakarta.servlet.http.HttpServletRequest;
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
import java.util.Date;

@Controller
public class UploadController {
    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/form_ok")
    public String form_ok(@RequestParam MultipartFile upload) {
        // if (upload != null) {
        if(!upload.isEmpty()){
            try {
                // java.io.File
                System.out.println(upload.getOriginalFilename());
                // upload.transferTo(new File("c:/java/upload",upload.getOriginalFilename()));
                // 같은 이름의 파일이면 오버라이팅이 된다
                // 파일이름 정책을 만들어야 한다

                // 파일이름-시간(타임스탬프).확장자
                String fileName = upload.getOriginalFilename().substring(0,upload.getOriginalFilename().lastIndexOf("."));
                String extension = upload.getOriginalFilename().substring(upload.getOriginalFilename().lastIndexOf("."));
                // System.out.println(fileName);
                // System.out.println(extension);

                upload.transferTo(new File("c:/java/upload",fileName+"-"+System.nanoTime()+extension));

            } catch (IOException e) {
                System.out.println("[에러] : "+e.getMessage());
            }
        } else {
            System.out.println("업로드 없음");
        }
        return "form_ok";
    }

    @RequestMapping("/form_ok2")
    // public String form_ok2(@RequestParam MultipartFile upload, HttpServletRequest request) {
    public String form_ok2(
            MultipartFile upload,
            String userid,
            String userpw,
            Model model) {
        // System.out.println(request.getParameter("userid"));
        // System.out.println(request.getParameter("userpw"));
        System.out.println(userid);
        System.out.println(userpw);
        String file= "";
        if (!upload.isEmpty()) {
            try {
                String fileName = upload.getOriginalFilename().substring(0, upload.getOriginalFilename().lastIndexOf("."));
                String extension = upload.getOriginalFilename().substring(upload.getOriginalFilename().lastIndexOf("."));
                file = fileName + "-" + System.nanoTime() + extension;
                upload.transferTo(new File("C:\\java\\springProject\\upload01\\src\\main\\resources\\static\\upload", file));

            } catch (IOException e) {
                System.out.println("[에러] : " + e.getMessage());
            }
        } else {
            System.out.println("업로드 없음");
        }
        model.addAttribute("file", file);
        return "form_ok";
    }

    @RequestMapping("/view")
    public String view(String file, Model model){
        model.addAttribute("file", file);
        return "view";
    }

    @RequestMapping("/form_ok3")
    // public String form_ok2(@RequestParam MultipartFile upload, HttpServletRequest request) {
    public String form_ok3(
            MultipartFile upload,
            Model model) {
        String file= "";
        if (!upload.isEmpty()) {
            try {
                String fileName = upload.getOriginalFilename().substring(0, upload.getOriginalFilename().lastIndexOf("."));
                String extension = upload.getOriginalFilename().substring(upload.getOriginalFilename().lastIndexOf("."));
                file = fileName + "-" + System.nanoTime() + extension;
                upload.transferTo(new File("C:\\java\\upload", file));

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
        String path = "c:/java/upload/" + strFile;

        Path filePath = Paths.get(path);
        Resource resource = new InputStreamResource(Files.newInputStream(filePath));

        File file = new File(path);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentDisposition(ContentDisposition.builder("attachment").filename(file.getName()).build());
        return new ResponseEntity<Object>(resource, headers, HttpStatus.OK);
    }
}
