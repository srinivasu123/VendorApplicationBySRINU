<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.navbar {
	overflow: hidden;
	background-color: #333;
	font-family: Arial, Helvetica, sans-serif;
}

.navbar a {
	float: left;
	font-size: 16px;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.dropdown {
	float: left;
	overflow: hidden;
}

.dropdown .dropbtn {
	font-size: 16px;
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
	background-color: red;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
</head>
<body>
	<img src="../images/BANNER.png" width="1320" height="150" />
	<div class="navbar">
		<a href="#">Home</a>

		<!-- Location Start Here -->
		<div class="dropdown">
			<button class="dropbtn">
				LOCATION <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="regLoc">REGISTER</a> <a href="viewAllLocs">VIEW ALL</a> <a
					href="ShowLocReport">REPORTS</a>
			</div>
		</div>
		<!-- LOCATION end HERE -->

		<!-- VENDOR START HERE -->
		<div class="dropdown">
			<button class="dropbtn">
				VENDOR <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="regVen">REGISTER</a> <a href="viewAllVendors">VIEW ALL</a>
				<a href="ShowVendorReport">REPORTS</a>
			</div>
		</div>
		<!-- VENDOR END HERE -->
		
<!-- 		CUSTOMER START HERE -->
		
		<div class="dropdown">
			<button class="dropbtn">
				CUSTOMER <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="regCust">REGISTER</a>
				 <a href="ViewAllCustomers">VIEW ALL</a>
				<a href="ShowCustomerReport">REPORTS</a>
			</div>
		</div>
		<!-- 		CUSTOMER STOP HERE -->
		


		<a href="showDocs">DOCUMENTS</a>


	</div>