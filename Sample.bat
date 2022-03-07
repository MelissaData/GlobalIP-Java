@echo off
mkdir target
javac -classpath "lib\gson-2.8.9.jar;" -d .\target .\src\main\java\com\melissadata\globalip\*.java .\src\main\java\com\melissadata\globalip\model\*.java .\src\main\java\com\melissadata\globalip\view\*.java
xcopy src\main\resources\ target\ /s /q
cd target
java -classpath "../lib\gson-2.8.9.jar;" com.melissadata.globalip.Main com.melissadata.globalip.view.GlobalIPController com.melissadata.globalip.view.RootLayoutController com.melissadata.globalip.model.GlobalIPOptions com.melissadata.globalip.model.GlobalIPTransaction
cd ..
rd .\target /s /q