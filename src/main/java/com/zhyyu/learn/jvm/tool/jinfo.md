### 查看java系统变量
* jinfo -sysprops 8064

```
Attaching to process ID 8064, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.111-b14
java.runtime.name = Java(TM) SE Runtime Environment
java.vm.version = 25.111-b14
sun.boot.library.path = C:\jdk1.8.0_111\jre\bin
java.vendor.url = http://java.oracle.com/
java.vm.vendor = Oracle Corporation
path.separator = ;
file.encoding.pkg = sun.io
java.vm.name = Java HotSpot(TM) 64-Bit Server VM
sun.os.patch.level =
sun.java.launcher = SUN_STANDARD
user.script =
user.country = CN
user.dir = D:\workspace\workspace-zhyyu-learn\learn-jvm
java.vm.specification.name = Java Virtual Machine Specification
java.runtime.version = 1.8.0_111-b14
java.awt.graphicsenv = sun.awt.Win32GraphicsEnvironment
os.arch = amd64
java.endorsed.dirs = C:\jdk1.8.0_111\jre\lib\endorsed
line.separator =

java.io.tmpdir = C:\Users\ZHONGY~1\AppData\Local\Temp\
java.vm.specification.vendor = Oracle Corporation
user.variant =
os.name = Windows 10
sun.jnu.encoding = GBK
java.library.path = C:\jdk1.8.0_111\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/jdk1.8.0_111/bin/../jre/bin/server;C:/jdk1.8.0_111/
bin/../jre/bin;C:/jdk1.8.0_111/bin/../jre/lib/amd64;C:\apache-maven-3.5.0\bin;C:\Program Files (x86)\Windows Resource Kits\Tools\;D:\app\zhongyuyu\pr
oduct\12.1.0\dbhome_1\bin;C:\Program Files\MySQL\MySQL Server 5.7\bin;C:\Python35\Scripts;C:\Python35;C:\jdk1.8.0_111\bin;C:\Program Files (x86)\Wind
ows Kits\8.1\Windows Performance Toolkit\;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\WINDOWS\system32;C:\WINDOW
S;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Fi
les (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Int
el\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Calibre2\;C:\Program Files\MySQL\MySQL Utilities 1.6\;C:\Program Files\Redis\;C:\
Program Files\Git\cmd;C:\WINDOWS\System32\OpenSSH\;C:\Python36\Scripts\;C:\Python36\;C:\Users\zhongyuyu\AppData\Local\Microsoft\WindowsApps;C:\Users\
zhongyuyu\AppData\Local\atom\bin;%USERPROFILE%\AppData\Local\Microsoft\WindowsApps;;C:\eclipse-jee-neon-3-win32-x86_64\eclipse;;.
java.specification.name = Java Platform API Specification
java.class.version = 52.0
sun.management.compiler = HotSpot 64-Bit Tiered Compilers
os.version = 10.0
user.home = C:\Users\zhongyuyu
user.timezone =
java.awt.printerjob = sun.awt.windows.WPrinterJob
file.encoding = UTF-8
java.specification.version = 1.8
user.name = zhongyuyu
java.class.path = D:\workspace\workspace-zhyyu-learn\learn-jvm\target\classes;C:\Users\zhongyuyu\.m2\repository\cglib\cglib\3.2.6\cglib-3.2.6.jar;C:\
Users\zhongyuyu\.m2\repository\org\ow2\asm\asm\6.0\asm-6.0.jar;C:\Users\zhongyuyu\.m2\repository\org\apache\ant\ant\1.9.6\ant-1.9.6.jar;C:\Users\zhon
gyuyu\.m2\repository\org\apache\ant\ant-launcher\1.9.6\ant-launcher-1.9.6.jar
java.vm.specification.version = 1.8
sun.arch.data.model = 64
sun.java.command = com.zhyyu.learn.jvm.gc.MemoryAllocation
java.home = C:\jdk1.8.0_111\jre
user.language = zh
java.specification.vendor = Oracle Corporation
awt.toolkit = sun.awt.windows.WToolkit
java.vm.info = mixed mode
java.version = 1.8.0_111
java.ext.dirs = C:\jdk1.8.0_111\jre\lib\ext;C:\WINDOWS\Sun\Java\lib\ext
sun.boot.class.path = C:\jdk1.8.0_111\jre\lib\resources.jar;C:\jdk1.8.0_111\jre\lib\rt.jar;C:\jdk1.8.0_111\jre\lib\sunrsasign.jar;C:\jdk1.8.0_111\jre
\lib\jsse.jar;C:\jdk1.8.0_111\jre\lib\jce.jar;C:\jdk1.8.0_111\jre\lib\charsets.jar;C:\jdk1.8.0_111\jre\lib\jfr.jar;C:\jdk1.8.0_111\jre\classes
java.vendor = Oracle Corporation
file.separator = \
java.vendor.url.bug = http://bugreport.sun.com/bugreport/
sun.io.unicode.encoding = UnicodeLittle
sun.cpu.endian = little
sun.desktop = windows
sun.cpu.isalist = amd64
```

### 查看vm 参数
* jinfo -flags 8064

```
Attaching to process ID 8064, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.111-b14
Non-default VM flags: -XX:CICompilerCount=3 -XX:InitialHeapSize=20971520 -XX:MaxHeapSize=20971520 -XX:MaxNewSize=10485760 -XX:MinHeapDeltaBytes=19660
8 -XX:NewSize=10485760 -XX:OldSize=10485760 -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseFa
stUnorderedTimeStamps -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC
Command line:  -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -Dfile.encoding=UTF-8
```

### 查看特定vm 参数
* jinfo -flag SurvivorRatio 8064

```
-XX:SurvivorRatio=8
```

### 设置特定vm 参数
* jinfo -flag SurvivorRatio=9 8064

```
Exception in thread "main" com.sun.tools.attach.AttachOperationFailedException: flag 'SurvivorRatio' cannot be changed

        at sun.tools.attach.WindowsVirtualMachine.execute(WindowsVirtualMachine.java:117)
        at sun.tools.attach.HotSpotVirtualMachine.executeCommand(HotSpotVirtualMachine.java:261)
        at sun.tools.attach.HotSpotVirtualMachine.setFlag(HotSpotVirtualMachine.java:234)
        at sun.tools.jinfo.JInfo.flag(JInfo.java:134)
        at sun.tools.jinfo.JInfo.main(JInfo.java:81)
```

* jinfo -flag MaxHeapSize=40971520 8064

```
Exception in thread "main" com.sun.tools.attach.AttachOperationFailedException: flag 'MaxHeapSize' cannot be changed

        at sun.tools.attach.WindowsVirtualMachine.execute(WindowsVirtualMachine.java:117)
        at sun.tools.attach.HotSpotVirtualMachine.executeCommand(HotSpotVirtualMachine.java:261)
        at sun.tools.attach.HotSpotVirtualMachine.setFlag(HotSpotVirtualMachine.java:234)
        at sun.tools.jinfo.JInfo.flag(JInfo.java:134)
        at sun.tools.jinfo.JInfo.main(JInfo.java:81)

```