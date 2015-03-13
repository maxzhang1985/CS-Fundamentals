function reverseStr(str) {
  // Remove all leading, trailing and miltiple whitespaces
  str = str.replace(/ +(?= )/g,'').trim();
  list = str.split(' ');
  console.log(list);
  var reversedStr = [];
  for (var i = list.length - 1; i >= 0; i--) {
    reversedStr.push(list[i]);
  }
  result = reversedStr.join(" ");
  return result;
}


// Test Case
s1 = 'the sky is blue'
console.log(reverseStr(s1) === 'blue is sky the' ); // true

s2 = 'what a   wonderful   day '
console.log(reverseStr(s2));

