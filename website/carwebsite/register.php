<?php 

$registerUsername = $_POST['registerUsername'];
$registerPassword = $_POST['registerPassword'];
$sex = $_POST['sex'];

if(!empty($registerUsername) || !empty($registerPassword) || !empty($sex)){
    $host = "localhost";
    $dbUsername = "root";
    $dbPassword = "cenk";
    $dbName ="jake_car_website";

    //Create Connection
    $conn = new mysqli($host, $dbUsername,$dbPassword,$dbName);
    if(mysqli_connect_error()){
        die('Connect Error('. mysqli_connect_errno().')'. mysqli_connect_error());
    } else{
        $SELECT = "SELECT username From users Where username = ? Limit 1";
        $INSERT = "INSERT Into users (username, password, gender) values(?,?,?)";

        $stmt = $conn->prepare($SELECT);
        $stmt->bind_param("s",$registerUsername);
        $stmt->execute();
        $stmt->bind_result($registerUsername);
        $stmt->store_result();
        $rnum=$stmt->num_rows;
        
        if($rnum==0){
            $stmt->close();
            $stmt=$conn->prepare($INSERT);
            $stmt->bind_param("sss",$registerUsername,$registerPassword, $sex);
            $stmt->execute();
          echo "New Records inserted Sucessfully";
          header('Location: http://' . $_SERVER['HTTP_HOST']. '/carwebsite/signup.html');
            exit;    
        } else{
            echo"User already exists";

        }
        $stmt->close();
        $conn->close();
    }
}

?>