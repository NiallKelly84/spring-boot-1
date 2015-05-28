CREATE TABLE IF NOT EXISTS addresses
( id BIGINT NOT NULL AUTO_INCREMENT,
  first_line VARCHAR(25),
  second_line VARCHAR(25),
  town VARCHAR(25),
  county VARCHAR(25),
  CONSTRAINT addresses_pk PRIMARY KEY (id)
);

INSERT INTO addresses (first_line, second_line, town, county) VALUES
('12', 'Beechmount', 'Tullamore', 'Offaly');