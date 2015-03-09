// #1: Binary Search, Time: O(nlogn), Space: O(1)
function twoSum(numbers, target) {
  for (var first = 0; first < numbers.length; first++) {
    var second = bsearch(numbers, target - numbers[first], first + 1);
    if (second != -1) {
      console.log(numbers[first] + "+" + numbers[second] + "=" + target);
      return [first + 1, second + 1];
    }
  }
  console.log("No two sum solution");
}

function bsearch(list, key, startPt) {
  var left = startPt;           //0
  var right = list.length - 1;  //3
  while (left < right) {
    var mid = (left + right) / 2;
    if (list[mid] < key) {
      left = mid + 1;
    } else {
      right = mid;
    }
  }
  if (left == right && list[left] == key) {
    return left
  } else {
    return -1
  }
}

// Test Case
numbers = [2,4,11,15]
target = 19
console.log(twoSum(numbers,target))

console.log("---")

numbers = [3,15,22,37]
target = 100
console.log(twoSum(numbers,target))