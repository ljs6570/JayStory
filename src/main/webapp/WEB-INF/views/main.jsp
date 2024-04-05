<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%@ include file="../views/inc/Header.jsp"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


    <main id="main">
<div>
    <c:choose>
        <c:when test="${login.user_no !=null}">

          <div id="main_login">
          <div class="text-left">
                    <a href="write" class="btn main_btn">글쓰기</a>
          </div>
            <table class="table table-bordered">
            <thead>
                <tr>
                    <th scope="col">제목</th>
                    <th scope="col">날짜</th>
                    <th scope="col">조회수</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="list" items="${list}" varStatus="status">
                <tr>
                    <td><a href="viewDetail?board_no="+${list.board_no}>${list.board_title}<a></td>
                    <td>${list.board_date}</td>
                    <td>${list.board_hit}</td>
                </tr>
                </c:forEach>
            </tbody>
            </table>
          </div>
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
</div>
    </main>

    <%@ include file="../views/inc/Footer.jsp"%>
