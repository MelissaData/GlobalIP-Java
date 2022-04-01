@echo off
cd target
java -classpath "lib\gson-2.8.9.jar;" com.melissadata.globalip.Main com.melissadata.globalip.view.GlobalIPController com.melissadata.globalip.view.RootLayoutController com.melissadata.globalip.model.GlobalIPOptions com.melissadata.globalip.model.GlobalIPTransaction
cd ..