<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../views/inc/Header.jsp"%>
<main id="main">

<div id="main_write">
    <form action="write" method="post">
        <fieldset>
         <div>
            <label for="board_title">제목</label>
            <input type="text" id="board_title" name="board_title" placeholder="제목을 입력하세요" class="form-control">
         </div>
            <label>내용</label>
         <div id="write_content">
            <textarea id="summernote" name="board_content"></textarea>
         </div>
         <div>
            <input type="hidden" id="user_no" name="user_no" value="">
         </div>
         <div class="text-right">
            <input type="submit" value="등록하기" class="btn main_btn">
         </div>
        </fieldset>
    </form>
</div>
   <script>
    $(document).ready(function() {

        $('#summernote').summernote({
              height: 400,
              focus: true,
              lang: "ko-KR",
              resize:false,
              disableResizeImage: true
        });
        $('.note-statusbar').hide();
    });
    </script>
    <script>
    $(function(){
         $("#user_no").val(parseInt("${login.user_no}"));
        });
    </script>
</main>
<%@ include file="../views/inc/Footer.jsp"%>