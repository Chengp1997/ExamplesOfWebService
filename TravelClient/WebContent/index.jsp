
<%@ page contentType="text/html;charset=UTF-8" language="java"
	import="bean.*,java.util.*,net.sf.json.*"%>
<html>
<head>
<title>Let's Go!</title>
</head>
<link rel="stylesheet"
	href="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>
	<div class="bg-primary"
		style="color: white; height: 150px; width: auto;">
		<br>
		<h1 style="text-align: center;">跟我出去玩</h1>
		<h3 style="text-align: center;">输入你想去的任何地方！带给你不一样的资讯</h3>
	</div>

	<ol class="breadcrumb">
		<li><a href="index.jsp">主页</a></li>
		<li class="active"></li>
	</ol>

	<div style="text-align: center">
		<img alt="" src="pic/lvyou.png">
		<form method="get" action="Detail.jsp">
			<h2>想去哪里玩？</h2>
			<br />
			<div>
				<input type="text" name="spot">
			</div>

			<br />
			<div>
				<input type="submit" value="Let's Go" class="btn btn-primary">
			</div>

		</form>
	</div>

	
</body>
</html>
