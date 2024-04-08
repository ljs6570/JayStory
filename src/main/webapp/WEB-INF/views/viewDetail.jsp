<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../views/inc/Header.jsp"%>
<main id="main">
<div>
    <div class="form-group">
        <label for="board_title">
        <input type="text" id="board_title" value="${select.board_title}" readonly>
    </div>
    <div class="form-group">
        <label for="board_content">
        <textarea>${select.board_content}<textarea>
    </div>
    <div>
        <a href="history.goBack(-1)">취소</a>
        <a href="viewUpdate?board_no=${select.board_no}">수정</a>
        <a href="viewDelete?board_no=${select.board_no}">삭제</a>
    </div>

</div>
</main>
<%@ include file="../views/inc/Footer.jsp"%>