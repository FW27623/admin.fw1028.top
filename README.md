# **Java面向对象实验项目代码**

Java实验项目代码-同步自Intellij IDEA 2021.2.3(Ultimate Edition)

## 实验内容：

### Java 实验项目，更改自动同步至Github，Java文件位于[ src ](https://github.com/FW27623/admin.fw1028.top/tree/master/src)路径下

#### _**实验一：**_
- **1.输出英文字母和希腊字母**
- **2.判断回文数**

#### _**实验二：**_
- **1.输出家庭成员结构**
- **2.比大小**
- **3.计算矩形的面积和周长**
- **4.输出桌子的信息**
- **5.输出课程信息**
- **6.猜数字游戏（三个难度级别）**

#### **_实验三：_**
- **1.编程模拟中国人和北京人。**  
*      除主类外，还有3个类：test_people、ChinaPeople和BeijingPeople类，要求如下：  
*     （1）People类是抽象类，有权限是protected的double型成员变量：height[]和weight[]，以及抽象方法：public void speakHello(String hello)、public double averageHeight(double height[])和public double averageWeight(double weight[])方法，功能分别是打印hello，计算平均身高和计算平均体重。  
*     （2）ChinaPeople类是People的子类，新增了public void chinaGongfu(String gongfuName)方法，功能打印功夫名。要求ChinaPeople重写父类的speakHello、averageHeight和averageWeight方法，重写的方法功能同上。  
*     （3）BeijingPeople类是ChinaPeople的子类，要求BeijingPeople类重写父类的averageHeight和averageWeight方法，功能分别是计算身高之和及计算体重之和。（拓展：要求averageHeight计算身高之和时，必须先利用父类的averageHeight计算平均值，然后利用平均值求和；averageWeight方法同上）。  
*     （4）在主类的主方法中，要求：创建ChinaPeople对象，并用该对象的averageHeight和averageWeight方法分别计算该对象的height[]的平均值和weight[]的平均值；创建BeijingPeople对象，并用该对象averageHeight和averageWeight方法ChinaPeople对象中height[]的身高之和及weight[]的体重之和。    


- **2.歌手大赛计算选手的成绩办法是去掉一个最高分和最低分后再计算平均分，而学校评估一个班级的学生体重时，是计算全班同学体重的平均值。**  
*      SongGame类和School类都实现了ComputerAverage的接口。  
*      ComputerAverage中只有一个方法public double average(double x[]),计算数组x的平均值。  


- **3.写出一个类A，该类创建的对象可以调用方法f输出英文字母表，然后再编写一个该类的子类B，要求子类B必须继承A类的方法（不允许重写），子类创建的对象不仅可以调用方法f输出英文字母表，而且可以调用子类新增的方法g输出希腊字母表。**    


- **4.写一个类，该类有一个方法public int f(int a, int b)，该方法返回a 和 b的最大公约数。然后再编写一个该类的子类，要求子类重写方法f，而且重写的方法将返回a和b的最小公倍数；**  
*      要求在重写的方法的方法体中首先调用被隐藏的方法返回a和b的最大公约数m，然后将乘积(a * b)/m返回；  
*      要求在应用的程序的主类中分别使用父类和子类创建对象，并分别调用方法f计算两个正整数的最大公约数和最小公倍数。

#### **_实验四：_**
- **1.用户任意输入一个信息，判断信息内容是否为回文数（见实验一第2题）**  


- **2.通过键盘输入年份和月份，之后输出该年月所对月的日历页。（比如输入的2019年11月，则程序输出2019年11月的日历）**  

#### **_实验五：_**
- **1.设计程序实现如图所示效果：输入一个非负整数后，点击“阶乘”按钮，计算该数的阶乘，并显示在下面的文本框中。**  

  <img src="https://www.fw1028.top/wp-content/uploads/2021/12/img_1.png" alt="1"/>    
  

- **2.以课堂演示登录窗口为例，若存在五个合法用户（五个合法用户的账号和密码在编写代码时由小组确定），用户输入的账号和密码只要满足其中一个账号，都可以验证通过，同时要求验证通过后可以打开一个新的窗口；若验证失败直接在原窗口提示“用户名或密码错误”的字样。**  
  

- **3.用户任意输入一个信息，判断信息内容是否为回文数（见实验一第2题）**  

  <img src="https://www.fw1028.top/wp-content/uploads/2021/12/img_2.png" alt="2"/>  
  

- **4.编写程序实现如图功能：**  

  <img src="https://www.fw1028.top/wp-content/uploads/2021/12/img_3.png" alt="3"/>  
  

- **5.编写代码实现交通信号灯功能。**
  

- **6.一元二次方程ax2+bx+c=0,使用swing建立输入窗口，输入a、b和c的值后提交确定，能够在窗口中显示方程的根。**
  

- **7.编写代码实现如图所示功能。**  

  <img src="https://www.fw1028.top/wp-content/uploads/2021/12/img_4.png" alt="4"/>
