package com.liu.dianmall.fastdfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.liu.dianmall.fastdfs.fastdfs.FdfsClient;

import java.io.File;
import java.io.IOException;

/**
 * @author Zhifeng.Zeng
 * @descrption 测试图片 控制类
 * @date 2020/06/04 19:14
 */
@RestController
@RequestMapping("fastdfs")
public class FastdfsTestController {

    @Autowired
    private FdfsClient fdfsClient;

    @PostMapping("/image")
    public String uploadFile(MultipartFile multipartFile) throws IOException {
        // 获取文件名
        String fileName = multipartFile.getOriginalFilename();
        // 获取文件后缀
        String prefix = fileName.substring(fileName.lastIndexOf("."));
        
        // 若需要防止生成的临时文件重复,可以在文件名后添加随机码
        File file = File.createTempFile(fileName.substring(0,fileName.lastIndexOf(".")), prefix);

        String imageUrl = fdfsClient.uploadFile(file);

        return imageUrl;
    }


    @DeleteMapping("/image")
    public String deleteFile(String imageUrl){

        fdfsClient.deleteFile(imageUrl);
        return "success";
    }
}
