# EcoMonitorSystem (Backend REST API)

**EcoMonitorSystem** is a Spring Boot-based backend REST API designed to support an environmental monitoring system. It allows users to submit complaints, view news, and gives admin users the ability to manage the platform. This backend is designed to later connect with a frontend (React, Angular).

##  Features

- User registration and login (via REST endpoints)
- Submit/view environmental complaints
- Admin: manage complaints and publish news
- RESTful API with JSON responses
- Role-based access control
- MySQL database integration

## 🛠 Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL
- Maven
- Postman (for API testing)

## ⚙ Configuration

Application properties (`src/main/resources/application.properties`):

```properties
spring.application.name=ecomonitorsystem
spring.datasource.url=jdbc:mysql://localhost:3306/ecomonitor
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

management.endpoints.web.exposure.include=*
```
 Database Structure
Database name: ecomonitor
Main tables: users, complaints, news, comments
Use your own SQL or JPA will auto-generate schema.

Create MySQL database

```sql
CREATE DATABASE ecomonitor;
```
| Method   | Endpoint             | Description                       | Request Body       |
|----------|----------------------|-----------------------------------|--------------------|
| `GET`    | `/users`             | Get all users                     | –                  |
| `POST`   | `/users/add`         | Add a new user                    | JSON (User)        |
| `GET`    | `/complaints`        | Get all complaints                | –                  |
| `POST`   | `/complaints/add`    | Submit a new complaint            | JSON (Complaint)   |
| `GET`    | `/news`              | Get all news                      | –                  |
| `GET`    | `/news/{id}`         | Get news by ID                    | –                  |
| `POST`   | `/news/add`          | Add new news                      | JSON (News)        |
| `DELETE` | `/news/{id}`         | Delete news by ID                 | –                  |
| `GET`    | `/comments`          | Get all comments                  | –                  |
| `POST`   | `/comments/add`      | Add a new comment                 | JSON (Comment)     |
| `DELETE` | `/comments/{id}`     | Delete comment by ID              | –                  |

 Roles (Planned)
Admin: Full control over news and complaints

User: Submit/view complaints, read news, post comments

 Future Plans
Add JWT-based authentication

Implement role-based access

Connect frontend (React/Angular)

Add Swagger documentation


