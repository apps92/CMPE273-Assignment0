function calculateTuition(form,name)
{
//alert("inside function");

  var courseoptions = form.elements[name];
    var val; //variable to store number of courses chosen
    // Using a loop to check which of the option was selected and assign it to val
    for (var i=0, len=courseoptions.length; i<len; i++) {
   // alert("inside loop");
        if ( courseoptions[i].checked ) { // Is the option checked?
            val = courseoptions[i].value; // if yes, the assign it to val
            break; // come out of the loop
        }
    }
    
    if(val==3 || val == 4 ) //if first option
    {
    alert("You need to pay $"+ 300*val + " for " + val+ " courses");
    }
  //  else if(val==4) //if second option
   // {
   // alert("you need to pay $1200 (4x300) for 4 courses");
  //  }
    else // this means user didn't select either of the options
        alert("please choose either 3 or 4 course option for the semester");

}