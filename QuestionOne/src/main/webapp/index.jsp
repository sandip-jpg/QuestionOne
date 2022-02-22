<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="components/header.jsp"%>

<div><c:if test="${first_name!=null}">
    <c:redirect url="/dashboard" />
</c:if>
    <div class="main">
        <div class="wrapper">
            <div class="content">
                <div class="buttons">
                    <div class="close">
                    </div>
                    <div class="minimize">
                    </div>
                    <div class="zoom">
                    </div>
                </div>

                <h2>Login Form</h2>
                    <form action="login" method="POST" class="login">
                        <label ><b>Username</b></label>
                        <input type="text" placeholder="Enter Username" name="username" required>

                        <label ><b>Password</b></label>
                        <input type="password" placeholder="Enter Password" name="password" required>

                        <button type="submit">Login</button>

                    </form>
                 <br>
                <span class="psw">Whats my Name ?</span>

                <span class="<%=request.getAttribute("error-message") !=null ? "error-msg" : ""%>">
                    <%=request.getAttribute("error-message") != null ? request.getAttribute("error-message") : ""%>
                </span>
            </div>
        </div>
    </div>
</div>
<%@include file="components/footer.jsp"%>