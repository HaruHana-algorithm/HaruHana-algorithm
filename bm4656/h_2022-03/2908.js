let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split(' ');
let sanguen = input.map(i => i.split('').reverse().join(''));
console.log(Math.max(...sanguen));
