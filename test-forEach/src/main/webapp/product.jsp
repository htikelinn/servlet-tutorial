<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Products</title>
</head>
<body>

<%-- Changed h2 to include an anchor tag --%>
<h2><a href="<c:url value="/products"/>">Products List</a></h2>

<img src="<c:url value="/images/pepsi.jpg"/>" alt="Pepsi" width="100" height="100">

<c:if test="${empty list}">
    <p>No products found.</p>
</c:if>

<ul>
    <c:forEach items="${list}" var="product">
        <li>${product}</li>
    </c:forEach>
</ul>

</body>
</html>