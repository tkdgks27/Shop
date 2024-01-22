function loginCheck() {
	var idField = document.login.login_id;
	var pwField = document.login.login_pw;

	if (isEmpty(idField) || isEmpty(pwField)) {
		alert("?");
		idField.value = "";
		pwField.value = "";
		idField.focus();
		return false;
	}

	return true;
}