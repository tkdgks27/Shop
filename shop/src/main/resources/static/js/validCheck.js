// <input>을 넣어서
// 안썼으면 true, 내용이 있으면 false
function isEmpty(input) {
	return !input.value;
}

// <input>, 글자수 넣어서
// 글자수가 부족하면 true, 정상이면 false
function lessThan(input, len) {
	return input.value.length < len;
}

// <input> 넣어서
// 한글/한자/... 들어있으면 true, 아니면 false
function containsHS(input) {
	// 써도 되는 것들
	var ok = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM.@_-";
	for (var i = 0; i < input.value.length; i++) {
		if (ok.indexOf(input.value[i]) == -1) {
			return true;
		}
	}
	return false;
}

// input x 2넣어서
// 글자 다르면 true, 같으면 false
function notSame(input1, input2) {
	return input1.value != input2.value;
}

// input, 문자열세트 넣어서
// 그거 없으면 true, 있으면 false
function notContains(input, set) {
	for (var i = 0; i < set.length; i++) {
		if (input.value.indexOf(set[i]) != -1) {
			return false;
		}
	}
	return true;
}

// input넣어서
// 숫자 아니면 true, 숫자면 false
function isNotNum(input) {
	return isNaN(input.value) || (input.value.indexOf(" ") != -1);
}

// input, 확장자 넣어서
// 그 파일이 아니면 true, 그거면 false
function isNotType(input, type) {
	type = "." + type;
	// input.value : C:\fakepath\선택한파일명
	return input.value.toLowerCase().indexOf(type) == -1;	
}