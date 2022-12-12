CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ma_sach` varchar(255) DEFAULT NULL,
  `nam_xuat_ban` datetime(6) DEFAULT NULL,
  `tac_gia` varchar(255) DEFAULT NULL,
  `ten` varchar(255) DEFAULT NULL,
  `the_loai` varchar(255) DEFAULT NULL,
  `tinh_trang` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gioi_tinh` varchar(255) DEFAULT NULL,
  `ho_ten` varchar(255) DEFAULT NULL,
  `ma_sv` varchar(255) DEFAULT NULL,
  `nam_sinh` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

CREATE TABLE db.`bookloan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `book_id` bigint(20) DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
)