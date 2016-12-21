$('head').append('<script type="text/javascript" src="/resources/js/user/joinController.js"></script>')
//$(document).on("click", ".iconClass .dip_heratIcon", function()

$(document).ready(function(){
	
	$('body').on("click",'.heart',function() {
		
		var A=$(this).attr("id");
		$(this).css("background-position","")
		var D=$(this).attr("rel");

			if(D === 'unlike') {
				$(this).addClass("heartAnimation").attr("rel","like"); //applying animation class
			} else {
				$(this).removeClass("heartAnimation").attr("rel","unlike");
				$(this).css("background-position","left");
			}

		});//heart click end
		
//	//찜하기 버튼 클릭
//	$('#dip_heratIcon').on("click", function () {
//		
//		// 임의 값 test용
//	//   var buytogether_number = 11;
//	//   var user_number = 2;
//	   var heartIcon = $(this).children();
//
//	   var btnClass = heartIcon.attr("class");
//	   console.log(heartIcon);
//	   if(btnClass == "icon-heart c-font-22 c-font-red-3 c-border-red"){
//
////	      controller.dipBtn(buytogether_number, user_number);
//	      heartIcon.attr("class", "glyphicon glyphicon-heart c-font-22 c-font-red-3 c-border-red");
//
//	   } else if(btnClass == "glyphicon glyphicon-heart c-font-22 c-font-red-3 c-border-red"){
//
////	      controller.cancleDip(buytogether_number, user_number);
//	      heartIcon.attr("class", "icon-heart c-font-22 c-font-red-3 c-border-red");
//
//	   }      
//		
//	});

});