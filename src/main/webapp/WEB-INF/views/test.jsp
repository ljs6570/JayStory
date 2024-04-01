<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="resources/js/summernote/summernote-lite.js"></script>
<script src="resources/js/summernote/lang/summernote-ko-KR.js"></script>

<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.css" rel="stylesheet">
<title>TEST</title>
</head>
<body>
    <h1>test</h1>
    <div>
      <form method="post">
        <textarea id="summernote" name="editordata"></textarea>
      </form>
    </div>
</body>
    <script>
$(document).ready(function() {

            $('#summernote').summernote('redo');
            $('#summernote').summernote('undo');
            $('#summernote').summernote({
                  height: 500,
                  minHeight: null,
                  maxHeight: null,
                  focus: true,
                  lang: "ko-KR",
                  placeholder: '최대 2048자까지 쓸 수 있습니다',
                toolbar: [
               			    ['fontname', ['fontname']],
               			    ['fontsize', ['fontsize']],
               			    ['style', ['bold', 'italic', 'underline','strikethrough', 'clear']],
               			    ['color', ['forecolor','color']],
               			    ['table', ['table']],
               			    ['para', ['ul', 'ol', 'paragraph']],
               			    ['height', ['height']],
               			    ['insert',['picture','link','video']],
               			    ['view', ['fullscreen', 'help']]
               			  ],
               			fontNames: ['Arial', 'Arial Black', 'Comic Sans MS', 'Courier New','맑은 고딕','궁서','굴림체','굴림','돋움체','바탕체'],
               			fontSizes: ['8','9','10','11','12','14','16','18','20','22','24','28','30','36','50','72']
            });

        });
    </script>
</html>