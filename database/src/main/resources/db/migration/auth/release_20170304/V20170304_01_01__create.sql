CREATE TABLE auth.keys
(
  value VARCHAR(200) NOT NULL,
  client_code VARCHAR(20) NOT NULL,
  PRIMARY KEY (value)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO api.keys(value, client_code)
VALUES('valid-key-value', 'test-client');