# Real Estate Management API (Spring Boot)

A simple RESTful API built with **Spring Boot** to manage real estate listings and their associated owners. The project connects to a MySQL database and provides CRUD operations for both properties and owners.

---

## Contents

- [Features](#features)  
- [Tech Stack](#tech-stack)  
- [Getting Started](#getting-started)  

---

## Features

- Manage real estate entries (`/subjects`)
  - Add, update, delete, fetch all, or fetch by ID
  - Filter listings by owner
- Manage owners (`/owner`)
  - Add, update, delete, fetch all, or fetch by ID
  - Count total owners
  - Search by name (case-insensitive)

---

## Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  

---

## Getting Started

1. **Clone the Repository**

```bash
git clone https://github.com/vesc0/real-estate-app
cd real-estate-app
```

2. **Configure Database**
   
Update (`application.properties`) with your MySQL credentials:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/real_estate
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

3. **Run the App**
```bash
mvn spring-boot:run
```
