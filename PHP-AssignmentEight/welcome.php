<html>
<head>
	<!--Link css files-->
	<link rel="stylesheet" href="masthead.css" type="text/css" />
	<link rel="stylesheet" href="concise.min.css" type="text/css" />
</head>
</html>

<?php // Script 9.7 - welcome.php #2
/* This is the welcome page. The user is redirected here after they successfully log in. */

session_start();

define('TITLE', 'Welcome to the J.D. Salinger Fan Club!');
include('header.html');

print '<h2>Welcome to the J.D. Slinger Fan Club!</h2>';
print '<p>Hello, ' . $_SESSION['email'] . '!</p>';

date_default_timezone_set('America/New_York');
print '<p>You have been logged in since: ' . date('g:i a', $_SESSION['loggedin']) . '.</p>';

print '<p><a href="logout.php">Logout</a></p>';

include('footer.html');
?>