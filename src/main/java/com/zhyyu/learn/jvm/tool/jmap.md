### 查看堆内存信息
- jmap -heap 8064

```
Attaching to process ID 8064, please wait...
Debugger attached successfully.
Server compiler detected.
JVM version is 25.111-b14

using thread-local object allocation.
Mark Sweep Compact GC

Heap Configuration:
   MinHeapFreeRatio         = 40
   MaxHeapFreeRatio         = 70
   MaxHeapSize              = 20971520 (20.0MB)
   NewSize                  = 10485760 (10.0MB)
   MaxNewSize               = 10485760 (10.0MB)
   OldSize                  = 10485760 (10.0MB)
   NewRatio                 = 2
   SurvivorRatio            = 8
   MetaspaceSize            = 21807104 (20.796875MB)
   CompressedClassSpaceSize = 1073741824 (1024.0MB)
   MaxMetaspaceSize         = 17592186044415 MB
   G1HeapRegionSize         = 0 (0.0MB)

Heap Usage:
New Generation (Eden + 1 Survivor Space):
   capacity = 9437184 (9.0MB)
   used     = 4741312 (4.52166748046875MB)
   free     = 4695872 (4.47833251953125MB)
   50.240749782986114% used
Eden Space:
   capacity = 8388608 (8.0MB)
   used     = 4194320 (4.0000152587890625MB)
   free     = 4194288 (3.9999847412109375MB)
   50.00019073486328% used
From Space:
   capacity = 1048576 (1.0MB)
   used     = 546992 (0.5216522216796875MB)
   free     = 501584 (0.4783477783203125MB)
   52.16522216796875% used
To Space:
   capacity = 1048576 (1.0MB)
   used     = 0 (0.0MB)
   free     = 1048576 (1.0MB)
   0.0% used
tenured generation:
   capacity = 10485760 (10.0MB)
   used     = 6291504 (6.0000457763671875MB)
   free     = 4194256 (3.9999542236328125MB)
   60.000457763671875% used

1594 interned Strings occupying 146384 bytes.
```

### 生成dump
- jmap -dump:file=testDump2 8064

```
Dumping heap to C:\Users\zhongyuyu\testDump2 ...
Heap dump file created
```
