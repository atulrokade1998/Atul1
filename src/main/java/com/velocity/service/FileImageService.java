package com.velocity.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.velocity.model.FileImage;
import com.velocity.service.FileImageService;

public interface FileImageService 
{

	FileImage uploadFileImage(MultipartFile mFile) throws IOException;
	
}
