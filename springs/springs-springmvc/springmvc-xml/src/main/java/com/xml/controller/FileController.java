package com.xml.controller;

import com.xml.util.FileUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @author lbs
 * @description 文件上传测试
 */
@Controller
public class FileController {
    @GetMapping("file")
    public String filePage() {
        return "file";
    }

    /**
     * 但文件上传
     * @param file 1
     * @param session 2
     * @return 3
     */
    @PostMapping("upFile")
    public String upFile(MultipartFile file, HttpSession session) {
        // 保存在项目目录 image 文件下，如果文件不存在则创建
        FileUtil.saveFile(file, session.getServletContext().getRealPath("/image"));
        return "success";
    }

    /**
     * 多文件上传
     * @param files 1
     * @param session 2
     * @return 3
     */
    @PostMapping("upFiles")
    public String upFile(@RequestParam(name = "file") MultipartFile[] files, HttpSession session) {
        for (MultipartFile file : files) {
            FileUtil.saveFile(file, session.getServletContext().getRealPath("images"));
        }
        return "success";
    }

    /**
     * 多文件上传方式 - 分别为不同文件制定不同名字
     * @param extendParam 1
     * @param file1 2
     * @param file2 3
     * @param session 4
     * @return 5
     */
    @RequestMapping("upFiles2")
    public String upFile(String extendParam,
                         @RequestParam(name = "file1") MultipartFile file1,
                         @RequestParam(name = "file2") MultipartFile file2,
                         HttpSession session) {
        String realPath = session.getServletContext().getRealPath("images2");
        FileUtil.saveFile(file1, realPath);
        FileUtil.saveFile(file2, realPath);
        System.out.println("extendParam:" + extendParam);
        return "success";
    }

    public ResponseEntity<byte[]> downloadFile(String filePath) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        File file = new File(filePath);
        // 解决文件名中文乱码
        String fileName = new String(file.getName().getBytes("UTF-8"), "iso-8859-1");
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", fileName);

        /*return new ResponseEntity<>(FileUtil.readFileToByteArray(file),
                headers, HttpStatus.CREATED);*/
        return null;
    }
}
