<%@ page import="java.util.ArrayList" %>
<%@ page import="Objects.Item" %>
<%@ page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
<title>Search Results</title>
<link href="CSS/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="CSS/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='//fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->
<!-- start menu -->
<link href="CSS/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="js/simpleCart.min.js"> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">

			<div class="header-left">

				<div class="search-box">
					<div id="sb-search" class="sb-search">
						<form action="#" method="post">
							<input class="sb-search-input" placeholder="Enter your search term..." type="search"  id="search">
							<input class="sb-search-submit" type="submit" value="">
							<span class="sb-icon-search"> </span>
						</form>
					</div>
				</div>

<!-- search-scripts -->
					<script src="js/classie.js"></script>
					<script src="js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
					<!-- //search-scripts -->

				<div class="ca-r">
					<div class="cart box_1">
						<a href="checkout.jsp">
						<h3> <div class="total">
							<span class="simpleCart_total"></span> </div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
				</div>
					<div class="clearfix"> </div>
			</div>

		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<h1><a href="index.jsp">Search Results</a></h1>
				</div>


				<div class="clearfix"> </div>
		</div>
		</div>
	</div>
<!-- products -->
	<!-- grow -->
	<div class="grow">
		<div class="container">
			<h2>Products</h2>
		</div>
	</div>
	<!-- grow -->
	<%
		DecimalFormat df = new DecimalFormat("0.00");
		ArrayList<Item> results = (ArrayList<Item>) session.getAttribute("results");
		for (int i = 0; i < results.size(); i++) {
			Item item = (Item) results.get(i);
			//System.out.println(item.getName());
		}
	%>
<script>

    function choose(element){
        alert(element.getAttribute("value"));
    }
</script>
	<div class="pro-du">
		<div class="container">
			<div class="col-md-9 product1">
				<div class=" bottom-product">
					<%
					for (Item item : results) {
					%>
					<div class="col-md-6 bottom-cd simpleCart_shelfItem">
						<div class="product-at ">
							<form method="post" action="addToCart.jsp">
								<!--width="50" height="100"-->
							<a href="addToCart.jsp?id=<%=item.getName()%>" id="<%=item.getName()%>"><input type="image" class="img-responsive"  src="images/results/<%=item.getName()%>.png" alt="" id="<%session.setAttribute("ids", item.getName());%>">
								<div class="pro-grid">
										<span class="buy-in">Order Now</span>
							</div>
						</a>
							</form>
						</div>
						<p class="tun"><span><%=item.getName()%></span><br></p>
						<div class="ca-rt">
							<a href="#" class="item_add"><p class="number item_price"><i> </i>$<%=df.format(item.getPrice())%></p></a>
						</div>
						<div class="clearfix"></div>
					</div>
						<div class="clearfix"> </div>
				</div>
				<%
					}
				%>
		</div>
</body>
</html>
