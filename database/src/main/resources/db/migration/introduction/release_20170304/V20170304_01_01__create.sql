CREATE TABLE introduction.person
(
  person_id BIGINT(20) NOT NULL AUTO_INCREMENT,
  person_code BIGINT(20) NOT NULL AUTO_INCREMENT,
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  birthday_year int(4) DEFAULT NULL,
  birthday_month int(2) DEFAULT NULL,
  birthday_day int(2) DEFAULT NULL,
  gender ENUM(male, female, unknown) DEFAULT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (transaction)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
