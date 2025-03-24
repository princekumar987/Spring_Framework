<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    

      <h1>This Dynamic Page</h1>
      
      
      ${key}
      
      <form action="insert" method="post">
            <input type="text" name="id" placeholder="enetr id">
            <input type="text" name="name" placeholder="enetr name">
            <button>submit</button>
      
      </form>

</body>
</html>