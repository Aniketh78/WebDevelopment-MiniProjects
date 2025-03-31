function accept(){
    let first=document.getElementById('first').value;
    let pass=document.getElementById('pass').value;
    let no=document.getElementById*('no').value;
    if(first.length<6){
        alert("Name Should not Less Than 6 Character");
    }
    if(pass.length<6){
        alert("Password Should not Less Than 6 Character");
    }
    if(no.length<6){
        alert("Number Should not Less Than 10 Digits");
    }
}