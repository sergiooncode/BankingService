<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Banking Service</title>
    </head>
    <body>
        <div align="center">
            <h1><a href="newAccount">Add new Checking account</a></h1>
            <h1><a href="newUser">Add new User</a></h1>
            <h1><a href="depositCurrency">Deposit currency</a></h1>
            <h1><a href="withdrawCurrency">Withdraw currency</a></h1>
            <h2>Transaction Ledger</h2>
            <table border="1">
                <th>Account No</th>
                <th>Account holder name</th>
                <th>Balance</th>
                <c:forEach var="account" items="${accountList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${account.accountHolderName}</td>
                    <td>${account.balance}</td>
                </tr>
                </c:forEach>             
            </table>
        </div>
        
    </body>
</html>