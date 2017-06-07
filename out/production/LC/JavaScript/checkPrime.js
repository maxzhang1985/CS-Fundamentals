/**
 * Created by anthonyng on 11/18/16.
 */
// Time Complexity: O(n)
function isPrime(n) {
    var divisor = 2;
    if (n <= 1) {
        return false;
    }

    while (n > divisor) {
        if (n % divisor === 0) {
            return false;
        } else if (divisor >= 3) {
            divisor += 2;
            console.log(divisor);
        } else {
            divisor++;
            console.log(divisor);
        }
    }
    return true;
}

isPrime(1); // false
isPrime(137); // true
isPrime(237); // false