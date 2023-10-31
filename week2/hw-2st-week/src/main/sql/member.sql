CREATE TABLE `member` (
      `loginId` varchar(100) NOT NULL,
      `password` varchar(100) NOT NULL,
      `email` varchar(100) DEFAULT NULL,
      `name` varchar(20) NOT NULL,
      `nickname` varchar(100) NOT NULL,
      `position` varchar(45) NOT NULL,
      `status_message` text,
      `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
      `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
      PRIMARY KEY (`loginId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3