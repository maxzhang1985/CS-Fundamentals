function removeDuplicates (array) {
  var list = [];
  for (var i = 0; i < array.length; i++) {
    if (list[array[i]] === nil) {
      list[array[i]] = array[i];
    } else {
      list.splice(array[i], 1);
    }
  }
}



// Test Case
A = [1,1,2]
console.log(removeDuplicates(A) == 2);