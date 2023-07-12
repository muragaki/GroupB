package com.example.reservationsystem.domain.entity.imgpicture;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="picture")

public class ImgPicture {
@Id
private String img1;
private String img2;
private String img3;
private String img4;
private String img5;

	
	

}
