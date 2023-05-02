let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split('\n').map(Number);

let max = Math.max(...input);
let i = 0;
input.forEach((elem, index) => {
  if (elem === max) {
    i = index + 1;
  }
});
console.log(max + '\n' + i);

// 더 쉽게 가능
//console.log(input.indexOf(max)+1)
