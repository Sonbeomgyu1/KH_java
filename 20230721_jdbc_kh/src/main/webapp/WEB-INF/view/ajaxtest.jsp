<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax test</title>
<script srx="https://code.jquery.com/jquery-3.7.0.js"></script>
</head>
<body>
<h2>ajax test</h2>
<button id="btnajax1">ajax1</button>
<script>
$("#btnajax1").click(ajax1ClickHandler);
function ajax1ClickHandler(result) {
	console.log("btnajax1 click");
	//$.ajax();(ojbect형태로 매개인자 전달해야함);
	//var obj = {k1:12, k2:'asdaqwd', k3:function(){}};
	console.log("ajax로 데이터 전달전");
	$.ajax({
		url:"${pageContext.request.contextPath}/ajax1"
		, type:"get"
		,data:{n1:'값도가나?', n2:123}
		,success: function(result){
			console.log("ctrl로부터 전달받은 데이터:");
			console.log(result);
		}
	});
	console.log("ajax로 데이터 전달중-1");
}
function ajax2ClicHandler() {
	
}
</script>
</body>
</html>