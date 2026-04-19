<%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
<title>Add Cookie</title>
</head>
<body>

<%
String name = request.getParameter("cname");
String domain = request.getParameter("cdomain");
int age = Integer.parseInt(request.getParameter("cage"));

Cookie ck = new Cookie(name, "UserCookie");
ck.setDomain(domain);
ck.setMaxAge(age);

response.addCookie(ck);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain:</b> <%= domain %></p>
<p><b>Max Age:</b> <%= age %> seconds</p>

<br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>