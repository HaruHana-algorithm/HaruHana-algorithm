let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split('\n').map(Number);
let set = new Set();

for (let i = 0; i < 10; i++) {
  set.add(input[i] % 42);
}
console.log(set.size);
