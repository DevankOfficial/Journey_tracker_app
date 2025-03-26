# ✈️ Plane Journey Tracker App (DistanceIt)

A **Kotlin-based Android app** that helps users track and visualize their journey while traveling by plane.

## 🚀 Features  
- **Distance Toggle:** Switch between kilometers and miles.  
- **Stop Tracking:** Mark each stop along the journey.  
- **Progress Visualization:** View distance covered, remaining distance, and visa requirements.  
- **Lazy List:** Efficiently handles journeys with multiple stops.  
- **Android Compatibility:** Runs smoothly on Android devices and emulators.  

## 🛠️ Tech Stack  

### **Frontend (UI)**  
Built using **Jetpack Compose** for a modern, reactive UI.  

<img src="https://upload.wikimedia.org/wikipedia/commons/7/7d/Kotlin_Icon.png" alt="Kotlin" width="50" height="50"> &nbsp;
<img src="https://developer.android.com/static/images/logos/jetpack-compose-logo.png" alt="Jetpack Compose" width="120" height="50"> &nbsp;

---

### **Backend (Logic & Data Handling)**  
Powered by **Kotlin & Jetpack Navigation** for seamless data management.  

<img src="https://upload.wikimedia.org/wikipedia/commons/3/3d/Android_Studio_Icon_2023.svg" alt="Android Studio" width="50" height="50"> &nbsp;
<img src="https://developer.android.com/static/images/logos/android.svg" alt="Android" width="50" height="50"> &nbsp;

---

### **📌 Code Structure**
Navigation & Screens
1. MainActivity.kt: Sets up the app with Jetpack Navigation.

2. HomeScreen.kt: Displays the journey progress, stops, and distance toggle.

3. SecondScreen.kt: Handles additional filters and selection options.

Data & Utilities
- Journey Details: Stores destination, stops, and progress.

- Stop Data: Randomly generated stops with distance, time, and visa requirements.

- Utility Functions: Includes distance conversion and dialog pop-ups.

---

### **🎯 How It Works**
1. Set your journey destination.

2. View stops, distances, and visas.

3. Mark stops as you progress.

4. Toggle units between kilometers and miles.

5. Track your journey with a visual progress bar.
