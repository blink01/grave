<?php 
include 'config.php';

     // Check whether username or password is set from android	
     if(isset($_POST['user_name']) && isset($_POST['password']))
     {
      // Innitialize Variable
      $result='';
        $username = $_POST['user_name'];
          $password = $_POST['password'];
      
      // Query database for row exist or not
          $sql = 'SELECT * FROM tbl_login WHERE  userName = :user_name AND password = :password;';
          $stmt = $conn->prepare($sql);
          $stmt->bindParam(':user_name', $username, PDO::PARAM_STR);
          $stmt->bindParam(':password', $password, PDO::PARAM_STR);
          $stmt->execute();
          if($stmt->rowCount())
          {
      $result="true";
          }  
          elseif(!$stmt->rowCount())
          {
          $result="false";
          }
      
      // send result back to android
         echo $result;
    }
?>