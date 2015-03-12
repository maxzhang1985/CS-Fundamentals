function isPalindrome(input_string) {
// ----- O(n) runtime, O(n) space -----

//   if (input_string.length === 0) {
//     return true;
//   } else {
//     var words = input_string.toLowerCase().replace(/[^a-zA-Z]/g,'');
//     var palindrome = "";
//     for (var i = words.length - 1; i >= 0 ; i--) {
//       palindrome += words[i];
//     };
//     if (words === palindrome) {
//       return true;
//     } else {
//       return false;
//     }
//   }

// ----- O(n) runtime, O(1) sapce -----
  var words = input_string.toLowerCase().replace(/[^a-zA-Z]/g, '');
  var left = 0;
  var right = words.length - 1;
  // Move two pointers towards each other until they meet
  while (left < right) {
    if (words[left] !== words[right]) {
      return false;
    };
    left++;
    right--;
  };
  return true;
}

// Test Case
console.log(isPalindrome("A man, a plan, a canal: Panama") === true);
console.log(isPalindrome("race a car") === false);
console.log(isPalindrome("") === true);