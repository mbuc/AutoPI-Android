AutoPI-Android
==============

The Android application for the AutoPI project.

See the Wiki for up-to-date information.



# AutoPI - Android Application

Note - for the Raspberry Pi source code, see github / mbuc / AutoPI

Also note - You have to use Android Studio, not Eclipse with the ADK plugin.  Google is migrating to Android Studio and it uses a completely different build platform than Eclipse.

## Installing Android Studio
You must have Windows 7 or later.  Hopefully 64-bit to make things easier.

* Get Android Studio from [here](http://developer.android.com/sdk/installing/studio.html).  
 * Install it.
* Get the JDK from [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
 * Install it as well.
* Set up your Environment Variables so that Android Studio can see the JDK.
 * Go to your Environment Variables (Start > Type in "Environment Variables" > Select "Edit the system environment variables".
 * Select Environment Variables in the bottom-right.
 * Under System Variables, click New... and add a variable with name JAVA_HOME and value C:\Program Files\Java\jdk1.8.0_05

Open Android Studio and wait for it to configure for the first time.

## Getting the GitHub project.
* Open Android Studio.
* Select "Check out from Version Control" then "GitHub"
* Fill in your login information
* Git Repository URL: https://github.com/mbuc/AutoPI-Android.git
 * Note that this URL should be listed in the drop-down box.  Make sure you select **AutoPI-Android.git**, NOT AutoPi.git.
* Click Clone.
* If it asks you if you want to open the project, say Yes.
 * NOTE: If it asks you if you want to create a project, you checked out the wrong repository.

## Updating
You must update your project in order to see changes that others have made.  A good practice is to update the project every time you open it and every 20 minutes afterwards.

To update, go to VCS > Update Project > OK.

## Making a commitment
You must commit and push your changes for it to be reflected on the server.

* VCS > Commit Changes
* Add a detailed message
* Hit Commit and Push
* Hit Push

Note that if you don't want to push yet, for some reason, you can commit and then push using VCS > Git > Push > Push.

###Anatomy of a good git log message
```
A short summary of the commit on the first line (50 chars or less!!!

A more detailed description of the commit. This should explain what issues the commit addressed, what feature were added, and how it was all acheived.

Any imperatives related to the commit. (i.e. Fixes issue #11. Completes development of X feature)
```
*NOTE: The blank newlines are necessary, especially the first one after the description. Git and Github use these blank lines to decipher between the summary and the detailed description. Viewing the log of commits will show summaries with a button to view descriptions. The second blank line is more of a stlyistic thing.
