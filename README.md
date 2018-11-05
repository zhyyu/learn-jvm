# 1 基础
### 1.1 jvm 内存区域
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jvm%20%E5%86%85%E5%AD%98%E5%8C%BA%E5%9F%9F.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/hotspotHeapStructure.png)
- oom
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/oom.png)
- sof
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/sof.png)

### 1.2 垃圾收集器

##### 1.2.1 判断对象是否可回收
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E5%88%A4%E6%96%AD%E5%AF%B9%E8%B1%A1%E6%98%AF%E5%90%A6%E5%8F%AF%E5%9B%9E%E6%94%B6.png)
- 可做gc roots 对象
    - 栈中引用对对象
    - 方法区静态类属性引用对象
    - 方法区常量引用对象

##### 1.2.2 垃圾收集算法
- mark-sweep
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/mark-sweep.png)
- mark-compact
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/mark-compact.png)
- copying
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/copying.png)

##### 1.2.3 垃圾收集器
- 垃圾收集器组合
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E5%9E%83%E5%9C%BE%E6%94%B6%E9%9B%86%E5%99%A8%E7%BB%84%E5%90%88.png)
- serial/serial old
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/serial_serial%20old.png)
- parnew/serial old
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/parnew_serial%20old.png)
- cms
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/cms.png)
    - -XX:CMSInitiatingOccupancyFraction=85
    - 垃圾收集阶段用户线程还在运行, 需要预留空间给用户线程


### 1.3 监控工具
##### 1.3.1 命令行工具
- jps
- jinfo
- jmap
- jstat
- jstack

##### 1.3.2 图形化工具
- jvisualvm
- MemoryAnalyzer


### 1.4 类加载机制
##### 1.4.1 类加载过程
- 加载
    - 通过一个全限定类名获取类的二进制流(applet/ProxyGenerator)
    - 内存中生成代表该类 java.lang.Class
- 验证
- 准备
- 解析
- 初始化(线程安全)
    - javap
    - staic block
        - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/staic%20block1.png)
        - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/staic%20block2.png)
    - 线程安全
        - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A81.png)
        - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A82.png)



##### 1.4.2 类加载时机(初始化必要条件)
- new/getstatic/putstatic/invokestatic
- 反射
- 初始化给定类, 父类未初始化, 初始化父类
- main 类

##### 1.4.3 理解类加载过程/时机demo
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%90%86%E8%A7%A3%E7%B1%BB%E5%8A%A0%E8%BD%BD%E8%BF%87%E7%A8%8B_%E6%97%B6%E6%9C%BAdemo1.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%90%86%E8%A7%A3%E7%B1%BB%E5%8A%A0%E8%BD%BD%E8%BF%87%E7%A8%8B_%E6%97%B6%E6%9C%BAdemo2.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%90%86%E8%A7%A3%E7%B1%BB%E5%8A%A0%E8%BD%BD%E8%BF%87%E7%A8%8B_%E6%97%B6%E6%9C%BAdemo3.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%90%86%E8%A7%A3%E7%B1%BB%E5%8A%A0%E8%BD%BD%E8%BF%87%E7%A8%8B_%E6%97%B6%E6%9C%BAdemo4.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%90%86%E8%A7%A3%E7%B1%BB%E5%8A%A0%E8%BD%BD%E8%BF%87%E7%A8%8B_%E6%97%B6%E6%9C%BAdemo5.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%90%86%E8%A7%A3%E7%B1%BB%E5%8A%A0%E8%BD%BD%E8%BF%87%E7%A8%8B_%E6%97%B6%E6%9C%BAdemo6.png)

##### 1.4.4 类加载器
- 加载类的类加载器与该类本身确定类在jvm 中的唯一性
- 双亲委派模型
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%B1%BB%E5%8A%A0%E8%BD%BD%E5%99%A81.png)
    - ---
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E7%B1%BB%E5%8A%A0%E8%BD%BD%E5%99%A82.png)


### 1.5 运行时栈结构

