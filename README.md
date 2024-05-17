# Continents Guide App

## Overview

The Continents Guide App is a mobile application designed to provide users with an engaging experience while exploring information about different continents. The app allows seamless navigation between continents, presenting unique content and visual elements for each region.

## Screens and Navigation

The app consists of several screens, each dedicated to a specific continent. The main navigation is facilitated through a user-friendly interface, allowing users to effortlessly switch between screens. The screens include:

- Main Menu
- Europe
- Asia
- Africa
- America
- Oceania

The navigation is implemented using Jetpack Compose and the Android Navigation component.

## Design and Styling

### Main Menu

The Main Menu screen features styled buttons, each representing a continent. The buttons are designed with a rounded corner shape, a distinct color palette, and a clear text label. The background of the Main Menu utilizes captivating images of each continent.

![Main Menu](screenshots/main_menu.jpeg)

### Continent Screens

Each continent screen presents information about the selected region. The content is displayed in a readable and aesthetically pleasing manner. The screens include a prominent title, styled text describing the continent, a 'Back' button for easy navigation to the Main Menu, and a 'Quiz' button to test your knowledge about the continent.

![Continent Screens](screenshots/information_screen_1_8.jpeg)

### Continent Quiz
The Continent Quiz screen provides an interactive quiz for users to test their knowledge about the selected continent. Users are presented with a series of questions about the continent and fields for entering their answers. After submitting their answers, users receive a score based on the number of correct responses.

The quiz screen includes:

- Questions related to the continent.
- Input fields for users to enter their answers.
- A 'Submit' button to submit the answers and receive the score.
- A 'Back' button to return to the Continent Screen.

![Continent Quiz](screenshots/quiz_screen_1_7.jpeg)

## Visual Elements

- **Styled Buttons**: The buttons on the Main Menu screen are styled with a unique color scheme and shape. They efficiently handle navigation to specific continent screens upon selection.

- **Styled Images**: Images are seamlessly integrated into the background of the Main Menu screen. These images, representing each continent, enhance the visual appeal of the app.

## Code Structure

- `MainActivity.kt`: Contains the main logic for setting up the Compose UI and navigation between screens.

- `MainMenuScreen.kt`: Defines the Main Menu screen with styled buttons and background images.

- `EuropeScreen.kt`, `AsiaScreen.kt`, `AfricaScreen.kt`, `AmericaScreen.kt`, `OceaniaScreen.kt`: Individual files for each continent screen, presenting unique content.

## Usage

To run the Continents Guide App, clone the repository and open the project in Android Studio. Build and run the app on an emulator or a physical device.

## Contributors

- Nikita Smiichyk (@smiichyk)

## License

See the [MIT License](LICENSE) file for details.
