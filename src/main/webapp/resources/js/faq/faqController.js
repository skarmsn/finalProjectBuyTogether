$('head').append('<script src=\'/resources/js/faq/faqDao.js\'><\/script>');

function faqController(){

	var dao = new faqDao();

	//FAQ [전체보기] 리스트
	this.listAll = function(){

		var data = dao.listAllDao();

		return data;

	}

	//FAQ [회원관련] 리스트
	this.listUser = function(){

		var data = dao.listUserDao();

		return data;

	}

	//FAQ [사냥관련] 리스트
	this.listBuy = function(){

		var data = dao.listBuyDao();

		return data;

	}

	//FAQ [정보관련] 리스트
	this.listInfo = function(){

		var data = dao.listInfoDao();

		return data;

	}


	//FAQ [고객센터] 리스트
	this.listCenter = function(){

		var data = dao.listCenterDao();

		return data;

	}

}