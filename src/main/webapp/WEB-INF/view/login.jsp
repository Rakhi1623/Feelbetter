<!DOCTYPE html>
<html>

<head>
    <title>Save Customer</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
     <script>
            function validateForm() {
                var username = document.forms["loginForm"]["username"].value;
                var password = document.forms["loginForm"]["password"].value;

                if (username === "" || password === "") {
                    alert("Username and password must not be empty");
                    return false;
                }
                return true;
            }
        </script>
</head>

<body>
    <div class='bold-line'></div>
    <div class='container'>
        <div class='window'>
            <div class='overlay'></div>
            <div class='content'>
                <div class='welcome'>Welcome..!</div>
                  <c:if test="${not empty errorMessage}">
                                    <div class="alert alert-danger">
                                        <c:out value="${errorMessage}" />
                                    </div>
                                </c:if>

                <form action="loginsubmit" method="POST">

                    <div class='input-fields'>

                  </c:if>
                        <input type='text' placeholder='Username' class='input-line full-width' name="username">
                        <input type='password' placeholder='Password' class='input-line full-width' name="password">
                    </div>
                    <p>
                       <a href="signup">Don't Have An Account? SignUp</a>
                    </p>
                    <button type="submit" class='ghost-round full-width'>Sign In</button>

                </form>


            </div>
        </div>
    </div>
</body>

</html>
