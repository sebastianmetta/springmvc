<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div>
	<h2>Spring Mvc example.</h2>
	<ol class="user-list">
		<c:forEach var="user" items="${users}">
			<s:url value="/users/{userName}" var="user_url">
				<s:param name="username" value="${user.username}" />
			</s:url>
		</c:forEach>
	</ol>
</div>