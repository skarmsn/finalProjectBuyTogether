$('head').append('<script type="text/javascript" src="/resources/js/user/joinDao.js"></script>')

function joinController() {
	
	var dao = new joinDao();
	//join controller
	this.requestJoin = function(user) {
		
		dao.regist(user);	
		
	};

}
