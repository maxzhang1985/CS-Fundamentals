/**
 * Created by anthonyng on 11/18/16.
 */
// Two Pointers
// Time Complexity: O(m+n)
function mergeSortedArray(a,b) {
    var sortedArr = [];
    var eA = a[0], eB = b[0];
    var i = 1, j = 1;
    
    if (a.length === 0) return b;
    if (b.length === 0) return a;
    
    while (eA || eB) {
        if (!eA && eB || eA > eB) {
            sortedArr.push(eB);
            eB = b[j++];
        } else {
            sortedArr.push(eA);
            eA = a[i++];
        }
    }
    return sortedArr;
}

mergeSortedArray([2,5,6,9], [1,2,3,29]); // [1, 2, 2, 3, 5, 6, 9, 29]
