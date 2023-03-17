let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();
let n = Number(input);
let sum = 0;
for (let i = 1; i <= n; i++) {
  sum += i;
}
console.log(sum);

//등차수열의 합 공식
console.log((n * (n + 1)) / 2);
