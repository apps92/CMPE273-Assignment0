function showBooks(){

var i;

var mathselectedtags = document.getElementsByName("Math");
var mathselected = "";

alert(mathselectedtags.length);



for(i=0;i<mathselectedtags.length;i++)
{
if(mathselectedtags[i].checked)
{

mathselected=mathselected+" "+mathselectedtags[i].value;
}

}

alert(mathselected);

var computerselectedtags = document.getElementsByName("Computer");
var computerselected = "";

alert(computerselectedtags.length);



for(i=0;i<computerselectedtags.length;i++)
{
if(computerselectedtags[i].checked)
{

computerselected=computerselected+" "+computerselectedtags[i].value;
}

}

alert(computerselected);


var engineeringselectedtags = document.getElementsByName("Engineering");
var engineeringselected = "";

alert(engineeringselectedtags.length);



for(i=0;i<engineeringselectedtags.length;i++)
{
if(engineeringselectedtags[i].checked)
{

engineeringselected=engineeringselected+" "+engineeringselectedtags[i].value;
}

}

alert(engineeringselected);


document.getElementById("final").innerHTML = mathselected+" "+computerselected+" "+engineeringselected;
	}
