@echo off
javac -classpath ".\melissadata\globalip\org.apache.sling.commons.json-2.0.20.jar;" .\melissadata\globalip\*.java .\melissadata\globalip\view\*.java ./melissadata\globalip\model\*.java
java -classpath ".\melissadata\globalip\org.apache.sling.commons.json-2.0.20.jar;"; melissadata.globalip.Main melissadata.globalip.view.GlobalIPController melissadata.globalip.view.GlobalIPTransactionController melissadata.globalip.view.RootLayoutController melissadata.globalip.model.GlobalIPOption
del .\melissadata\globalip\*.class 
del .\melissadata\globalip\view\*.class 
del .\melissadata\globalip\model\*.class