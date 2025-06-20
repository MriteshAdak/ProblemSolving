/**
 * @param {string} s
 * @return {number}
 */

const ROMAN_SYMBOLS = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 };

var romanToInt = function(s) {
    
    let result = ROMAN_SYMBOLS[s[0]];
    let previousValue = ROMAN_SYMBOLS[s[0]];

    for (let charIndex = 1; charIndex < s.length; charIndex++) {
        
        if (ROMAN_SYMBOLS[s[charIndex]] <= previousValue)
            result += ROMAN_SYMBOLS[s[charIndex]];
        else if (ROMAN_SYMBOLS[s[charIndex]] > previousValue)
            result += (ROMAN_SYMBOLS[s[charIndex]] - 2*previousValue);

        previousValue = ROMAN_SYMBOLS[s[charIndex]];
    }

    return result;
};
// Solved