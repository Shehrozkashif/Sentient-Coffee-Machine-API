# API Documentation for Sentient Coffee Machine

---

## Base URL
```
http://localhost:8080
```

## 1. Personality Management

### GET /personality
**Description**: Retrieve the current personality profile of the machine.

**Response**:
- **Status Code**: 200 OK
- **Body**:
  ```json
  {
    "mood": "happy",
    "humorLevel": "high",
    "talkativeness": "medium"
  }
  ```

---

### PUT /personality
**Description**: Update the personality profile of the machine.

**Request Body**:
```json
{
  "mood": "excited",
  "humorLevel": "low",
  "talkativeness": "high"
}
```

**Response**:
- **Status Code**: 200 OK
- **Body**:
  ```json
  {
    "message": "Personality profile updated successfully."
  }
  ```

---

## 2. User Preferences

### POST /users
**Description**: Create a new user profile.

**Request Body**:
```json
{
  "userId": "user123",
  "preferredDrink": "latte",
  "strength": "medium",
  "milk": true,
  "sugar": false
}
```

**Response**:
- **Status Code**: 201 Created
- **Body**:
  ```json
  {
    "message": "User profile created successfully."
  }
  ```

---

### GET /users/{userId}/preferences
**Description**: Retrieve the coffee preferences for a specific user.

**Response**:
- **Status Code**: 200 OK
- **Body**:
  ```json
  {
    "userId": "user123",
    "preferredDrink": "latte",
    "strength": "medium",
    "milk": true,
    "sugar": false
  }
  ```

---

### PUT /users/{userId}/preferences
**Description**: Update the coffee preferences for a specific user.

**Request Body**:
```json
{
  "preferredDrink": "espresso",
  "strength": "strong",
  "milk": false,
  "sugar": true
}
```

**Response**:
- **Status Code**: 200 OK
- **Body**:
  ```json
  {
    "message": "User preferences updated successfully."
  }
  ```

---

## 3. Coffee Brewing

### POST /brew
**Description**: Initiate a brewing cycle with parameters for drink type, size, and any customizations.

**Request Body**:
```json
{
  "drinkType": "latte",
  "size": "medium",
  "customizations": {
    "extraShot": true,
    "flavor": "vanilla"
  }
}
```

**Response**:
- **Status Code**: 202 Accepted
- **Body**:
  ```json
  {
    "brewId": "brew123",
    "message": "Brewing cycle initiated."
  }
  ```

---

### GET /brew/{brewId}/status
**Description**: Get the status of a brewing cycle.

**Response**:
- **Status Code**: 200 OK
- **Body**:
  ```json
  {
    "brewId": "brew123",
    "status": "brewing"
  }
  ```

- **Possible Status Values**: `brewing`, `complete`, `error`

---

## 4. Interaction and Learning

### POST /interaction
**Description**: Record user interactions with the machine, such as voice commands, button presses, or ratings of drinks.

**Request Body**:
```json
{
  "userId": "user123",
  "interactionType": "buttonPress",
  "details": "User pressed the latte button."
}
```

**Response**:
- **Status Code**: 201 Created
- **Body**:
  ```json
  {
    "message": "Interaction recorded successfully."
  }
  ```

---

### GET /recommendations
**Description**: Get personalized coffee recommendations for a user based on past interactions and preferences.

**Response**:
- **Status Code**: 200 OK
- **Body**:
  ```json
  {
    "recommendations": [
      {
        "drinkType": "cappuccino",
        "reason": "User often chooses medium-strength drinks with milk."
      },
      {
        "drinkType": "flat white",
        "reason": "User has shown a preference for creamy drinks."
      }
    ]
  }
  ```

---

## Error Handling

### Common Error Responses

- **Status Code**: 400 Bad Request
  **Example**:
  ```json
  {
    "error": "Invalid input data."
  }
  ```

- **Status Code**: 404 Not Found
  **Example**:
  ```json
  {
    "error": "User not found."
  }
  ```

- **Status Code**: 500 Internal Server Error
  **Example**:
  ```json
  {
    "error": "An unexpected error occurred. Please try again later."
  }
  ```

---

## API Design Notes

- **RESTful Principles**:
  - The API follows RESTful design principles such as using HTTP methods (GET, POST, PUT) for CRUD operations.
  - Endpoints use meaningful names and parameters.

- **Data Validation**:
  - The API performs basic validation to ensure data integrity, such as checking required fields and data types.

- **Consistency**:
  - All responses use JSON format.
  - Consistent error responses help users understand issues.

---

## Conclusion

This documentation provides a comprehensive overview of the Sentient Coffee Machine API, including endpoint descriptions, request and response examples, and error handling details. The API can be tested with tools like Postman or integrated with a frontend for full-stack functionality.
