<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		var a;
		
		function addBook()
		{
			var bookadd=document.form1.bookname.value;
			var authoradd=document.form1.authorname.value;
			var genreadd=document.form1.genre.value;

			var tr= document.createElement('tr');

			var td1= tr.appendChild(document.createElement('td'));
			var td2=tr.appendChild(document.createElement('td'));
			var td3=tr.appendChild(document.createElement('td'));

			td1.innerHTML=bookadd;
			td2.innerHTML=genreadd;
			td3.innerHTML=authorname;

			document.getElementById("tb1").appendChild(tr);
		}
	</script>
</head>

<body style="background-color: grey;">
	<H2>Inser Book</h2>
		<form method="POST" name="form1" action="books.html" >
			Book name:<input type="text" name="bookname">
			Author:<input type="text" name="authorname">
			Genre:<input type="text" name="genre">
			<br><br>
			<input type="button" name="add" value="Add Data" onclick="addBook()">
			</form>

</body>
</html>