/**
 * Created by anthonyng on 11/18/16.
 */
// Time Complexity: O(n)
function greatestCommonDivisor(a, b) {
    if (a < 0 || b < 0) return -1;

    var res = 1;
    for (var i = 1; i <= Math.min(a, b); i++) {
        if (a % i === 0 && b % i === 0) {
            res = i;
        }
    }
    return res;
}

// Recursive: O(logn)
function greatestCommonDivisor_r(a, b){
    if(b == 0)
        return a;
    else
        return greatestCommonDivisor_r(b, a%b);
}

greatestCommonDivisor(14, 21); // 7

greatestCommonDivisor(69, 169); // 1

greatestCommonDivisor_r(14, 21); // 7