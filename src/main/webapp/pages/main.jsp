<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 27.12.2016
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html" charset="UTF-8">
    <title>Main</title>
</head>
<body>
<h1>Hello </h1>
<h2>
    <% request.setCharacterEncoding("UTF-8"); %>
    <%=request.getParameter("username")%>
    <br>
    <%=request.getParameter("password")%>
    ${param["password"]}
</h2>
</body>
</html>

<%--<%= httpServletRequest %>httpServletRequest = request;<%!
    private javax.servlet.http.HttpServletRequest httpServletRequest;
%>--%>
