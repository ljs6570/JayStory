<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../views/inc/Header.jsp"%>
<main id="main">
<div>
    <form>
        <fieldset>
         <div class="form-group">
            <label for="board_title">제목</label>
            <input type="text" id="board_title" name="board_title" placeholder="제목을 입력하세요">
         </div>
         <div class="form-group">
            <label for="board_content">내용</label>
            <textarea id="summernote" name="board_content"></textarea>
         </div>
         <div class="form-group">
            <label></label>
            <input>
         </div>
         <div>
            <input type="submit" value="등록하기" class="btn main_btn">
         </div>
        </fieldset>
    </form>
</div>
</main>
<%@ include file="../views/inc/Footer.jsp"%>