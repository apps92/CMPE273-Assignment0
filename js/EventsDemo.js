function refreshClub()
{

var choice = document.getElementById("hobby").value;
if(choice=="sports")
document.getElementById("innerHTMLtxt").textContent = "Baseball Team, Basketball Team or Softball Softball";
else if(choice=="MDF")
document.getElementById("innerHTMLtxt").textContent = "Sparta Music club, Contemporary Dance Group or canvas creators";
else if(choice=="MathScience")
document.getElementById("innerHTMLtxt").textContent = "Math club, ScienceGeeks";
else if(choice=="other")
document.getElementById("innerHTMLtxt").textContent = "Look out for various Student clubs in the foyer";
}