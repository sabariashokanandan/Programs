// Below function Executes on click of login button.
function validate(){
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;

if ( username == "sabari" && password == "123"){
window.location = "main.jsp"; // Redirecting to other page.
return false;
}
else
{
alert ("Incorrect username and password");
return false;
}

if ( username == "arumugam" && password == "456"){
window.location = "main.html"; // Redirecting to other page.
return false;
}
else
{
alert ("Incorrect username and password");
return false;
}

if ( username == "murugan" && password == "789"){
window.location = "main.html"; // Redirecting to other page.
return false;
}
else
{
alert ("Incorrect username and password");
return false;
}

}