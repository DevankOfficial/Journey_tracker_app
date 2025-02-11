# Journey Tracker App (DistanceIt)

## Overview
The Journey Tracker app is designed to provide users with information about their journey, including details about stops, distances between stops, and the overall progress of the journey. The app offers a user-friendly interface with the ability to switch between kilometers and miles, mark stops as reached, and visualize the journey's progress.

## Features
- **Unit Switching:** Users can toggle between displaying distances in kilometers and miles by using a dedicated button.
- **Stop Marking:** A button allows users to indicate that they have reached the next stop in their journey.
- **Progress Visualization:** The app includes a progress section that displays each stop, their distances, the total distance covered, and the remaining distance. A progress bar visually represents the journey's progress.
- **Lazy List:** For journeys with more than 10 stops, the app utilizes a lazy list to efficiently handle large datasets.
- **Compatibility:** The app is designed to run seamlessly on both Android devices and the Android emulator.

## ScreenShot


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
The app has two screens: `Home` and `Second`. The `NavHost` is set up with these two routes. The `startDestination` is set to `Home`, which means the app will open with the `Home` screen.

#### Home Screen
The `Home` screen is represented by the `JHome().homeScreen(navController)` composable function. This function takes in the `NavController` as a parameter, which is used for navigating between different screens.

#### Second Screen
The `Second` screen is represented by the `secondScreen(navController)` composable function. This function also takes in the `NavController` as a parameter.

#### Theme
The app uses a custom theme defined in `LearndAppTheme`. The `Surface` composable is used to apply this theme to the entire app.

#### StatusBarColor
The status bar color is set to white using the `Setcolorbar().SetStatusBarColor(color = Color.White)` function.

### Data Package
The data package contains the data classes and functions used to generate and manage the data in the application.

#### JourneyDetails
The `JourneyDetails` data class represents the details of a journey. It has two properties:
- `destination`: A string representing the destination of the journey.
- `stops`: A list of `Stop` objects representing the stops in the journey.

#### Stop
The `Stop` data class represents a stop in the journey. It has five properties:
- `name`: The name of the stop.
- `distance`: The distance to the stop.
- `timeToCover`: The time to cover the distance to the stop.
- `preSum`: The sum of the distances of the previous stops.
- `preTimesum`: The sum of the times to cover the distances of the previous stops.

#### generateRandomStops
The `generateRandomStops` function generates a list of random stops. It creates a `Stop` object for each stop and adds it to the list. The distance and time to cover for each stop are randomly generated.

### Home Screen
The `HomePage` class contains the main screen of the application. It has two companion objects:
- `journeyDetails`: An instance of the `JourneyDetails` data class.
- `kilo`: A boolean variable that could be used to toggle between kilometers and miles.

#### homeScreen
The `homeScreen` function is a composable function that represents the home screen of the application. It uses the `Scaffold` composable to provide a consistent design for the screen.

##### State
The `homeScreen` function uses several state variables:
- `destination`: A string state that could be used to store the destination of the journey.
- `stops`: A list state that could be used to store the stops of the journey.
- `showInKilometers`: A boolean state that could be used to toggle between displaying distances in kilometers and miles.

##### Composables
Several composables are used in the `homeScreen` function:
- `Scaffold`: Provides a consistent design for the screen.
- `BottomAppBar`: Displays a button at the bottom of the screen.
- `Button`: Represents the button displayed in the `BottomAppBar`.

### Second Screen
#### secondScreen
The `secondScreen` function is a composable function that represents the second screen of the application. It uses the `Scaffold` composable to provide a consistent design for the screen.

##### State
The `secondScreen` function uses several state variables:
- `load`: A float state that could be used to represent some form of progress or loading state.
- `indeces`: An integer state that could be used to keep track of selected indices in a list or similar data structure.
- `selectedFilters`: A list state that could be used to keep track of selected filters or similar selection-based features.

##### Composables
Several composables are used in the `secondScreen` function:
- `Scaffold`: Provides a consistent design for the screen.
- `BottomAppBar`: Displays a button at the bottom of the screen.
- `Button`: Represents the button displayed in the `BottomAppBar`. The button's colors are set using the `ButtonDefaults.buttonColors` function.
- `Row`: A composable that places its children in a horizontal sequence.
- `Text`: A composable that displays text.
- `Card`: A composable that displays a material design card.
- `Icon`: A composable that displays an icon.
- `LazyColumn`: A composable that lazily displays items in a column.
- `FilterChip`: A composable that represents a filter chip. The chip's colors are set using the `FilterChipDefaults.filterChipColors` function.

##### onClick
The `onClick` function is used to handle click events on the filter chip. It checks if the current stop's name is not in the `selectedFilters` state, and if so, it adds the current stop's name to the `selectedFilters` state for each index up to and including the current index.

#### CompletionDialog
The `CompletionDialog` function is a composable function that displays a dialog when the journey is completed. It takes a function `onDismissRequest` as a parameter which is called when the dialog is dismissed.

Inside the dialog, a `Card` is used to hold the content. An `Image` is displayed inside a `Box` to show a congratulation icon. A `Button` is provided to dismiss the dialog.

#### convertKilometersToMiles
The `convertKilometersToMiles` function is a utility function that converts kilometers to miles. It takes a `kilometers` parameter and returns the equivalent distance in miles.
