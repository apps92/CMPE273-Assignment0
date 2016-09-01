function displaylevels()
{

var years = document.getElementsByName("level");

if(years[0].checked)
{
alert("undergrad");
document.getElementById("Undergraduate").style.display = "block";

}

else if(years[1].checked)
{
alert("grad");
document.getElementById("Graduate").style.display = "block";
}
}

function calcundergrad()
{
alert("inside undergrad");
var selectedyear = document.getElementById("yearofundergrad").value;
//alert(selectedyear);

switch(selectedyear)
{

case "junior" : alert(selectedyear); break;
case "sophomore" : alert(selectedyear); break;
case "freshman" : alert(selectedyear); break;
case "senior" : alert(selectedyear); break;

}
}

function calcgrad()
{

var selectedyear = document.getElementById("yearofgrad").value;

if(selectedyear=="first")
{
alert("first graduate year");
}
else if(selectedyear=="second")
{
alert("second graduate year");
}
else
alert("invalid grad year");
}

