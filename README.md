# sample-katalon-espresso-test

This project is an example of using Katalon Studio with Android Espresso driver.

### Prerequitesites
- Install Gradle 7
- Install JDK 8 (not JRE)

### How to use

1. Add `automationName: Espresso` in Project Settings/Desired Capabilities/Mobile/Android
2. Open `New Test Case` and change `jdkLocation` with your JDK 8 location and application file path

```
//Update your jdk location
String jdkLocation = '/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre'

SystemUtil.setEnv('JAVA_HOME', jdkLocation)

println System.getenv("JAVA_HOME")

//Update your app location
Mobile.startApplication('/Users/duyanhluong/Downloads/TheApp-v1.5.0 (3).apk', false)

Mobile.closeApplication()
```
3. Run `New Test Case`
4. Now you can start spy/record and run the test normally with Espresso driver

### Migrate to other projects
1. Copy and paster `Include` folder of this project to your project
2. Follow step #1 to #5 of **How to use**
