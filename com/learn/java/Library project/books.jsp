<!DOCTYPE html>
<html>
<head>
	<title>Convert JSON Data to HTML Table</title>
	<style>
		   .styled-table {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}
thead tr {
  background-color  : limegreen;
    color: #ffffff;
    text-align: left;
}
th,
 td {
    padding: 12px 15px;
}
th{
	 background-color  : limegreen;
}
 tbody tr {
    border-bottom: 1px solid #dddddd;
}

 tbody tr {
    background-color: white;
    color: black;
}

tbody tr:last-of-type {
    border-bottom: 2px solid #009879;
}
	</style>
</head>
<body align="center" 	style="background-color: grey; color:white">
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
			
			createTablefromJSON(myBooks)


			
		function createTablefromJSON(data)
		{
			var col=[];
			for(var i=0;i<data.length;i++){
				for(var row in data[i]){
					if(col.indexOf(row)==-1){
						col.push(row);
					}
				}
			}

			var table=document.createElement("table");
			var tr= table.insertRow(-1);

			for(var i=0;i<col.length;i++){
				var th=document.createElement("th");
				th.innerHTML=col[i];
				tr.appendChild(th);
			}

			for(var i=0;i<data.length;i++){
				tr=table.insertRow(-1);

				for(var j=0;j<col.length;j++){
					var tabCell=tr.insertCell(-1);
					tabCell.innerHTML=data[i][col[j]]+"<table>";
				}
			}
			var divContainer=document.getElementById("showData");
			divContainer.innerHTML="";
			divContainer.appendChild(table);
		}

	</script>
	</html>