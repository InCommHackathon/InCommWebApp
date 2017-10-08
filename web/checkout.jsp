<%@ page import="Objects.Cart" %>
<%@ page import="Objects.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="Objects.Search" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
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
<link href="magicthumb/magicthumb.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="magicthumb/magicthumb.js"></script>
</head>
<body>
<!--header-->
<%
	Cart cart = new Cart();

	if(session.getAttribute("cart") != null)
	{
		cart = (Cart) session.getAttribute("cart");
	}
	else {
		session.setAttribute("cart", cart);
	}
	Search search = new Search();
	search.importData();
	Item item;
	if(session.getAttribute("item") != null) {
	    item = search.getItems().get(session.getAttribute("item").toString());
	    cart.addItemToCart(item);
	    session.setAttribute("cart", cart);
		session.setAttribute("item", null);

	}

	DecimalFormat df = new DecimalFormat("0.00");
%>

<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="social">
				<ul>
					<li><a href="#"><i class="facebok"> </i></a></li>
					<li><a href="#"><i class="twiter"> </i></a></li>
					<li><a href="#"><i class="inst"> </i></a></li>
					<li><a href="#"><i class="goog"> </i></a></li>
						<div class="clearfix"></div>
				</ul>
			</div>
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
					<h1><a href="index.jsp">Shopping Cart</a></h1>
				</div>
		 <div class="clearfix"> </div>
		</div>
		</div>
	</div>
	<!-- grow -->
	<div class="grow">
		<div class="container">
			<h2>Checkout</h2>
		</div>
	</div>
	<!-- grow -->
<div class="container">
	<div class="check">
			 <h1>My Shopping Bag (<%=cart.getItems().size()%>)</h1>
		 <div class="col-md-9 cart-items">

				<script>$(document).ready(function(c) {
					$('.close1').on('click', function(c){
						$('.cart-header').fadeOut('slow', function(c){
							$('.cart-header').remove();
						});
						});
					});
			   </script>
				 <script>
				 	$("#img").click(function() {
   		 		$(this).attr('width', '400');
    			$(this).attr('height', '300');
}					);
				 </script>
				 <script type="text/javascript">
MagicThumbOptions = {
    'expandSpeed':'1000',
    'expandEffect':'fade'
}

    }
				 </script>

			 <%
				 for (Item item1: cart.getItems()) {
			 %>
			 <div class="cart-header">
				 <div class="close1"> </div>
				 <div class="cart-sec simpleCart_shelfItem">
						<div class="cart-item cyc">
							<a href="/images/results/<%=item1.getName()%>.png" class="MagicThumb"><img src="/images/results/<%=item1.getName()%>.png"/></a>
						</div>
					   <div class="cart-item-info">
						<h3><a href="#"><%=item1.getName()%></a><span></span></h3>
						<ul class="qty">
							<li><p>Qty : <%=item1.getQuantity()%></p></li>
						</ul>

							 <div class="delivery">
							 <div class="clearfix"></div>
				        </div>
					   </div>
					   <div class="clearfix"></div>

				  </div>
			 </div>
			<%
				}
			%>
			 <script>$(document).ready(function(c) {
					$('.close2').on('click', function(c){
							$('.cart-header2').fadeOut('slow', function(c){
						$('.cart-header2').remove();
					});
					});
					});
			 </script>
			 <!--<div class="cart-header2">
				 <div class="close2"> </div>
				  <div class="cart-sec simpleCart_shelfItem">
						<div class="cart-item cyc">
							 <a href="/images/camera2.1.png" class="MagicThumb"><img src="/images/camera2.1.png"/></a>
						</div>
					   <div class="cart-item-info">
						<h3><a href="#">Camera 2</a><span>Model No: 3578</span></h3>
						<ul class="qty">
							<li><p>Qty : 1</p></li>
						</ul>
							 <div class="delivery">
							 <div class="clearfix"></div>
				        </div>
					   </div>
					   <div class="clearfix"></div>

				  </div>
			  </div>
		 </div>
		 //--->
		  <div class="col-md-3 cart-total">
			 <div class="price-details">
				 <h3>Price Details</h3>
				 <span>Total</span>
				 <span class="total1"><%="$" + df.format(cart.getSubtotal() * 1.07)%></span>
				 <div class="clearfix"></div>
			 </div>
			 <ul class="total_price">
			   <li class="last_price"> <h4>TOTAL</h4></li>
			   <li class="last_price"><span><%="$" + df.format(cart.getSubtotal() * 1.07)%></span></li>
			   <div class="clearfix"> </div>
			 </ul>


			 <div class="clearfix"></div>
			  <form method="post" action="Submit.jsp">
			 		<input type="image"  src="/images/ordernow.png" name="saveForm" class="btTxt submit" id="saveForm" onclick="" /> <!-- LInk to Email Verification-->
				  <%
					  	String balance = "";
					  	if(session.getAttribute("balance") != null)
						{
						    balance = (String) session.getAttribute("balance");
							if(balance.equals("false")) {
				  		%>
				  				<br>You do not have enough funds for this purchase
				  		<%
							}
						}
				  %>
			  </form>
			  <div class="total-item">
			 </div>
			</div>
			<div class="clearfix"> </div>
	 </div>
	 </div>


<!--//content-->

</body>
</html>
