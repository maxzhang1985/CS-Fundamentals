function isPalindrome(input_string) {
  if (input_string.length === 0) {
    return true;
  } else {
    var words = input_string.toLowerCase().replace(/[^a-zA-Z]/g,'');
    var palindrome = "";
    for (var i = words.length - 1; i >= 0 ; i--) {
      palindrome += words[i];
    };
    if (words === palindrome) {
      return true;
    } else {
      return false;
    }
  }

}

// Test Case
console.log(isPalindrome("A man, a plan, a canal: Panama") === true);
console.log(isPalindrome("race a car") === false);
console.log(isPalindrome("") === true);