let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();
let n = Number(input);
let result = '';
for (let i = 0; i < n; i++) {
  for (let j = 0; j <= i; j++) {
    result += '*';
  }
  result += '\n';
}
console.log(result);
