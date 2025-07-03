/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    
    if (x === 0 || x === 1) {
        return x;
    }

    // doing a binary search on the list of natural numbers for an optimal search
    let start = 0;
    let end = x;
    let mid;

    while (end !== (start+1)) {
        mid = Math.ceil( (start + end) / 2 );

        if (mid * mid > x) {
            end = mid;
        } else if (mid * mid < x) {
            start = mid;
        } else {
            return mid;
        }
    }

    return start;
};

//Solved