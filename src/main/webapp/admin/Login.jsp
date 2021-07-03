<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Đăng nhập</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/Bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/font/css/all.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="/Js/JQIndex.js"></script>
    <style>
        /* .container {
            margin-top: 50px;
            width: 400px;
            padding: 20px;
        } */
        
        body {
            margin: 0;
            padding: 0;
            background: url(img/back.jpg);
            background-size: cover;
            background-position: center;
            font-family: sans-serif;
        }
        
        .loginbox {
            width: 390px;
            height: 450px;
            background: #000;
            color: #fff;
            top: 50%;
            left: 50%;
            position: absolute;
            transform: translate(-50%, -50%);
            box-sizing: border-box;
            padding: 70px 30px;
            border-radius:10px;
        }
        
        .avatar {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            position: absolute;
            top: -50px;
            left: calc(50% - 50px);
        }
        
        h1 {
            margin: 0;
            padding: 0 0 20px;
            text-align: center;
            font-size: 22px;
        }
        
        .loginbox p {
            margin: 0;
            padding: 0;
            font-weight: bold;
        }
        
        .loginbox input {
            width: 100%;
            margin-bottom: 20px;
        }
        
        .loginbox input[type="text"],
        input[type="password"] {
            border: none;
            border-bottom: 1px solid #fff;
            background: transparent;
            outline: none;
            height: 40px;
            color: #fff;
            font-size: 16px;
        }
        
        .loginbox input[type="submit"] {
            border: none;
            outline: none;
            height: 40px;
            background: #fb2525;
            color: #fff;
            font-size: 18px;
            border-radius: 20px;
        }
        
        .loginbox input[type="submit"]:hover {
            cursor: pointer;
            background: #ffc107;
            color: #000;
        }
    </style>
</head>
<body>



<div class="loginbox">
        <img src="img/dangnhap.png" class="avatar">
        <h1>Đăng nhập</h1>
        <p style="color: red;">${err}</p>
        <form method="POST" action="${pageContext.request.contextPath}/loginAdmin">
        <table border="0">
            <p>Tên đăng nhập</p>
            <input type="text" name="username" value="${user.username}" />
            <p>Mật khẩu</p>
            <input type="password" name="password"  value="${user.password}"/>
            <input type="submit" value= "Đăng nhập" />     
            <br>
            <a href="#">
                <p>Quên mật khẩu? </p>
            </a>
             </table>
        </form>    
       
    </div>
</body>
</html>