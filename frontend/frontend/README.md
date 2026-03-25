# 🔐 Full Stack Authentication & RBAC System

A complete authentication and role-based access control (RBAC) system built with **Spring Boot** (backend) and **React + TypeScript** (frontend). Users can register with different roles (USER/ADMIN) and access content based on their role.

---

## 🎥 Demo Video

[![Watch Demo Video](https://img.youtube.com/vi/g06Jsbaov2U/0.jpg)](https://youtu.be/g06Jsbaov2U)

**Watch Full Demo:** [Click Here](https://youtu.be/g06Jsbaov2U)

---


## 🔗 Project Links

| Link | URL |
|------|-----|
| **GitHub Repository** | https://github.com/Pranayuike123/rbac-auth-system1 |
| **Demo Video** | https://youtu.be/g06Jsbaov2U |
| **Backend API** | http://localhost:8080 |
| **Swagger UI** | http://localhost:8080/swagger-ui.html |
| **Frontend** | http://localhost:5173 |

---

## 🛠️ Tech Stack

### Backend
| Technology | Version | Purpose |
|------------|---------|---------|
| Java | 17 | Programming Language |
| Spring Boot | 3.1.5 | Framework |
| Spring Security | - | Authentication & Authorization |
| Spring Data JPA | - | Database Operations |
| JWT | 0.11.5 | Token Generation & Validation |
| MySQL | 8.0+ | Database |
| Lombok | - | Boilerplate Code Reduction |
| Maven | - | Dependency Management |
| Swagger/OpenAPI | 2.2.0 | API Documentation |


### Frontend
| Technology | Version | Purpose |
|------------|---------|---------|
| React | 18.2.0 | UI Library |
| TypeScript | 5.3.3 | Type Safety |
| Vite | 5.0.8 | Build Tool |
| TailwindCSS | 3.3.6 | Styling |
| React Router DOM | 6.20.0 | Navigation |
| React Hook Form | 7.48.0 | Form Handling |
| Axios | 1.6.2 | API Calls |
| React Query | 5.12.0 | Data Fetching |

---

## 📋 Features

### Authentication
- ✅ User Registration with Name, Email, Password
- ✅ Role Selection (USER / ADMIN) during registration
- ✅ Secure Login with Email & Password
- ✅ JWT Token Generation on successful login
- ✅ Token-based API Authentication

### Authorization (RBAC)
- ✅ **USER Role** → Can access user-level content
- ✅ **ADMIN Role** → Can access admin-level content
- ✅ Role-based endpoint protection

### Frontend Pages
- ✅ **Register Page** - User registration with role selection
- ✅ **Login Page** - User authentication
- ✅ **Dashboard Page** - Role-based content display
- ✅ **User Content Card** - Only visible to USER role
- ✅ **Admin Content Card** - Only visible to ADMIN role

### Security
- ✅ Password Encryption (BCrypt)
- ✅ JWT Token Validation
- ✅ Protected Routes in React
- ✅ Role-based UI Rendering

### Bonus Features
- ✅ Logout Functionality
- ✅ Password Validation (min 6 characters)
- ✅ Loading States
- ✅ Error Handling
- ✅ Responsive Dark Theme UI
- ✅ Swagger API Documentation

---

## 📁 Project Structure

rbac-auth-system1/
│
├── backend/ # Spring Boot Backend
│ ├── pom.xml # Maven Dependencies
│ └── src/main/
│ ├── java/com/example/rbac/
│ │ ├── RbacApplication.java # Main Application Class
│ │ ├── config/ # Configuration Classes
│ │ │ ├── SecurityConfig.java # Security Configuration
│ │ │ └── DataInitializer.java # Database Initializer
│ │ ├── controller/ # REST Controllers
│ │ │ ├── AuthController.java # Authentication APIs
│ │ │ └── TestController.java # Test APIs
│ │ ├── dto/ # Data Transfer Objects
│ │ │ ├── LoginRequest.java
│ │ │ ├── RegisterRequest.java
│ │ │ └── JwtResponse.java
│ │ ├── entity/ # JPA Entities
│ │ │ ├── User.java
│ │ │ ├── Role.java
│ │ │ └── ERole.java
│ │ ├── repository/ # Data Access Layer
│ │ │ ├── UserRepository.java
│ │ │ └── RoleRepository.java
│ │ ├── security/ # Security Components
│ │ │ ├── JwtUtils.java # JWT Utilities
│ │ │ ├── UserDetailsImpl.java # User Details Implementation
│ │ │ ├── UserDetailsServiceImpl.java
│ │ │ └── AuthTokenFilter.java # JWT Filter
│ │ └── exception/ # Exception Handling
│ │ └── GlobalExceptionHandler.java
│ └── resources/
│ └── application.properties # Application Configuration
│
└── frontend/ # React Frontend
├── package.json # Dependencies
├── tailwind.config.js # TailwindCSS Config
├── vite.config.ts # Vite Config
├── index.html # HTML Template
└── src/
├── main.tsx # Entry Point
├── App.tsx # Main App Component
├── index.css # Global Styles
├── types/
│ └── index.ts # TypeScript Types
├── services/
│ └── api.ts # API Service with Axios
├── context/
│ └── AuthContext.tsx # Authentication Context
└── components/
├── Login.tsx # Login Page
├── Register.tsx # Register Page
├── Dashboard.tsx # Dashboard Page
└── ProtectedRoute.tsx # Route Protection


4️⃣ Access the Application

Application	URL
Frontend	http://localhost:5173
Backend API	http://localhost:8080
Swagger Docs	http://localhost:8080/swagger-ui.html

