<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Login and register page</title>
    <link rel="stylesheet" href= "simple.css">
<body>
    <h2 style="text-align: center; margin-top: 5%; margin-bottom: -6%; color: whitesmoke;"> Welcome to Indian Railways </h2>
    <div class= "login-page">
        <div class= "form">

            <form class= "login-form" action="Traindetails.html" onsubmit="MyFunction()">
                <input type = "text" class="form-control" placeholder="username" value="${user.userName}" required/>
                <input type = "password" class="form-control" placeholder="password" value="${user.password}" required/>
                <input type= "Submit" class="btn btn-primary" value="Login" id="bru">
            </form>

            <form class="login-form" action = "RegistrationPage.html">
                <button class="btn btn-success">Register</button>
            </form>
        </div>
    </div>

<script>
    $('.text a').click(function(){
        $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
    });
</script>
</body>
</html>