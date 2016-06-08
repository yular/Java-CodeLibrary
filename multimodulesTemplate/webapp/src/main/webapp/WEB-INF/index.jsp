<html lang="en" ng-app="templateapp">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Java Template</title>
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-tree/2.15.0/angular-ui-tree.min.css">
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/nvd3/1.8.3/nv.d3.css">
  <link rel="stylesheet" type="text/css" href="resources/css/index.css">
</head>
<body>

	<div class="container">
		<h1>Maven + Spring MVC Web Project Example</h1>

		<h2>Message : ${message}</h2>
		<h2>Counter : ${counter}</h2>

		<div ng-controller="templateservicectrl">
			<div class="row">
				<div class="col-sm-4 col-md-4">
					<input type="text" class="form-control" ng-model="RequestDTO.val" />
				</div>
				<div class="col-sm-4 col-md-4">
				</div>
				<div class="col-sm-4 col-md-4">
					<a class="btn btn-large btn-primary" ng-click="getDTO()">submit</a>
				</div>
			</div>

			<br>

			<div class="row">
				<div class="col-sm-4 col-md-4">
					<input type="text" class="form-control" ng-model="res.val" />
				</div>
				<div class="col-sm-4 col-md-4">
					<ul ng-repeat="x in res.lst">
						<li>{{ x }}</li>
					</ul>
				</div>
			</div>
		</div>

	</div>

	<footer class="footer">
		<div class="container">
		  <div class="row row-spacer" id="footer-info">
		    <p class="text-muted">&copy; 2016 BaiChuan Yang All rights reserved.</p>
		    <p class="text-muted">Powered by BaiChuan Yang</p>
		  </div>
		</div>
	</footer>

<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.8/angular.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.8/angular-resource.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.8/angular-route.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.8/angular-animate.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-tree/2.15.0/angular-ui-tree.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/1.1.0/ui-bootstrap-tpls.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.16/d3.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-nvd3/1.0.6/angular-nvd3.min.js" charset="utf-8"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/nvd3/1.8.3/nv.d3.min.js"></script>
<script src="resources/js/templateApp.js"></script>
<script src="resources/js/templateCtrl.js"></script>	
</body>
</html>
