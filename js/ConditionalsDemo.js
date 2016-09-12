function displaylevels()
{
var years = document.getElementsByName("level");
if(years[0].checked)
{
document.getElementById("Undergraduate").style.display = "block";
document.getElementById("Graduate").style.display = "none";
}


else if(years[1].checked)
{
document.getElementById("Graduate").style.display = "block";
document.getElementById("Undergraduate").style.display = "none";
}
}

function calcundergrad()
{
var selectedyear = document.getElementById("yearofundergrad").value;
var premium = 0;
var status = document.getElementsByName("Status");

if(status[0].checked)
	{
		 premium = 300;
	}

switch(selectedyear)
{

case "junior" : alert(selectedyear+" with premium :" +premium); break;
case "sophomore" : alert(selectedyear+" with premium :" +premium); break;
case "freshman" : alert(selectedyear+" with premium :" +premium); break;
case "senior" : alert(selectedyear+" with premium :" +premium); break;

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

