CREATE TABLE IF NOT EXISTS employee
( employee_id BIGINT(10) NOT NULL,
  employee_number BIGINT DEFAULT NULL,
  salary BIGINT DEFAULT 0,
  KEY (employee_id),
  PRIMARY KEY (employee_id),
  FOREIGN KEY (employee_id) REFERENCES people (id)
);
