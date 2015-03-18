function removeDuplicates (array) {
  // Runtime: O(n); Space: O(n)
  // var list = [];
  // for (var i = array.length - 1; i >= 0; i--) {
  //   // Check if specific value exists in list
  //   if (list.indexOf(array[i]) === -1) {
  //     list.splice(array[i], 0, array[i]);
  //   } else {
  //     // Remove from array if pair exists
  //     list.splice(list.indexOf(array[i]), 1);
  //     array.splice(i, 1);
  //   }
  // }
  // return array.length;

// ========================================================
  // Runtime: O(n); Space: O(1)
  var len = array.length;
  if (len < 2) {
    return len;
  }

  var i = 0;
  var j = 1;
  while (i < len && j < len) {
    if (array[i] == array[j]) {
      j++;
    } else {
      i++;
      array[i] = array[j];
      j++;
    }
  }
  return i + 1;
}

// Test Case
A = [1,1,2]
console.log(removeDuplicates(A)); // 2

B = [3,5,4,6,78,3,6,78,5]
console.log(removeDuplicates(B)); // 5