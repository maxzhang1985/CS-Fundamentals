function removeDuplicates (array) {
  var list = [];
  for (var i = 0; i < array.length; i++) {
    // Check if specific value exists in list
    if (list.indexOf(array[i]) === -1) {
      list.splice(array[i], 0, array[i]);
    } else {
      // Remove from list if pair exists
      list.splice(list.indexOf(array[i]), 1);
    }
  }
  return list;
}



// Test Case
A = [1,1,2]
console.log(removeDuplicates(A));