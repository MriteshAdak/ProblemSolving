/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let start = 0;
    let end = nums.length-1;
    let mid;

    while (start <= end) {
        mid = Math.floor((start + end) / 2);
        
        if (nums[mid] > target) {
            end = mid - 1;
        }
        else if (nums[mid] < target) {
            start = mid + 1;
        }
        else {
            return mid;
        }
    }

    return start;
};

//Solved