<!DOCTYPE html> 
<html>
	<head>
		<!-- This is a comment tag -->
		<meta charset="UTF-8" />
		<title>Camera Shop</title>
		<link rel="stylesheet" href="siteLayout.css" type="text/css" media="screen,projection" />
		<link rel="stylesheet" href="siteTheme.css" type="text/css" media="screen,projection" />
		<style>
			/* For styling specific to this page */
			#mainBody {
				min-height: 615px;
				
			}
			body{
			background-color:pink;
			}
		</style>
		<script src="jquery-2.2.0.min.js"></script>
		<script src='CameraShop.js'></script>
		<script>
		
			var timer;
		
			$(document).ready(function() {
				
				// set a timed function call to wait for xml to load
				timer = window.setInterval(function() {
				
					if ($products === null)
					{
						// Don't do anything... Still waiting
						return;
					}
					else
					{
						// Remove timer
						window.clearInterval(timer);
						
						// Populate the nav bar
						populateNav("navmenu");
				
						// // Check if page called from search results page and append anchor to breadcrumb
						if (vars["searchTerm"] != undefined)
						{
							$('#breadCrumb').append(' - <a href="results.html?OLDid=' + vars['id'] + '&searchTerm=' + vars['searchTerm'] + '">Return to search results</a>');
						}
						
						// The 'id' is in the vars array
						var $id = vars['id'];
						
						// Put the ID in the searchBar form
						$("#hiddenID").attr("value", $id);
						
						// Get the product that matches the id
						var $theProduct = null;
						$products.find("product").each(function() {
							
							if ($(this).find('id').text() === $id)
							{
								$theProduct = $(this);
							}
						
						});
						
						// Get the product data into the variables from the matched product
						var title = $theProduct.find('title').text();
						var brand = $theProduct.find('brand').text();
						var price = $theProduct.find('price').text();
						var description = $theProduct.find('description').text();
						var $spec = $theProduct.find('spec');  // This is an XML object containing the child data objects of the 'spec'
						var specification = [];
						$spec.children().each(function() {
							specification[$(this).prop("tagName")] = $(this).text();
						});
						// The 'specification' variable is an associative array of the spec child data values that are indexed via the child tag name
						var imageFilename = $theProduct.find('picture').text();
						
						/******************************************************
						 **      YOUR CODE GOES BELOW HERE !!!!!!!!!!!!!!!   **
						 ******************************************************/
						$('table td:nth-child(1)').append($id);
						$('table td:nth-child(2)').append(title);
						$('table td:nth-child(3)').append(brand);
						$('table td:nth-child(4)').append(price);
						$('table td:nth-child(5)').append(description);
						$('table td:nth-child(6)').append('<img src=/ProductImages/' + imageFilename+">");
						
						 // These few lines of code here show you how the data can be accessed using the variable - especially the spec!
						 // You can delete these lines when you've learnt from them... They display the data in the developer tools -> console
						 console.log($id + ":" + title + ":" + brand + ":" + price + ":" + description + ":" + imageFilename);
						 
						 for(var key in specification)
						 {
						 	console.log(key + ":" + specification[key]);
						 }
						 
						 
						 /** Don't put jQuery code below here **/
					}
				});	
			});
		</script>
	</head>
	<body>
		<header>
			<img src="logo.jpg" alt="Camera Shop Logo" />
			<h1>Camera Shop</h1>
			<div id="searchBar"><form action="results.html">
				<input type="hidden" name="OLDid" id="hiddenID" />
				Search: <input type="text" name="searchTerm" id="searchTerm" max-length="15"><input type="submit" id="theSubmit" value="Submit">
			</form></div>
			<div id="breadCrumb"><a href="index.html"><img src="home.jpg" alt="The home button" /></a></div>
		</header>
		<ul class="navmenu">
		</ul>
		<div id="mainBody">
	
		<table>
				<thead>
					<tr>
						<th>id</th>	<!-- This is the ID -->
						<th>Title</th>
						<th>Brand</th>
						<th>Price</th>
						<th>description</th>
						<th>image</th>
					<tr>
				</thead>
				<tbody>
					<!-- Your table of results goes in the body of the table -->
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tbody>
			</table>
		</div>
		<footer>
			<p>&copy Camera Shop 2018</p>
		</footer>
	</body>
</html>
