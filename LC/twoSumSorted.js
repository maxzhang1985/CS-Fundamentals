// Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

// The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

// You may assume that each input would have exactly one solution.

// Input: numbers={2, 7, 11, 15}, target=9
// Output: index1=1, index2=2

// #1: Binary Search, Time: O(nlogn), Space: O(1)
function twoSum(numbers, target) {
  for (var first = 0; first < numbers.length; first++) {
    var second = bsearch(numbers, target - numbers[first], first + 1);
    if (second != -1) {
      return [first + 1, second + 1];
    }
  }
  console.log("No two sum solution");
}



// Test Case
numbers = [2,4,11,15]
target = 19
console.log(twoSum(numbers,target))

console.log("---")

numbers = [3,15,37,22]
target = 100
console.log(twoSum(numbers,target))