# ExamplesOfWebService

These are two projects of class web service. 

IDE: eclipse

- TravelService
  - client: TravelClient
- School searching Service
  - Server: WebServiceDB
  - Client: WebServiceClient



## Travel Service

a) 内容：调用全国景区信息服务，开发查询景点介绍的服务。

b) 部署：使用eclipse进行开发。使用外调的web service，开发JSP页面来显示服务，并部署于tomcat之上。

i. <img src="/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps1.png" alt="img" style="zoom: 33%;" />

ii. Src/bean package 中为使用web service获得的数据，返回对应的对象列表

c) 运行：

i. 运行时，通过index.jsp进入页面，输入你想到达的目的地。

ii. 运行时请联网。考虑到有些css文件，js文件使用的是网站的链接，运行时请联网。

iii. Jsp页面中，进行服务的调用

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps2.png) 

d) 例子：

i. 进入主页

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps3.png) 

ii. 搜索正确的地名/地点，返回对应地点的景点推荐信息

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps4.png) 

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps5.png) 

iii. 输入了错误的地名信息，返回错误，请返回

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps6.png) 

 

## School searching Service

Server

a) 内容：使用自带数据（全国大学信息），开发了解高校信息web service 服务。

b) 部署：使用eclipse进行开发。使用xml文件的数据作为数据来源，开发搜索学校信息的服务。使用JWS进行服务开发。

i. <img src="/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps7.png" alt="img" style="zoom:50%;" />

ii. 信息来源为：src/resource/schoolsInChina.xml

iii. 使用src/WebService/SearchUniversityInterface.java定义服务接口

iv. Src/WebService/SearchUniversity.java 记录服务逻辑

v. src/WebService/WebServicePublish.java 发布服务

vi. 运行时，首先要使用WebServicePublish.java将服务发布，再来运行客户端。

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps8.png) 

Client

c) 内容：使用自己发布的web service，开发客户端。部署：使用eclipse进行开发。使用JWS进行部署，开发JSP页面来显示服务，并部署于tomcat之上。

i. <img src="/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps9.png" alt="img" style="zoom:50%;" />

ii. src/helper/ConnectHelper.java 连接自开发的服务

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps10.png) 

iii. src/webservice package 中的内容为解析wsdl后生成的服务。

d) 运行：

i. 运行时请联网。

ii. 通过index.jsp进入页面。运行时，可根据头衔（985/211），学校类型，高校所在地，高校类型等分类来查询对应学校；也可根据你的输入来查询对应学校的信息

iii. Jsp页面中进行服务的调用

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps11.png) 

e) 例子

i. 进入index.jsp页面

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps12.png) 

ii. 可根据各种类型来查询学校

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps13.png) 

iii. 点击对应的类别，可查询到类别中的学校

![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps14.png) 

iv. 点击对应的学校/搜索对应的学校姓名，可查询对应的学校信息。

v. ![img](/Users/chengeping/Documents/LearningMaterial/Projects/ExamplesOfWebService/IMG/wps15.png)

 