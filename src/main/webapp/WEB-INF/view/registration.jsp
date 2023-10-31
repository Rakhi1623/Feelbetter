<!DOCTYPE html>
<html>

<head>
    <title>Save Customer</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/css/signup.css">
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/css/button.css">

</head>

<body>
    <div class="container">
        <div class="title">Registration</div>
        <form action="registrationsubmitt" method="POST">
            <div class="user__details">
                <div class="input__box">
                    <span class="details">First Name</span>
                    <input type="text" name="firstName" placeholder="E.g: John" required>
                </div>
                <div class="input__box">
                    <span class="details">Last Name</span>
                    <input type="text" name="lastName" placeholder="E.g: Smith" required>
                </div>
                <div class="input__box">
                    <span class="details">Age</span>
                    <input type="text" name="age" placeholder="E.g: 30" required>
                </div>

                <div class="input__box">
                    <span class="details">Username</span>
                    <input type="text" name="username" placeholder="johnWC98" required>
                </div>
                <div class="input__box">
                    <span class="details">Email</span>
                    <input type="email" name="email" placeholder="johnsmith@hotmail.com" required>
                </div>
                <div class="input__box">
                    <span class="details">Phone Number</span>
                    <input type="tel" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" name="phoneNo" placeholder="0123456789"
                        required>
                </div>
                <div class="input__box">
                    <span class="details">Password</span>
                    <input type="password" name="password" placeholder="********" required>
                </div>
                <div class="input__box">
                    <span class="details">Confirm Password</span>
                    <input type="password" placeholder="********" required>
                </div>

            </div>
            <div class="gender__details">
                <input type="radio" name="gender" value="Male" id="dot-1">
                <input type="radio" name="gender" value="Female" id="dot-2">
                <input type="radio" name="gender" value="Prefer not to say" id="dot-3">

                <span class="gender__title">Gender</span>
                <div class="category">
                    <label for="dot-1">
                        <span class="dot one"></span>
                        <span>Male</span>
                    </label>
                    <label for="dot-2">
                        <span class="dot two"></span>
                        <span>Female</span>
                    </label>
                    <label for="dot-3">
                        <span class="dot three"></span>
                        <span>Prefer not to say</span>
                    </label>
                </div>

<div class="text1">
                  <input type="hidden" name="name" value="User" >



</div>
            </div>
            <div class="button">
                <input type="submit" value="Register">
            </div>
        </form>
    </div>
</body>

</html>
