function reverseStr(str) {
  list = str.split(" ");
  var reversedStr = [];
  for (var i = list.length - 1; i >= 0; i--) {
    reversedStr.push(list[i]);
  }
  result = reversedStr.join(" ");
  return result;
}


// Test Case
s = 'the sky is blue'
console.log(reverseStr(s) === 'blue is sky the' ); // true

