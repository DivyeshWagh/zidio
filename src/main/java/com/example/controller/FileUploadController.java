package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.service.FileUploadService;

@RestController
@RequestMapping("/api/upload")
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/resume")
    public ResponseEntity<String> uploadResume(@RequestParam("file") MultipartFile file) {
        String url = fileUploadService.uploadFile(file, "resume");
        return ResponseEntity.ok(url);
    }

    // FIX: Changed path to be unique "/certificate"
    @PostMapping("/certificate")
    public ResponseEntity<String> uploadCertificate(@RequestParam("file") MultipartFile file) {
        String url = fileUploadService.uploadFile(file, "certificate");
        return ResponseEntity.ok(url);
    }

    // FIX: Changed path to be unique "/invoice"
    @PostMapping("/invoice")
    public ResponseEntity<String> uploadInvoice(@RequestParam("file") MultipartFile file) {
        String url = fileUploadService.uploadFile(file, "invoice");
        return ResponseEntity.ok(url);
    }
}