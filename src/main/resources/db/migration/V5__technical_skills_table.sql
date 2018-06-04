CREATE TABLE technical_skills (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  employeeId INT (5) NOT NULL,
  java INT (1) NOT NULL,
  AWS INT (1) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_employeeId (employeeId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;