// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.
// For example,
// Consider the following matrix:

// [
//   [1,   3,  5,  7],
//   [10, 11, 16, 20],
//   [23, 30, 34, 50]
// ]
// Given target = 3, return true.
// Given target = 100, return false.

// Time Complexity: O(m*n)
var searchMatrix = function(matrix, target) {
  var result = false;
  for (i = 0; i < matrix.length; i++) {
    for (j = 0; j < matrix[i].length; j++) {
      if (target === matrix[i][j]) {
        result = true;
      }
    }
  }
  console.log(result);
}

// Test Case
arr = [
        [1,   3,  5,  7],
        [10, 11, 16, 20],
        [23, 30, 34, 50]
       ]

searchMatrix(arr, 3);
searchMatrix(arr, 99);

// Time Complexity: O(m+n) --> Binary Search, diagonal split


