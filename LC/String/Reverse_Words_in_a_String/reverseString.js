function reverseStr(str) {
  reversedList = [];
  for (var i = 0; i < str.length; i++) {
    if (str[i] === " ") {
      reversedList.push(str.substr(0, i - 1));
    }
  }
  console.log(reversedList);
  return reversedList;
}


// Test Case
s = 'the sky is blue'
console.log(reverseStr(s) === 'blue is sky the' ); // true

