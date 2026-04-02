# Smart Campus Operations Hub (IT3030 PAF 2026) — GroupXX

## Project Overview
Smart Campus Operations Hub is a web-based system for managing campus facilities/assets, bookings, maintenance & incident tickets, and notifications with authentication/authorization.

## Tech Stack
- Backend: Spring Boot REST API
- Frontend: React web application
- Database: MySQL
- CI: GitHub Actions
- Version Control: Git + GitHub (branching: main/dev/feature/*)

## Repository Structure
- `backend/` — Spring Boot API
- `frontend/` — React web app
- `docs/` — documentation (architecture, API, DB, meeting notes)
- `.github/workflows/` — GitHub Actions workflows

## Setup Instructions (High level)
### Prerequisites
- Java 17+ (recommended)
- Maven (or Maven Wrapper)
- Node.js 18+ (recommended) + npm
- MySQL 8+

### Backend (Spring Boot)
1. Create a MySQL schema (e.g., `smart_campus`)
2. Configure DB connection in `backend/src/main/resources/application.properties`
3. Build/run backend (once implemented)

### Frontend (React)
1. Install dependencies (once created)
2. Run frontend (once implemented)

## Core Modules
1. Facilities & Assets Catalogue
2. Booking Management
3. Maintenance & Incident Ticketing
4. Notifications + Authentication/Authorization

## Module Allocation by Member
- Member 1: Facilities & Assets Catalogue
- Member 2: Booking Management
- Member 3: Maintenance & Incident Ticketing
- Member 4: Notifications + Authentication/Authorization

## API & Frontend Summary
- Backend: REST endpoints per module (document in `docs/api/`)
- Frontend: UI pages for catalogue, booking, tickets, notifications, login/roles

## GitHub Actions
- CI runs on pushes/PRs to `main` and `dev`
- Backend: build + test
- Frontend: build
