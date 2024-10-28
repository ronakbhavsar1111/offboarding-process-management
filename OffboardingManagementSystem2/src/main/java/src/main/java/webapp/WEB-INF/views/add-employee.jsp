<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Add Employee</title>
</head>
<body>
<h2>Add Employee</h2>
<form action="#" th:action="@{/employees/add}" th:object="${employee}" method="post">
    <label>First Name:</label>
    <input type="text" th:field="*{firstName}"/>
    <label>Last Name:</label>
    <input type="text" th:field="*{lastName}"/>
    <label>Email:</label>
    <input type="email" th:field="*{email}"/>
    <label>Phone:</label>
    <input type="text" th:field="*{phone}"/>
    <button type="submit">Add</button>
</form>
</body>
</html>
