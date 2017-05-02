<!DOCTYPE html>
<html>
<head>
	<title>Simple Upload dan Download File</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>


	<div id="container">
    	<div id="header">
    		<h1>Lomba Java IT Fair 8</h1>
        	<span>Sprint Java Programming</span>
        </div>
        
        <div id="menu">
        	<a href="index.php">Home</a>
            <a href="upload.php" class="active">Upload</a>
        </div>

        
        
        <div id="content">
        	<h2>Upload</h2>


        	<?php

			include('config.php');
			$dmid;
			if (isset($_POST['upload'])) { // If the id post variable is set
    			$dmid = $_POST['upload'];
			} else { // If the id post variable is not set
    			$dmid = null;
			}
			if($dmid){
				$allowed_ext	= array('java');
				$file_name		= $_FILES['file']['name'];
				$value 			= explode('.', $file_name);
				$file_ext		= strtolower(end($value));
				$file_size		= $_FILES['file']['size'];
				$file_tmp		= $_FILES['file']['tmp_name'];
				
				$nama			= $_POST['nama'];
				$tgl			= date("Y-m-d");
				
				if(in_array($file_ext, $allowed_ext) === true){
					if($file_size < 1044070){
						$lokasi = 'files/'.$nama.'.'.$file_ext;
						move_uploaded_file($file_tmp, $lokasi);
						$in = mysql_query($conn, "INSERT INTO download VALUES(NULL, now(), '$nama', '$file_ext', '$file_size', '$lokasi')");
						if($in){
							echo '<div class="ok">SUCCESS: File berhasil di Upload!</div>';
						}else{
							echo '<div class="error">ERROR: Gagal upload file!</div>';
						}
					}else{
						echo '<div class="error">ERROR: Besar ukuran file (file size) maksimal 1 Mb!</div>';
					}
				}else{
					echo '<div class="error">ERROR: Ekstensi file tidak di izinkan!</div>';
				}
			}

			?>

        	
            <p>
            <form action="" method="post" enctype="multipart/form-data">
            <table width="100%" align="center" border="0" bgcolor="#eee" cellpadding="2" cellspacing="0">
            	<tr>
                	<td width="40%" align="right"><b>Nama File</b></td><td><b>:</b></td><td><input type="text" name="nama" size="40" required /></td>
                </tr>
                <tr>
                	<td width="40%" align="right"><b>Pilih File</b></td><td><b>:</b></td><td><input type="file" name="file" required /></td>
                </tr>
                <tr>
                	<td>&nbsp;</td><td>&nbsp;</td><td><input type="submit" name="upload" value="Upload" /></td>
                </tr>
            </table>
            </form>
            </p>  
            
        </div>
    </div>

</body>
</html>