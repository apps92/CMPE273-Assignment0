function generateTransactionID(){

var count = 100;

var student = {'name':Name.value,'StudentId':sid.value,'department':department.value};
var transactionid = 0;
//if(localStorage.getItem("scount"))
{
//count = localStorage.getItem("scount");
 transactionid= student.department+student.StudentId+count;
count++;
//localStorage.setItem("scount", count);
}
//else
{
transactionid= student.department+student.StudentId+count;
count++;
//localStorage.setItem("scount", count);
}

alert(transactionid);
}