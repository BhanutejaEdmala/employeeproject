<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style>
        .button-container {
            text-align: center; /* Align buttons to the center */
        }

        .button-container form {
            display: inline-block; /* Make forms display inline */
            margin: 0 10px; /* Add some spacing between buttons */
        }
    </style>
</head>
<body>
<center><h1>HOME</h1></center>
<div class="button-container">
    <form action="/">
        <input type="submit" value="Add">
    </form>
    <form action="/update">
        <input type="submit" value="Update">
    </form>
    <form action="/g">
        <input type="submit" value="View">
    </form>
    <form action="/view">
        <input type="submit" value="View All">
    </form>
    <form action="/dform">
        <input type="submit" value="Delete">
    </form>
</div>
</body>
</html>


