let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split('\n');
let n = Number(input[0]);
let arr = input[1].split(' ').map(Number);

let max = Math.max(...arr);
let min = Math.min(...arr);

console.log(min + ' ' + max);
