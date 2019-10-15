<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Current Weather</title>
    <style>
    	td {
    		padding-left:20px;
    	}
    </style>
</head>
<body>
<table width="400px" style="text-align:left; BORDER-COLLAPSE:collapse; border-style:dotted; border-width:1px;">   
    <tr style="border-bottom-style:dotted;border-width:1px;">   
        <td width="150px" style="border-right-style:dotted;border-width:1px;">City</td>   
        <td>${current.city}</td>     
    </tr>  
    <tr style="border-bottom-style:dotted;border-width:1px;">   
        <td width="150px" style="border-right-style:dotted;border-width:1px;">Updated time</td>   
        <td>${current.lastupdate.value}</td>
    </tr>
    <tr style="border-bottom-style:dotted;border-width:1px;">   
        <td width="150px" style="border-right-style:dotted;border-width:1px;">Weather</td>   
        <td>${current.weather.value}</td>
    </tr>
    <tr style="border-bottom-style:dotted;border-width:1px;">   
        <td width="150px" style="border-right-style:dotted;border-width:1px;">Temperature</td>   
        <td>${current.temperature.value}</td>
    </tr>
    <tr>   
        <td width="150px" style="border-right-style:dotted;border-width:1px;">Wind</td>   
        <td>${current.wind.speed.value}</td>
    </tr>
</table>
</body>
</html>