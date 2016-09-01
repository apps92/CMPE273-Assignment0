function myfunction (){

try{

var age = document.getElementById("age").value;
if(age<18)
throw ("Age is less than 18");

}

catch (err)
{

alert(err);
}

finally
{
alert("exiting program");

}
}