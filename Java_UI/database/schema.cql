CREATE KEYSPACE hostel_db
WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

USE hostel_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name TEXT,
    room_no INT,
    phone TEXT
);

CREATE TABLE complaints (
    complaint_id INT,
    student_id INT,
    issue TEXT,
    status TEXT,
    created_at TIMESTAMP,
    PRIMARY KEY (student_id, complaint_id)
);

CREATE TABLE complaint_counter (
    student_id INT PRIMARY KEY,
    total_complaints COUNTER
);