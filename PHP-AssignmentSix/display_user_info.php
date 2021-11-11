<html>
<head>
  <!--
    Ryan Siegel
	11/11/2021
	Purpose: Display info or display errors.
  -->
	<title>Display your info</title>
	<!--Grab info from form and do calculations-->
	<?php
		//coffee
		$coffee = $_POST['coffee'];
		if ($coffee == "Select Coffee:") {$coffeePrice="error"; $coffee="error";}
		else if ($coffee == "Boca Villa") {$coffeePrice=7.99;}
		else if ($coffee == "South Beach Rhythm") {$coffeePrice=8.99;}
		else if ($coffee == "Pumpkin Paradise ") {$coffeePrice=8.99;}
		else if ($coffee == "Sumatran Sunset") {$coffeePrice=9.99;}
		else if ($coffee == "Bali Batur") {$coffeePrice=10.95;}
		else if ($coffee == "Double Dark") {$coffeePrice=9.95;}
		$coffeeMessage = "";
		
		//type
		$type = $_POST['type'];
		if ($type == "Decaffeinated") {$coffeePrice= $coffeePrice + 1.00;}
		
		//quantity
		$quantity = $_POST['quantity'];
		if ($quantity == "") {$quantity="error";}
		$quantityMessage = "";
		
		//telenumber
		$telenumber = $_POST['phone'];
		if ($telenumber == "") {$telenumber="error";}
		$teleMessage = "";
		
		//name
		$name = $_POST['name'];
		if ($name == "") {$name="error";}
		$nameMessage = "";
		
		//email
		$email = $_POST['email'];
		if ($email == "") {$email="error";}
		$emailMessage = "";
		
		//address
		$address = $_POST['address'];
		if ($address == "") {$address="error";}
		$addressMessage = "";
		
		//city
		$city = $_POST['city'];
		if ($city == "") {$city="error";}
		$cityMessage = "";
		
		//state
		$state = $_POST['state'];
		if ($state == "") {$state="error";}
		$stateMessage = "";
		
		//zip
		$zip = $_POST['zip'];
		if ($zip == "") {$zip="error";}
		$zipMessage = "";
		
		//error page?
		if ($coffee != "error" && $quantity != "error" && $telenumber != "error" && $name != "error" && $email != "error" && $address != "error" && $city != "error" && $state != "error" && $zip != "error") {$errorPage = "no"; $total = $coffeePrice * $quantity;}
		else
		{
			$errorPage = "yes";
			if ($coffee == "error") {$coffeeMessage = "Please select a coffee to be purchased.</br>";}
			if ($quantity == "error") {$quantityMessage = "Please enter a quantity.</br>";}
			if ($telenumber == "error") {$teleMessage = "Please enter a telephone number.</br>";}
			if ($name == "error") {$nameMessage = "Please enter a name.</br>";}
			if ($email == "error") {$emailMessage = "Please enter a e-mail address.</br>";}
			if ($address == "error") {$addressMessage = "Please enter a address.</br>";}
			if ($city == "error") {$cityMessage = "Please enter a city.</br>";}
			if ($state == "error") {$stateMessage = "Please enter a state.</br>";}
			if ($zip == "error") {$zipMessage = "Please enter a zip code.</br>";}
		}
		
		
	?>
	<!--Table styling-->
	<style type="text/css">
	table.table1 td:nth-child(1) {
		width: 125px;
	}
	
	table.table1 td:nth-child(2) {
		width: 200px;
	}
	
	table.table2 td:nth-child(1) {
		width: 150px;
	}
	
	table.table2 td:nth-child(2) {
		width: 100px;
	}
	
	table.table2 td:nth-child(3) {
		width: 75px;
	}
	
	table.table2 td:nth-child(4) {
		width: 75px;
	}
	
	table.table2 td:nth-child(5) {
		width: 75px;
	}
	
	table.table2 tr:nth-child(1) {
		text-align: center;
	}
	
	table.table2 tr:nth-child(2) {
		text-align: center;
		font-weight: bold;
		border: 1px solid black;
	}
	
	table.table2 tr:nth-child(3) {
		text-align: center;
	}
	</style>
</head>

<body>
	<h1>The Coffee House</h1>
	<?php if($errorPage == "no")
	{ ?>
		<h2>Order Summary</h2>
		<table class="table1">	
			<tr>
				<td>Name:</td>
				<td><?php echo $name; ?></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><?php echo $address; ?></td>
			</tr>
			<tr>
				<td>City, State, Zip:</td>
				<td><?php echo $city?>, <?php echo $state?>, <?php echo $zip?></td>
			</tr>
			<tr>
				<td>Phone #:</td>
				<td><?php echo $telenumber; ?></td>
			</tr>
			<tr>
				<td>E-Mail:</td>
				<td><?php echo $email; ?></td>
			</tr>
		</table></br>
		<table class="table2">	
			<tr>
				<td colspan="5">Order Information</td>
			</tr>
			<tr>
				<td>Coffee</td>
				<td>Type</td>
				<td>Quantity</td>
				<td>Unit Cost</td>
				<td>Total</td>
			</tr>
			<tr>
				<td><?php echo $coffee; ?></td>
				<td><?php echo $type; ?></td>
				<td><?php echo $quantity; ?></td>
				<td>$<?php echo $coffeePrice; ?></td>
				<td>$<?php echo $total; ?></td>
			</tr>
		</table></br>
		<!-- perform return to input page -->
		<form action="http://localhost/user_input.htm">
		<input type="submit" value="Return to input form">
		</form>
	<?php }
	else
	{ ?>
		<p style="color:red;"><b>Errors!!</b></br>
		<?php echo $coffeeMessage; ?><?php echo $quantityMessage; ?><?php echo $teleMessage; ?><?php echo $nameMessage; ?><?php echo $emailMessage; ?><?php echo $addressMessage; ?><?php echo $cityMessage; ?><?php echo $stateMessage; ?><?php echo $zipMessage; ?>
		</p>
		<!-- perform return to input page -->
		<form action="http://localhost/user_input.htm">
		<input type="submit" value="Return to input form">
		</form>
	<?php }
	?>
</body>