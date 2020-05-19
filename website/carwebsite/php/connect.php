<?php

    $username = filter_input(INPUT_POST,'username');
    $password = filter_input(INPUT_POST,'password');

    if(!empty($username)){
        if(!empty($password)){
            $dbServerName ="localhost";
            $dbusername ="root";
            $dbPassword="cenk";
            $dbName = "jake_car_website";

            $con = mysqli_connect($dbServerName,$dbusername,$dbPassword,$dbName);
            if(mysqli_connect_error()){
                die('Connect Error ('. mysqli_connect_errno());

            }
        } else{
            echo "empty Password";
        }

    } else{
        echo "Empty username";
    }


?>