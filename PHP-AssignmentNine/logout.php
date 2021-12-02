<?php
//Ryan Siegel - 12/2/21 - Create full page
if (isset($_COOKIE['Samuel'])) {
	setcookie('Samuel', FALSE, time()-300);
}

// Define a page title and include the header:
define('TITLE', 'Logout');
include('header.html');

// Print a message:
echo '<p>You are now logged out.</p>';

// Include the footer:
include('footer.html'); 
?>