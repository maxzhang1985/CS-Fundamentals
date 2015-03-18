function removeDuplicates (array) {
  // Runtime: O(n); Space: O(n)
//   var list = [];
//   for (var i = array.length - 1; i >= 0; i--) {
//     // Check if specific value exists in list
//     if (list.indexOf(array[i]) === -1) {
//       list.splice(array[i], 0, array[i]);
//     } else {
//       // Remove from array if pair exists
//       list.splice(list.indexOf(array[i]), 1);
//       array.splice(i, 1);
//     }
//   }
//   return array.length;
// }

// ========================================================
  // Runtime: O(n); Space: O(1)
  var len = array.length;
  if (len < 2) {
    return len;
  }

  var i = 0;
  var j = 1;
  while (i < len && j < len) {    // If duplicate exists
    if (array[i] == array[j]) {   // j continues to find the next different number
      j++;
    } else {
      i++;                        // i becomes the duplicated number that will be replaced
      array[i] = array[j];        // replace the non-duplicated j with the duplicated i
      j++;                        // update the next unchecked j
    }
  }
  console.log(array);
  return i + 1;
}

// Test Case
A = [1,1,2]
console.log(removeDuplicates(A)); // 2

B = [3,3,3,5,5,7,7,7,7,9,9,9,9,9,11]
console.log(removeDuplicates(B)); // 5