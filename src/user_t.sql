-- 导出  表 test.user_t 结构
CREATE DATABASE `test`;
CREATE TABLE `user_t` (
  `id` VARCHAR(32) NOT NULL,
  `user_name` VARCHAR(50) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `age` INT(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


INSERT INTO `user_t` (`id`, `user_name`, `password`, `age`) VALUES
	('1', 'ceddd', 'sfasgfaf', 24);
/*创建本地用户epet,密码0000*/
GRANT ALL ON test.* TO `test`@`localhost` IDENTIFIED BY '123456'