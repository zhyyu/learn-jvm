# 1 基础
### 1.1 jvm 内存区域
- ![image](https://note.youdao.com/yws/res/7269/WEBRESOURCEd895109def63d52d7484ad08a12632eb)
- ![image](https://i.stack.imgur.com/ldFRR.png)

- oom
    - ![image](https://note.youdao.com/yws/res/7278/WEBRESOURCE880fd7cc9c21b3f0d77dfc3d938912c6)

- sof
    - ![image](https://note.youdao.com/yws/res/7306/WEBRESOURCEab5cf472b6df416fa51bd540a19b7573)

### 1.2 垃圾收集器

##### 1.2.1 判断对象是否可回收
- ![image](https://note.youdao.com/yws/res/7292/WEBRESOURCE8a0c061c3141da5e3840bef8be2c3ef3)
- 可做gc roots 对象
    - 栈中引用对对象
    - 方法区静态类属性引用对象
    - 方法区常量引用对象

##### 1.2.2 垃圾收集算法
- mark-sweep
    - ![image](https://note.youdao.com/yws/res/7316/WEBRESOURCEd1857881e5a2ca9e38b333472c9c361b)
- mark-compact
    - ![image](https://note.youdao.com/yws/res/7321/WEBRESOURCE69fec2c93c77d2b36813f030bb02e4c2)
- copying
    - ![image](https://note.youdao.com/yws/res/7324/WEBRESOURCEf8349bcd80aae4bd747aaa7fc176703c)

##### 1.2.3 垃圾收集器
- 垃圾收集器组合
    - ![image](https://note.youdao.com/yws/res/7330/WEBRESOURCE8bb7faa5f5154b97ab472ecb756852a7)
- serial/serial old
    - ![image](https://note.youdao.com/yws/res/7335/WEBRESOURCEe306b4041e36c647262b40223eebec32)
- parnew/serial old
    - ![image](https://note.youdao.com/yws/res/7340/WEBRESOURCE18e139e9985e95580a9950c5513442dc)
- cms
    - ![image](https://note.youdao.com/yws/res/7344/WEBRESOURCE117c23faebb1e4b0a8a0df4fc243f329)
    - -XX:CMSInitiatingOccupancyFraction=85
    - ![image](https://note.youdao.com/yws/res/7544/WEBRESOURCEd91c9d68128ac11feeb62f6d420fafc7)


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
        - ![image](https://note.youdao.com/yws/res/7421/WEBRESOURCE452cea746ec7cf7563a44f394c3bef7c)
        - ![image](https://note.youdao.com/yws/res/7419/WEBRESOURCEb3db3b6bfc1ce96637982bbfa36b4917)



##### 1.4.2 类加载时机(初始化必要条件)
- new/getstatic/putstatic/invokestatic
- 反射
- 初始化给定类, 父类未初始化, 初始化父类
- main 类

##### 1.4.3 理解类加载过程/时机demo
- ![image](https://note.youdao.com/yws/res/7434/WEBRESOURCE846125e842f5666a04e18188a4765c54)
- ![image](https://note.youdao.com/yws/res/7438/WEBRESOURCE98403e490f1524850edd880198d60a02)
- ![image](https://note.youdao.com/yws/res/7442/WEBRESOURCE925403370900878ec058c9fe2c370dd3)
- ![image](https://note.youdao.com/yws/res/7447/WEBRESOURCE52a8f3140b5832c38d404ede5d5034ca)
- ![image](https://note.youdao.com/yws/res/7451/WEBRESOURCEe4b1863febdc01ac60a8648aeb2df0ef)
- ![image](https://note.youdao.com/yws/res/7455/WEBRESOURCEca2aaa94ccbccb43145e902fa213fd74)

##### 1.4.4 类加载器
- 加载类的类加载器与该类本身确定类在jvm 中的唯一性
- 双亲委派模型
    - ![image](https://note.youdao.com/yws/res/7392/WEBRESOURCE41e93750d033da3046418ea570a85875)
    - ---
    - ![image](https://note.youdao.com/yws/res/7396/WEBRESOURCE637f80f2a10a7b7c2cf688bd218e793e)


### 1.5 运行时栈结构

- 运行时栈帧结构
    - ![image](https://note.youdao.com/yws/res/7463/WEBRESOURCE3da2f32b35126e20f750e95e139f33e5)
- add demo
    - ![image](https://note.youdao.com/yws/res/7471/WEBRESOURCEcc015c67446fc446b731c9b7ab5c4a7c)
    - ![image](https://note.youdao.com/yws/res/7469/WEBRESOURCEf1088f684750d54c34b1097f3ba4200a)

### 1.6 前端编译器
##### 1.6.1 语法糖
- 泛型
    - ![image](https://note.youdao.com/yws/res/7487/WEBRESOURCE602076fe75b17368d53f10c3a9351e4c)
    - ![image](https://note.youdao.com/yws/res/7491/WEBRESOURCE4f8d0bd717a98d1c24562bf1b2f682f4)
    - ![image](https://note.youdao.com/yws/res/7496/WEBRESOURCEcd02226fa81e1889a152081bf86f7df2)
- stirng concatenate
    - ![image](https://note.youdao.com/yws/res/7500/WEBRESOURCEb798686216f3a81d07d9fcf82cbb0c5d)
    - ![image](https://note.youdao.com/yws/res/7504/WEBRESOURCE98ff6eaecc729624cf33af77a7279c38)

##### 1.6.2 lombok
- ![image](https://note.youdao.com/yws/res/7508/WEBRESOURCE18d8c09ab7d82847c98048f9b7a6abf6)
- ![image](https://note.youdao.com/yws/res/7511/WEBRESOURCEd003f9c0d5a493992aaa06c861d613a5)


### 1.7 多线程

- java 线程内存模型
    - ![image](https://note.youdao.com/yws/res/7517/WEBRESOURCEcc9bbf88f13d5bc82be4195e13880481)
- volatile
    - ![image](https://note.youdao.com/yws/res/7524/WEBRESOURCEd0ace813726b1f3df3467fe504f3532d)
    - ![image](https://note.youdao.com/yws/res/7527/WEBRESOURCE5e4b0738f9f46e1841bb4c0fb28c7ad3)

----------

# 2 实践

### 2.1 eclipse/xmind 调优
- ![image](https://note.youdao.com/yws/res/7553/WEBRESOURCEb6d6642804a16644688d902abe56ebbf)
- ![image](https://note.youdao.com/yws/res/7551/WEBRESOURCE307a30268bed1005c0daf63afa291fd9)
- ![image](https://note.youdao.com/yws/res/7560/WEBRESOURCE1c6916f3212d7978290a071982a05d60)

### 2.2 死锁分析
- ![image](https://note.youdao.com/yws/res/7566/WEBRESOURCE1282ca75c4532727a9177bb28263e8a3)
- ![image](https://note.youdao.com/yws/res/7563/WEBRESOURCE59b16dd4f3a860d3f57111f59525b60d)
-  jstack -l 2676 > ./jstack-l_2676.tdump
    - ![image](https://note.youdao.com/yws/res/7574/WEBRESOURCE42e8b135eb3f9626411015772bf2f40d)
    - ![image](https://note.youdao.com/yws/res/7578/WEBRESOURCE46e5f4de953ffe3edd21361b1acbd15a)

### 2.3 survivor/eden 分析
##### 2.3.1 jmap -heap
- ![image](https://note.youdao.com/yws/res/10638/WEBRESOURCEccb28b4b80991659b5345770f87f3822)

##### 2.3.2 jinfo -flags
- ![image](https://note.youdao.com/yws/res/10649/WEBRESOURCE6bc7130ae419697b5319e010024b9fd7)
- how to find default jvm options
    - http://www.oracle.com/technetwork/articles/java/vmoptions-jsp-140102.html

##### 2.3.3 stackoverflow
- https://stackoverflow.com/questions/27293826/java-why-is-the-default-for-xxsurvivorratio-not-used
- ![image](https://note.youdao.com/yws/res/10659/WEBRESOURCE4ce5576ff1ea40a448dd29ef28ad8108)

##### 2.3.4 add jvm options
- -XX:SurvivorRatio=8
- -XX:-UseAdaptiveSizePolicy

##### 2.3.4 result
- ![image](https://note.youdao.com/yws/res/10672/WEBRESOURCEc74962552b04ea4e9ca17b101d706cfc)
- ![image](https://note.youdao.com/yws/res/10669/WEBRESOURCEf86701395f997f35ab74eb48870999df)

### 2.4 一次oom 事故分析
##### 2.4.1 wiki
- https://confluence.sui.work/pages/viewpage.action?pageId=10420233
    - ![image](https://note.youdao.com/yws/res/10681/WEBRESOURCE6fd8b510095179c76d0225893e76b596)
- https://confluence.sui.work/pages/viewpage.action?pageId=5416131
- https://confluence.sui.work/pages/viewpage.action?pageId=5426287

##### 2.4.2 operation-cs
- log
    - ![image](https://note.youdao.com/yws/res/10685/WEBRESOURCE60b6ed93bd164da8f7b807fae89a0df2)
    - ![image](https://note.youdao.com/yws/res/10690/WEBRESOURCE719e02d7d7a6c0c0df8878eda6318b91)
    - ![image](https://note.youdao.com/yws/res/10695/WEBRESOURCEf1a7763cf2fb5b832ede87fab83d0352)
- memoryAnalyzer
    - ![image](https://note.youdao.com/yws/res/10701/WEBRESOURCE6dcf9b333c00f94de9e248d84939e9c1)
    - ![image](https://note.youdao.com/yws/res/10716/WEBRESOURCEf74fe456e02f32556b9e329165abc4dd)
    - ![image](https://note.youdao.com/yws/res/10722/WEBRESOURCEb75f7d5ce07933042b72de3a92f6e279)
    - ![image](https://note.youdao.com/yws/res/10729/WEBRESOURCE4be8533abf46dcabf06938a3e4891b16)
    - ![image](https://note.youdao.com/yws/res/10733/WEBRESOURCEc0dfa9fc3a9812bc97e2499c50fccce9)
    - jmap_dum_Leak_Suspects.zip
        - ![image](https://note.youdao.com/yws/res/10740/WEBRESOURCE22a99eed521fed86292705f1d6c02061)
- jvisualvm
    - ![image](https://note.youdao.com/yws/res/10705/WEBRESOURCE991a95b04e06e4aa9a32ec65be7ab08d)
    - ![image](https://note.youdao.com/yws/res/10708/WEBRESOURCE3bc0aedb175680c01f4f6bf88b01d328)
    - ![image](https://note.youdao.com/yws/res/10712/WEBRESOURCE369e358538ee674411756390a5783661)
