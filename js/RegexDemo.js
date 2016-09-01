
var students = [];
var i=0;
function register(){
alert("inside");
var emailt = document.getElementById("email").value;
var regemail = new RegExp("[a-zA-Z\.]*(@sjsu.edu)$");
var emailresult=regemail.test(emailt);
alert("regex"+emailresult);
var idt= document.getElementById("sid").value;
var pass = document.getElementById('password').value;
var passcon = document.getElementById('confirm').value;
students.push({'email':emailt,'sid':idt,'password':pass,'confirmpass':passcon});
alert(students[i].email+students[i].sid+students[i].confirmpass);
document.write(students[i].email);
}
