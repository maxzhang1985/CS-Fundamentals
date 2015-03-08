// You are given a 2-Dimensional array with M rows and N columns. You are initially positioned at (0,0) which is the top-left cell in the array. You are allowed to move either right or downwards. The arrays is filled with 1's and 0's. A 1 indicates that you can move through that cell, a 0 indicates that you cannot move through the cell. Given a function numberOfPaths which takes in the above 2-D arrays, return the number of paths from the top-left cell to the bottom-right cell (i.e. (0,0) to (M-1,N-1)).

// Your task is to complete the body of the function and return a single integer fenoting the number of paths mentioned above. Since the answer can be large, you have to return the number of paths modulo 1,000,000,007, i.e. ans % (10^9 + 7).

// Constraints
// - 1 <= N, M <= 1000

// Sample Input #1:
// 1 1 1 1
// 1 1 1 1
// 1 1 1 1

// Output #1:
// 10

// Explanation #1:
// None of the values in the array is zero. Counting all possible paths from (0,0) to (2,3) gives us 10 possible paths as follows:
// - One path that goes all the way across the top row to (0,3).
// - Two paths that go right to cell (0,2) then turn down.
// - Three paths that go right to the cell (0,1) then turn down.
// - Four paths that start by going down to cell (1,0).

// Sample Input #2:
// 1 1
// 0 1

// Output #2:
// 1

// Explanation #2:
// You can move only right from the top-left cell: (0,0) to (0,1). After that, your only move is to (1,1). Hence only 1 path.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoOfPathsInMatrix {

    int m,n;
    int arr[][]=null;

    public static void main(String[] args)throws IOException {

        NoOfPathsInMatrix obj=new NoOfPathsInMatrix();

        BufferedReader br =new BufferedReader(new InputStreamReader((System.in)));

        System.out.println("Enter the no of rows in matrix : ");
        obj.m = Integer.parseInt(br.readLine());
        System.out.println("Enter the no of cols in matrix : ");
        obj.n = Integer.parseInt(br.readLine());

        obj.arr = new int[obj.m][obj.n];
        for(int i=0; i< obj.m;i++)
        {
            System.out.println("Enter "+(i+1)+"th row : ");
            for(int j=0;j<obj.n;j++)
            {
                String s = br.readLine();
                obj.arr[i][j] = Integer.parseInt(s);
            }
        }

        System.out.println("No of paths : "+obj.noOfPaths(obj.arr,0,0));
    }

    int noOfPaths(int a[][], int i,int j)
    {
        if(i==m-1 && j==n-1)
            return a[i][j];
        else if (i==m-1)
            return a[i][j+1];
        else if (j==n-1)
            return a[i+1][j];
        else if(a[i][j]==1)
            return noOfPaths(a,i+1,j) + noOfPaths(a,i,j+1);
        else
            return 0;
    }
}