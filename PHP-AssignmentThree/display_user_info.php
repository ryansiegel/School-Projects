<html>
<head>
  <!--
    Ryan Siegel
	09/15/2021
	Purpose: This script hosts the php of the results from the html user input page.
  -->
	<title>User Input</title>
	<!-- link css -->
	<link rel="stylesheet" href="style.css" type="text/css" />
</head>

<body>
	<!-- create user input results table -->
	<table>
		<tr>
			<th colspan = "2">Please enter user informaton</th>
		</tr>
		<tr>
			<td>Name:</td>
			<td><?php echo $_POST['firstname']; ?> <?php echo $_POST['lastname']; ?></td>
		</tr>
			<td>Address:</td>
			<td><?php echo $_POST['address']; ?></td>
		</tr>
		<tr>
			<td>City, State, Zip:</td>
			<td><?php echo $_POST['city']; ?>, <?php echo $_POST['state']; ?>, <?php echo $_POST['zip']; ?></td>
		</tr>
		<tr>
			<td>Telephone #:</td>
			<td><?php echo $_POST['telephonenum']; ?></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><?php echo $_POST['emailaddress']; ?></td>
		</tr>
		<!-- perform return to input page -->
		<form action="http://localhost/user_input.htm">
		<tr>
			<td colspan = "2"><input type="submit" value="Return to input form"></td>
		</tr>
		</form>
	</table>

</body>
</html> 