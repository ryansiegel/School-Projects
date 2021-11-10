<html>
<head>
  <!--
    Ryan Siegel
	09/29/2021
	Purpose:
  -->
	<title>User Input</title>
	<!--Grab info from form and do calculations-->
	<?php 
		$hoursWorked = $_POST['hoursworked']; 
		$hourlyRate = $_POST['hourlyrate'];
		$grossPay = $hoursWorked * $hourlyRate;
		$federalTaxes = $grossPay * 0.1065;
		$stateTaxes = $grossPay * 0.04;
		$socialSecurity = $grossPay * 0.038;
		$medicareTaxes = $grossPay * 0.013;
		$totalTaxes = $federalTaxes + $stateTaxes + $socialSecurity + $medicareTaxes;
		$netPay = $grossPay - $totalTaxes;
	?>
	<!--Table styling-->
	<style type="text/css">
	table, tr, td {
		border: 1px solid black;
	}
	
	td:nth-child(1) {
		width: 45%;
		text-align: left;
		font-weight: bold;
	}
	
	td:nth-child(2) {
		width: 45%;
		text-align: right;
	}
	</style>
</head>

<body>
	<h1>Paycheck Information</h1>
	<p>Hello <?php echo $_POST['firstname'];?> <?php echo $_POST['lastname'];?>. This week you worked 
	<?php echo $hoursWorked; ?> hours and, based on</br>
	the pay rate of $<?php echo $hourlyRate; ?> per hour, your pay check information is:</br></br>
	<table>	
		<tr>
			<td>Gross Pay:</td>
			<td>$<?php echo number_format((float)$grossPay,2,'.',''); ?></td>
		</tr>
			<td>Federal Taxes:</td>
			<td>$<?php echo number_format((float)$federalTaxes,2,'.',''); ?></td>
		</tr>
		<tr>
			<td>State Taxes:</td>
			<td>$<?php echo number_format((float)$stateTaxes,2,'.',''); ?></td>
		</tr>
		<tr>
			<td>Social Security Taxes:</td>
			<td>$<?php echo number_format((float)$socialSecurity,2,'.',''); ?></td>
		</tr>
		<tr>
			<td>Medicare Taxes:</td>
			<td>$<?php echo number_format((float)$medicareTaxes,2,'.',''); ?></td>
		</tr>
		<tr>
			<td>Total Taxes:</td>
			<td>$<?php echo number_format((float)$totalTaxes,2,'.',''); ?></td>
		</tr>
		<tr>
			<td>Net Pay:</td>
			<td>$<?php echo number_format((float)$netPay,2,'.',''); ?></td>
		</tr>
	</table>
	<!-- perform return to input page -->
	<form action="http://localhost/user_input.htm">
	<input type="submit" value="Return to input form">
	</form>
</body>
