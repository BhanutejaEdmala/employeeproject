<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style>
        .button-container {
            text-align: center; /* Align buttons to the center */
            margin-bottom: 20px; /* Add some space at the bottom */
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        .button-container form {
            display: inline-block; /* Make forms display inline */
            margin: 0 5px; /* Add some spacing between buttons */
        }
    </style>
</head>
<body>
<div class="button-container">
    <div class="button-container">
        <form action="/">
            <input type="submit" value="Add">
        </form>
    </div>
</div>
<table>
    <thead>
        <tr>
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th>Department</th>
            <th>Branch</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="employee" items="${l}">
            <tr>
                <td><c:out value="${employee.getEmpid()}"/></td>
                <td><c:out value="${employee.getEname()}"/></td>
                <td><c:out value="${employee.getDept()}"/></td>
                <td><c:out value="${employee.getBranch()}"/></td>
                <td><a href="/lupd/${employee.getEmpid()}">update</a></td>
                 <td><a href="/ldel/${employee.getEmpid()}">delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
