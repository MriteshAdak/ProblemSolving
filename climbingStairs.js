/**
 * @param {number} n
 * @return {number}
 */

function factorial(num) {
    let result = 1;
    
    for (let i = 2; i <= num; i++) {
        result *= i;
    }

    return result;
}

var climbStairs = function(n) {
    
    let numberOfCombinations = 1;

    for (let i = 1; i <= Math.floor(n/2); i++) {

        numberOfCombinations += ( factorial(n-i) / ( factorial(n-2*i) * factorial(i) ) );
    }

    return numberOfCombinations;

};

//Solved