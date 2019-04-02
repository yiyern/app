DROP TABLE IF EXISTS user_info;
CREATE TABLE user_info (
  id mediumint(8) NOT NULL AUTO_INCREMENT COMMENT'用户ID',
  name varchar(33) NOT NULL COMMENT '姓名',
  age int(3) NOT NULL COMMENT '年龄',
  money double NOT NULL COMMENT '账户余额',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
