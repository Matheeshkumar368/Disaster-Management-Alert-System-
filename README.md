<div align="center">

<!-- ANIMATED TYPING - Title -->
<img src="https://readme-typing-svg.demolab.com?font=Orbitron&weight=900&size=34&duration=4000&pause=1000&color=FF8C00&center=true&vCenter=true&width=800&height=80&lines=DISASTER+MANAGEMENT;%26+ALERT+SYSTEM" alt="Disaster Management and Alert System"/>

<!-- ANIMATED TYPING - Subtitle -->
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=15&duration=2500&pause=700&color=FFD700&center=true&vCenter=true&width=750&height=50&lines=Java+21+%7C+Spring+Boot+4.0.4+%7C+JWT+%7C+MySQL+8.0;Admin+%7C+Citizen+%7C+Responder+Role+System;localhost%3A8080+%7C+Local+Development+Only;Infosys+Springboard+6.0+Internship+Project" alt="Subtitle"/>

<!-- ANIMATED ALERT STRIP -->
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=12&duration=1500&pause=300&color=FF4500&center=true&vCenter=true&width=800&height=25&lines=%F0%9F%9A%A8+EMERGENCY+RESPONSE+COMMAND+CENTER+%7C+localhost%3A8080+%7C+mvnw+spring-boot%3Arun+%F0%9F%9A%A8" alt="Alert Strip"/>

<br/>

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.4-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Auth-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Wrapper-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)

<br/>

