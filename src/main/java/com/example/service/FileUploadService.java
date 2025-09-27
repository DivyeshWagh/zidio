package com.example.service;

import java.io.IOException;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import jakarta.mail.Folder;

@Service
public class FileUploadService {

	@Autowired
	private Cloudinary cloudinary;
	
	public String uploadFile(MultipartFile file, String folder) {
		
		Map<String, Object> uploadResult;
		try {
			uploadResult = cloudinary.uploader().upload(file.getBytes(),ObjectUtils.asMap("folder",folder));
			return uploadResult.get("secure_url").toString();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to upload files",e);
		}
	
		
	}
}
