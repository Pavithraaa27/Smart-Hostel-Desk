# 🏨 Hostel Complaint Management System

A simple yet efficient desktop-based application designed to streamline the process of lodging, tracking, and managing hostel complaints using **Java Swing** and **Apache Cassandra**.

---

## 🚀 Overview

The *Hostel Complaint Management System* is built to provide a structured way for hostel administrators to handle student complaints. It enables easy complaint submission, viewing, and status tracking, ensuring transparency and efficiency.

This project also demonstrates hands-on implementation of **NoSQL database concepts using Cassandra**, making it ideal for academic and learning purposes.

---

## ✨ Features

- 🔐 Admin Login Authentication  
- 📝 Add Complaint  
- 📋 View Complaints in Table Format  
- 🔄 Update Complaint Status  
- 📊 Track Complaint Count using Counters  
- ⏳ TTL (Time-To-Live) for Temporary Data  
- 🏷️ Support for List Collections (Tags)  
- 📁 Import & Export Data (CSV)  

---

## 🛠️ Tech Stack

- Frontend: Java Swing  
- Backend: Java  
- Database: Apache Cassandra  
- Tools: Eclipse / VS Code, CQLSH  

---

## 🗄️ Database Design

### Keyspace:
- hostel_db

### Tables:
- students  
- complaints  
- complaint_counter  

### Highlights:
- Composite Primary Key  
- Secondary Index on status  
- List Collection (tags)  
- Counter Table for tracking complaints  
- TTL for auto-expiring records  

---

## 📸 Application Screens

- Login Page  
- Dashboard  
- Add Complaint  
- View Complaints  

---

## ⚙️ How to Run

### 1. Compile Java Files
```bash
javac *.java
```

### 2. Run Application
```bash
java LoginPage
```

### 3. Start Cassandra
```bash
cassandra
```

### 4. Open CQL Shell
```bash
cqlsh
```

---

## 🧪 Sample CQL Operations

```sql
USE hostel_db;

SELECT * FROM students;

SELECT * FROM complaints WHERE student_id = 1;

UPDATE complaints 
SET status = 'resolved' 
WHERE student_id = 1 AND complaint_id = 1;
```

---

## 📈 Learning Outcomes

This project helped in understanding:

- NoSQL database design  
- Cassandra Query Language (CQL)  
- Primary Keys & Indexing  
- Data modeling in distributed systems  
- Java Swing UI development  

---

## 🔮 Future Enhancements

- Web-based UI (React / Node.js)  
- Notification system  
- Analytics dashboard  
- Student login module  
- Cloud deployment  

---

## 📚 References

- Apache Cassandra Documentation  
- DataStax CQL Guide  
- Java Swing Documentation  

---

## 👩‍💻 Author

Pavithra Nair

---

## ⭐ Final Note

This project is a perfect blend of **database concepts + UI development**, showcasing practical implementation of real-world problem solving using modern tools.
