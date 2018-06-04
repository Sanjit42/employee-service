CREATE TABLE domain_skills (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  employeeId INT (5) NOT NULL,
  government INT (1) NOT NULL,
  education INT (1) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_employeeId (employeeId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
