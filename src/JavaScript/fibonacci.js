/**
 * Created by anthonyng on 11/18/16.
 */
function fibonacci_r(n) {
    // recursive: O(2^n)
    if (n <= 2) return 1;
    return fibonacci_r(n-1) + fibonacci_r(n-2);
}

function fibonacci_i(n) {
    // iterative: O(n)
    var res = 0;
    var first = 1;
    var second = 1;

    if (n <= 2) return 1;

    for (var i = 3; i <= n; i++){
        res = first + second;
        first = second;
        second = res;
    }
    return res;
}

fibonacci_r(15);
fibonacci_i(15);