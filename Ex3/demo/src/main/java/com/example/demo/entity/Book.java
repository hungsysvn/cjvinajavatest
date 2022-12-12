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
@Table(name = "book")
@Getter
@Setter
public class Book {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "ma_sach")
	private String maSach;
	
	@Column(name = "ten")
	private String ten;
	
	@Column(name = "the_loai")
	private String theLoai;
	
	@Column(name = "nam_xuat_ban")
	private Date namXuatBan;
	
	@Column(name = "tac_gia")
	private String tacGia;
	
	@Column(name = "tinh_trang")
	private String tinhTrang;

}
