<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%@ include file="../views/inc/Header.jsp"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


    <main id="main">

    <c:choose>
        <c:when test="${login.user_no !=null}">

        </c:when>
        <c:otherwise>
         <div id="main_start">
            <p>JayStory 시작하기<p>
        </div>
        <div class="text-center">
            <a href="login" class="btn main_btn">글쓰기</a>
        </div>
        </c:otherwise>
    </c:choose>

    </main>
    <%@ include file="../views/inc/Footer.jsp"%>
