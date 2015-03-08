You are given a 2-Dimensional array with M rows and N columns. You are initially positioned at (0,0) which is the top-left cell in the array. You are allowed to move either right or downwards. The arrays is filled with 1's and 0's. A 1 indicates that you can move through that cell, a 0 indicates that you cannot move through the cell. Given a function numberOfPaths which takes in the above 2-D arrays, return the number of paths from the top-left cell to the bottom-right cell (i.e. (0,0) to (M-1,N-1)).

Your task is to complete the body of the function and return a single integer fenoting the number of paths mentioned above. Since the answer can be large, you have to return the number of paths modulo 1,000,000,007, i.e. ans % (10^9 + 7).

Constraints
- 1 <= N, M <= 1000

Sample Input #1:
1 1 1 1
1 1 1 1
1 1 1 1

Output #1:
10

Explanation #1:
None of the values in the array is zero. Counting all possible paths from (0,0) to (2,3) gives us 10 possible paths as follows:
- One path that goes all the way across the top row to (0,3).
- Two paths that go right to cell (0,2) then turn down.
- Three paths that go right to the cell (0,1) then turn down.
- Four paths that start by going down to cell (1,0).

