# Patient Monitoring Backend

A lightweight backend service for ingesting and validating patient temperature measurements.  
The project is built with **Java 17** and **Spring Boot**, and deployed on **AWS EC2** to simulate a real-world cloud backend service.

---

## Features

- RESTful API for submitting patient temperature measurements
- Input validation using Jakarta Bean Validation
- Structured JSON responses with timestamps and status
- Global exception handling with clear error messages
- Runnable as a standalone JAR
- Deployed and tested on AWS EC2

---

## Tech Stack

- Java 17  
- Spring Boot  
- Gradle  
- Embedded Tomcat  
- AWS EC2 (Ubuntu)  
- Jackson (JSON serialization)

---

## API Endpoints

### POST `/api/v1/measurements`

Submit a temperature measurement for a patient.

#### Request Body
```json
{
  "patientId": "p001",
  "temperature": 36.7
}
