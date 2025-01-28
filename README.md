# README

## Backend - Course Management API

### **Description**
This is a Spring Boot-based RESTful API for managing courses in an educational platform. It provides endpoints for creating, reading, updating, and deleting courses, as well as fetching details of specific courses.

---

### **Features**
- CRUD operations for courses.
- Uses PostgreSQL for data persistence.
- Automatically creates database tables using JPA.

---

### **Requirements**
- Java 21 or later
- Maven 3.8+
- PostgreSQL

---

### **Setup Instructions**

#### **1. Clone the Repository**
```bash
git clone <git@github.com:christianestevam/course-api.git>
cd course-api
```

#### **2. Configure Database**
Modify the `application.properties` or `application.yml` file to match your PostgreSQL configuration.

Example configuration (`src/main/resources/application.properties`):
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

#### **3. Build the Project**
```bash
mvn clean install
```

#### **4. Run the Application**
```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`.

---

### **Endpoints**

#### **Courses**
- `GET /courses` - List all courses.
- `GET /courses/{id}` - Get details of a specific course by ID.
- `POST /courses` - Create a new course.
- `PUT /courses/{id}` - Update an existing course by ID.
- `DELETE /courses/{id}` - Delete a course by ID.

---

### **Testing**
Use tools like Postman or cURL to test the endpoints.

Example with cURL:
```bash
curl -X POST http://localhost:8080/courses \
-H "Content-Type: application/json" \
-d '{"title":"Java Programming","description":"Learn Java","workload":40,"price":100,"instructor":"John Doe","published":true,"category":"Programming","imageUrl":"http://example.com/image.jpg"}'
```

---