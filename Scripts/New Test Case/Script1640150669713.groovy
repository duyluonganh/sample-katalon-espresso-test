import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import util.SystemUtil


String jdkLocation = '/Library/Java/JavaVirtualMachines/jdk1.8.0_191.jdk/Contents/Home/jre'

SystemUtil.setEnv('JAVA_HOME', jdkLocation)

println System.getenv("JAVA_HOME")

Mobile.startApplication('/Users/duyanhluong/Downloads/TheApp-v1.5.0 (3).apk', false)

Mobile.closeApplication()