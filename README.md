# BiteBuddy 🍴

**BiteBuddy** is a fun and interactive Android app designed to help users quickly decide what to eat during busy days. By entering the time of day, the app provides meal suggestions ranging from breakfast to after-dinner snacks, making meal planning simple, engaging, and enjoyable.

## Project Structure

The **BiteBuddy** project contains a main Android module located in the `app/` directory. Inside `app/`, the `src/main/` folder holds the Kotlin source file `MainActivity.kt` under `java/com/example/bitebuddy/`, as well as the `res/` directory for resources. The `res/` folder includes `layout/activity_main.xml` for the app’s user interface and a `drawable/` directory for any graphics or backgrounds. The module also has its own Gradle build file named `build.gradle.kts`.  

At the project level, there is a `build.gradle.kts` file for overall project configuration, a `settings.gradle.kts` file to define project settings, and this `README.md` file that provides documentation and guidance for the project.

## Features

- **Time-based meal suggestions**: Type in a time of day (e.g., Morning, Afternoon, Dinner) and get meal ideas.
- **Fun and engaging UI**: Vibrant design with emojis to make meal planning enjoyable and interactive.
- **Reset functionality**: Clear inputs and suggestions with a single tap using the "Reset" button.
- **Error handling with prompts**: If the user enters an invalid time of day, BiteBuddy displays a motivating error message, such as "Oops! That’s not a valid time. Try Morning, Afternoon, or Dinner 🕒," and prompts the user to enter again.
- **Variety of meal suggestions**: Provides multiple options per time of day, including snacks and desserts.

## Technology

- Kotlin  
- Android Studio  
- Android SDK (minSdk 21, compileSdk 35)  
- Gradle for build automation  

## How to Run

1. Clone the repository.  
2. Open the project in Android Studio.  
3. Build and run the app using an emulator (BlueStacks or Android Emulator) or a physical device.  
4. Enter a time of day in the text field to see meal suggestions.  
5. Use the "Reset" button to clear your input and try again.  

## Example Meal Suggestions

- **Morning**: Pancakes, Smoothie  
- **Mid-morning snack**: Fruit and yoghurt  
- **Afternoon**: Sandwich, Salad  
- **Afternoon snack**: Cookies and milk  
- **Dinner**: Pasta, Stir Fry  
- **After dinner snack**: Ice cream, Fruit salad  

## License

This project is for educational purposes and can be modified and extended freely. It encourages experimenting with UI design, Kotlin logic, and interactive app features to make meal planning fun and engaging.
