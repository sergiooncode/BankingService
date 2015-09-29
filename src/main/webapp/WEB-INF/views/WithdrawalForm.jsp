<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create New Account</title>
</head>
<body>
    <div align="center">
        <h1>Withdraw Currency</h1>
        <table>
            <form:form action="withdrawCurrency" method="post" modelAttribute="transaction">
            <form:hidden path="transactionId"/>
            <tr>
                <td>Account holder name:</td>
                <td><form:input path="accountHolderName"/></td>
            </tr>
            <tr>
                <td>Amount:</td>
                <td><form:input path="transactionAmount"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save">
                </td>
            </tr>        
            </form:form>
        </table>
    </div>
     
</body>
</html>