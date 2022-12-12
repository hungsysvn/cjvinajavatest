package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "ma_sv")
	private String maSv;
	
	@Column(name = "ho_ten")
	private String hoTen;
	
	@Column(name = "nam_sinh")
	private Date namSinh;
	
	@Column(name = "gioi_tinh")
	private String gioiTinh;
}
