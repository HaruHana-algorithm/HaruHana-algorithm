let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split('\n');

let arr = [];
for (let i = 1; i <= input[0]; i++) {
  let [r, s] = input[i].split(' ');
  arr = s.split('');
  arr = arr.map(elem => elem.repeat(r));
  console.log(arr.join(''));
}
