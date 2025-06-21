/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    
    let commonPrefix = "";
    let tempPrefixCheck = [...strs[0]];
    for(let strings of strs) {
        let currentString = [...strings];
        let i = 0;
        while (i<(Math.min(tempPrefixCheck.length, currentString.length))) {
            if (tempPrefixCheck[i] !== currentString[i]) {
                break;
            }
            i++;
        }
        tempPrefixCheck.splice(i);
    }
    commonPrefix = tempPrefixCheck.join("");
    return commonPrefix;
};