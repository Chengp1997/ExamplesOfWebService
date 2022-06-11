<%@ page import="bean.SpotsInfo,net.sf.json.*"%><%--
  Created by IntelliJ IDEA.
  User: Emily_Chen
  Date: 2018/12/4
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Title</title>
</head>
<link rel="stylesheet"
	href="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/Head.css"/>
<link rel="stylesheet" type="text/css" href="css/gallary.css" />
<body >
	<div>
		<%
			String keyword = request.getParameter("spot");
			SpotsInfo spotInfo = new SpotsInfo();	
			System.out.println(keyword);
			JSONObject pagebean = spotInfo.getPageBeanInfo(keyword, "", "", "", "");
		%>
		<%
			if (pagebean.getString("allNum").equals("0")) {
		%>
		
			<div class="alert alert-danger" role="alert">
			啊哦(⊙o⊙)？是不是输错啦？没有这个地方哦！
			  <a href="index.jsp" class="alert-link">点我返回！</a>
			</div>
		<%
			} else {
		%>
		<%
			JSONArray contentlist = pagebean.getJSONArray("contentlist");
		%>
		<div class="bg-primary" style="color: white;height: 150px;width: auto;">
		<br>
			<h1 style="text-align: center;"><%=keyword%></h1>
			<h3 style="text-align: center;">欢迎来到<%=keyword%></h3>
		</div>
		
		<ol class="breadcrumb">
			<li><a href="index.jsp">主页</a></li>
			<li class="active"><%=keyword%></li>
		</ol>

		<div class="body">
			<%
				for (int i = 0; i < contentlist.size(); i++) {
						JSONObject spotsInfo = JSONObject.fromObject(contentlist.getString(i));//获得所有详细数据
			%>

			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title"><%=spotsInfo.getString("name")%></h3>
				</div>
				<div class="panel-body">
				
					<%
						if (spotsInfo.has("address")) {
					%>
						<div>地址：<%=spotsInfo.getString("proName") + spotsInfo.getString("address")%></div>
					<%
						}
					%>
					
					<%
						if (spotsInfo.has("location")) {
									JSONObject location = JSONObject.fromObject(spotsInfo.getString("location"));//坐标组  包括lat, lon
					%>
						<div>latitude: <%=location.getString("lat") %> </div>
						<div>longitude: <%=location.getString("lon") %> </div>
					<%
						}
					%>

					<%
						if (spotsInfo.has("summary")) {
					%>
					<div>
						介绍：<%=spotsInfo.getString("summary")%></div>
					<%
						}
					%>

					<%
						if (spotsInfo.has("priceList")) {
									JSONArray priceList = spotsInfo.getJSONArray("priceList");
								}
					%>

					<%
						if (spotsInfo.has("picList")) {
									JSONArray picList = spotsInfo.getJSONArray("picList");
					%>
					<div id="gallary">
						<%
							for (int j = 0; j < picList.size(); j++) {
								JSONObject pic = JSONObject.fromObject(picList.getString(j));
						%>
								<%="<img src=" + pic.getString("picUrl") + " />"%>
						<%	if(j==4)break;
							}
						%>
					</div>

					<%
						}
					%>
					<div class="clear"></div>
				</div>
			</div>



			<%
				}
			%>

		</div>


		<%
			}
		%>
	</div>
</body>
</html>
