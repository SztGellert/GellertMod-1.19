# GellertMod-1.19


![Welcome-to-SztGellerts-](https://user-images.githubusercontent.com/55703557/195711184-de73f25f-013b-48da-b75e-2cf680d3832c.png)

This is an experimenting modding tutorial repository for minecraft forge based on
https://www.youtube.com/watch?v=LpoSy091wYI&list=PLKGarocXCE1HrC60yuTNTGRoZc6hf5Uvl Minecraft 1.19 Forge Modding Tutorial by Kaupenjoe

This modding tutorial's goal is fun and learning java through a real-life given example.

Feel free to share knowledge about modding and coding best practices.

Steps to reproduce:

0. https://www.youtube.com/playlist?list=PLKGarocXCE1FeXvEogpjz4SvHxF_FJRO6 Java/Minecraft Tutorial 
(Learn Java before trying to read and modify complex code)

1. Download IntelliJ Idea Community Edition https://adoptium.net/?variant=openjdk8&jvmVariant=hotspot

2. Download OpenJDK https://adoptium.net/?variant=openjdk8&jvmVariant=hotspot

3. Download Minecraft Forge https://files.minecraftforge.net/net/minecraftforge/forge/ MDK

4. Copy Forge MDK to modding folder

5. Delete Readme, License, Credits & Changelog files

6. Open project folder with IntelliJ

7. File -> Project Structure -> Check Correct SDK version (17) Language Level -> SDK Default

8. File-> Settings -> Build, Execution, Deployment -> Build Tools -> Gradle -> Gradle JVM: Project SDK

9. Project Folder options -> Tree Appearance -> remove check for Flatten Packages and Hide Empty Middle Packages

10. Change Build.gradle: version 0.0.1-1.19 group:net.yourname.modid change modid every occurence in file

11. Click Load Gradle changes Button (Upper Right Corner)

12. ExampleMod.java change MOD_ID and package name //Build.gradle group 

13. Resources->META INF->mods.toml change modid change version //build.gradle version

14. Click on GRADLE tab right panel // Tasks -> forgegradle runs->genIntellijRuns after finish click on runClient task

15. Build Jar file to share mod: ./gradlew build in terminal or gradle tab/ Build / build
Jar file can be found in created build folder/libs

+1 Setup Github Repo +github acc VCS tab->Share Project On Github /private? Add account ->GH acc->SHARE->Commit(Add) ✔️
