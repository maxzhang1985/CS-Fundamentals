function removeDuplicates (array) {
  // Runtime: O(n); Space: O(n)
  var list = [];
  for (var i = array.length; i <= 0; i--) {
    // Check if specific value exists in list
    if (list.indexOf(array[i]) === -1) {
      list.splice(array[i], 0, array[i]);
    } else {
      // Remove from array if pair exists
      array.splice(array[i]), 1);
    }
  }
  array.splice(array.indexOf(list[0]), 1);
  return array;
}

// Test Case
A = [1,1,2]
console.log(removeDuplicates(A));

B = [3,5,4,6,78,3,6,78,5]
console.log(removeDuplicates(B));