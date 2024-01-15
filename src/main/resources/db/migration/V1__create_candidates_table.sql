CREATE TABLE candidates (
    id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL ,
    email VARCHAR(50) NOT NULL ,
    genre VARCHAR(10) NOT NULL,
    salary BIGINT ,
    createAt DATE
);