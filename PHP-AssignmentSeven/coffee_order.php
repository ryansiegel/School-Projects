<head>
  <!--
    Ryan Siegel
	11/22/2021
	Purpose: Take coffee order and print results, along with showing errors and sticky form on main page.
  -->
	<title>Coffee Order</title>
	<!--Grab info from form and do calculations-->
	<?php
		if($_SERVER['REQUEST_METHOD'] == 'POST')
		{
			//coffee
			$coffee = $_POST['coffee'];
			if ($coffee == "Select Coffee:") {$coffeePrice="0"; $coffee="error";}
			else if ($coffee == "Boca Villa") {$coffeePrice=7.99;}
			else if ($coffee == "South Beach Rhythm") {$coffeePrice=8.99;}
			else if ($coffee == "Pumpkin Paradise ") {$coffeePrice=8.99;}
			else if ($coffee == "Sumatran Sunset") {$coffeePrice=9.99;}
			else if ($coffee == "Bali Batur") {$coffeePrice=10.95;}
			else if ($coffee == "Double Dark") {$coffeePrice=9.95;}
			$coffeeMessage = null;
			
			//type
			$type = $_POST['type'];
			if ($type == "Decaffeinated") {$coffeePrice= $coffeePrice + 1.00;}
			
			//quantity
			$quantity = $_POST['quantity'];
			if ($quantity == null) {$quantity="error";}
			$quantityMessage = null;
			
			//telenumber
			$telenumber = $_POST['phone'];
			if ($telenumber == null) {$telenumber="error";}
			$teleMessage = null;
			
			//name
			$name = $_POST['name'];
			if ($name == null) {$name="error";}
			$nameMessage = null;
			
			//email
			$email = $_POST['email'];
			if ($email == null) {$email="error";}
			$emailMessage = null;
			
			//address
			$address = $_POST['address'];
			if ($address == null) {$address="error";}
			$addressMessage = null;
			
			//city
			$city = $_POST['city'];
			if ($city == null) {$city="error";}
			$cityMessage = null;
			
			//state
			$state = $_POST['state'];
			if ($state == null) {$state="error";}
			$stateMessage = null;
			
			//zip
			$zip = $_POST['zip'];
			if ($zip == null) {$zip="error";}
			$zipMessage = null;
		
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
	<?php if($_SERVER['REQUEST_METHOD'] == 'POST' && $errorPage == "no")
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
		<form action="<?php unset($_POST); ?>">
		<input type="submit" value="Return to input form">
		</form>
	<?php }
	else
	{	if($_SERVER['REQUEST_METHOD'] == 'POST' && $errorPage == "yes")
		{ ?>
			<p style="color:red;"><b>Errors!!</b></br>
			<?php echo $coffeeMessage; ?><?php echo $quantityMessage; ?><?php echo $teleMessage; ?><?php echo $nameMessage; ?><?php echo $emailMessage; ?><?php echo $addressMessage; ?><?php echo $cityMessage; ?><?php echo $stateMessage; ?><?php echo $zipMessage; ?>
			</p>
		<?php } ?>
		<h2>Order Form</h2>
		<table>
			<!-- perform php post method -->
			<form method="POST">
			<tr>
				<td>Coffee:</td>
				<td>
					<select id = "coffee" name = "coffee">
						<optgroup label="Select Coffee:">
							<option selected hidden>Select Coffee:</option>
							<option <?php if (isset($_POST['coffee']) && $_POST['coffee'] == "Boca Villa") echo 'selected'; ?>>Boca Villa</option>
							<option <?php if (isset($_POST['coffee']) && $_POST['coffee'] == "South Beach Rhythm") echo 'selected'; ?>>South Beach Rhythm</option>
							<option <?php if (isset($_POST['coffee']) && $_POST['coffee'] == "Pumpkin Paradise") echo 'selected'; ?>>Pumpkin Paradise</option>
							<option <?php if (isset($_POST['coffee']) && $_POST['coffee'] == "Sumatran Sunset") echo 'selected'; ?>>Sumatran Sunset</option>
							<option <?php if (isset($_POST['coffee']) && $_POST['coffee'] == "Bali Batur") echo 'selected'; ?>>Bali Batur</option>
							<option <?php if (isset($_POST['coffee']) && $_POST['coffee'] == "Double Dark") echo 'selected'; ?>>Double Dark</option>
						</optgroup>
					</select>
				</td>
			</tr>
			<tr>
				<td>Type:</td>
				<td>
					<label for = "Regular" class="container">Regular
					<input type = "radio" name = "type" id = "regular" checked="checked" value="Regular" />
					</label>
					<label for = "Decaffeinated" class="container">Decaffeinated
					<input type = "radio" name = "type" id = "decaffeinated" <?php if (isset($_POST['type']) && $_POST['type'] == "Decaffeinated") echo 'checked="checked"'; ?> value="Decaffeinated" />
					</label>
				</td>
			</tr>
			<tr>
				<td>Quantity (in pounds):</td>
				<td><input type="number" id="quantity" name="quantity" min="1" placeholder="###" style="width: 45px;" value="<?php if (isset($_POST['quantity'])) echo $_POST['quantity']; ?>"/></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" id="name" name="name" value="<?php if (isset($_POST['name'])) echo $_POST['name']; ?>" /></td>
			</tr>
			<tr>
				<td>E-mail Address:</td>
				<td><input type="text" id="email" name="email" value="<?php if (isset($_POST['email'])) echo $_POST['email']; ?>"/></td>
			</tr>
			<tr>
				<td>Telephone Number:</td>
				<td><input type="tel" id="phone" name="phone" style="width: 100px;" placeholder="###-###-####" value="<?php if (isset($_POST['phone'])) echo $_POST['phone']; ?>"/></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" id="address" name="address" value="<?php if (isset($_POST['address'])) echo $_POST['address']; ?>"/></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" id="city" name="city" value="<?php if (isset($_POST['city'])) echo $_POST['city']; ?>"/></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" id="state" name="state" style="width: 25px;" value="<?php if (isset($_POST['state'])) echo $_POST['state']; ?>"/></td>
			</tr>
			<tr>
				<td>Zip:</td>
				<td><input type="number" id="zip" name="zip" max="99999" placeholder="#####" style="width: 65px;" value="<?php if (isset($_POST['zip'])) echo $_POST['zip']; ?>" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset""/></td>
			</tr>
			</form>
		</table>
	<?php }
	?>
</body>