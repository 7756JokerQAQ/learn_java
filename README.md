1.hashMap使用的频率最高 HashMap、Hashtable和 Properties
2.HashMap是Map接口使用频率最高的实现类
3.HashMap是以Key-Val对方式来存储数据（HashMap￥Node类型）
4.key不能重复，但是值可以重复，允许使用null键和null值
5.如果添加相同的key，则会覆盖原来的key-val等同于修改（Key不会替换，val替换）
6.与HashSet一样，不保证映射的顺序，因为底层是以hash表的方式来来存储的
7.HashMap没有实现同步，因此是线程不安全的
HashMap扩容机制
1)HashMap底层维护了Node类型的数组table默认为为NULL
2当创建对象是，将加载因子loadfactor初始化为0.75
3.当添加key-val时通过key的哈希值得到在table的索引。然后判断该索引出是否有元素；如果没有元素则直接添加，如果该索引处有元素，继续判断该元素的key和准备加入的key是否相等如果相等，则直接替换val 如果不相等则需要判断是否为树状或者链状结构，做出相应的处理如果添加时发现容量不够，则需要扩容
4.第一次添加，则需要扩容table的容量为16 临界值（threshold）为12 （16*0.75）
5.以后再扩容，则需要扩容的table容量为原来的2倍（32）临界值也变为原来的两倍即24
6.在java8中如果一条链表的元素超过TREEIFY_THRESHOLD默认为8并且table的大小>=MIN_TREEIFY_CAPACITY(默认为64)就会进行树化
Hashtable 实现了map接口
1.存放的是K-V
2.hashtable 的键和值都不能为null，否则会抛出NULLPointerException
3.hashtable 使用的方法基本上和hashMao一样
4.hashtable是线程安全的 hashMap是线程不安全的
他的继承类Properties基本介绍
1.Properties类继承了HashTable类并且实现了Map接口 也是使用一种键值对的形式来保存数据
2.他的使用特点和Hashtable类似
3.Properties 还可以用与从xxx.properties文件中，加载数据到Properties类对象，并且进行读取和修改
4.xxx.properties 文件通常作为配置文件
在开发中，选择什么集合实现类，主要取决于业务操作特点，然后根据集合实现类特性进行选择，分析如下：
1)先判断存储的类型（一组对象单列]或一组键值对双列]）
2)一组对象[单列]：Collection接口
                允许重复：List
增删多：LinkedList[底层维护了一个双向链表]
改查多：ArrayList[底层维护Object类型的可变数组]
不允许重复：Set
无序：HashSet[底层是HashMap,维护了一个哈希表即（数组+链表+红黑树）]
排序：TreeSet
插入和取出顺序一致：LinkedHashSet,维护数组+双向链表
3)一组键值对[双列]：Map
键无序：HashMap[底层是：哈希表jdk7:数组+链表，jdk8:数组+链表+红黑树]
键排序：TreeMap
键插入和取出顺序一致：LinkedHashMap
读取文件Properties
