单例模式：
饿汉模式
懒汉模式

区别：
饿汉模式：加载类时比较慢，运行时获取实例比较快，线程安全的
懒汉模式：加载类时比较快，运行时获取实例比较慢，线程不安全的

拓展：
线程安全和线程不安全：
线程安全就是多线程访问时，采用了加锁机制，当一个线程访问该类的某个数据时，进行保护，其他线程不能进行访问直到该线程读取完，
其他线程才可使用。不会出现数据不一致或者数据污染。
线程不安全就是不提供数据访问保护，有可能出现多个线程先后更改数据造成所得到的数据是脏数据