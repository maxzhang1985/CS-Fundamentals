/**
 * Created by anthonyng on 11/19/16.
 */
// do both string reverse and word reverse.
function reverseInPlace(str) {
    return str.split(' ').reverse().join(' ').split('').reverse().join('');
}