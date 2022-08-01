<!DOCTYPE html>
<html>
<head>
	<title>Convert JSON Data to HTML Table</title>
</head>
<body align="center" style="background-color: grey; color:white"	>
	<h2 class="heading" style="text-align:center"><b>Books</b></h2>

	<div id="textboxes" style="text-align: center;display:none">
    
        <form method="POST" name="form1"  >
            Book name:<input type="text" name="bookname">
            Author:<input type="text" name="authorname">
            Genre:<input type="text" name="genre">
            <br><br>
            <input type="button" name="add" value="Add Data" onclick="addBook()">
            </form>
</div>
<div class="buttoncontainer" style="text-align: center">
<button type="button" id="b1" class="button button1" onClick="myFunction1()">Add</button>
</div>
	<p align="center" id="showData"></p>
	 </body>
	<script>
		  function myFunction1() {
        var x = document.getElementById("textboxes");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}
		
			var myBooks=[
				{
				"Name":"Dark room",
				"Author":"Gosling",
				"Genre":"Thriller",
				"Link":"novel1.html",
				"Delete":"Delete",
			},
				{
				"Name":"Guide",
				"Author":"osborn",
				"Genre":"Romantic",
				"Link":"novel2.html",
				"Delete":"Delete",
			},
				{
				"Name":"Talkative man",
				"Author":"dinesh",
				"Genre":"Comedy",
				"Link":"novel3.html",
				"Delete":"Delete",
			},
				{
				"Name":"Golden gate",
				"Author":"ram",
				"Genre":"Fantasy",
				"Link":"novel4.html",
				"Delete":"Delete",
			},
				{
				"Name":"A suitable boy",
				"Author":"karthick",
				"Genre":"Comedy",
				"Link":"novel5.html",
				"Delete":"Delete",
			},
			{
				"Name":"An equal music",
				"Author":"dinesh",
				"Genre":"Romantic",
				"Link":"novel6.html",
				"Delete":"Delete",
			},
			{
				"Name":"Grimus",
				"Author":"dinesh",
				"Genre":"Thriller",
				"Link":"novel7.html",
				"Delete":"Delete",
			},
			{
				"Name":"Midnight's children",
				"Author":"ram",
				"Genre":"Fantasy",
				"Link":"novel8.html",
				"Delete":"Delete",
			},
			{
				"Name":"Shame",
				"Author":"murugan",
				"Genre":"Comedy",
				"Link":"novel9.html",
				"Delete":"Delete",
			},
			{
				"Name":"The algebra of infinite justice",
				"Author":"sathish",
				"Genre":"Fantasy",
				"Link":"novel10.html",
				"Delete":"Delete",
			},
			{
				"Name":"The god of small things",
				"Author":"harish",
				"Genre":"Thriller",
				"Link":"novel11.html",
				"Delete":"Delete",
			},
			{
				"Name":"The ministry of utmost happiness",
				"Author":"sathish",
				"Genre":"Horror",
				"Link":"novel12.html",
				"Delete":"Delete",
			},
			{
				"Name":"Selection day",
				"Author":"harish",
				"Genre":"Comedy",
				"Link":"novel13.html",
				"Delete":"Delete",
			},
			{
				"Name":"Last man in tower",
				"Author":"murugan",
				"Genre":"Romantic",
				"Link":"novel14.html",
				"Delete":"Delete",
			},
			{
				"Name":"Between the assassinations",
				"Author":"dinesh",
				"Genre":"Thriller",
				"Link":"novel15.html",
				"Delete":"Delete",
			}
			]
			
			var html="<table>"
			for(var i=0;i<myBooks.length;i++)
			{
				html+='<br>'
				for(var j=i;j<=i;j++)
				{
					html+='<tr>'
					html+='<td>'+myBooks[i].Author+'</td>';
					html+='<td>'+myBooks[i].Name+'</td>';
					html+='<td><a href='myBooks[i].Link+'>Continue reading</a></td>';
					html+='<tr>';
				}
			}
			document.getElementById('showData').innerHTML=html;

	</script>
	</html>