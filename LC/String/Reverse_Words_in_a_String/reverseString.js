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


// Test Case
s1 = 'the sky is blue'
console.log(reverseStr(s1) === 'blue is sky the'); // true

s2 = 'what a   wonderful   day '
console.log(reverseStr(s2) === 'day wonderful a what'); // true

