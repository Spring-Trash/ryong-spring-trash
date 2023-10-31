CREATE TABLE `board` (
     `board_id` int NOT NULL AUTO_INCREMENT,
     `user_id` varchar(45) DEFAULT NULL,
     `title` varchar(100) NOT NULL,
     `content` text,
     `is_notice` tinyint NOT NULL DEFAULT '0',
     `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
     `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
     PRIMARY KEY (`board_id`),
     KEY `board_user_id_member_loginId_idx` (`user_id`),
     CONSTRAINT `board_user_id_member_loginId` FOREIGN KEY (`user_id`) REFERENCES `member` (`loginId`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3