This repo is part of the brocode Java tutorial playlist.

Source Link: https://drive.google.com/drive/folders/10DDwjbizuD9NoszPajH1lnutz6HjkRUl?usp=sharing

*place in project folder
Project>PackageFolder>Package>class

#################################
**complie and run Java with Command Prompt**
1.Make sure you have a Java JDK installed.
2.(optional) user a text editor and save a file as .java
3.Open command Prompt (windows) r Terminal (Mac) on your computer
4.set path=C:\Program Files\Java\jdk-xxx\bin (where JDK is located)
5.cd to the location of the java files
6.javac xxx.java (to compile)
7.java xxx (to run a .class file, it's portable)
#################################

#################################
**Create an executable jar with Eclipse IDE**
-----------------------------------------
1. Right click on Java project (pick a project with a GUI)
2. Export
3. Java , Runnable Jar file
4. At Launch configuration select your project
5. At Export destination, select where you want this jar file exported to
6. Finish

Create an executable jar with IntelliJ
-----------------------------------------
1. File , Project Structure , Artifacts , (+) , JAR ,  jar from module with dependencies
2. Main Class: select the class containing your main method
3. OK
3. Change output directory to where you want this JAR saved to
6. Apply , OK
7. Build (top of window in IntelliJ) , Build Artifacts , Build

If you want an icon, convert an image to a .ico file
----------------------------------------------------
1. https://icoconvert.com/ (this is a decent site)
2. Choose your image (file type my vary)
3. Upload
4. Convert to ICO
5. Download your icon

Use Launch4j to create an .exe with custom icon
----------------------------------------------
1. Install Launch4j http://launch4j.sourceforge.net/
2. Output file: browse for the output destination and name your file ending with .exe
3. Jar: browse for where you saved your jar or executable jar file
4. (Optional) Icon: browse for your custom icon (must be .ico)
5. navigate to JRE tab
6. Bundled JRE path: Browse for location of your jdk (Example C:\Program Files\Java\jdk-14.0.1)
7. At the top of window, click the Build Wrapper (gear icon)
8. name and save the Lauch4j config file where you want
9. Your application.exe should be saved to your output file location (no longer need previous files)
##################################

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@