<h1>Update Form</h1>
<form action="/upd" modelAttribute=emp method="POST">
    <!-- Hidden input field for empid -->
    <input type="hidden" name="empid" value=${empid}>
    <br><br>
    Enter Employee Name:<input type="text" name="ename">
    <br><br>
    Enter Dept:<input type="text" name="dept">
    <br><br>
    Enter Branch:<input type="text" name="branch">
    <br><br>
    <input type="submit" name="submit">
</form>
