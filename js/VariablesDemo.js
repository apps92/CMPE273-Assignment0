function calculateTransport(){

alert("inside function");

var transitCost = 0, parkingCost = 0, totalCost=0;

transitOptions = document.getElementsByClassName('modeoftransport');
for(i=0;i<transitOptions.length;i++)
{
if(transitOptions[i].checked)
{
transitCost+=5;
}

}

parkingOptions = document.getElementsByClassName('parkingtype');
for(i=0;i<parkingOptions.length;i++)
{
if(parkingOptions[i].checked)
{
parkingCost+=10;
}

}

totalCost = transitCost + parkingCost;
alert("total cost is "+totalCost + "-(parking - " +parkingCost+ " and Transit - " + transitCost+" )");


}