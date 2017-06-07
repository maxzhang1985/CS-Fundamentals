// Given an array of integers, every element appears twice except for one. Find that single one.

// Note:
// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

// // Bit manipulation, Time Complexity: O(n) | Space Complexity: O(1)
// XOR(Exclusive OR) will return 1 only on two different bits. So if two numbers are the same, XOR will return 0. Finally only one number left.
// As long as there is a duplicate one later in the operation, it will cancel out each other to 0. So the only single one will be left over, and become the result.

var singleNumber = function(nums) {
  var result = 0;
  for (var i = 0; i < nums.length; i++) {
    console.log(result);
    console.log(nums[i]);
    result ^= nums[i];
    console.log('new result: ' + result);
  }
  return console.log('result ' + result);
}

// Test Case
singleNumber([1,1,2,2,3,3,4,5,5])
singleNumber([1,0,1])
singleNumber([1,3,5,7,9,1,3,5,7])