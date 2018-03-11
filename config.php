<?php
$servername = "www.franklinpracticum.com";
$username = "frank73_s18grav2";
$password = "Grave2.18";
$dbname = "frank73_s18grav2";

try {
    	$conn = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    	$conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    }
catch(PDOException $e)
    {
    	die("Cannot connect to the database because: " .mysql_error())
    }
?>