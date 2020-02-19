# Beerer
Learn about your favourite beers

## Get started with IntelliJ
- Lets enable Android plugin
    - Go to File -> Settings -> Plugins -> Search for "Android Support" -> Enable plugin -> Hit OK and restart IntelliJ 
- Lets install Android SDK
    - Go to File -> Settings -> Appearance & Behaviour -> System Settings -> Android SDK
    - Hit Edit link -> Set the path for installation -> Next -> Next -> Wait and Finish
- Lets create Android Emulator
    - Go to Tools -> Android -> AVD Manager -> Create Virtual Device... -> Pixel 3 -> Next -> Download Android Q System Image -> Next -> Finish
- Lets clone the GitHub repository 
    - Go to File -> New -> Project from Version Control -> Login to Github -> Select dossiersolutions/beerer -> Clone
    - Notification comes up -> Hit Enable Auto Import
- Lets create a run configuration
    - Go to Run -> Edit Configurations -> Hit plus icon -> Android App -> Select "app" module -> Ok
- Lets run our app
    - In the top right corner select you new run configuration and emulator -> Hit run icon
    
## Project structure
- src/main
    - java - contains kotlin source files
- src/res
    - drawable - contains vector based images which can be referenced from kotlin source files (using R.drawable.drawable_name)
    - layout - contains XML based layouts which can be referenced from kotlin source files (using R.layout.layout_name or R.id.component_id), notice a designer tab when you open the file
    - mipmap - contains bitmap images which can be referenced from kotlin source files (using R.mipmap.mipmap_name)
    - values - contains constants
    - AndroidManifest.xml - defines activities, permissions of the app 
- build.gradle - defines how to build the app, dependencies, build target, etc.