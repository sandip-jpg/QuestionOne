<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="components/header.jsp"%>

<c:if test="${first_name==null}">
    <c:redirect url="/login" />
</c:if>
<div>
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

                <h2>Your name is </h2>
                <div class="login name-display">
                    <p class="display_name"><c:out value="${first_name}"/></p>
                    <p>&nbsp</p>
                    <p class="display_name"><c:out value="${last_name}"/></p>
                </div>

                <a href="${pageContext.request.contextPath}/logout" class="button aButton" >
                    <span class="button__text">Log Out</span>
                    <i class="button__icon fas fa-chevron-right"></i>
                </a>
            </div>
        </div>
    </div>
</div>
<%@include file="/components/footer.jsp"%>