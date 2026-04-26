<%@ page import="java.sql.*" %>
<html>
<head>
<title>Salary Report</title>
</head>
<body>

<h2>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h2>
<h2>Salary Report</h2>
<h2>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h2>

<%
int total = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "");

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

    while(rs.next()) {
%>

Emp_No : <%= rs.getInt(1) %><br>
Emp_Name : <%= rs.getString(2) %><br>
Basic : <%= rs.getInt(3) %><br>

----------------------------------------<br>

<%
        total += rs.getInt(3);
    }
%>

<h3>Grand Salary : <%= total %></h3>

<%
    con.close();
} catch(Exception e) {
    out.println(e);
}
%>

</body>
</html>