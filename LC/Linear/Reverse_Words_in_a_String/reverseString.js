// Runtime: O(n), Space: O(n)
function reverseStr(str) {
  // Remove all leading, trailing and miltiple whitespaces
  var words = str.replace(/ +(?= )/g,'').trim().split(' ');
  var reversedStr = [];
  for (var i = words.length - 1; i >= 0; i--) {
    reversedStr.push(words[i]);
  }
  return reversedStr.join(" ");
}
//------------------------------------------------------------------------------
// Reverse a single word using Recursion
function reverseAstr(str) {
  if (str === "") {
    // Handle the last char
    return "";
  } else {
    return reverseAstr(str.substr(1)) + str.charAt(0);
  }
}
// Reverse a single word using iteration
function stringReverser(str) {
  var reverse = '';
  for (var i = str.length - 1; i >= 0; i--) {
    reverse += str[i];
  }
  return reverse;
}
//------------------------------------------------------------------------------

// Test Case
s1 = 'the sky is blue'
console.log(reverseStr(s1) === 'blue is sky the'); // true

s2 = 'what a   wonderful   day '
console.log(reverseStr(s2) === 'day wonderful a what'); // true

s3 = 'string'
console.log(reverseAstr(s3) === 'gnirts') // true

