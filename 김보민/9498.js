let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split('\n');

function check(a) {
  if (90 <= a && a <= 100) console.log('A');
  else if (80 <= a && a <= 89) console.log('B');
  else if (70 <= a && a <= 79) console.log('C');
  else if (60 <= a && a <= 69) console.log('D');
  else console.log('F');
}

check(Number(input[0]));
