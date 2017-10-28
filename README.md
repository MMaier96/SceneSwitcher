# SceneSwitcher
Because so many people requested an update to my old SceneSwitcher due existing bugs, I decided to create a new program.
The SceneSwitcher allows streamer to change scenes by tracking specific pixel on the screen.

## General Information
### Why SceneSwitcher? Isn't there an integrated in OBS
The existing scene switcher in OBS uses the list of currently running processes and change the scene dependend on what game or program is running.
But many League of Legends streamer want to have different scenes for Client,Loadingscreen and the actual game. But the game and loadingscreen are 
running on the same process so there is no way of changing scenes with the integrated OBS SceneSwitcher.

### Why is the SceneSwitcher written in Java?
There are many reasons why the SceneSwitcher is written in Java. 
My first Idea was to write it in C/C++ but many games will detect the SceneSwitcher if it try to get access on the running process.
C/C++ would make it much easier to track what kind of scene you want to have, but there is a risk of getting banned!
The soft version of tracking what scene you want to have is by tracking specific pixel on the screen. No game will ever detect this and it will be 100% save using this.
And the second advantage of Java is that it will be executable on Mac/Linux as well, where C/C++ would offer a few problems.

### Lifecycle of the tracking process
![The lifecycle of the tracking Thread](https://i.imgur.com/jq6r67A.png)

## UML Diagram
![UML Diagram created with draw.io](https://i.imgur.com/b354Rrr.png)

## TODO
* Add h2/ormlite Database
  * load/save Objects (Settings)
* Create the GUI
  * SceneViewer
    * Table for active Scenes
  * Settings
  * DebugMode
* Objects for handling Database
* Detecting Pixel and Changes (THREAD)
* Simulate Hotkeys
* MultiLanguage Support
  * German
  * English
