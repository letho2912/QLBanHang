<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng kí</title>
    <link rel="stylesheet" href="/Boostrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/font/css/all.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="/Js/JQIndex.js"></script>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: url(img/back.jpg);
            background-size: cover;
            background-position: center;
            font-family: sans-serif;
           
        }
        
        .loginbox {
         border-radius: 10px;
            width: 410px;
            height: 550px;
            background: #000;
            color: #fff;
            top: 50%;
            left: 50%;
            position: absolute;
            transform: translate(-50%, -50%);
            box-sizing: border-box;
            padding: 70px 30px;
        }
        
        h1 {
            margin-bottom: 4px;
            padding: 0 0 0px;
            text-align: center;
            font-size: 30px;
        }
        
        .loginbox p {
            margin: 0;
            padding: 0;
            margin-top:13px;
            font-weight: bold;
        }
        
        .avatar {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            position: absolute;
            top: -50px;
            left: calc(50% - 50px);
        }
        
        .loginbox input[type="text"],
        input[type="password"] {
            border: none;
            border-bottom: 1px solid #fff;
            background: transparent;
            outline: none;
            height: 28px;
            color: #fff;
            font-size: 16px;
        }
        
        .loginbox input[type="submit"] {
            border: none;
            outline: none;
            height: 35px;
            background: #fb2525;
            color: #fff;
            font-size: 18px;
            border-radius: 20px;
            width: 100%;
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
        <img class="avatar" src="img/hinh.jpg">
        
        <p style="color: red;">${errou}</p>
        <form method="POST" action="${pageContext.request.contextPath}/register">
        	<p>Họ và tên</p>
            <input type="text" name="fullname" value="${register.full_name}"   size="38" required="required"/>              
            <p>Tên đăng nhập</p>
            <input type="text" name="username" value="${register.user_name}"   size="38" required="required"/>
            <p>Địa chỉ e-mail</p>
            <input type="text" name="email" value="${register.Email}"   size="38" required="required"/>
            <p>Mật khẩu</p>
            <input type="password" name="password" value="${register.pass_word }"  size="38" required="required"/>
            <p>Số điện thoại</p>
            <input type="text" name="phone"  value="${register.Phone }" size="38" required="required"/>
            <br>
            <br>
            <input id="checkbox" name="" required="" type="checkbox"/> Đồng ý với điều khoản của chúng tôi.
            <br>
            <br>
            <input type="submit" value="Đăng kí"/>
            <br>
            <br>
            <p>Bạn đã có tài khoản rồi? <a href="login">Đăng nhập</a></p>
        </form>
    </div>
</body>

</html>