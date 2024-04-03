<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../views/inc/Header.jsp"%>
<main id="main">
<div id="main_sign">
<form action="signUp" method="post">
<fieldset>
    <div class="form-group">
        <label for="user_id">아이디</label>
        <input type="email" id="user_id" name="user_id" placeholder="이메일을 입력해주세요">
    </div>
    <div class="form-group">
        <label for="user_pw">비밀번호</label>
        <input type="password" id="user_pw" name="user_pw" placeholder="비밀번호를 입력해주세요">
    </div>
    <div class="form-group">
        <label for="checkPw">비밀번호 확인</label>
        <input type="password" id="checkPw" name="checkPw" placeholder="비밀번호를 다시 입력해주세요">
    </div>
    <div class="form-group">
        <label for="user_name">이름</label>
        <input type="text" id="user_name" name="user_name" placeholder="이름을 입력해주세요">
    </div>
    <div>
        <input type="submit" value="가입하기" name="main_btn">
    </div>
</fieldset>
</form>
</div>






</main>
<%@ include file="../views/inc/Footer.jsp"%>