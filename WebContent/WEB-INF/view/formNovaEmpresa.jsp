<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkEntradaServlet }" method="post">
	
		nome: <input type="text" name="nome"  />
		DataAbertura: <input type="date" name="dataAbertura"  />
		<input type="hidden" name="acao" value="NovaEmpresa">
	
	
		<input type="submit" />
	</form>

</body>
</html>