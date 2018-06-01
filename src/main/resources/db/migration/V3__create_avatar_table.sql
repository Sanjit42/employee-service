CREATE TABLE avatar (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  employeeId INT (5) NOT NULL,
  image BLOB,
  PRIMARY KEY (id),
  UNIQUE KEY UK_employeeId (employeeId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;