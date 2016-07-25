<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="resources/js/jquery.js" type="text/javascript"></script>

<title>Insert title here</title>

<script type="text/javascript">

			function teste(){
				
				$.getJSON('jsonId?id=1',function(data){
					alert("Titulo: " + data.titulo);
				});
			}
				
</script>

<style type="text/css">
	
	#anuncios{
		background: red;
		border: 1px solid;
	}

</style>

</head>
<body>


	<h1>Funcionou XD</h1>



	<c:forEach var="anuncio" items="${anuncios}">
		<ul>
			<li>${anuncio.id}</li>
			<li>${anuncio.titulo}</li>
			<li>${anuncio.descricao}</li>
		
		</ul>
		
	</c:forEach>

	<div id="anuncios" onclick="teste()">
	teste
	</div>



</body>
</html>