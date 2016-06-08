templateApp
 .config(['$httpProvider', function($httpProvider) {
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
        $httpProvider.defaults.useXDomain = true;
  }])
 .controller('templateservicectrl', ['$scope', '$http', 'templateservice', function($scope, $http, templateservice) {

 	$scope.RequestDTO = {
 		val: null,
 		lst: ["abc", "def", "ghi", "jkl", "mno"]
 	};

 	$scope.res = {
 		val: null,
 		lst: []
 	};

 	$scope.getDTO = function(){
 		console.log(" enter ... ");
 		var ans = templateservice.requests.sendDTORequest($scope.RequestDTO, 
 			function(){
 				$scope.res = ans;
 				console.log(ans);
 		}, function() {
 				console.log(" fail ... ");
 		});
 	}

   }]);