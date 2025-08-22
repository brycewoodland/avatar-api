# 🌊🔥🌪️🪨 Avatar: The Last Airbender REST API

A simple REST API for exploring data from the *Avatar: The Last Airbender* universe.
This API is built with **Java + Spring Boot** and uses **PostgreSQL** as the database.
It exposes read-only endpoints (```GET``` requests) for nations, factions, characters,
bending styles, episodes, animals, weapons, languages, and quotes.

## Features

- Query information about **Nations** (Fire Nation, Earth Kingdom, etc.)
- Explore **Characters** and their relationships (factions, bending, languages, weapones, quotes)
- Browse **Episodes** by season and number
- View **Factions** and their associated nations
- Discover **Animals** and their owners
- Get details on **Bending styles** and which characters use them
- Access **Quotes** from characters

## Database Schema
The database is structured around the Avatar universe with relational integrity.

### Core Tables
- nations
- factions
- characters
- locations
- episodes
- bending_styles
- animals
- weapons
- languages
- quotes

### Join Tables
- character_factions
- character_bending
- character_weapons
- character_languages

## Getting Started

### Prerequisites
- Java 17+
- Maven (or use Gradle if you prefer)
- PostgreSQL
- Git

### Setup
1. Clone the repository:

```bash
git clone https://github.com/your-username/avatar-api.git
cd avatar-api
```

2. Create the PostgreSQL database:
   
```sql
CREATE DATABASE avatar_api;
```

3. Run the schema script to set up tables: avatar-db-backup

4. Configure your database credentials in src/main/resources/application.properties:

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/avatar_api
spring.datasource.username=your_user
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
```

5. Build and run the Spring Boot app.

The server will start at http://localhost:8080

## Example Endpoints

- GET /api/v1/characters -> List of all characters

### Tech Stack
- **Backend**: Java 17+, Spring Boot
- **Database**: PostgreSQL
- **ORM**: JPA / Hibernate
- **Build Tool**: Maven

## Future Plans
- [] Add filtering (e.g., characters by bending style, nation)
- [] Implement pagination for large datasets (e.g., episodes, quotes)
- [] Add write operations (```POST```, ```PUT```, ```DELETE```)
- [] Extend database to include Legend of Korra data

## License
MIT License. Free to use, modify, and share.
