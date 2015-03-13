function twoSum(numbers, target) {
  // #1: Brute force, time: O(n^2), Space: O(1)

  for (var first = 0; first < numbers.length; first++) {
    for (var second = 0; second < numbers.length; second++ ) {
      if (numbers[first] + numbers[second] == target) {
        result = [first, second];
        console.log(numbers[first] + "+" + numbers[second] + "=" + target)
        return result;
      }
    }
  }
  return "No two sum solution"

  // #2: HashMap, time: O(n), Space: O(n)
}

// Test Case
numbers = [2,4,11,15]
target = 19
console.log(twoSum(numbers,target))

numbers = [3,15,37,22]
target = 37
console.log(twoSum(numbers,target))

numbers = [3,24,53,4]
target = 100
console.log(twoSum(numbers,target))