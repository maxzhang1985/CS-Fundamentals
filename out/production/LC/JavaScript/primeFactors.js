/**
 * Created by anthonyng on 11/18/16.
 */
// Time Complexity: O(n)
function primeFactors(n) {
    var divisor = 2;
    var factor = [];
    while (n > 2) { // stop when it becomes 1 (divided by itself)
        if (n % divisor === 0) {
            factor.push(divisor);
            n = n / divisor;
        } else {
            divisor++;
        }
    }
    return factor;
}

