# BiteBuddy
# YouTube: https://youtu.be/3Dl7GmMq-qU?si=rGbNeRm1x8uz5V_R

BiteBuddy is a fun and interactive Android app designed to help users quickly decide what to eat. By entering the time of day, the app suggests meals ranging from breakfast to after-dinner snacks. The goal is to make meal planning simple, stress-free, and enjoyable.

## Purpose of the App
The purpose of BiteBuddy is to:
- Remove the stress of deciding what to eat.
- Provide quick, time-based meal suggestions.
- Keep the experience engaging with motivational messages.

If the user types in an incorrect input, the app responds with a friendly error message and prompts them to try again.

## Design Considerations

### User Interface (UI)
- Minimal layout with one main input field and results area.
- Clean design that is simple and easy to navigate.
- A reset button lets users clear everything with one tap.

### User Experience (UX)
- Quick interaction: type the time of day → get meal suggestions.
- Friendly error messages instead of app crashes.
- Designed to be intuitive for first-time users.

### Technical Design
- Language: Kotlin
- Framework: Android Studio
- Compatibility: minSdk 21, compileSdk 35
- Build system: Gradle
- Organized project structure with:
  - MainActivity.kt (logic)
  - res/layout/ (UI layout)
  - res/drawable/ (images/backgrounds)

## GitHub Usage
- All project files are stored in a GitHub repository.
- Commits track progress and code changes.
- Version control ensures nothing is lost.
- Errors during pushing (such as non-fast-forward issues) were solved by syncing branches, which helped strengthen version control skills.
- GitHub serves as a backup and collaboration tool.

## GitHub Actions
While the current project is small, GitHub Actions can be used to:
- Automate builds to check that the app compiles correctly.
- Run tests to confirm input and error handling work as expected.
- Generate APKs automatically.
- Run linting and code quality checks to ensure consistent code.

This makes development smoother and more reliable as the project grows.

## Conclusion
BiteBuddy is a lightweight but practical app that helps users make meal choices in a simple and interactive way. Its design is minimal, user-friendly, and effective.

## Reference 
W3Schools. (n.d.). Kotlin Tutorial. W3Schools. Retrieved September 1, 2025, from https://www.w3schools.com/KOTLIN/index.php

GitHub made it possible to manage code efficiently, while GitHub Actions provide opportunities for future automation and testing. Together, these tools support both the technical and creative sides of the project.
