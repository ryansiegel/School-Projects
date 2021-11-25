<html>
<head>
	<!--Link css files-->
	<link rel="stylesheet" href="masthead.css" type="text/css" />
	<link rel="stylesheet" href="concise.min.css" type="text/css" />
</head>
</html>

<?php // Script 9.8 - logout.php
/* This is the logout page. It destroys the session information. */

session_start();

$_SESSION = [];

session_destroy();

define('TITLE', 'Logout');
include('header.html');

?>

<h2>Welcome to the J.D. Salinger Fan Club!</h2>
<p>You are now logged out.</p>
<p>Thank you for using this site. We hope you liked it.<br>Blah, blah, blah... Blah, blah, blah...</p>


<?php include('footer.html'); ?>