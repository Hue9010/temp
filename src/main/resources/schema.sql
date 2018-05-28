CREATE TABLE IF NOT EXISTS `tbl_user` (
        `seq` INT NOT NULL auto_increment,
        `name` VARCHAR(45) NOT NULL,
        PRIMARY KEY (`seq`));

INSERT INTO tbl_user(name) values('홍길동'),('임꺽정'),('역발산');
