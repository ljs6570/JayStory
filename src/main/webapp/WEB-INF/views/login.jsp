<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../views/inc/Header.jsp"%>
<main id="main">
<div id="main_login">
    <form action="login" method="post" id="login">
    <fieldset>
        <div class="form-group">
           <input type="text" id="userId" name="userEmail" placeholder="아이디를 입력하세요" >
        </div>
        <div class="form-group">
            <input type="password" id="userpw" name="userPass" placeholder="비밀번호를 입력하세요">
       </div>
       <div class="form-group">
       <input type="submit" class="btn login_btn" value="로그인">
       </div>
    <div class="form-group find">
        <a href="findId">아이디 찾기</a>
        <p>|</p>
        <a href="findPass">비밀번호 찾기</a>
    </div>
    </fieldset>
    </form>
    <div>
    <a href="#" class="btn login_btn">네이버</a>
    </div>
    <div>
    <a href="#" class="btn login_btn">카카오</a>
    </div>

</div>

</main>
<%@ include file="../views/inc/Footer.jsp"%>