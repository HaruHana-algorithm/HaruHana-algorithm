function mySolution(s) {
  let arr = s.split("");
  let num = arr.map((_, i) => arr[i].charCodeAt(0));
  let arr2 = num.sort((a, b) => b - a);
  return arr2.map((_, i) => String.fromCharCode(arr2[i])).join("");
}

function solution(s) {
  return s.split("").sort().reverse().join("");
}
