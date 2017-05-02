<?php
//koneksi ke database
	$servername = "localhost";
	$username	= "root";
	$password	= "";
	$database	= "lomba";

	$conn = mysqli_connect($servername, $username, $password, $database);

	if(!$conn){
		die("Connection failed :".mysqli_connect_error());
	}

//fungsi untuk mengkonversi size file
function formatBytes($bytes, $precision = 2) { 
    $units = array('B', 'KB', 'MB', 'GB', 'TB'); 

    $bytes = max($bytes, 0); 
    $pow = floor(($bytes ? log($bytes) : 0) / log(1024)); 
    $pow = min($pow, count($units) - 1); 

    $bytes /= pow(1024, $pow); 

    return round($bytes, $precision) . ' ' . $units[$pow]; 
} 
?>