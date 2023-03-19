let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split('\n');
let testCase = Number(input[0]);
let result = '';

for (let i = 1; i <= testCase; i++) {
  let data = input[i].split(' ').map(Number);
  result += data[0] + data[1] + '\n';
}
console.log(result);
