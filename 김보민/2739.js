let fs = require('fs');
let input = fs.readFileSync('input.txt').toString();
let n = Number(input);
for (let i = 1; i < 10; i++) {
  console.log(n + ' * ' + i + ' = ' + n * i);
}
