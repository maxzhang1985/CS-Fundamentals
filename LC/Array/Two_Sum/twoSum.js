function twoSum(numbers, target) {
  // #1: Brute force, Runtime: O(n^2), Space: O(1)
  for (var first = 0; first < numbers.length; first++) {
    for (var second = 0; second < numbers.length; second++ ) {
      if (numbers[first] + numbers[second] == target) {
        return [first, second];
      }
    }
  }
  return "No two sum solution"

  // #2: HashMap, Runtime: O(n), Space: O(n)
}

// Test Case
var numbers = [2,4,11,15]
var target = 19
console.log('Input=> numbers: ' + numbers + ' | target: ' + target);
console.log('Output=> index1 = ' + (twoSum(numbers, target)[0] + 1) + ', index2 = ' + (twoSum(numbers, target)[1] + 1));
if (twoSum(numbers,target) != "No two sum solution") {
  console.log(numbers[twoSum(numbers,target)[0]] + ' + ' + numbers[twoSum(numbers,target)[1]] + ' = ' + target + '\n'); //19
} else {
  console.log("No two sum solution");
}

var numbers = [3,15,37,22,48]
var target = 85
console.log('numbers: ' + numbers + ' | target: ' + target);
console.log('Output=> index1 = ' + (twoSum(numbers, target)[0] + 1) + ', index2 = ' + (twoSum(numbers, target)[1] + 1));
if (twoSum(numbers,target) != "No two sum solution") {
  console.log(numbers[twoSum(numbers,target)[0]] + ' + ' + numbers[twoSum(numbers,target)[1]] + ' = ' + target + '\n'); //85
} else {
  console.log("No two sum solution");
}

var numbers = [3,24,53,4]
var target = 100
console.log('numbers: ' + numbers + ' | target: ' + target);
console.log('Output=> index1 = ' + (twoSum(numbers, target)[0] + 1) + ', index2 = ' + (twoSum(numbers, target)[1] + 1));
if (twoSum(numbers,target) != "No two sum solution") {
  console.log(numbers[twoSum(numbers,target)[0]] + ' + ' + numbers[twoSum(numbers,target)[1]] + ' = ' + target + '\n');
} else {
  console.log("No two sum solution");
}
