CREATE TABLE testing_skills (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  employeeId INT (5) NOT NULL,
  capybara INT (1) NOT NULL,
  cucumber INT (1) NOT NULL,
  fitnesse INT (1) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_employeeId (employeeId)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;