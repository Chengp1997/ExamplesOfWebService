<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="helper.*,net.sf.json.*,webservice.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="css/Head.css" />
		<link rel="stylesheet" type="text/css" href="css/gallary.css" />
	</head>

	<link rel="stylesheet" type="text/css" href="css/gallary.css" />

	<body>
		<%
		String needToBeDecode = request.getParameter("schoolName");
		String schoolName = URLDecoder.decode(needToBeDecode, "utf-8");
		ConnectHelper connectHelper = new ConnectHelper();
		SearchUniversity port = connectHelper.connect();
		School school = port.searchByName(schoolName);
	%>
		<div class="bg-primary" style="color: white; height: 150px; width: auto; background-color: #383838">
			<br>
			<h1 style="text-align: center;">中国大学信息</h1>
			<h4 style="text-align: center;">教育要从娃娃抓起！</h4>
		</div>
		<ul class="nav nav-tabs">
			<li role="presentation">
				<a href="index.jsp">主页</a>
			</li>
			<li role="presentation" class="active">
				<a href="#">
					<%=schoolName%>
				</a>
			</li>
		</ul>
		<br />
		<div id="info" class="body">

			<div class="panel panel-default">
				<div class="panel-body" style="text-align:center">
					<div class="panel panel-default">
							<div class="panel-body" style="color: white;background-color: #383838">
								<h1>
						学校名称：<%=school.getName()%></h1>
								<h3>
						<%=school.getAbbreviation()%></h3>
								<h2>
						所在地：<%=school.getProvince()%></h2>
							</div>
					</div>

					<h3>
					城市：<%=school.getCity()%></h3>
					<h3>
					学校性质：<%=school.getCharacter()%></h3>
					<h3>
					学校类型：<%=school.getType()%></h3>
					<h3>
					是否为211：<%=school.getType211()%></h3>
					<h3>
					是否为985：<%=school.getType985()%></h3>
					<h3>
					学校官网：
					<a href="<%= school.getWebsite()%>">
					<%=school.getWebsite()%>
					</a></h3>
				</div>
			</div>

		</div>
	</body>

</html> 