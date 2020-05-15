const username = document.getElementById('registerUsername');
const password = document.getElementById('registerPassword');
const confirmPassword = document.getElementById('confirmPassword');
const form = document.getElementById('registration');


form.addEventListener('submit',(e) =>{
    var gender;
    if(username.value =='' || username.value  == null || password.value == ''|| password.value == null){
        alert('Please Complete All Fields to Register');
        e.preventDefault();

    }

    if(confirmPassword.value != password.value){
        e.preventDefault();
        alert('Passwords are not matching');
    }

    if(document.getElementById("m").checked == true){
        gender="male";
    } else if(document.getElementById("f").checked == true){
        gender = "female";
    }

})



