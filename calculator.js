<html>
<head>
<script type="text/javascript">
function cal()
{
calculator.display.value=eval(calculator.display.value);
}
function add()
{
calculator.display.value+='+';
}
function sub()
{
calculator.display.value+='-';
}
function mul()
{
calculator.display.value+='*';
}
function div()
{
calculator.display.value+='/';
}
function log()
{
var a=Math.log(calculator.display.value);
calculator.display.value=a;
}
function square()
{
var a=Math.sqrt(calculator.display.value);
calculator.display.value=a;
}
function clean()
{
calculator.display.value='';
}
</script>

</head>
<body>
<center>
<form name="calculator">
<table>
<tr>
<td colspan="4">
<input type="text" name="display" id="display" disabled>
</td>
</tr>
<tr>
<td><input type="button" name="one" value="1" onclick="calculator.display.value+='1'"></td>
<td><input type="button" name="two" value="2" onclick="calculator.display.value+='2'"></td>
<td><input type="button" name="three" value="3" onclick="calculator.display.value+='3'"></td>
</tr>
<tr>
<td><input type="button" name="four" value="4" onclick="calculator.display.value+='4'"></td>
<td><input type="button" name="five" value="5" onclick="calculator.display.value+='5'"></td>
<td><input type="button" name="six" value="6" onclick="calculator.display.value+='6'"></td>
</tr>
<tr>
<td><input type="button" name="seven" value="7" onclick="calculator.display.value+='7'"></td>
<td><input type="button" name="eight" value="8" onclick="calculator.display.value+='8'"></td>
<td><input type="button" name="nine" value="9" onclick="calculator.display.value+='9'"></td>
</tr>
<tr>
<td><input type="button" name="neat" value="C" onclick="clean()"></td>
<td><input type="button" name="zero" value="0" onclick="calculator.display.value+='0'"></td>
<td><input type="button" name="equal" value="=" onclick="cal()"></td>
</tr>
<tr>
<td><input type="button" class="operator" name="plus" value="+" onclick="add()"></td>
<td><input type="button" class="operator" name="minus" value="-" onclick="sub()"></td>
<td><input type="button" class="operator" name="product" value="x" onclick="mul()"></td>
</tr>
<tr>
<td><input type="button" class="operator" name="division" value="/" onclick="div()"></td>
<td><input type="button" class="operator" name="logrithm" value="lg" onclick="log()"></td>
<td><input type="button" class="operator" name="square_root" value="sqrt" onclick="square()"></td>
</tr>
</table>
</form>
</center>
</body>
</html>
