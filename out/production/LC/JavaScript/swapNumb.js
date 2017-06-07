/**
 * Created by anthonyng on 11/19/16.
 */
// How would you swap two numbers without using a temporary variable?
function swapNumb(a, b) {
    console.log("a: " + a + " | b: " + b);
    b = b - a;
    a = a + b;
    b = a - b;
    console.log("a: " + a + " | b: " + b);
}
swapNumb(2, 5);

// bit manipulation
function swapNumb_b(a, b) {
    console.log("a: " + a + " | b: " + b);
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    console.log("a: " + a + " | b: " + b);
}
swapNumb_b(2, 5);