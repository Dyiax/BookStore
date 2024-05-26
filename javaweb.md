1. **实验的目的及要求**

通过本次实验，学生需把本课程所学到的各方面技术综合应用于一个相对全面的小型动态网站，加深对web应用开发的总体理解和各种技术结合使用的体会，为后续的课程设计和毕业设计等实践环节积累经验，打好基础。

1. **背景**

当今网络高速发展，网络购物已经不再新奇，它满足人们对各种物品的需求。“书籍是人类进步的阶梯”，对于网上书店来说，无疑是网络购物中心最好的学习例子，作为电商项目它可能比较简单，但麻雀虽小五脏俱全。我们小组决定设计一个拥有用户购物模块和管理员模块的网上书店。

1. **需求分析**

**3.1 问题陈述**

网上书店系统应该具有这样的功能：

1. 对于用户来说，可以浏览所出售书籍，根据价格或书名等信息查询。
1. 可以将商品添加至购物车，可以进行购买，对订单进行签收操作
1. 对于管理者来说，可以对图书进行增删改的处理，对用户订单进行发货等操作。

**3.2 功能需求分析**

1. 安全性管理：管理员通过账号和密码登录网上书店系统，管理书籍，管理订单信息，拥有最大的权限；对于普通用户来说，有一定的操作权限，但仅仅限于用户模块。通过服务器端的权限设置和数据库登录权限设置来实现整个系统的安全性。

（1）管理员：对图书进行增删改操作，对订单进行确认发货、查看详情操作。也有普通用户的权限，将商品添加到购物车，清空购物车去结账。

`  `（2）用户：对购物车进行增删改操作，对订单进行结算查看操作，进行登录注册操作。


图2—1用户管理功能模块


`  `通过对用户登录状态的检查，赋予用户不同权限，登录状态下与未登录状态下模块区别为购物车结账模块和订单查询模块的权限不同。

1. 图书管理：该功能模块用于管理图书相关的信息包含的功能模块如下图所示

图书管理

图书基本信息


图书增加


图书修改

图书删除
![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.008.png)

图2—2“图书管理”功能模块  

`  `“图书基本信息”包括名称、价格、作者、销售、库存；“图书增删改”可以对图书进行相关的操作。



4、购物车管理：此功能模块用于管理图书流通环节的相关的操作，包括如下图所示的功能模块。

购物车管理

商品增加

商品删除

商品结账

![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.009.png)

`                          `图2—3“购物车管理”功能模块


`  `“购物车管理”对于用户添加进购物车的图书进行删除、清空、结账等操作。

5、订单模块：订单模块分为管理者订单和用户订单，两者唯一的不同在于管理者订单可以查询所有用户的购买情况，对订单进行发货操作；而用户只可以查询自己的订单信息以及对订单进行收货操作。


订单管理

查询订单信息

用户确认收货

管理者确认发货
![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.010.png)

`     `管理者对所有订单进行查询和确认发货操作；用户对自己的订单进行查询和确认收货操作。

1. **总体设计**

**4.1 功能结构图设计**

**网上书店系统**

**购物车管理**

**图书管理**

**订单管理**

图书增加

图书删除

图书查询

删除

增加

查询

状态修改

图书修改

**用户管理**

登录

注册

注销

![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.011.png)

图3—1系统总功能图




**4.2 模块简介**
### <a name="_toc23514"></a><a name="_toc23387"></a><a name="_toc478"></a>**（一）前台模块**

![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.012.png)![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.013.png)![ref3]



![ref3]![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.015.png)





![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.016.png)![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.017.png)



![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.018.png)![ref3]![ref3]


1. <a name="_toc2613"></a>**用户注册**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.019.png)

1. <a name="_toc15313"></a>**用户登录**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.020.png)

1. <a name="_toc18529"></a>**订单查看**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.021.png)

1. <a name="_toc30778"></a>**购物车结算**


   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.022.png)


1. <a name="_toc31493"></a>**检索图书**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.023.png)


   ### <a name="_toc11635"></a><a name="_toc21395"></a><a name="_toc17100"></a>**（**二）后台模块![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.024.png)

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.025.png)![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.026.png)![ref3]



   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.027.png)![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.028.png)

   ![ref3]

1. <a name="_toc9583"></a>图书增加

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.029.png)



1. <a name="_toc4175"></a>图书修改

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.030.png)

1. <a name="_toc5450"></a>图书删除

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.031.png)

1. <a name="_toc31669"></a>订单查看

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.032.png)

1. **详细设计**

**5.1 主模块详细设计**

`  `我做的是B/S模式的网上书店系统，那么首选的语言就是java，数据库我选择mysql和java进行JDBC编程，实现前端和数据库的连接。在建模方面我使用PowerDesigner来实现系统模型分析，使用navicat来分析数据库表之间的联系。

