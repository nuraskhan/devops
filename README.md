# Devops Project

This repository contains a multi-module application with Dockerized microservices for `accounts` and `cards`. The project includes Docker Compose configuration for local development and GitHub Actions for continuous integration and deployment.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies](#technologies)
- [Setup and Installation](#setup-and-installation)
  - [Prerequisites](#prerequisites)
  - [Docker Setup](#docker-setup)

## Project Overview

This project includes multiple microservices that are built and containerized using Docker. The main services are:
- **Accounts**: A service for handling user account management.
- **Cards**: A service for managing card information.

The project is managed using `Maven` for building the application and Docker for containerization.

## Technologies

- **Java** (Spring Boot) for backend services
- **Docker** for containerization
- **Maven** for building Java projects
- **GitHub Actions** for CI/CD
- **Docker Compose** for local development environment setup
- **Prometheus and Grafana** for monitoring and visualization

## Setup and Installation

### Prerequisites

Make sure you have the following tools installed:
- [Docker](https://www.docker.com/get-started) and [Docker Compose](https://docs.docker.com/compose/install/)
- [Maven](https://maven.apache.org/install.html)
- [Git](https://git-scm.com/)

### Docker Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/project-repo.git
   cd project-repo
   ```
   
2. Build Docker images for each microservice:

   ```bash
   cd accounts
   mvn clean package -DskipTests
   docker build -t nurascript/accounts .
   ```
   
   ```bash
    cd cards
    mvn clean package -DskipTests
    docker build -t nurascript/cards .
   ```
   
3. Run the services using Docker Compose:
Once the Docker images are built and pushed, you can start the services locally using Docker Compose. This will start both the accounts and cards services, as well as the monitoring services (Prometheus and Grafana).
   
   ```bash
    docker-compose up
   ```

   This will start the containers for accounts, cards, Prometheus, and Grafana. You can verify that the services are running by visiting the following URLs:

- Accounts service: http://localhost:8080
- Cards service: http://localhost:8081
- Prometheus: http://localhost:9090
- Grafana: http://localhost:3000
