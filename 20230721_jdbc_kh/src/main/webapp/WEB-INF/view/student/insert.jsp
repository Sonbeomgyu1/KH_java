<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 글 등록</title>
</head>
<body>
<c:choose>
	<c:when test="${not empty bno }">
		<h2>${bno }에 답글 등록</h2>
	</c:when>
	<c:otherwise>
		<h2>새 글 등록</h2>
	</c:otherwise>
</c:choose>
	<div>
	<!--type="file" 이 있다면 form method="post" entype="multpart/form-date" 반드시작성 !!!  -->
		<form action="<%=request.getContextPath() %>/board/insert" method="post"
		enctype = "multipart/from-data">
			<c:if test="${not empty bno }">
				<input type="hidden" name="bno" value="${bno }">
			</c:if>
			제목:<input type="text" name="btitle">
			<br>
			내용:<textarea rows="10" cols="50" name="bcontent"></textarea>
			<br>
			
			<button type="button" id="btn-add-file">파일추가</button>
			<div id ="add-file">
			</div>
			<button type="submit">글 등록</button>
		</form>
	</div>
	<script >
	$("#btn-add-file").click(function(){
		var cnt =$("[type=file]").length+1;
		htmlVal = '파일첨부(name에 field명 작성하지말자!) :<input type="file" name="a1"><br>';
		$("#add-file").append(htmlVal);
		$(".btn-delete-file").off('click');
		$(".btn-delete-file").on('click',function();{
			$(this).parent().remove();
		)};
	});
	</script>
</body>
</html>