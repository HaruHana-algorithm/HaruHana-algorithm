let fs = require('fs');
let [n, input] = fs.readFileSync('input.txt').toString().split('\n');

let arr = input.split(' ').map(Number);

let max = Math.max(...arr);
let updated = [];
for (let i = 0; i < n; i++) {
  updated.push((arr[i] / max) * 100);
}

console.log(updated.reduce((sum, cur) => sum + cur) / n);
