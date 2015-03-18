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
  return list[0];
}



// Test Case
A = [1,1,2]
console.log(removeDuplicates(A) === 2);

B = [3,5,4,6,78,3,6,78,5]
console.log(removeDuplicates(B) === 4);