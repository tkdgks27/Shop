function joinCheck(){
	var id = document.joinForm.shop_id;
	var pw = document.joinForm.shop_pw;
	var pwc = document.joinForm.shop_pwCheck;
	var email = document.joinForm.shop_email;
	var add1 = document.joinForm.shop_address1;
	var add2 = document.joinForm.shop_address2;
	var add3 = document.joinForm.shop_address3;
	
	if(isEmpty(id) || containsHS(id)){
		alert("id 를 올바르게 입력해주세요");
		id.value="";
		id.focus();
		return false;
	}
	if(isEmpty(pw) || lessThan(pw, 6) || notContains(pw, '1234567890')
		|| notSame(pw, pwc)){
			alert("pw를 올바르게 입력해주세요");
			pw.value="";
			pw.value="";
			pw.focus();
			return false;
		}
	if(isEmpty(email)){
		alert("email을 다시 입력해주세요");
		email.focus();
		return false;
		
	}
	if(isEmpty(add1) || isEmpty(add2) || isEmpty(add3)){
		alert("주소를 입력해주세요")
		add3.focus();
	}
		return true;
}