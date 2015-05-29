CREATE TABLE IF NOT EXISTS people
( id BIGINT(10) NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(25),
  surname VARCHAR(25),
  KEY(id),
  PRIMARY KEY (id)
);

INSERT INTO people (first_name, surname) VALUES
('Jason', 'Halford'),
('Shauna', 'Halford'),
('Terry', 'Wogan');