package com.velocity.service.serviceImplemention;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.velocity.model.FileImage;

import com.velocity.repository.FileImageRepository;
import com.velocity.service.FileImageService;

@Service
public class FileImageServiceImpl implements FileImageService
{
	
	@Autowired
	private FileImageRepository fileImageRepository;

	public FileImage uploadFileImage(MultipartFile mFile) throws IOException
	{
		String fileName=mFile.getOriginalFilename();
		String contentype=mFile.getContentType();
		FileImage fileImage=new FileImage(fileName, contentype,mFile.getBytes());
		FileImage fileImage2=fileImageRepository.save(fileImage);
		return fileImage2;
	}

	


}
