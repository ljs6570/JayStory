<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../views/inc/Header.jsp"%>
<main id="main">
<div>
    <form>
        <fieldset>
         <div class="form-group">
            <label for="board_title">제목</label>
            <input type="text" id="board_title" name="board_title" value="">
         </div>
         <div class="form-group">
            <label for="user_pw">비밀번호</label>
            <input type="password" id="user_pw" name="user_pw" placeholder="비밀번호를 입력하세요">
         </div>
         <div>
            <input type="submit" value="삭제하기" class="btn main_btn">
         </div>
        </fieldset>
    </form>
</div>
</main>
<%@ include file="../views/inc/Footer.jsp"%>