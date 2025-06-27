/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */

var addBinary = function (a, b) {
    return (BigInt(`0b${a}`) + BigInt(`0b${b}`)).toString(2);

// Or you can take the very long path here but it will eventually time out though it is made to handle large values

/*  let carryForward = false;
  let arrayBig = [], arraySmall = [];
  a.length > b.length?
    (arrayBig = a.split(""), arraySmall = [...b]):
    (arrayBig = b.split(""), arraySmall = [...a]);
  let resultArray = [];
  let i = arrayBig.length - 1;
  let j = arraySmall.length - 1;

  while (i >= 0) {

    if (j >= 0) {
    
        if (arrayBig[i] === arraySmall[j]) {
            if (carryForward) {
            resultArray.unshift("1");
            } else {
            resultArray.unshift("0");
            }

            if (arrayBig[i] == 0) {
            carryForward = false;
            } else {
            carryForward = true;
            }
        } else {
            if (carryForward) {
            resultArray.unshift("0");
            carryForward = true;
            } else {
            resultArray.unshift("1");
            carryForward = false;
            }
        }
        j--;
        i--;
        continue;
    } else if (carryForward) {
        if (arrayBig[i] == 0) {
            resultArray.unshift("1");
            carryForward = false;
        } else {
            resultArray.unshift("0");
        }
        i--;
    }
  }

  if (carryForward) {
    resultArray.unshift("1");
  }

  return resultArray.join("");*/
};
