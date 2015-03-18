function removeDuplicates (array) {
  var list = [];
  for (var i = 0; i < array.length; i++) {
    // Check if array is not empty
    if (!list[array[i]]) {
      list.splice(array[i], 0, array[i]);
      console.log(list);
      console.log(array[i]);
    } else {
      list.splice(array[i], 1);
      console.log(list);
      console.log(array[i]);
    }
  }
  return list;
}



// Test Case
A = [1,1,2]
console.log(removeDuplicates(A));