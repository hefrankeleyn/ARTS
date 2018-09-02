#目录：
1.如何设置本地服务器
  1.1 互联网是怎么工作的  

#1.设置项目目标

第一步：列出想做的事情；

第二步：根据想做的事情列出详细的解决方案；

第三步：对想做的事情进行排序；

#2.互联网的产生
第一步：
两台电脑互相连在一起，需要一根线，三台电脑互相连在一起，需要三条线，多台电脑就需要很多线；

第二步：
如果使用路由器，分发信号，放在电脑之间，就可以少用很多的线；

第三步：
将线分发到世界各处，有现成的线——电话线。

第四步：
将路由器信息转化成电话线的信息，使用“猫”。

第五步：
在互联网中由ISP（互联网服务商），管理特殊的路由器。

通过上面五步，形成了互联网。

#3.Web的构成——当访问网页时发生了什么事
##3.1、客户端、服务器
客户端：入网设备和可联网的软件组成客户端；
服务器：存储网页信息的计算机；

##3.1、客户端与服务器的沟通
在浏览器（客户端的联网软件）上输入一个网址（比如：www.baidu.com),这个网址叫**域名**；

浏览器会去**DNS**（相当于一个电话本，根据姓名找电话）找服务器的唯一地址；

客户端发出的请求叫**HTTP**(就像有人说英语，有人说汉语)，一种通信的语言；

这段**HTTP**信息要通过**TCP/IP**（就像交通工具，有人坐地铁，有人开车）传输到服务器；

服务器将网页信息以**数据包**（小的数据包，可以同时发给很多人）的形式发出去，满足多人请求；

##3.2、网页、网站、网络服务器、浏览器、搜索引擎
网页，指的是html

网站，多个有关联的html

网络服务器，存放一个或多个网站的计算机

浏览器：像火狐、google、QQ等软件

搜素引擎：用于搜索其他网站的网站，如www.google.cn

##3.3、剖析URL

HTTP://www.example.com:80/path/to/myfile.html?key1=value1&key2=value2#SomeWhereInTheDocument

###HTTP://
协议

###www.example.com
域名

###:80
端口号
HTTP端口为80，HTTPS端口为443

###/path/to/myfile.html
网络服务器上的资源路径

###'#SomeWhereInTheDocument'
资源本身的一个锚点


#运行一个简单的本地HTTP服务器
C:\Users\Administrator>python -m http.server

或

C:\Users\Administrator>python -m http.server 7888


正在阅读：
1.https://developer.mozilla.org/en-US/docs/Learn/Server-side/Django
  
  1.1 https://developer.mozilla.org/en-US/docs/Learn/Server-side/First_steps

     1.1.1 https://developer.mozilla.org/en-US/docs/Learn/Common_questions/What_is_a_web_server
     
         https://developer.mozilla.org/en-US/docs/Learn/Server-side/First_steps/Introduction

     1.1.2 https://developer.mozilla.org/en-US/docs/Learn/Common_questions/What_software_do_I_need
  
     1.1.3 https://developer.mozilla.org/en-US/docs/Learn/Common_questions/Upload_files_to_a_web_server

##server_side和client_side 的不同

不同点一：开发的语言

    client-side 用html、css、javaScript开发
    server-side 用python、java、C、C++等开发

不同点二：运行的场所

    client-side 运行在浏览器（brower）
    server-side 运行在服务器
    
不同点三：框架的使用

    client-side 做简单的site，没必要用框架
    server-side 没有必要从头开发，通常使用框架

##request includes:

###1. URL
      
###2. 

###3. Additional information





