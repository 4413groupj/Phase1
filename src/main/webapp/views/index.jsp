<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to user Registration</title>
</head>
<body style="background-color:powderblue;" >
<h1 style=" padding-top: 20px;
  padding-right: 20px;
  padding-bottom: 10px;
  padding-left: 20px;">Sign-In or Sign-Up</h1>
  
		Welcome to User Page. This Page is made for admin purposes only and will be moved to "/admin"<br>
		
		<form action="addUser" method="post" >
		
			First Name : <input type="text" name="userFirstName"><br>	
			Second Name: <input type="text" name="userSecondName"><br>
			UserID: <input type="text" name="userID"><br>
			Email Address: <input type="text" name="emailAddress"><br>

			<input type="submit">	
		</form><hr>
		
		<h1 style=" padding-top: 20px;
  padding-right: 20px;
  padding-bottom: 10px;
  padding-left: 20px;">Search For Users</h1>
		
		
			<form action="getUsers" method="get" >
			Show All Users:<br>
			<input type="submit">	
		</form><hr>
		
			<form action="getUser" method="get" >
			Show Single User:<br>
			UserID: <input type="text" name="userID"><br>
			<input type="submit">	
		</form><hr>
		
		<form action="getUserByUserFirstName" method="get" >
			SearchUser/s BY Name :<br>
			Input User's First Name: <input type="text" name="userFirstName"><br>
			<input type="submit">	
		</form><hr>
		
		<form action="getUserByUserSecondName" method="get" >
			SearchUser/s BY Name :<br>
			Input User's Second Name: <input type="text" name="userSecondName"><br>
			<input type="submit">	
		</form><hr>
		
		
		
		
		
</body>
</html>