# Plane Journey Tracker App (DistanceIt)

## Overview
The Journey Tracker app is designed to provide users with information about their journey as the travel though plane.

## Features
- **Unit Switching:** Users can toggle between displaying distances in kilometers and miles by using a dedicated button.
- **Stop Marking:** A button allows users to indicate that they have reached the next stop in their journey.
- **Progress Visualization:** The app includes a progress section that displays each stop, their distances, the total distance covered, visas required, and the remaining distance. A progress bar visually represents the journey's progress.
- **Lazy List:** For journeys with more than 3 stops, the app utilizes a lazy list to efficiently handle large datasets.
- **Compatibility:** The app is designed to run seamlessly on both Android devices and the Android emulator.

## Getting Started
To run the Journey Tracker app on your Android device or emulator, follow these steps:
1. Clone the repository to your local machine.
   git clone https://github.com/Devank23/MC_A1.git
2. Open the project in Android Studio.
3. Run the app on your desired device or emulator.

## Technologies Used
- **Kotlin:** The programming language used for app development.
- **Android Compose:** A modern UI toolkit for building native Android UI.

## Code Structure
### MainActivity.kt
This is an Android application built with Jetpack Compose and Navigation Compose.

#### MainActivity
The `MainActivity` is the entry point of the application. It sets up the navigation for the app using `NavHost` and `rememberNavController`.

#### Navigation
The app has two screens: `HomePage` and `Second`. The `NavHost` is set up with these two routes, with the default screen being `HomePage`.

#### Home Screen
The `Home` screen is represented by the `HomePage().homeScreen(navController)` composable function. This function takes in the `NavController` as a parameter, which is used for navigating between different screens.

#### Second Screen
The `Second` screen is represented by the `secondScreen(navController)` composable function. This function also takes in the `NavController` as a parameter.

#### Theme
The app uses a custom theme defined in `LearndAppTheme`. The `Surface` composable is used to apply this theme to the entire app.

### Data Package
The data package contains the data classes and functions used to generate and manage the stops data.

#### Journey Details
The `JourneyDeets` data class represents the details of a journey. It has two properties:
- `dest`: A string representing the destination of the journey.
- `stops_list`: A list of `Stop` objects representing the stops in the journey.

#### Stop
The `Stop` data class represents a stop in the journey. It has following properties:
- `name`: The name of the stop. Which is set as `Stop {i}`.
- `currDist`: The distance to the stop. Which is randomly generated between 5 to 19 km.
- `timeNeeded`: The time to cover the distance to the stop. Which is also randomly generated between 10 to 29 minutes.
- `visa`: The visa requirement of that stop. Which is randomly generated as a single length string between A to Z.
- `TotDist`: The sum of the distances of the previous stops.
- `timeTaken`: The sum of the times to cover the distances of the previous stops.
- `reachedStatus`: A bool to mark if the stop has been reached or not.

#### generateRandomStops
The `generateRandomStops` function generates a list of random stops. It creates a `Stop` object for each stop and adds it to the list. Each attribute is generated as defined above. The number of `Stops` in each list varies between 5 to 15 (intentionally >3 to showcase lazy list).

### Home Screen
The `HomePage` class contains the main screen of the application. It has two companion objects:
- `journey`: An instance of the `JourneyDeets` data class.
- `kilo`: A boolean variable that could be used to toggle between kilometers and miles.

## Home Screen

### homeScreen
The `homeScreen` function is a composable function responsible for rendering the application's home screen. It utilizes the `Scaffold` composable to maintain a consistent layout.

#### State
The `homeScreen` function manages the following state variables:
- **`destination`**: A string state used to store the journey’s destination.
- **`stops`**: A list state that holds the journey’s stops.
- **`showInKilometers`**: A boolean state that toggles the distance display between kilometers and miles.

#### Composables
The `homeScreen` function incorporates several composables:
- **`Scaffold`**: Establishes a structured layout for the screen.
- **`BottomAppBar`**: Displays a button at the bottom for user interaction.
- **`Button`**: Placed within the `BottomAppBar` to trigger actions.

---

## Second Screen

### secondScreen
The `secondScreen` function is a composable function that represents the application's second screen. Like `homeScreen`, it employs the `Scaffold` composable to ensure a uniform screen design.

#### State
This function manages the following state variables:
- **`load`**: A float state that may represent loading progress.
- **`indeces`**: An integer state tracking selected indices within a list or similar structure.
- **`selectedFilters`**: A list state storing selected filters or options.

#### Composables
Various composables are used in `secondScreen`:
- **`Scaffold`**: Provides a structured layout.
- **`BottomAppBar`**: Contains a button for user interaction.
- **`Button`**: Placed within the `BottomAppBar`, styled using `ButtonDefaults.buttonColors`.
- **`Row`**: Arranges child composables in a horizontal sequence.
- **`Text`**: Displays textual content.
- **`Card`**: Presents content in a material design card format.
- **`Icon`**: Renders an icon.
- **`LazyColumn`**: Efficiently displays a vertically scrolling list of items.
- **`FilterChip`**: Represents a selectable filter chip, styled using `FilterChipDefaults.filterChipColors`.

#### onClick
The `onClick` function handles filter chip interactions. If a stop’s name is not already in `selectedFilters`, it is added for each index up to the current one.

---

## Dialogs & Utilities

### CompletionDialog
The `CompletionDialog` function displays a dialog upon journey completion. It accepts an `onDismissRequest` callback, which is triggered when the dialog is dismissed.

The dialog's content is wrapped inside a `Card`. A `Box` is used to display an `Image` representing a congratulatory icon, and a `Button` is provided to close the dialog.

### convertKilometersToMiles
The `convertKilometersToMiles` function is a utility function that converts a given distance in kilometers to miles and returns the equivalent value.  