![License](https://img.shields.io/badge/License-Academic-blue?style=flat-square)
![Status](https://img.shields.io/badge/Status-Local_Dev_Only-orange?style=flat-square)
![Internship](https://img.shields.io/badge/Infosys_Springboard-6.0-0066CC?style=flat-square)
![Localhost](https://img.shields.io/badge/Runs_On-localhost:8080-brightgreen?style=flat-square)
![Platform](https://img.shields.io/badge/Platform-Local_Only-red?style=flat-square)
![HikariCP](https://img.shields.io/badge/HikariCP-Connection_Pool-blue?style=flat-square)
[![Stars](https://img.shields.io/github/stars/Matheeshkumar368/Disaster-Management-Alert-System-?style=flat-square&label=Stars)](https://github.com/Matheeshkumar368/Disaster-Management-Alert-System-)

</div>

---

<div align="center">

### This project runs only through `./mvnw spring-boot:run`
### Accessible at `http://localhost:8080`
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

## ⚡ Features

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
| 🔄 Connection Pool | HikariCP with MySQL optimization | System |

</div>

---

## 🛠️ Technology Stack

<div align="center">

### Backend

| Technology | Version | Purpose |
|:---|:---:|:---|
| Java | 21 LTS | Core application language |
| Spring Boot | 4.0.4 | Application framework and embedded Tomcat |
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
| CSS3 | Styling — dark themes, card layouts |
| JavaScript Vanilla | Dynamic interactions and Fetch API calls |

### Infrastructure

| Technology | Purpose |
|:---|:---|
| MySQL 8.0 | Primary relational database |
| Maven Wrapper | Dependency management and build tool |
| Maven Compiler Plugin | Annotation processing with Lombok |

</div>

---

## 🏗️ Project Architecture

```
+-----------------------------------------------------------------------------+
|                  DISASTER MANAGEMENT SYSTEM ARCHITECTURE                    |
+-----------------------------------------------------------------------------+
|                                                                             |
|  PRESENTATION LAYER  (Static HTML/CSS/JS - served by Spring Boot)          |
|  index.html | citizen-dashboard | admin-dashboard | responder-dashboard     |
|  alerts.html | reports.html | profile.html | training.html | admin-tasks    |
|                                                                             |
+------------------------------------+----------------------------------------+
                                     |
                              HTTP REST API
                                     |
+------------------------------------v----------------------------------------+
|                        SECURITY LAYER                                       |
|          Spring Security  -->  JWT Filter  -->  JwtUtil.java                |
|          SecurityConfig.java  -->  Role-based endpoint protection           |
+------------------------------------+----------------------------------------+
                                     |
+------------------------------------v----------------------------------------+
|                    CONTROLLER LAYER  (7 Controllers)                        |
|   AuthController    AlertController    DisasterController                   |
|   CitizenReportController    IncidentReportController                       |
|   RescueTaskController    MessageController                                 |
+------------------------------------+----------------------------------------+
                                     |
+------------------------------------v----------------------------------------+
|                    SERVICE LAYER  (5 Services)                              |
|   AlertService    DisasterService    CitizenReportService                   |
|   IncidentReportService    RescueTaskService                                |
+------------------------------------+----------------------------------------+
                                     |
+------------------------------------v----------------------------------------+
|              REPOSITORY LAYER  (7 Repositories - Spring Data JPA)          |
|   UserRepository    AlertRepository    DisasterRepository                   |
|   CitizenReportRepository    IncidentReportRepository                       |
|   RescueTaskRepository    MessageRepository                                 |
+------------------------------------+----------------------------------------+
                                     |
                             HikariCP Pool  (max 20 connections)
                                     |
+------------------------------------v----------------------------------------+
|         MySQL 8.0  --  disaster_management  database  (7 entity tables)    |
+-----------------------------------------------------------------------------+
```

---

## 🔐 Role Based Authentication Flow

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
 |   ADMIN ROLE   | | CITIZEN ROLE   | | RESPONDER ROLE  |
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

## 📁 Project Structure

<details>
<summary>Click to expand full project structure</summary>

```
Disaster-Management-Alert-System/
|
+-- pom.xml                              # Maven - Spring Boot 4.0.4, Java 21
+-- mvnw / mvnw.cmd                      # Maven Wrapper (Linux / Windows)
+-- DATABASE_SETUP.sql                   # MySQL schema script
|
+-- src/main/java/com/disaster/management/
|   |
|   +-- DisasterManagementApplication.java
|   +-- DataInitializer.java
|   |
|   +-- config/
|   |   +-- SecurityConfig.java
|   |
|   +-- controller/
|   |   +-- AuthController.java
|   |   +-- AlertController.java
|   |   +-- DisasterController.java
|   |   +-- CitizenReportController.java
|   |   +-- IncidentReportController.java
|   |   +-- RescueTaskController.java
|   |   +-- MessageController.java
|   |
|   +-- entity/
|   |   +-- User.java
|   |   +-- Alert.java
|   |   +-- Disaster.java
|   |   +-- CitizenReport.java
|   |   +-- IncidentReport.java
|   |   +-- RescueTask.java
|   |   +-- Message.java
|   |
|   +-- repository/
|   |   +-- UserRepository.java
|   |   +-- AlertRepository.java
|   |   +-- DisasterRepository.java
|   |   +-- CitizenReportRepository.java
|   |   +-- IncidentReportRepository.java
|   |   +-- RescueTaskRepository.java
|   |   +-- MessageRepository.java
|   |
|   +-- security/
|   |   +-- JwtUtil.java
|   |
|   +-- service/
|       +-- AlertService.java
|       +-- DisasterService.java
|       +-- CitizenReportService.java
|       +-- IncidentReportService.java
|       +-- RescueTaskService.java
|
+-- src/main/resources/
|   +-- application.properties
|   +-- static/
|       +-- index.html                   # Login page
|       +-- home.html
|       +-- citizen-dashboard.html
|       +-- admin-dashboard.html
|       +-- responder-dashboard.html
|       +-- alerts.html
|       +-- admin-alerts.html
|       +-- reports.html
|       +-- profile.html
|       +-- admin-profile.html
|       +-- admin-tasks.html
|       +-- responder-profile.html
|       +-- responder-register.html
|       +-- responder-rescue.html
|       +-- responder-tasks.html
|       +-- training.html
|       +-- auth-guard.js
|       +-- role-loading.js
|       +-- role-loading.css
```

</details>

---

## 🔄 Emergency Monitoring Workflow

```
STEP 1 - CITIZEN REPORTS
  Citizen logs in  -->  Citizen Dashboard
  -->  Report Disaster  -->  POST /api/citizen-reports
                    |
                    v
STEP 2 - ADMIN REVIEWS
  Admin Dashboard  -->  Reviews reports
  -->  Creates Disaster  -->  POST /api/disasters
                    |
                    v
STEP 3 - ALERT BROADCAST
  Admin  -->  Admin Alerts  -->  POST /api/alerts
  -->  Alert visible to all roles
                    |
                    v
STEP 4 - TASK ASSIGNMENT
  Admin  -->  Admin Tasks
  -->  Assigns Rescue Task to Responder
  -->  POST /api/rescue-tasks
                    |
                    v
STEP 5 - RESPONDER ACTION
  Responder Dashboard  -->  View tasks
  -->  Pending --> In Progress --> Completed
  -->  PUT /api/rescue-tasks/{id}
                    |
                    v
STEP 6 - RESOLUTION
  Admin updates Disaster status to Resolved
  -->  Archived in MySQL
```

---

## 📸 Screenshot Gallery

> Run the project at `http://localhost:8080`, capture screenshots, place them in a `/screenshots` folder, then replace each placeholder with `![desc](screenshots/filename.png)`.

<div align="center">

---

### 🔐 Login Page
> `SCREENSHOT WILL BE ADDED HERE` — `localhost:8080/index.html`

---

### 📝 Registration Page
> `SCREENSHOT WILL BE ADDED HERE`

---

### 🏠 Citizen Dashboard
> `SCREENSHOT WILL BE ADDED HERE` — `localhost:8080/citizen-dashboard.html`

---

### ⚙️ Admin Dashboard
> `SCREENSHOT WILL BE ADDED HERE` — `localhost:8080/admin-dashboard.html`

---

### 🧑‍🚒 Responder Dashboard
> `SCREENSHOT WILL BE ADDED HERE` — `localhost:8080/responder-dashboard.html`

---

### 🚨 Emergency Alerts
> `SCREENSHOT WILL BE ADDED HERE` — `localhost:8080/alerts.html`

---

### 📊 Disaster Monitoring
> `SCREENSHOT WILL BE ADDED HERE`

---

### 👤 Profile Management
> `SCREENSHOT WILL BE ADDED HERE` — `localhost:8080/profile.html`

</div>

---

## 🔧 Installation Guide

### Requirements

<div align="center">

| Requirement | Version |
|:---|:---:|
| Java JDK | 21 LTS |
| MySQL Server | 8.0 or higher |
| Git | Latest |
| Maven | Included via Maven Wrapper |

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

```bash
mysql -u root -p disaster_management < DATABASE_SETUP.sql
```

### Step 4 — Configure Credentials

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/disaster_management
spring.datasource.username=root
spring.datasource.password=your_mysql_password
```

---

## ▶️ Running the Project

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

> Local development only. No cloud. No deployment. No live demo.

---

## 🚀 Future Scope

<details>
<summary>Click to expand roadmap</summary>

| Priority | Feature |
|:---:|:---|
| High | Real-time WebSocket notifications |
| High | SMS and Email alerts via Twilio or SendGrid |
| Medium | Interactive map with Leaflet.js |
| Medium | NDMA RSS feed auto-parsing |
| Medium | Forgot password and reset flow |
| Low | Mobile app for field responders |
| Low | Multi-language support |
| Low | Docker containerization |
| Low | CI/CD with GitHub Actions |
| Low | AI-based severity prediction |

</details>

---

## 👨‍💻 Contributors

<div align="center">

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/Matheeshkumar368">
        <img src="https://avatars.githubusercontent.com/u/Matheeshkumar368?v=4" width="100px" style="border-radius:50%" alt="Matheeshkumar"/><br/>
        <b>Matheeshkumar</b><br/>
        <sub>Full Stack Developer</sub><br/>
        <sub>Infosys Springboard 6.0 Intern</sub>
      </a>
    </td>
  </tr>
</table>

| Area | Contribution |
|:---|:---|
| Architecture | Full MVC layer — Spring Boot 4 structure |
| Security | JWT authentication with Spring Security |
| Database | MySQL schema — 7 entity tables |
| Frontend | 15+ HTML role-based dashboards |
| REST API | 7 controllers covering all modules |
| Testing | Application integration tests |
| Build | Maven Wrapper cross-platform config |

</div>

---

## 📄 License

```
Academic Use License
Developed under Infosys Springboard 6.0 Internship Program.
Free to use as reference for learning and academic projects.
Not intended for commercial use.
```

---

<div align="center">

<!-- ANIMATED FOOTER -->
<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=12&duration=2000&pause=500&color=FF4500&center=true&vCenter=true&width=700&height=28&lines=Disaster+Management+%26+Alert+System+%7C+Infosys+Springboard+6.0;Java+21+%7C+Spring+Boot+4+%7C+JWT+%7C+MySQL+%7C+localhost%3A8080;Local+Development+Only+%7C+mvnw+spring-boot%3Arun" alt="Footer"/>

<br/>

[![GitHub stars](https://img.shields.io/github/stars/Matheeshkumar368/Disaster-Management-Alert-System-?style=social)](https://github.com/Matheeshkumar368/Disaster-Management-Alert-System-)
[![GitHub forks](https://img.shields.io/github/forks/Matheeshkumar368/Disaster-Management-Alert-System-?style=social)](https://github.com/Matheeshkumar368/Disaster-Management-Alert-System-)

<br/>

**Made with dedication during Infosys Springboard 6.0 Internship Program**

</div>
