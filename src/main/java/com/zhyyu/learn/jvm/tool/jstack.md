### 产看线程堆栈
* jstack -l 1136

```
C:\Users\Administrator>jstack 1136
2018-06-19 20:20:29
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.121-b13 mixed mode):

"Service Thread" #9 daemon prio=9 os_prio=0 tid=0x000000001e243800 nid=0x8cc runnable [0x0
000000000000000]
   java.lang.Thread.State: RUNNABLE

"C1 CompilerThread2" #8 daemon prio=9 os_prio=2 tid=0x000000001e1b2000 nid=0x3204 waiting
on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread1" #7 daemon prio=9 os_prio=2 tid=0x000000001e1b0800 nid=0x27a0 waiting
on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #6 daemon prio=9 os_prio=2 tid=0x000000001ce0e000 nid=0x193c waiting
on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Attach Listener" #5 daemon prio=5 os_prio=2 tid=0x000000001e19a800 nid=0x3334 waiting on
condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Signal Dispatcher" #4 daemon prio=9 os_prio=2 tid=0x000000001cdff000 nid=0x2c98 runnable
[0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" #3 daemon prio=8 os_prio=1 tid=0x000000001cdea000 nid=0x3158 in Object.wait()
[0x000000001e18e000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076b308ec8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:143)
        - locked <0x000000076b308ec8> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:164)
        at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:209)

"Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x000000001cda2800 nid=0x2b08 in Objec
t.wait() [0x000000001e07f000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076b306b68> (a java.lang.ref.Reference$Lock)
        at java.lang.Object.wait(Object.java:502)
        at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
        - locked <0x000000076b306b68> (a java.lang.ref.Reference$Lock)
        at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

"main" #1 prio=5 os_prio=0 tid=0x00000000029be800 nid=0x37e0 runnable [0x00000000034df000]

   java.lang.Thread.State: RUNNABLE
        at com.zhyyu.learn.jvm.gc.MemoryAllocation.main(MemoryAllocation.java:19)

"VM Thread" os_prio=2 tid=0x000000001cd9b000 nid=0x35e0 runnable

"GC task thread#0 (ParallelGC)" os_prio=0 tid=0x0000000002a0d000 nid=0x3048 runnable

"GC task thread#1 (ParallelGC)" os_prio=0 tid=0x0000000002a0e800 nid=0x35c4 runnable

"GC task thread#2 (ParallelGC)" os_prio=0 tid=0x0000000002a10000 nid=0x2320 runnable

"GC task thread#3 (ParallelGC)" os_prio=0 tid=0x0000000002a11800 nid=0x22ec runnable

"VM Periodic Task Thread" os_prio=2 tid=0x000000001e28d000 nid=0x22d8 waiting on condition


JNI global references: 6
```

* with deadlock

```
Found one Java-level deadlock:
=============================
"Thread-1":
  waiting to lock monitor 0x00000000188d4778 (object 0x00000000d7d850e0, a java.lang.Integer),
  which is held by "Thread-0"
"Thread-0":
  waiting to lock monitor 0x00000000028f9d48 (object 0x00000000d7d850f0, a java.lang.Integer),
  which is held by "Thread-1"

Java stack information for the threads listed above:
===================================================
"Thread-1":
        at com.zhyyu.learn.jvm.tool.DeadThreadDetect$Task2.run(DeadThreadDetect.java:44)
        - waiting to lock <0x00000000d7d850e0> (a java.lang.Integer)
        - locked <0x00000000d7d850f0> (a java.lang.Integer)
        at java.lang.Thread.run(Thread.java:745)
"Thread-0":
        at com.zhyyu.learn.jvm.tool.DeadThreadDetect$Task1.run(DeadThreadDetect.java:29)
        - waiting to lock <0x00000000d7d850f0> (a java.lang.Integer)
        - locked <0x00000000d7d850e0> (a java.lang.Integer)
        at java.lang.Thread.run(Thread.java:745)

Found 1 deadlock.
```