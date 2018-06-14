### 查看运行main 线程
* jps -lv
	* -l 全类名
	* -v jvm参数

```
8064 com.zhyyu.learn.jvm.gc.MemoryAllocation -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -Dfile.encoding=UTF-8
2868  -Dosgi.requiredJavaVersion=1.8 -XX:+UseG1GC -XX:+UseStringDeduplication -Dosgi.requiredJavaVersion=1.8 -Xms256m -Xmx1024m -Dosgi.requiredJavaVe
rsion=1.8 -XX:+UseG1GC -XX:+UseStringDeduplication -Dosgi.requiredJavaVersion=1.8 -Xms256m -Xmx1024m
15464 sun.tools.jps.Jps -Dapplication.home=C:\jdk1.8.0_111 -Xms8m
```
