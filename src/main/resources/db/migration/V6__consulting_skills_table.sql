CREATE TABLE consulting_skills (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  employeeId INT (5) NOT NULL,
  communication INT (1) NOT NULL,
  planning INT (1) NOT NULL,
  questioning INT (1) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_employeeId (employeeId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;