This project demonstrates a microservices architecture using Spring Boot.

- IRCTC Service: Saves ticket details into the database.
- Notification Service: Sends email notifications.
- After ticket booking, IRCTC service calls Notification service using Feign Client.
- User receives an email confirmation: "Your ticket is booked".

Technologies used:
- Spring Boot
- Spring Cloud OpenFeign
- Java
- Email (SMTP)
- MySQL
