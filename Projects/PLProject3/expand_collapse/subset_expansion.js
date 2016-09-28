

$(document).ready(function(){
    $("#a1").click(function(){
        $("#div1").toggleClass("hide");
        var isHidden = document.getElementById("div1").className;
        if (isHidden == "hide"){
         document.getElementById("a1").innerHTML= "Show more";
        }
        else {
         document.getElementById("a1").innerHTML= "Show less";
        }
    });
    $("#a2").click(function(){
        $("#div2").toggleClass("hide");
        isHidden = document.getElementById("div2").className;
        if (isHidden == "hide"){
         document.getElementById("a2").innerHTML= "Show more";
        }
        else {
         document.getElementById("a2").innerHTML= "Show less";
        }
    });
    $("#a3").click(function(){
        $("#div3").toggleClass("hide");
        isHidden = document.getElementById("div3").className;
        if (isHidden == "hide"){
         document.getElementById("a3").innerHTML= "Show more";
        }
        else {
         document.getElementById("a3").innerHTML= "Show less";
        }
    });
    
});