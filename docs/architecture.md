# ShopEase – System Architecture

## 1. Project Overview
ShopEase is an e-commerce application developed using Java, Spring Boot, and MySQL.

## 2. Application Components

### Frontend
- HTML
- CSS
- Displays products and user interface.

### Backend
- Java 21
- Spring Boot
- Handles business logic and API requests.

### Database
- MySQL
- Stores users, products, carts, and orders.

### DevOps
- Git and GitHub for version control.
- Docker for containerization.
- Jenkins for CI/CD automation.
- Nginx for reverse proxy.

## 3. Application Flow

1. Customer opens the ShopEase website.
2. Frontend sends requests to the backend.
3. Spring Boot processes the requests.
4. Backend communicates with MySQL.
5. Database returns the required data.
6. Backend sends the response to the frontend.

## 4. Deployment Flow

Developer → GitHub → Jenkins → Docker → Application Deployment

## 5. Initial Environment
The application will initially run on a local Ubuntu virtual machine.
