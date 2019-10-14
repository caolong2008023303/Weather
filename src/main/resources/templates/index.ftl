<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>City</title>
</head>
<body>
    <h2>Please select a city to get the current weather</h2>
    <select name="city" id="city" style="width:120px;" value="">
		<option value="">--Please select--</option>
		<#list cities as city>
			<option value="${city}">${city}</option>
		</#list>
	</select>
</body>
</html>