# 🔐 Authentication Template
This repository contains an authentication template for Android apps using Firebase Authentication. It supports two sign-in methods:

- 📧 Email and Password authentication
- 🔒 Google Sign-In (using Firebase + Google Identity)

## 📱 Features
- Sign up with email and password
- Sign in with email and password
- Sign in with Google (OAuth2 via Firebase)
- Sign out functionality
- Simple UI with navigation between sign-up, login, and main screens
- Firebase integration using FirebaseAuth
- Google Sign-In integration via GoogleSignInClient

## 📁 Project Structure
- LoginActivity.kt
Handles email/password login.

- SignUpActivity.kt
Handles user registration via email/password and Google Sign-In.
Also processes Google Sign-In result and handles Firebase authentication with the obtained token.

- MainActivity.kt
Displays the currently logged-in user's email and provides a button to sign out.

## 🛠️ Tech Stack
- Language: Kotlin
- Firebase Authentication
- Google Sign-In API
- Android ViewBinding
- Activities + XML layouts

## 🚀 Getting Started
1. Clone the Repository
```
git clone https://github.com/MelArt24/Authentication.git
```

2. Set up Firebase
- Go to Firebase Console
- Create a new Firebase project
- Add your Android app and download the google-services.json file
- Place it in the /app directory
- Enable Email/Password and Google sign-in methods in Firebase → Authentication → Sign-in method