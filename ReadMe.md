![alt text](https://www.melissa.com/_borders17/nav/2017/images/melissa-global-intelligence.png)

# Global IP API JAVA REST Sample Code

This is a sample code for Melissa's Global IP API.
It is written in JAVA and accesses the API through REST.
This sample is intended to show the functionality of the Global IP Web Service and how to call the service in JAVA.


## Getting Started

These instructions will get you a copy of the sample project up and running on your local machine for testing purposes. 

### Prerequisites

**License**

This sample is intended for use after a web service account has been created and you have a license key.
If you do not, please contact sales (800-800-6245 ext. 3) for a trial.

**JAVA Version Compatibility**

This example has support for the major versions Java 8 and Java 11.
Versions which build on top of these major versions (9-10 and 12+) should also work.

For Java 8, a JDK destribution with JavaFX is necessary to run this demo.
For this reason, Oracle's official Java 8 JDK or an open source distribution like
[ZuluFX](https://www.azul.com/downloads/?version=java-8-lts&package=jdk-fx) is recommended.

**Software**

[Apache Maven](https://maven.apache.org/install.html) is needed for builds using Java 11.
Java 8 based builds do not need any extra software.

## Compiling and Running the Sample

### Java 8

Run `java8_compile.bat` to build the example then use `java8_run.bat` to run it.

### Java 11

Building and running for Java 11+ requires an installation of
[Apache Maven](https://maven.apache.org/install.html).

#### Method 1
Run `java11_compile.bat` to build the example then use `java11_run.bat` to run it.

#### Method 2
`mvn clean javafx:jlink`

This will create a folder called `target`.
Inside the folder will be the build under `globalip` as well as an all-in-one `globalip.zip`.
The folder and the zip file contain identical files.

Java is needed to build the example, but does not need to be installed to run it.
To run the example, navigate to `./target/globalip/bin/` and run `globalip.bat`.

Alternatively, `mvn clean javafx:run` will compile and run the example without creating the all-in-one deliverables.

## Troubleshooting

Q: `mvn` command is not recognized<br>
A: Make sure that Maven is installed correctly.
If Maven is installed, make sure it is in your path variable.
you can check if Maven is installed correctly by running `mvn -v`.

Q: My Java 8 based build is failing compilation<br>
A: The likely reason for this is that you are using a Java 8 distribution that does not include JavaFX.
Install a distribution that includes Java FX to remedy this.
Oracle's official distribution of Java 8 or [ZuluFX](https://www.azul.com/downloads/?version=java-8-lts&package=jdk-fx) should suffice.

Q: My Maven build is failing with `invalid flag: --module-path`<br>
A: You are attempting to use Maven to build this project with Java 8.
Try building with `Java8_compile.bat` or install and configure the PATH variable for Java 11.

Q: Which method do I use?<br>
A: Run `java -version` or `mvn -v` to get the version of Java you are using.
Use the method that corresponds to the JDK version detected.

## Sales and Support

For free technical support please call us at 800-MELISSA ext. 4 (800-635-4772 ext. 4) or email us at tech@MelissaData.

To subscribe to the Global IP Web Service, please contact our sales department at 800-MELISSA ext. 3 (800-635-4772 ext. 3).

## Copyright Notice

(C) 2018 Melissa Data Corporation. All rights reserved.

Global IP Web Service is a trademark and 1-800-MELISSA is a registered trademark
of Melissa Data Corporation.

All other brands and products are trademarks of their respective holder(s).

## Authors

* **Melissa**
