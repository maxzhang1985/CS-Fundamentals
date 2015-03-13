// #1: Binary Search, Runtime: O(nlogn), Space: O(1)
// function twoSum(numbers, target) {
//   for (var first = 0; first < numbers.length; first++) {
//     var second = bsearch(numbers, target - numbers[first], first + 1);
//     if (second != -1) {
//       console.log(numbers[first] + "+" + numbers[second] + "=" + target);
//       return [first + 1, second + 1];
//     }
//   }
//   console.log("No two sum solution");
// }

// function bsearch(list, key, startPt) {
//   var left = startPt;           //0
//   var right = list.length - 1;  //3
//   while (left < right) {
//     var mid = (left + right) / 2;
//     if (list[mid] < key) {
//       left = mid + 1;
//     } else {
//       right = mid;
//     }
//   }
//   if (left == right && list[left] == key) {
//     return left
//   } else {
//     return -1
//   }
// }

// #2: Two Pointers, Runtime: O(n), Space: O(1)
function twoSum(numbers, target) {
  var i = 0;
  var j = numbers.length - 1;
  while (i < j) {
    var sum = numbers[i] + numbers[j];
    if (sum < target) {
      i++;
    } else if (sum > target) {
      j--;
    } else {
      return [i, j];
    }
  }
  return "No two sum solution";
}



// Test Case
numbers = [2,4,11,15]
target = 19
console.log(twoSum(numbers,target)[0] === 1 && twoSum(numbers,target)[1] === 3); // true

numbers = [3,15,22,37]
target = 59
console.log(twoSum(numbers,target)[0] === 2 && twoSum(numbers,target)[1] === 3); // true

numbers = [3,4,24,53]
target = 100
console.log(twoSum(numbers,target) === 'No two sum solution'); // true