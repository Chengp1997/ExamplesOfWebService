<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="helper.*,net.sf.json.*,webservice.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/Head.css" />
<link rel="stylesheet" type="text/css" href="css/gallary.css" />
</head>
<body>
	<div class="bg-primary"
		style="color: white; height: 150px; width: auto; background-color: #383838">
		<br>
		<h1 style="text-align: center;">中国大学信息</h1>
		<h4 style="text-align: center;">教育要从娃娃抓起！</h4>
	</div>
	<ul class="nav nav-tabs">
		<li role="presentation" class="active"><a href="index.jsp">主页</a></li>
	</ul>
	<br />
	<%
		ConnectHelper connectHelper = new ConnectHelper();
		SearchUniversity port = connectHelper.connect();
		List<School> schools = port.getAllSchoolInfo();
	%>
	<div class="body">
		<div style="text-align: center">
			<form method="get" action="schoolInfo.jsp">
				<h2>请输入你想搜索的学校</h2>
				<br />
				<div>
					<input type="text" name="schoolName">
				</div>
				<br />
				<div>
					<input type="submit" value="查询" class="btn btn-primary">
				</div>
			</form>
		</div>
		<br />

		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">按头衔搜索</h3>
			</div>
			<div class="panel-body">
				<h4>
					<a href="schoolList.jsp?type=type211"> <span
						class="label label-default">211</span>
					</a> <a href="schoolList.jsp?type=type985"> <span
						class="label label-default">985</span>
					</a>
				</h4>
			</div>
		</div>
		<div class="clear"></div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">高校所在地</h3>
			</div>
			<div class="panel-body">
				<%
					Set<String> provinces = new TreeSet<String>();
					for (int i = 0; i < schools.size(); i++) {
						provinces.add(schools.get(i).getProvince());
					}
				%>
				<div>
					<%
						for (String value : provinces) {
					%>
					<div id="gallary" style="margin: 10px">
						<h4>
							<%
								String mytext = java.net.URLEncoder.encode(value, "utf-8");
							%>
							<a href="schoolList.jsp?type=province&index=<%=mytext%>"> <span
								class="label label-default"> <%=value%>
							</span>
							</a>
						</h4>
					</div>
					<%
						}
					%>
				</div>
			</div>
		</div>
		<div class="clear"></div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">高校类型</h3>
			</div>
			<div class="panel-body">
				<%
					Set<String> types = new TreeSet<String>();
					for (int i = 0; i < schools.size(); i++) {
						types.add(schools.get(i).getType());
					}
				%>
				<div>
					<%
						for (String value : types) {
					%>
					<div id="gallary" style="margin: 10px">
						<h4>
							<%
								String mytext = java.net.URLEncoder.encode(value, "utf-8");
							%>
							<a href="schoolList.jsp?type=type&index=<%=mytext%>"> <span
								class="label label-default"> <%=value%>
							</span>
							</a>
						</h4>
					</div>
					<%
						}
					%>
				</div>
			</div>
		</div>
		<div class="clear"></div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">高校性质</h3>
			</div>
			<div class="panel-body">
				<%
					Set<String> characters = new TreeSet<String>();
					for (int i = 0; i < schools.size(); i++) {
						characters.add(schools.get(i).getCharacter());
					}
				%>
				<div>
					<%
						for (String value : characters) {
					%>
					<div id="gallary" style="margin: 10px">
						<h4>
							<%
								String mytext = java.net.URLEncoder.encode(value, "utf-8");
							%>
							<a href="schoolList.jsp?type=character&index=<%=mytext%>"> <span
								class="label label-default"> <%=value%>
							</span>
							</a>
						</h4>
					</div>
					<%
						}
					%>
				</div>
			</div>

		</div>
</body>
</html>