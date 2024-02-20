USE mydb;
CREATE TABLE member (
    member_Id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email_address VARCHAR(80),
    phone_number VARCHAR(20) 
);

use mydb;
CREATE TABLE book (
    book_id SERIAL PRIMARY KEY,
    book_name VARCHAR(255) NOT NULL,
    book_author VARCHAR(255) NOT NULL
);
