$('head').append('<script type="text/javascript" src="/resources/js/user/joinController.js"></script>')

$(document).ready(function() {

	var controller = new joinController();

	$('#userAddBtn').on("click", function() { //회원가입 button click
		
		var user = { id : $('#id').val(),
				password : $('#password').val(),
				passwordCheck : $('#passwordCheck').val(),
				name : $('#name').val(),
				birthdate : $('#birthdate').val(),
				nickname : $('#nickname').val(),
				email : $('#email').val(),
				phoneNumber : $('#phoneNumber').val()
		};
		
		controller.requestJoin(user);

	});

});