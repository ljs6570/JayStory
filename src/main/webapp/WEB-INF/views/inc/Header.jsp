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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script src="resources/js/summernote/summernote-lite.js"></script>
    <script src="resources/js/summernote/lang/summernote-ko-KR.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.css" rel="stylesheet">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/inc.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/sign.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board.css"/>
    <title>Title</title>
    </head>

    <body>
    <header>
        <nav class="navbar navbar-inverse">
          <div class="container-fluid">
            <div class="navbar-header">
              <a class="navbar-brand" href="home">JayStory</a>
            </div>

          <c:choose>
              <c:when test="${login.user_no != null}" >
                  <ul class="nav navbar-nav navbar-right">
                       <li><a href="#">${login.user_no}</a></li>
                       <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                  </ul>
              </c:when>
              <c:otherwise>
                <ul class="nav navbar-nav navbar-right">
                  <li><a href="signAgree"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                  <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </ul>
              </c:otherwise>
          </c:choose>
          </div>
        </nav>
    </header>
