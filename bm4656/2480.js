let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split(' ').map(Number);

let [a, b, c] = input;
let prize = 0;
if (a === b && b === c) prize = 10000 + a * 1000;
else if (a === b && b !== c) prize = 1000 + a * 100;
else if (a !== b && b === c) prize = 1000 + b * 100;
else if (a === c && b !== c) prize = 1000 + a * 100;
else {
  prize = Math.max(...input) * 100;
}
console.log(prize);
