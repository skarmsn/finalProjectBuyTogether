function joinDao() {
	//신규회원 등록
	this.regist = function(user) {

		$.ajax({
			type: 'post',
			url: '/join/regist',	
			headers: { 
				"Content-Type": "application/json",
				"X-HTTP-Method-Override": "POST" },
				data: JSON.stringify({}),
				dataType: 'text', //서버에서 보내오는 데이터 타입
				success:function(result){
					if(result==null) { //등록 성공시
						alert("성공");
					}
				}
		});

	}

	//신규회원 로그인 시 닉네임 및 기본정보 등록 화면으로 이동
	this.insertUserInfoDao = function(user) {

		document.location = "/user/info";

	};

	//로그인 성공 시 메인 화면으로 이동
	this.homeDao = function() {		

		document.location = "/home";

	};

	//로그인 실패 시 로그인 화면으로 이동
	this.loginDao = function() {		

		document.location = "/user/login";

	};

}