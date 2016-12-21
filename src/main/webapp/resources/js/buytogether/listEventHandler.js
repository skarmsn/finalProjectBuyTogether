$('head').append('<script src=\'/resources/js/buytogether/buytogetherController.js\'><\/script>');

$(document).ready(function (){

	var controller = new buytogetherController();

	controller.requestCategoryList();
	controller.requestHuntingTypeList();
	controller.requestHuntingStatusList();

	var keyword =  $('#keyword').val();
	var page = 1;
	var perPageNum = 6;
	var user_number;

	var scri = {
			page : page, perPageNum : perPageNum, keyword : keyword, user_number : user_number
	};

	controller.requestListAll(scri);

	//검색버튼 클릭시
	$('#search_button').click(function(){

		var category_number = $('#category_number').val();
		var hunting_type_number = $('#hunting_type_number').val();
		var hunting_status_number = $('#hunting_status_number').val();
		var buytogether_address_sido = $('#sido').val();
		var buytogether_address_sigungu = $('#sigungu').val();
		var regDate = $('#registDate').val();
		
		var keyword = $('#keyword').val();
		var page = 1;
		var perPageNum = 6;

		var scri = {
				page : page,
				perPageNum : perPageNum,
				category_number : category_number,
				hunting_type_number : hunting_type_number,
				hunting_status_number : hunting_status_number,
				buytogether_address_sido : buytogether_address_sido,
				buytogether_address_sigungu : buytogether_address_sigungu,
				user_number : user_number,
				regDate : regDate,
				keyword : keyword
		}
		
		console.log(scri);

		controller.requestListAll(scri);
	});

	//페이징
	$('#pagination').on("click", "li a", function(event){

		event.preventDefault();

		var category_number = $('#category_number').val();
		var hunting_type_number = $('#hunting_type_number').val();
		var hunting_status_number = $('#hunting_status_number').val();
		var buytogether_address_sido = $('#sido').val();
		var buytogether_address_sigungu = $('#sigungu').val();
		var regDate = $('#registDate').val();

		var keyword = $('#keyword').val();
		
		var page = $(this).attr("href");
		var perPageNum = 6;

		var scri = {
				page : page,
				perPageNum : perPageNum,
				category_number : category_number,
				hunting_type_number : hunting_type_number,
				hunting_status_number : hunting_status_number,
				buytogether_address_sido : buytogether_address_sido,
				buytogether_address_sigungu : buytogether_address_sigungu,
				user_number : user_number,
				regDate : regDate,
				keyword : keyword
		}
		console.log("scri");
		console.log(scri);
		
		controller.requestListAll(scri);
	});
});