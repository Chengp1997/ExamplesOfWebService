<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="helper.*,net.sf.json.*,webservice.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/Head.css" />
<link rel="stylesheet" type="text/css" href="css/gallary.css" />
</head>
<link rel="stylesheet" type="text/css" href="css/gallary.css" />
<body>
	<div class="bg-primary"
		style="color: white; height: 150px; width: auto; background-color: #383838">
		<br>
		<h1 style="text-align: center;">中国大学信息</h1>
		<h4 style="text-align: center;">教育要从娃娃抓起！</h4>
	</div>
	<ul class="nav nav-tabs">
		<li role="presentation"><a href="index.jsp">主页</a></li>
		<li role="presentation" class="active"><a href="#">学校列表</a></li>
	</ul>
	<br />
	<%
		ConnectHelper connectHelper = new ConnectHelper();
		SearchUniversity port = connectHelper.connect();
	%>
	<%
		String type = request.getParameter("type");
		String needToBeDecode = request.getParameter("index");
		String index = URLDecoder.decode(needToBeDecode, "utf-8");
		List<School> list = new ArrayList<School>();
		if (type.equals("province")) {
			list = port.searchByProvince(index);
		} else if (type.equals("type")) {
			list = port.searchBytype(index);
		} else if (type.equals("character")) {
			list = port.searchByCharacter(index);
		} else if (type.equals("type211")) {
			List<School> schools = port.getAllSchoolInfo();
			for (School school : schools) {
				if (school.getType211().equals("是")) {
					list.add(school);
				}
			}
		} else if (type.equals("type985")) {
			List<School> schools = port.getAllSchoolInfo();
			for (School school : schools) {
				if (school.getType985().equals("是")) {
					list.add(school);
				}
			}
		}
	%>
	<div class="body">
		<div class="panel panel-default">
			<div class="panel-heading" >
				<h3 class="panel-title" >学校列表</h3>
			</div>
			<div class="panel-body">
				<ul class="list-group">
					<%
						for (int i = 0; i < list.size(); i++) {
					%>
					<%
						String mytext = java.net.URLEncoder.encode(list.get(i).getName(), "utf-8");
					%>
					<a href="schoolInfo.jsp?schoolName=<%=mytext%>">
						<li class="list-group-item"><%=list.get(i).getName()%></li>
					</a>
					<%
						}
					%>
				</ul>

			</div>
		</div>
	</div>
</body>
</html>