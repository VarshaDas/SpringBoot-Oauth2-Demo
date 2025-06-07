
````markdown
# Spring Boot OAuth2 Demo

This is a simple Spring Boot project that demonstrates OAuth 2.0 login integration using **Google** as the authentication provider. It retrieves basic profile details such as name, email, and profile picture after login.

## 🔧 Features

- ✅ Google OAuth 2.0 login  
- ✅ Spring Security integration  
- ✅ Access public and private endpoints  
- ✅ Retrieve authenticated user profile data  
- ✅ REST APIs for user data  

---

## 🚀 Technologies Used

- Java 17+  
- Spring Boot 3.x  
- Spring Security  
- OAuth 2.0 Client (Google)  
- Maven  

---

## 🔐 OAuth2 Scopes

This app requests the following scopes from Google:

- `profile`: for name and picture  
- `email`: for user email  

---

## 🛠️ Setup & Run

### 1. Clone the repository

```bash
git clone https://github.com/VarshaDas/SpringBoot-Oauth2-Demo.git
cd SpringBoot-Oauth2-Demo/Oauth2-springdemo
````

### 2. Configure Google OAuth Credentials

* Go to [Google Developer Console](https://console.developers.google.com/)
* Create OAuth client credentials
* Set the redirect URI to:

  ```
  http://localhost:8080/login/oauth2/code/google
  ```
* Note down your `client-id` and `client-secret`

### 3. Update `application.properties`

```properties
spring.security.oauth2.client.registration.google.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_CLIENT_SECRET
spring.security.oauth2.client.registration.google.scope=profile,email
```

### 4. Run the app

```bash
./mvnw spring-boot:run
```

Or run it from your IDE (IntelliJ, Eclipse, etc.).

---

## 🙋‍♀️ Author

**Varsha Das**
GitHub: [@VarshaDas](https://github.com/VarshaDas)

```

Let me know if you want me to add API endpoints or usage examples next!
```
