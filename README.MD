# 📌 Demo CRUD - Spring Boot + React + MySQL

This project is a simple CRUD (Create, Read, Update, Delete) demo using **Spring Boot** for the backend and **React** for the frontend.  
The database is **MySQL**.  
It demonstrates how to build a REST API and a simple UI to manage data.

---

## 🏗️ Architecture
React (Frontend) <--> Spring Boot (Backend - REST API) <--> MySQL (Database)

---

- **Frontend:** ReactJS
- **Backend:** Spring Boot Web, Spring Data JPA
- **Database:** MySQL

---

## 🧰 Technologies & Dependencies

### Backend
- [Spring Boot](https://spring.io/projects/spring-boot)
- Spring Web (REST API)
- Spring Data JPA (ORM)
- MySQL Connector/J
    - _Note_: **No Lombok** (all getters/setters/constructors are written manually)

### Frontend
- [React](https://react.dev/)
- lAxios (for API calls)
- CSS / Tailwind

### Database
- MySQL 9.x

---

## 🚀 Features

- **Create** new records
- **Read** and display a list of records
- **Update** existing records
- **Delete** records
- React UI to interact with REST API

---

## ⚙️ Requirements

- JDK 21+ (JDK 21 recommended)
- Maven 3.9+
- Node.js 22+ and npm or yarn
- MySQL Server (9.x)

---

## 🛠️ Backend Setup (Spring Boot)

1. **Clone the project**
```bash
git clone https://github.com/your-username/demo-crud-springboot-react.git
cd demo-crud-springboot-react/backend
```

2. **Create the database in MySQL**
```bash
create database crudmysql;
```

3. **Configure `application.properties`**
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/demo_crud
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
```

4. **Run the backend**
```bash
mvn spring-boot:run
```
👉 Backend will run at:
http://localhost:8080

## 🎨 Frontend Setup (React)

1. **Go to the frontend folder**

```bash
cd ../frontend
```


2. **Install dependencies**
```bash
npm install
```



3. **Configure API base URL**
In `src/api.js` or `src/services/axios.js`:
```bash
export const API_BASE_URL = "http://localhost:8080/api";
```





4. **Run the React app**
```bash
npm start
```
Frontend will run at:
👉 http://localhost:3000

---

## 🧾 Notes
_For production, switch to `validate` and use a database migration tool (Flyway/Liquibase)._
