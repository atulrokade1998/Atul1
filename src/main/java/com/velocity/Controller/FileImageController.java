package com.velocity.Controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.velocity.model.FileImage;
import com.velocity.service.FileImageService;
import com.velocity.Controller.FileImageController;


@RestController
public class FileImageController {
	
	@Autowired
	private FileImageService fileImageService;
	
	@PostMapping("/fileUpload")
	public FileImage uploadFileImage(@RequestParam("mFile")MultipartFile mFile) throws IOException 
	{ 
		FileImage fileImage=fileImageService.uploadFileImage(mFile);
		return fileImage;
	}
	
}


