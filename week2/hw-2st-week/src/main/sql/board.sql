CREATE TABLE `springstudy`.`board` (
    `board_id` INT NOT NULL AUTO_INCREMENT,
    `user_id` VARCHAR(45) NULL,
    `title` VARCHAR(100) NOT NULL,
    `content` TEXT NULL,
    `created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`board_id`),
    INDEX `board_user_id_member_loginId_idx` (`user_id` ASC) VISIBLE,
    CONSTRAINT `board_user_id_member_loginId`
    FOREIGN KEY (`user_id`)
    REFERENCES `springstudy`.`member` (`loginId`)
    ON DELETE SET NULL
    ON UPDATE CASCADE
)ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;