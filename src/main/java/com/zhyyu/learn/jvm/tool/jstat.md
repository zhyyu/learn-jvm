### 查看堆各区域医用内存占比
* jstat -gcutil 8064

header | mean
------ | --------
s0 |	survival0
s1 |	survival1
e |		eden
o |		old
m |		?
ccs | 	?
ygc | 	yong gc
ygct |  yong gc time
fgc | 	full gc
fgct | 	full gc time
gct | 	all gc time

```
  S0     S1     E      O      M     CCS    YGC     YGCT    FGC    FGCT     GCT
  0.00   0.00  56.50  60.00  54.41  55.74      1    0.007     1    0.005    0.013
```
