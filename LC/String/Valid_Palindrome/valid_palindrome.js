function isPalindrome(input_string) {
  if (input_string.length === 0) {
    return true;
  } else {
    for (var i = 0; i < input_string.length; i++) {
      // do sth
    };
  }

}







// Test Case
console.log(isPalindrome("A man, a plan, a canal: Panama") === true);
console.log(isPalindrome("race a car") === false);
console.log(isPalindrome("") == true);