let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().trim().split(' ');

let cnt = 0;
input.forEach(i => {
  if (i !== '') cnt++;
});
console.log(cnt);
