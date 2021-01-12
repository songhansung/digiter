<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	  <h2>게시글 수정1</h2>
	  <c:if test="${board != null && board.writer == user.id}">
			<form action="<%=request.getContextPath()%>/board/modify" method="post" enctype="multipart/form-data">
			  	<input type="hidden" name="num" value="${board.num}">
			    <div class="form-group">
			      	<label>제목</label>
			      	<input type="text" class="form-control" name="title" value="${board.title}">
			    </div>
			    <div class="form-group">
			      	<label>작성자</label>
			      	<input type="text" class="form-control" name="writer" value="${board.writer}" readonly>
			    </div>
			    <div class="form-group">
			      	<label>내용</label>
			      	<textarea rows="10" class="form-control" name="content">${board.content}</textarea>
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
			    <c:if test="${fList.size() != 0}">
				    <div class="form-group">
				      <label for="cotent">첨부파일</label>
				      <c:forEach items="${fList}" var="file">
				      	<div><a href="<%=request.getContextPath()%>/board/download?fileName=${file.filename}">${file.oriFilename}</a></div>
				      </c:forEach>
				    </div>
		    	</c:if>
				<button type="submit" class="btn btn-outline-dark">저장</button>
				<a href="<%=request.getContextPath()%>/board/list" class="after">
					<button type="button" class="btn btn-outline-dark">취소</button>
				</a>
		  	</form>
	  	</c:if>
	  	<c:if test="${barod == null && board.writer != user.id}">
	  	<h1>존재하지 않은 게시글이거나 작성자가 아닙니다.</h1>
	  	</c:if>
	</div>
	<script>
		$(function (){
			$('form').submit(function(){
				var cnt = 0;
				$('input[name=fileList]').each(function() {
					if($(this).val() != ''){
						cnt++;
					}
				})
				if(cnt == 0){
				var res = confirm('선택된 첨부파일이 없습니다. 이전에 등록된 첨부파일이 삭제됩니다. 수정하시겠습니까?')
				return res;
				}
				return true;
			})
		})
	</script>
</body>
</html>