`  `总的开发流程就是前端给出页面设计之后，数据库设计跟上，然后就是后端的java开发。<a name="_toc15655"></a>用户界面设计

利用前端HTML、CSS、JS制作出了前端页面：

1. **首页**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.033.png)

1. **登录页面**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.034.png)

1. **注册页面**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.035.png)

1. **用户购物车页面**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.036.png)

1. **我的订单页面**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.037.png)

1. **图书管理页面**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.038.png)


1. **用户管理页面**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.039.png)

   **说明：**

   `   `其中我们在注册页面用了EL表达式对用户输入的账号、密码和邮箱进行前端第一步的验证操作。其它页面均为HTML静态页面，之后就开始数据库设计。
   ### <a name="_toc16947"></a>**数据库存储设计**
   建库语句如下：



   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.040.png)并决定创建4张表如下：

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.041.png)


图为navicat for mysql提供


![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.042.png)![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.043.png)建表语句如下：





![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.044.png)![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.045.png)








**4.2 子模块详细设计**

在IDEA项目中创建好java ee项目，将项目框架的文件夹创建好：web层、service层、dao层、javabean。

`  `java后端开发分为前台模块和后台模块两大部分，其中又可以分为用户模块、图书模块、购物车模块、订单模块和权限管理以及事务管理设计。

**5.2 子模块详细设计**

**用户模块：**

根据数据库表的设计创建javaBean，创建User类，数据与数据库t\_user表相对应。之后与设计数据库层面的连接，这里导入数据库连接的jar包，已经测试包：

![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.046.png)  编写基本的数据库连接操作，这里使用JDBCUtils，创建基本的配置文件，在JDBCUtils中编写代码：


static {
`    `try {
`        `Properties properties = new Properties();
`        `//读取jdbc.properties属性配置文件
`        `InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties" );
`        `//从流中加载数据
`        `properties.load(inputStream);
`        `//创建数据库连接池
`        `dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);

`    `} catch (Exception e) {
`        `e.printStackTrace();
`    `}

}

`  `可以进行打印连接进行测试，看看是否连接到了数据库。编写baseDao类，在里面增加一些增删改查的方法，以便之后连接继承使用。

`  `配置好环境之后，我们编写UserDao接口，在其中添加根据用户名查询用户、根据用户名和密码查询用户、保存用户等方法，然后在UserDaoImpl中实现这个接口。主要为编写sql语句并返回，部分语句如下：

public class UserDaoImpl extends BaseDao implements UserDao {
`    `@Override
`    `public User querybyUsername(String username) {
`        `String sql = "select `id`,`username`,`password`,`email` from t\_user where username = ?";
`        `return queryForOne(User.class,sql,username);
`    `}
}

`   `编写完Dao层之后，观看前端关于用户页面的服务就有登录、注册等服务，编写service层，service层用来调用Dao，例如登录的时候调用UserDao中的根据用户名和密码查询用户的方法，通过得到的User类对象是否为空来判断用户登录是否成功，而相应前端请求的自然就是Web层的servlet代码。所以编写完service层之后要去web层编写相应的UserServlet，并记得在web.xml配置，以便在前端页面引用。这个时候可以将之前的前端HTML5页面全部替换为JSP动态页面，其实很简单，就是在前面加上

<%@ page contentType="text/html;charset=UTF-8" language="java" %>一行代码即可，方便后续我们进行动态引入从servlet来的数据，动态的显示。

`  `关于用户登录的模块也就是：

![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.047.png)


其中在Dao层要进行一次test，在service层也要进行测试，如果出现错误，那么分层开发的优势就可以显示出来，我们可以很快的找出是哪一层出现了错误。在servlet层中我们用到了HTTP的相关知识，使用了doPost或者doGet方法，因此将servlet层中复用的代码放到baseServlet中，并利用反射技术去调用我们响应的方法（即通过类找到方法）。

`   `那么用户注册的模块也和登录一致，其中DAO、service层是一至的，我们只需要在servlet层中添加注册的方法即可。

**图书模块**

`  `根据数据库设计javabean，并在book中添加get()、set()方法、toSting()方法以及有参无参构造函数。

`  `然后设计bookDao层，因为书籍一般都有增删改查的操作，所以在bookDao中有通过id查询图书、删除图书、改变图书的操作，之后测试sql语句是否正确，例如查询操作：

public Book queryBookById(Integer id) {
`    `String sql = "select \* from t\_book where id = ?";
`    `return queryForOne(Book.class,sql,id);
}

就是一个简单的sql语句，然后利用我们的数据库编程类库，之间得到我们查询之后的图书对象。

`  `之后的service层也是通过dao层来实现方法，而我们的servlet层也是如此，这个时候要去管理员的图书管理页面去设置我们数据显示。这里就用到了JSP技术，也就是为什么之前要将HTML换位JSP页面的原因，可以动态的显示书籍信息，例如：

