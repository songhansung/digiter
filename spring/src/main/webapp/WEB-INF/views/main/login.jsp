<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<c:if test="${user == null}">
		<!-- url이 localhost:8080/test/login -->
		<form action="<%=request.getContextPath()%>/login" method="post">
		    <div class="form-group">
		      <label for="usr">ID:</label>
		      <input type="text" class="form-control" id="usr" name="id">
		    </div>
		    <div class="form-group">
		      <label for="pwd">PW:</label>
		      <input type="password" class="form-control" id="pwd" name="pw">
		    </div>
		    <button type="submit" class="btn btn-primary col-12">로그인</button>
		</form>
	</c:if>
</body>
</html>