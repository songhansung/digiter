<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/jquery.js"></script>
<style>
	.btn{
		display: inline-block;
		float: left;
	}
	 .after::after{
	    content: '';
	    clear: both;
	    display: block;
	}
	.container{
		position:relative;
	}
	.black-box{
		position: absolute;
		background-color:black;
		width: 100%;
    	height: 100%;
    	display:none;
    	opacity: 0.5;
	}
</style>
</head>
<body>
   <div class="container">
   		<div class="black-box">
   			<div>
				<a href="<%=request.getContextPath()%>/board/list" class="after">
				<button type="button" class="btn btn-outline-dark">확인</button>
				</a>
				<a href="<%=request.getContextPath()%>/board/register" class="after">
				<button type="button" class="btn btn-outline-dark">취소</button>
				</a>
			</div>
   		</div>
		<h2>게시글등록</h2>
		<form action="<%=request.getContextPath()%>/board/register" method="post" enctype="multipart/form-data">
		    <div class="form-group">
		    	<label>제목</label>
		    	<input type="text" class="form-control" name="title">
		    </div>
		    <div class="form-group">
		    	<label>작성자</label>
		    	<input type="text" class="form-control" name="writer" value="${user.id}" readonly>
		    </div>
		    <div class="form-group">
		    	<label>내용</label>
		    	<textarea rows="10" class="form-control" name="content"></textarea>
		  	</div>
		  	<div class="form-group">
		    	<label>파일</label>
		        <input type="file" class="form-control" name="fileList"/>
		    </div>
		    <div class="form-group">
		    	<label>파일</label>
		        <input type="file" class="form-control" name="fileList"/>
		    </div>
		    <div class="form-group">
		    	<label>파일</label>
		        <input type="file" class="form-control" name="fileList"/>
		    </div>
		  	<button type="submit" class="btn btn-outline-dark">등록</button>
		</form>
		<a href="<%=request.getContextPath()%>/board/list" class="after">
		<button type="button" class="btn btn-outline-dark">취소</button>
		</a>
	</div>
</body>
</html>