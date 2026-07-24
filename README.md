<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=ff4500,ff8c00,ffd700&height=200&section=header&text=Disaster%20Management%20%26%20Alert%20System&fontSize=32&fontColor=ffffff&fontAlignY=40&desc=Emergency%20Response%20Command%20Center%20%7C%20Java%2021%20%7C%20Spring%20Boot%204%20%7C%20JWT%20%7C%20MySQL&descAlignY=62&descSize=14&animation=fadeIn" width="100%"/>

</div>

<div align="center">

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.4-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Auth-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Wrapper-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)

<br/>

![License](https://img.shields.io/badge/License-Academic-blue?style=flat-square)
![Status](https://img.shields.io/badge/Status-Local_Dev-orange?style=flat-square)
![Internship](https://img.shields.io/badge/Infosys_Springboard-6.0-0066CC?style=flat-square&logo=infosys)
![Localhost](https://img.shields.io/badge/Runs_On-localhost:8080-brightgreen?style=flat-square)
![Platform](https://img.shields.io/badge/Platform-Local_Only-red?style=flat-square)

</div>

---

<div align="center">

### This project runs only through `./mvnw spring-boot:run` and is accessible at `http://localhost:8080`
**Designed for Local Development and Testing &nbsp;|&nbsp; Built using Java Spring Boot and Maven**
**Developed as part of Infosys Springboard 6.0 Internship Program**

</div>

---

## Table of Contents

<details>
<summary>Expand Navigation</summary>

- [Internship Project](#-internship-project)
- [Problem Statement](#-problem-statement)
- [About the Project](#-about-the-project)
- [Features](#-features)
- [Technology Stack](#-technology-stack)
- [Project Architecture](#-project-architecture)
- [Role Based Authentication Flow](#-role-based-authentication-flow)
- [Project Structure](#-project-structure)
- [Emergency Monitoring Workflow](#-emergency-monitoring-workflow)
- [Screenshot Gallery](#-screenshot-gallery)
- [Installation Guide](#-installation-guide)
- [Running the Project](#-running-the-project)
- [Future Scope](#-future-scope)
- [Contributors](#-contributors)
- [License](#-license)

</details>

---

## 🏢 Internship Project

<div align="center">

| | |
|:---:|:---|
| 🏛️ **Organization** | Infosys Springboard 6.0 Internship Program |
| 👨‍💻 **Developer** | Matheeshkumar |
| 🎯 **Domain** | Emergency Response and Disaster Management |
| 🖥️ **Environment** | Local Development — Built using Java Spring Boot and Maven |
| 🌐 **Access** | Easily executable on localhost using Maven Wrapper |
| 📅 **Year** | 2025 – 2026 |

</div>

> This is not an online deployed application.
> Built using Java Spring Boot and Maven.
> Developed as part of Infosys Springboard 6.0 Internship Program.
> Easily executable on localhost using Maven Wrapper — `http://localhost:8080`

---

## 🚨 Problem Statement

Every year, natural disasters — floods, fires, earthquakes, cyclones — cause thousands of casualties. The critical window between disaster occurrence and emergency response is often lost due to:

- No centralized reporting platform for citizens
- Delayed communication between citizens and responders
- No role-based access for coordinated response
- Admins having no real-time disaster visibility
- Responders lacking structured task assignment

This system addresses that gap by providing a **structured, role-aware emergency command platform** where citizens report incidents, admins monitor and broadcast alerts, and responders receive and complete rescue tasks — all through a unified local web application.

---

## 🎯 About the Project

**Disaster Management and Alert System** is a full-stack Java Spring Boot web application engineered to simulate a real-world emergency response command center. Built as part of the Infosys Springboard 6.0 Internship Program, the system provides role-based access control, JWT-secured REST APIs, real-time disaster monitoring, citizen reporting, responder task management, and admin-level alert broadcasting.

### Objectives

- Enable **citizens** to register, report disasters, and receive emergency alerts
- Enable **responders** to view assigned rescue tasks and update their status
- Enable **admins** to monitor all disasters, broadcast alerts, and manage users
- Secure all API endpoints with **JWT-based authentication**
- Persist all data in a **MySQL relational database**
- Deliver a full **multi-role web dashboard** accessible at `localhost:8080`
- Provide structured **incident and citizen reporting** workflows

---

## Features

<div align="center">

| Module | Feature | Role |
|:---|:---|:---:|
| 🔐 Authentication | JWT-secured login and registration | All |
| 👤 Access Control | Role-based access — Admin, Responder, Citizen | All |
| 🌊 Disaster Management | Create, monitor, and track disaster status | Admin |
| 📢 Alert Broadcasting | Emergency alert broadcast to all users | Admin |
| 📋 Citizen Reporting | Disaster report submission with location and severity | Citizen |
| 🆘 Incident Reporting | Incident report filing with severity levels | Citizen |
| 🗺️ Rescue Tasks | Task assignment and real-time status updates | Responder |
| 💬 Messaging | Internal messaging between all roles | All |
| 📊 Admin Dashboard | Full system overview for administrators | Admin |
| 🧑‍🚒 Responder Dashboard | Assigned task view for responders | Responder |
| 🏠 Citizen Dashboard | Personal report history and alert view | Citizen |
| 🔔 Alerts | Emergency alert display per user role | All |
| 👤 Profile Management | Profile management for all roles | All |
| 🏋️ Training | Responder training module | Responder |
| 🔄 Connection Pool | HikariCP connection pool with MySQL optimization | System |

</div>

---

## Technology Stack

<div align="center">

### Backend

| Technology | Version | Purpose |
|:---|:---:|:---|
| Java | 21 LTS | Core application language |
| Spring Boot | 4.0.4 | Application framework and embedded Tomcat server |
| Spring Security | Included | Authentication and authorization |
| Spring Data JPA | Included | ORM and database abstraction |
| JJWT | 0.11.5 | JSON Web Token generation and validation |
| MySQL Connector/J | Runtime | MySQL JDBC driver |
| Spring Validation | Included | Input validation |
| Rome | 2.1.0 | NDMA RSS disaster feed parsing |
| Lombok | Optional | Boilerplate code reduction |
| HikariCP | Included | High-performance connection pooling |

### Frontend

| Technology | Purpose |
|:---|:---|
| HTML5 | Page structure for all dashboards |
| CSS3 | Styling — dark themes, card layouts, glassmorphism |
| JavaScript (Vanilla) | Dynamic interactions and fetch API calls |

### Infrastructure

| Technology | Purpose |
|:---|:---|
| MySQL 8.0 | Primary relational database |
| Maven Wrapper | Dependency management and build tool |
| Maven Compiler Plugin | Annotation processing with Lombok support |

</div>

---

## Project Architecture

```
+-----------------------------------------------------------------------------+
|                  DISASTER MANAGEMENT SYSTEM ARCHITECTURE                    |
+-----------------------------------------------------------------------------+
|                                                                             |
|  PRESENTATION LAYER (Static HTML/CSS/JS - served by Spring Boot)           |
|  index.html | citizen-dashboard | admin-dashboard | responder-dashboard     |
|  alerts.html | reports.html | profile.html | training.html | admin-tasks    |
|                                                                             |
+------------------------------------+----------------------------------------+
                                     |
                              HTTP / REST API
                                     |
+------------------------------------v----------------------------------------+
|                        SECURITY LAYER                                       |
|           Spring Security  -->  JWT Filter  -->  JwtUtil.java               |
|           SecurityConfig.java  -->  Role-based endpoint protection          |
+------------------------------------+----------------------------------------+
                                     |
+------------------------------------v----------------------------------------+
|                        CONTROLLER LAYER                                     |
|   AuthController    AlertController    DisasterController                   |
|   CitizenReportController    IncidentReportController                       |
|   RescueTaskController    MessageController                                 |
+------------------------------------+----------------------------------------+
                                     |
+------------------------------------v----------------------------------------+
|                        SERVICE LAYER                                        |
|   AlertService    DisasterService    CitizenReportService                   |
|   IncidentReportService    RescueTaskService                                |
+------------------------------------+----------------------------------------+
                                     |
+------------------------------------v----------------------------------------+
|                   REPOSITORY LAYER  (Spring Data JPA)                      |
|   UserRepository    AlertRepository    DisasterRepository                   |
|   CitizenReportRepository    IncidentReportRepository                       |
|   RescueTaskRepository    MessageRepository                                 |
+------------------------------------+----------------------------------------+
                                     |
                             HikariCP Pool
                                     |
+------------------------------------v----------------------------------------+
|              MySQL 8.0  --  disaster_management database                    |
+-----------------------------------------------------------------------------+
```

---

## Role Based Authentication Flow

```
                    +------------------+
                    |  localhost:8080  |
                    |   Login Page     |
                    +--------+---------+
                             |
                    POST /api/auth/login
                             |
                    +--------v---------+
                    |  AuthController  |
                    |  JWT Generated   |
                    +--------+---------+
                             |
          +------------------+------------------+
          |                  |                  |
 +--------v-------+ +--------v-------+ +--------v--------+
 |  ADMIN ROLE    | | CITIZEN ROLE   | | RESPONDER ROLE  |
 +--------+-------+ +--------+-------+ +--------+--------+
          |                  |                  |
 +--------v-------+ +--------v-------+ +--------v--------+
 | admin-          | | citizen-       | | responder-      |
 | dashboard.html  | | dashboard.html | | dashboard.html  |
 +----------------+  +----------------+  +-----------------+
 | View disasters | | Report disaster| | View tasks      |
 | Broadcast alert| | File incident  | | Update status   |
 | Assign tasks   | | View alerts    | | View alerts     |
 | Manage users   | | View reports   | | Training module |
 | Admin profile  | | Profile mgmt   | | Responder prof. |
 +----------------+  +----------------+  +-----------------+
```

---

## Project Structure

<details>
<summary>Click to expand full project structure</summary>

```
Disaster-Management-Alert-System/
|
+-- pom.xml                              # Maven build config - Spring Boot 4.0.4, Java 21
+-- mvnw / mvnw.cmd                      # Maven Wrapper scripts (Linux / Windows)
+-- DATABASE_SETUP.sql                   # MySQL schema initialization script
|
+-- src/
|   +-- main/
|   |   +-- java/com/disaster/management/
|   |   |   |
|   |   |   +-- DisasterManagementApplication.java    # Spring Boot entry point
|   |   |   +-- DataInitializer.java                  # Seed data on startup
|   |   |   |
|   |   |   +-- config/
|   |   |   |   +-- SecurityConfig.java               # Spring Security + JWT setup
|   |   |   |
|   |   |   +-- controller/
|   |   |   |   +-- AuthController.java               # Login and registration endpoints
|   |   |   |   +-- AlertController.java              # Alert CRUD endpoints
|   |   |   |   +-- DisasterController.java           # Disaster management endpoints
|   |   |   |   +-- CitizenReportController.java      # Citizen report endpoints
|   |   |   |   +-- IncidentReportController.java     # Incident report endpoints
|   |   |   |   +-- RescueTaskController.java         # Rescue task endpoints
|   |   |   |   +-- MessageController.java            # Inter-role messaging endpoints
|   |   |   |
|   |   |   +-- entity/
|   |   |   |   +-- User.java                         # User entity (Admin/Citizen/Responder)
|   |   |   |   +-- Alert.java                        # Emergency alert entity
|   |   |   |   +-- Disaster.java                     # Disaster event entity
|   |   |   |   +-- CitizenReport.java                # Citizen-submitted report entity
|   |   |   |   +-- IncidentReport.java               # Incident report entity
|   |   |   |   +-- RescueTask.java                   # Rescue task entity
|   |   |   |   +-- Message.java                      # Inter-role message entity
|   |   |   |
|   |   |   +-- repository/
|   |   |   |   +-- UserRepository.java
|   |   |   |   +-- AlertRepository.java
|   |   |   |   +-- DisasterRepository.java
|   |   |   |   +-- CitizenReportRepository.java
|   |   |   |   +-- IncidentReportRepository.java
|   |   |   |   +-- RescueTaskRepository.java
|   |   |   |   +-- MessageRepository.java
|   |   |   |
|   |   |   +-- security/
|   |   |   |   +-- JwtUtil.java                      # JWT generation and validation
|   |   |   |
|   |   |   +-- service/
|   |   |       +-- AlertService.java
|   |   |       +-- DisasterService.java
|   |   |       +-- CitizenReportService.java
|   |   |       +-- IncidentReportService.java
|   |   |       +-- RescueTaskService.java
|   |   |
|   |   +-- resources/
|   |       +-- application.properties                # DB config, server port, JPA settings
|   |       +-- static/                               # Frontend HTML/CSS/JS
|   |           +-- index.html                        # Login page
|   |           +-- home.html                         # Landing page
|   |           +-- citizen-dashboard.html            # Citizen role dashboard
|   |           +-- admin-dashboard.html              # Admin role dashboard
|   |           +-- responder-dashboard.html          # Responder role dashboard
|   |           +-- alerts.html                       # Alert viewing page
|   |           +-- admin-alerts.html                 # Admin alert management
|   |           +-- reports.html                      # Reports listing
|   |           +-- profile.html                      # User profile management
|   |           +-- admin-profile.html                # Admin profile
|   |           +-- admin-tasks.html                  # Admin task assignment
|   |           +-- responder-profile.html            # Responder profile
|   |           +-- responder-register.html           # Responder registration
|   |           +-- responder-rescue.html             # Rescue operation view
|   |           +-- responder-tasks.html              # Responder task list
|   |           +-- training.html                     # Responder training module
|   |           +-- auth-guard.js                     # Frontend route protection
|   |           +-- role-loading.js                   # Role-based redirect logic
|   |           +-- role-loading.css                  # Loading screen styles
|   |
|   +-- test/
|       +-- DisasterManagementApplicationTests.java
|
+-- login-designs/                       # UI variant designs
|   +-- VARIANT_1_NORTHERN/
|   +-- VARIANT_2_CRISIS/
|   +-- VARIANT_3_TERRA/
|
+-- loading-screen/                      # Custom loading screen component
```

</details>

---

## Emergency Monitoring Workflow

```
STEP 1 - DETECTION
  Citizen logs in  -->  Opens Citizen Dashboard
  -->  Clicks "Report Disaster"
  -->  Fills type, location, severity, date
  -->  Submits via POST /api/citizen-reports
                    |
                    v
STEP 2 - ADMIN REVIEW
  Admin logs in  -->  Sees new report on Admin Dashboard
  -->  Reviews CitizenReport + IncidentReport data
  -->  Creates Disaster record via POST /api/disasters
                    |
                    v
STEP 3 - ALERT BROADCAST
  Admin  -->  Admin Alerts  -->  Creates emergency alert
  -->  POST /api/alerts  -->  Saved to MySQL
  -->  Visible to all roles on their dashboards
                    |
                    v
STEP 4 - RESCUE TASK ASSIGNMENT
  Admin  -->  Admin Tasks  -->  Creates RescueTask
  -->  Assigns to specific Responder
  -->  POST /api/rescue-tasks
                    |
                    v
STEP 5 - RESPONDER ACTION
  Responder logs in  -->  Responder Dashboard
  -->  Views assigned rescue tasks
  -->  Updates task status: Pending --> In Progress --> Completed
  -->  PUT /api/rescue-tasks/{id}
                    |
                    v
STEP 6 - RESOLUTION
  Admin monitors status  -->  Updates Disaster status to Resolved
  -->  Incident archived in MySQL
```

---

## Screenshot Gallery

> Run the project at `http://localhost:8080`, take screenshots, and add them to a `/screenshots` folder in the repo. Then replace the placeholder text below with `![description](screenshots/filename.png)`.

<div align="center">

---

### Login Page
> SCREENSHOT WILL BE ADDED HERE — `localhost:8080/index.html`

---

### Registration Page
> SCREENSHOT WILL BE ADDED HERE

---

### Citizen Dashboard
> SCREENSHOT WILL BE ADDED HERE — `localhost:8080/citizen-dashboard.html`

---

### Admin Dashboard
> SCREENSHOT WILL BE ADDED HERE — `localhost:8080/admin-dashboard.html`

---

### Responder Dashboard
> SCREENSHOT WILL BE ADDED HERE — `localhost:8080/responder-dashboard.html`

---

### Emergency Alerts
> SCREENSHOT WILL BE ADDED HERE — `localhost:8080/alerts.html`

---

### Disaster Monitoring
> SCREENSHOT WILL BE ADDED HERE

---

### Profile Management
> SCREENSHOT WILL BE ADDED HERE — `localhost:8080/profile.html`

---

</div>

---

## Installation Guide

### Requirements

<div align="center">

| Requirement | Version |
|:---|:---:|
| Java JDK | 21 LTS |
| MySQL Server | 8.0+ |
| Git | Latest |
| Maven | via Wrapper (included in repo) |

</div>

### Step 1 — Clone the Repository

```bash
git clone https://github.com/Matheeshkumar368/Disaster-Management-Alert-System-
```

### Step 2 — Move to Project Directory

```bash
cd Disaster-Management-Alert-System-
```

### Step 3 — Set Up MySQL Database

```sql
CREATE DATABASE disaster_management;
```

Then run the provided setup script:

```bash
mysql -u root -p disaster_management < DATABASE_SETUP.sql
```

### Step 4 — Configure Database Credentials

Open `src/main/resources/application.properties` and update:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/disaster_management
spring.datasource.username=root
spring.datasource.password=your_mysql_password
```

---

## Running the Project

### Windows

```cmd
mvnw.cmd spring-boot:run
```

### Linux / macOS

```bash
./mvnw spring-boot:run
```

### Access the Application

```
http://localhost:8080
```

> This project runs only on your local machine.
> No internet connection required after Maven downloads dependencies.
> No cloud hosting. No live deployment.
> Designed for Local Development and Testing.

---

## Future Scope

<details>
<summary>Click to expand development roadmap</summary>

| Priority | Feature |
|:---:|:---|
| High | Real-time WebSocket notifications for instant alert delivery |
| High | SMS and Email alert dispatch using Twilio or SendGrid |
| Medium | Interactive map integration using Leaflet.js for disaster location visualization |
| Medium | NDMA RSS feed auto-parsing for real government disaster data |
| Medium | Forgot password and password reset flow |
| Low | Mobile application for field responders |
| Low | Multi-language support for regional accessibility |
| Low | Docker containerization for one-command deployment |
| Low | CI/CD pipeline with GitHub Actions for automated testing |
| Low | AI-based disaster severity prediction from historical report data |

</details>

---

## Contributors

<div align="center">

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Matheeshkumar368">
        <img src="https://avatars.githubusercontent.com/u/Matheeshkumar368?v=4" width="100px" alt="Matheeshkumar" style="border-radius:50%"/><br/>
        <b>Matheeshkumar</b><br/>
        <sub>Full Stack Developer</sub><br/>
        <sub>Infosys Springboard 6.0 Intern</sub>
      </a>
    </td>
  </tr>
</table>

| Area | Contribution |
|:---|:---|
| Architecture | Designed full MVC layer structure with Spring Boot |
| Security | Implemented JWT authentication with Spring Security |
| Database | Designed MySQL schema with 7 entity tables |
| Frontend | Built 15+ HTML dashboards with dark themes |
| REST API | Developed 7 controllers covering all system modules |
| Testing | Wrote and executed application integration tests |
| Build | Configured Maven Wrapper for cross-platform builds |

</div>

---

## License

This project was developed for academic and internship purposes under the **Infosys Springboard 6.0 Program**.

```
Academic Use License
Free to use as reference for learning and academic projects.
Not intended for commercial use.
```

---

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=ff4500,ff8c00,ffd700&height=120&section=footer&text=Infosys%20Springboard%206.0%20%7C%20localhost:8080%20%7C%20Local%20Dev%20Only&fontSize=13&fontColor=ffffff&fontAlignY=65" width="100%"/>

**If this project helped you, please give it a star**

Developed with dedication during the **Infosys Springboard 6.0 Internship Program**

</div>
