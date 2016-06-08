var templateApp = angular.module('templateapp', ['ngResource','ngRoute','ngAnimate','ui.bootstrap']);

templateApp.factory('templateservice', ['$resource', function($resource) {
	var base = 'service';
	return {
		requests: $resource(base, {}, {
			sendDTORequest: {
				method:'post',
				url:base+'/getdtoresult'
			}
		})
	};
}]);

templateApp.run(['$rootScope', '$window', 'templateservice', function($rootScope, $window, templateservice){
	$rootScope.welcomemsg = "";

	var init = function(){
 	}

 	init();

}]);
