<!DOCTYPE html>
<html>
<body>
<?php
$number_one = rand(1, 100);
$number_two = rand(1, 100);
$addition = $number_one + $number_two;
$difference = $number_two - $number_one;
$product = $number_one * $number_two;
$division = $number_two / $number_one;
$remainder = $number_two % $number_one;

echo "$number_one + $number_two = $addition<br>";
echo "$number_two - $number_one = $difference<br>";
echo "$number_one * $number_two = $product<br>";
echo "$number_two / $number_one = $division<br>";
echo "$number_two % $number_one = $remainder";
?>

</body>
</html>