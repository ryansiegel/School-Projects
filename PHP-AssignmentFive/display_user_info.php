<html>
<head>
  <!--
    Ryan Siegel
	10/06/2021
	Purpose: Display info, adjust string input.
  -->
	<title>Display your info</title>
	<!--Grab info from form and do calculations-->
	<?php 
		//remove extra spaces, leave one space between first and last, break first and last name into array, change string to lower and make first letter of each uppercase
		$fullname = explode(" ", ucwords(strtolower(trim(preg_replace('/\s\s+/', ' ', str_replace("\n", " ", $_POST['fullname']))))));
		//remove spaces, quotes, dashes, and brackts
		$telenumber = str_replace(" ", "", str_replace("'", "", str_replace('(', '', str_replace(')', '', str_replace('-', '', $_POST['telenumber'])))));
		//split string at @, make it all lower case, remove spaces
		$email = explode("@",str_replace(" ", "",strtolower($_POST['emailaddress'])));
		//remove php html tags, replace spaces with dashes, any new line has a br, only show 30 chars
		$notes =  nl2br(substr(str_replace(" ", "-",strip_tags($_POST['notes'])),0,30));
	?>
	<!--Table styling-->
	<style type="text/css">
	table, tr, td {
		border: 1px solid black;
	}
	
	td:nth-child(1) {
		width: 25%;
		text-align: left;
	}
	
	td:nth-child(2) {
		width: 25%;
		text-align: left;
	}
	</style>
</head>

<body>
	<h1>Display your info</h1>
	<table>	
		<tr>
			<td>First Name:</td>
			<td><?php echo $fullname[0]; ?></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><?php echo $fullname[1]; ?></td>
		</tr>
		<tr>
			<td>Telephone Number:</td>
			<td><?php echo $telenumber; ?></td>
		</tr>
		<tr>
			<td>Username:</td>
			<td><?php echo $email[0]; ?></td>
		</tr>
		<tr>
			<td>Domain:</td>
			<td><?php echo $email[1]; ?></td>
		</tr>
		<tr>
			<td>Notes:</td>
			<td><?php echo $notes; ?></td>
		</tr>
	</table>
</body>