- 运行时栈帧结构
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E8%BF%90%E8%A1%8C%E6%97%B6%E6%A0%88%E5%B8%A7%E7%BB%93%E6%9E%84.png)
- add demo
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/add%20demo1.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/add%20demo2.png)

### 1.6 前端编译器
##### 1.6.1 语法糖
- 泛型
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E6%B3%9B%E5%9E%8B1.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E6%B3%9B%E5%9E%8B2.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E6%B3%9B%E5%9E%8B3.png)
- stirng concatenate
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/stirng%20concatenate1.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/stirng%20concatenate2.png)

##### 1.6.2 lombok
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/lombok1.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/lombok2.png)

##### 1.6.3 immutable object
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/immutable%20object1.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/immutable%20object2.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/immutable%20object3.png)


### 1.7 多线程

- java 线程内存模型
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jvm%20%E5%86%85%E5%AD%98%E5%8C%BA%E5%9F%9F.png)
- volatile
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/volatile1.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/volatile2.png)

----------

# 2 实践

### 2.1 eclipse/xmind 调优
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/eclipse_xmind%20%E8%B0%83%E4%BC%981.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/eclipse_xmind%20%E8%B0%83%E4%BC%982.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/eclipse_xmind%20%E8%B0%83%E4%BC%983.png)

### 2.2 死锁分析
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E6%AD%BB%E9%94%81%E5%88%86%E6%9E%901.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E6%AD%BB%E9%94%81%E5%88%86%E6%9E%902.png)
-  jstack -l 2676 > ./jstack-l_2676.tdump
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E6%AD%BB%E9%94%81%E5%88%86%E6%9E%903.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/%E6%AD%BB%E9%94%81%E5%88%86%E6%9E%904.png)

### 2.3 survivor/eden 分析
##### 2.3.1 jmap -heap
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jmap%20-heap.png)

##### 2.3.2 jinfo -flags
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jinfo%20-flags.png)
- how to find default jvm options
    - http://www.oracle.com/technetwork/articles/java/vmoptions-jsp-140102.html

##### 2.3.3 stackoverflow
- https://stackoverflow.com/questions/27293826/java-why-is-the-default-for-xxsurvivorratio-not-used
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/stackoverflow.png)

##### 2.3.4 add jvm options
- -XX:SurvivorRatio=8
- -XX:-UseAdaptiveSizePolicy

##### 2.3.5 result
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/result1.png)
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/result2.png)

##### 2.3.6 jstat -gcutil 500ms 20
- ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jstat%20-gcutil%20500ms%2020.png)

### 2.4 一次oom 事故分析
##### 2.4.1 wiki
- https://confluence.sui.work/pages/viewpage.action?pageId=10420233
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/wiki.png)
    - -XX:+HeapDumpOnOutOfMemoryError
        - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/HeapDumpOnOutOfMemoryError.png)
- https://confluence.sui.work/pages/viewpage.action?pageId=5416131
- https://confluence.sui.work/pages/viewpage.action?pageId=5426287

##### 2.4.2 operation-cs
- log
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/log1.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/log2.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/log3.png)
- memoryAnalyzer
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/memoryAnalyzer1.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/memoryAnalyzer2.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/memoryAnalyzer3.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/memoryAnalyzer4.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/memoryAnalyzer5.png)
    - jmap_dum_Leak_Suspects.zip
        - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jmap_dum_Leak_Suspects.png)
- program analyze
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/program%20analyze1.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/program%20analyze2.png)
- jvisualvm
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jvisualvm1.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jvisualvm2.png)
    - ![image](http://zhyyu-learn.oss-cn-shenzhen.aliyuncs.com/learn-jvm/jvisualvm3.png)

----------

# 相关资源
- 深入理解Java虚拟机 JVM高级特性与最佳实践
- Java HotSpot VM Options
    - https://www.oracle.com/technetwork/articles/java/vmoptions-jsp-140102.html
- jvm instruciton set
    - https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html
- Troubleshooting Guide for HotSpot VM
    - https://docs.oracle.com/javase/7/docs/webnotes/tsg/TSG-VM/html/clopts.html