<div id="main">
`   `<table style="height: 350px">
`      `<tr>
`         `<td>名称</td>
`         `<td>价格</td>
`         `<td>作者</td>
`         `<td>销量</td>
`         `<td>库存</td>
`         `<td colspan="2">操作</td>
`      `</tr>
`      `<c:forEach items="${requestScope.page.items}" var="book">
`         `<tr>
`            `<td>${book.name}</td>
`            `<td>${book.price}</td>
`            `<td>${book.author}</td>
`            `<td>${book.sales}</td>
`            `<td>${book.stock}</td>
`            `<td><a href="manager/bookServlet?&action=getBook&id=${book.id}&pageNo=${requestScope.page.pageNo}">修改</a></td>
`            `<td><a class="deleteClass" href="manager/bookServlet?action=delete&id=${book.id}&pageNo=${requestScope.page.pageNo}">删除</a></td>
`         `</tr>
`      `</c:forEach>





`  `而整个的逻辑也是很好理解的：

![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.048.png)



`  `以上我们就可以试下图书的增加、删除和修改操作，在删除操作中我们需要在web页面上添加提示，避免用户不小心删除了数据。

**购物车模块**

`  `购物车模块可以用session来设计，也可以用mysql来设计，或者用redis缓存技术。这里决定使用session技术，它的生命周期也就是浏览器的生命周期，即关闭浏览器购物车生命结束，不会保存用户购物车的信息。

`  `选用了session之后，直接创建相应的servlet，在里面实现增加、删除的方法。从前端获得数据之后直接保存到session域中，所以增删操作也就是session信息的操作，但是在结账操的时候，就使用数据库操作，将购物车里面的item和order保存在数据库中。这一块和订单模块相连接。

**订单模块**

`  `为了保存用户购买书籍的信息和订单信息，依旧和之前一样，这里可以从servlet开始，反向操作。在servlet中的操作逆行逻辑如下：

![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.049.png)

**事务处理**

`  `从上面得到创建订单的同时（也就是用户付款完毕之后），需要同时对图书的销售量和存储量进行操作，这一步必须一起执行，或者一起失败，所以这里要用事务处理机制。这里没有选择在数据库中使用触发器或者设置事务操作。我选择用ThreadLocal，也就是线程。这里我首先设想的是利用一个线程关联一个数据的特性，手动的设置事务，成功则提交事务，失败则回滚事务，并在相应操作，也就会上面所说的创建订单+库存销售的修改上加上try-catch操作来实现事务。后面发现是可行的，但是如果后面有更多需要事务的地方就不好处理，所以我利用Filter来进行过滤，在doFiltr()方法中进行ThreadLocal操作来实现整个的事务处理。

**权限控制**

`  `编写好基础页面之后，需要实现前后台的功能，也就是说用户的权限是不能涉及后台管理的，所以使用了Filter来控制。我利用session域来获得登录的对象（如果没有登录那么跳转登录页面），对登录对象进行管理员用户的检测，以此实现权限管理（并在web.xml中进行配置）。



逻辑也就是

![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.050.png)








、

1. **编码和测试**
### **总体测试**
1. <a name="_toc27368"></a>**登录功能**

   ![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.051.png)




1. <a name="_toc4382"></a>**结账功能![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.052.png)![](Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.053.png)**

   

   ### <a name="_toc10859"></a>

   ### **（三）优化**

1. 将前端页面相同部分的代码汇总，可以方便之后的修改。

1. 通过查看资料将resquest域中的数据利用webUtils工具类快速注入到对象中。

1. 增加了500、404等错误提示页面。

1. **总结及建议**

1. **收获:**

通过开发B/S模式的网上书店系统，我学到了前端和后端开发的相关技术，包括HTML、CSS、JavaScript，以及Java和MySQL的数据库编程。这不仅提升了编程技能，还让我理解了整个Web应用的开发流程。使用PowerDesigner和Navicat进行系统模型分析和数据库设计，学到了如何合理设计数据库表，建立表之间的关系。这对于构建高效、可扩展的数据库结构是非常重要的。

在开发过程中，会遇到各种技术和逻辑上的问题，解决这些问题需要具备良好的问题分析和解决能力。

1. **不足:**

用户体验优化： 虽然完成了前端页面设计，但可能还有进一步优化用户体验的空间。可以考虑使用一些现代的前端框架（如React、Vue）来提高交互性和用户友好性。

安全性考虑不足： 在真实的Web应用中，安全性是至关重要的。可能需要考虑加入一些安全性措施，如防止SQL注入、XSS攻击等。

[ref1]: Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.003.png
[ref2]: Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.005.png
[ref3]: Aspose.Words.176c095b-7d9b-4fb6-899a-f6f7fcccd61f.014.png
