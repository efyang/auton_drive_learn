# auton_drive_learn

### Instructions
* Read through the source files
* Make your own fork
* Create a branch called "auton-stage1" and switch to it
* Setup the project (in android studio or intellij idea - they're basically the same thing, I myself am making this in intellij)
* Complete all of the TODOs
* When ready, submit a pull request to my repository to turn it in.

### Notes
* Ask me if anything needs to be clarified or fixed
* You can add comments to anywhere on a new line in the preexisting source, and you should have comments explaining what your implementations are doing

### Source outline
* `Drivebase`: interface of a simple drivebase, with relative rotation and forward movement
* `ExtendedMath`: static class containing math utility functions
* `Vector2F`: a two-element vector
* `NavigationalState`: a subcomponent keeping track of all the navigational info the robot needs
* `Robot`: A robot with a `Drivebase` and a `NavigationalState` that moves nicely autonomously

### Grading
* 20 points - style (consistent spacing, naming (camelCase), indentation, structure, etc.)
* 20 points - clarity (comments explaining your methodology and thought process, reasonable variable naming)
* 60 points - functionality (does everything work, is it as specified, and if it is a "good"/correct solution)
* Total: 100 points
