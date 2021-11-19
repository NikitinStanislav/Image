-- создание при запуске

CREATE TABLE IF NOT EXISTS users (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(250) NOT NULL,
                              password VARCHAR(250) NOT NULL,
                              imageImmitation VARCHAR(250) DEFAULT NULL
);

INSERT INTO users (name, password, imageImmitation) VALUES
('NameColumn', 'Password here', 'image'),
('NameColumn2', 'Password here2', 'image2');