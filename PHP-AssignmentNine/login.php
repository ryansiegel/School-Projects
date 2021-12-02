<?php 
//Ryan Siegel - 12/2/21 - Create full page
$loggedin = false;
$error = false;

// Check if the form has been submitted:
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	// Handle the form:
	if (!empty($_POST['email']) && !empty($_POST['password'])) {
		if ( (strtolower($_POST['email']) == 'me@example.com') && ($_POST['password'] == 'testpass') ) { // Correct!
			// Create the cookie:
			setcookie('Samuel', 'Clemens', time()+3600);
			// Indicate they are logged in:
			$loggedin = true;
		} else { // Incorrect!
			$error = 'The submitted email address and password do not match those on file!';
		}
	} else { // Forgot a field.
		$error = 'Please make sure you enter both an email address and a password!';
	}
}

// Set the page title and include the header file:
define('TITLE', 'Login');
include('header.html');

// Print an error if one exists:
if ($error) {
	print '<p class="error">' . $error . '</p>';
}

// Indicate the user is logged in, or show the form:
if ($loggedin) {

	print '<p>You are now logged in!</p>';

} else {

	print '<h2>Login Form</h2>
	<form action="login.php" method="post">
	<p><label>Email Address <input type="email" name="email"></label></p>
	<p><label>Password <input type="password" name="password"></label></p>
	<p><input type="submit" name="submit" value="Log In!"></p>
	</form>';

}

include('footer.html');
?>