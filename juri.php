<!DOCTYPE html>
<html>
            <!--- Head Pada Program Dowload Juri -->
<head>
    <title>Website Juri Java Programming</title>
    <link rel="stylesheet" type="text/css" href="style.css">
        <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="description" content="Metro, a sleek, intuitive, and powerful framework for faster and easier web development for Windows Metro Style.">
    <meta name="keywords" content="HTML, CSS, JS, JavaScript, framework, metro, front-end, frontend, web development">
    <meta name="author" content="Sergey Pimenov and Metro UI CSS contributors">

    <link rel='shortcut icon' type='image/x-icon' href='favicon.ico' />
    <title></title>

    <link href="css/metro.css" rel="stylesheet">
    <link href="css/metro-icons.css" rel="stylesheet">
    <link href="css/metro-responsive.css" rel="stylesheet">
    <link href="css/metro-schemes.css" rel="stylesheet">

    <link href="css/docs.css" rel="stylesheet">

    <script src="js/jquery-2.1.3.min.js"></script>
    <script src="js/metro.js"></script>
    <script src="js/docs.js"></script>
    <script src="js/prettify/run_prettify.js"></script>
    <script src="js/ga.js"></script>
    <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
</head>
<body class = "bg-darker">
	
    <div id="container">
    
    <!--- Header  -->
    <div id="header">          
            <h1>Lomba Java IT Fair 8</h1>
    </div>
        
     <div class="align-center">
    <center>
        <div style="width: 170px;  margin-right: 0px" class=" ">
        <img src="images/itfair.png" data-role="fitImage" data-format='cycle'  style="width: 170px;  margin-right: 75px margin-top: 50px">
    </div>
    </center>
                
    <div class="countdown labels-top" data-role="countdown" data-label-color="fg-grayLight" data-divider-color="fg-grayLight"  data-days="2" style="font-size: 2rem"></div>
    </div>

    <div id="menu">
    </div>
        
    
    <!--- Conten yang ada di program lomba -->
    <div id="content">
    <center>
        	<h2>Download</h2>
            <p>Tabel file yang telah diupload oleh peserta, Silahkan Klik judul file untuk mendownload </p>
    </center>
            
            <p>
            <table class="table" width="100%" cellpadding="3" cellspacing="0">
            	<tr>
                	<th width="30">No.</th>
                    <th width="80">Waktu Upload</th>
                    <th>Nama File</th>
                    <th width="70">Tipe</th>
                    <th width="70">Ukuran</th>
                </tr>
               

     <!--- Fungsi menampilkan data dan mengambil data di program lomba -->
                <?php
				include('config.php');
				$sql = mysqli_query($conn, "SELECT * FROM download ORDER BY id DESC");
				if(mysqli_num_rows($sql) > 0)
                {
					$no = 1;
					while($data = mysqli_fetch_assoc($sql))
                    {
						echo '
						<tr bgcolor="#fff">
							<td align="center">'.$no.'</td>
							<td align="center">'.$data['tanggal_upload'].'</td>
							<td><a href="'.$data['file'].'">'.$data['nama_file'].'</a></td>
							<td align="center">'.$data['tipe_file'].'</td>
							<td align="center">'.formatBytes($data['ukuran_file']).'</td>
						</tr>
						';
						$no++;
					}
				}

                else
                {
					echo '
					<tr bgcolor="#fff">
						<td align="center" colspan="4" align="center">Tidak ada data!</td>
					</tr>
					';
				}
				  ?>
            </table>
            </p>
        </div>
        <footer>
            <center> <a href="https://github.com/rezagunawan" target="_blank"> Copyright &copy;</a> <a href="https://web.facebook.com/reza.gunawan.35" target="_blank">Reza G - IF UIN SGD 2014</a> </center>   
        </footer>
    </div>
</body>
</html>