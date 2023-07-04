package com.velocity.repository;


import org.springframework.stereotype.Repository;

import com.velocity.model.FileImage;
import com.velocity.service.FileImageService;

import jakarta.persistence.Id;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface FileImageRepository extends CrudRepository<FileImage,Id>
{
	
}
