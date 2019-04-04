DUBBO STUDY PROJECT

1、
尝试使用Dubbo的multicast模式，发现一运行就报Can't assign requested address的错误，造成这种原因的主要是系统中开启了IPV6协议（比如window7），java网络编程经常会获取到IPv6的地址，这明显不是我们想要的结果，搜索发现很多蹩脚的做法是：禁止IPv6协议。

解决方法： 在虚拟机的运行参数里，加入下面的参数。

-Djava.net.preferIPv4Stack=true
　　

 
这时，就能解决Can't assign requested address的报错，成功调用服务了。
