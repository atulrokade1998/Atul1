package com.velocity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "fileimage")
public class FileImage 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String type;

@Lob
@Column(name = "imageDetails", length = 1000)
private byte[] imageDetails;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public FileImage(String name, String type, byte[] imageDetails) {
	super();
	this.name = name;
	this.type = type;
	this.imageDetails = imageDetails;
}
    public byte[] getImageDetails() {
	return imageDetails;
}
public void setImageDetails(byte[] imageDetails) {
	this.imageDetails = imageDetails;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
}
