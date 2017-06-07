/**
 * Created by anthonyng on 11/18/16.
 */

// Start a while looping and keep an object/ associated array.
// If i find an element for the first time i will set its value as true (that will tell me element added once.).
// If i find a element in the exists object, i will not insert it into the return array.

// Time Complexity: O(n), O(n)
function removeDuplicate(arr) {
    var checker = {};
    var resArr = [];

    for (var i = 0; i < arr.length; i++) {
        var num = arr[i];
        if (!checker[num]) {
            resArr.push(num);
            checker[num] = true;
        }
    }
    return resArr;
}

removeDuplicate([1,3,3,3,1,5,6,7,8,1]); //[1, 3, 5, 6, 7, 8]

