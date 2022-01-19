<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.cha.demo.AddrDB" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.cha.demo.Addr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>주소 목록</h1>
<%    
    AddrDB db = new AddrDB();
    ArrayList<Addr> addrList = db.selectDatas();
    
    for(int i = 0; i < addrList.size(); i++) { 
        Addr addr = addrList.get(i);
    %>
        <div>
            번호 : <%= addr.getIdx() %> <br/>
            이름 : <%= addr.getName() %><br/> 
            주소 : <%= addr.getAddress() %><br/>
            전화번호 : <%= addr.getPhone() %><br/>
        </div>
        <hr>
    <% } %>
    
</body>
</html>