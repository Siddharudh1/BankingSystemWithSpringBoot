<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addCustomer">
            <div class="user-details">
                <div class="input-box">
                    <span class="details">firstName </span>
                    <input type = "text" placeholder="Enter your fname" id="fname" required >
                    <li>Enter alphabet only</li>
                </div>
                <div class="input-box">
                    <span class="details">lastName</span>
                    <input type = "text" placeholder="Enter your lname" id ="lname" required>
                    <li>Enter alphabet only</li>
                </div>
                <div class="input-box">
                    <span class="details">age </span>
                    <input type = "number" placeholder="Enter your age" id="age" required>
                    <li>Enter valid age</li>
                </div>
                <div class="input-box">
                    <span class="details">address</span>
                    <input type="text" placeholder="Enter your address" id="address" required>
                </div>
                <div class="input-box">
                    <span class="details">mobileNumber</span>
                    <input type = "number" placeholder="Enter your mobileNumber" id="mob" required>
                </div>
                <div class="input-box">
                    <span class="details">emailId </span>
                    <input type = "email" placeholder="Enter your emailid" id="email"required>
                    <li>Enter valid email</li>
                </div>
                <div class="input-box">
                    <span class="details">dateofBirth</span>
                    <input type = "date" placeholder="Enter your dateofBirth" id="dob" required>
                </div>
            </div>
            <div class="button">
                <input type="submit" value="submit">
            </div>
        </form>
</body>
</html>