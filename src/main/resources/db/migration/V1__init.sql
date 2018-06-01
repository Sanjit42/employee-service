CREATE TABLE employee (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name VARCHAR (100) NOT NULL,
  employeeId INT (5) NOT NULL,
  role VARCHAR (50) NOT NULL,
  gender VARCHAR(5) NOT NULL,
  homeOffice VARCHAR(50) NOT NULL ,
  currentProject VARCHAR(50) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_employeeId (employeeId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
