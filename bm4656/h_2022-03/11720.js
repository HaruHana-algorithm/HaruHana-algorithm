let fs = require('fs');
let [n, input] = fs.readFileSync('input.txt').toString().split('\n');

let arr = input.split('').map(Number);

console.log(arr.reduce((sum, cur) => sum + cur));
