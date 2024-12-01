# Sentient Coffee Machine API

Welcome to the Sentient Coffee Machine API! This API is the core software that drives the "personality" and "intelligence" of a sentient coffee machine. It allows developers to integrate functionalities such as personality management, user preferences, coffee brewing, and personalized recommendations into their applications.

## Features

### Personality Management
- **Retrieve the current personality** of the machine.
- **Update the personality** with parameters like mood, humor level, and talkativeness.

### User Preferences
- **Create user profiles** and manage personalized coffee preferences.
- Retrieve and update preferences for specific users.

### Coffee Brewing
- Initiate and monitor the brewing process with customizable options for drink type, size, and other parameters.

### Interaction and Learning
- Record user interactions, including voice commands and drink ratings.
- Provide personalized coffee recommendations based on past interactions and preferences.

---

## Getting Started

### Prerequisites
- Java Development Kit (JDK 11 or above).
- A database server (e.g., MySQL, PostgreSQL).
- A build tool like Maven or Gradle.

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/sentient-coffee-api.git
   cd sentient-coffee-api
   ```

2. Configure the database:
   - Update the `application.properties` file in the `src/main/resources` directory with your database credentials.

3. Build and run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

4. The API will be available at `http://localhost:8080`.

---

## API Documentation

### Base URL
```
http://localhost:8080
```

### Endpoints

#### Personality Management
- **GET /personality**: Retrieve the machine's current personality.
- **PUT /personality**: Update the machine's personality.

#### User Preferences
- **POST /users**: Create a new user profile.
- **GET /users/{userId}/preferences**: Retrieve coffee preferences for a specific user.
- **PUT /users/{userId}/preferences**: Update coffee preferences for a specific user.

#### Coffee Brewing
- **POST /brew**: Start a new brewing cycle.
- **GET /brew/{brewId}/status**: Retrieve the status of a brewing cycle.

#### Interaction and Learning
- **POST /interaction**: Record user interactions with the machine.
- **GET /recommendations**: Fetch coffee recommendations for a user.

For detailed API documentation, please refer to [API_DOCS.md](./API_DOCS.md).

---

## Development

### Project Structure

- **Controllers**: Handle incoming HTTP requests and route them to the appropriate services.
- **Services**: Contain business logic and interact with data repositories.
- **Models**: Represent data structures used throughout the application.
- **Repositories**: Handle database interactions.

### Adding a New Feature
1. Define a new model if needed.
2. Add a corresponding repository.
3. Create a service with business logic.
4. Expose the functionality through a controller endpoint.

---

## Contributing
We welcome contributions to improve the Sentient Coffee Machine API! To contribute:
1. Fork the repository.
2. Create a feature branch.
3. Submit a pull request with detailed descriptions of changes.

---

## License
This project is licensed under the MIT License. See the LICENSE file for details.

---

## Acknowledgments
- Special thanks to all contributors and testers.
- Inspired by the need for smarter coffee machines.

Enjoy coding and caffeinating with the Sentient Coffee Machine API!

