let fs = require('fs');
let [c, ...input] = fs.readFileSync('input.txt').toString().split('\n');

for (let i = 0; i < c; i++) {
  let [n, ...arr] = input[i].split(' ').map(Number);

  let average = arr.reduce((sum, current) => sum + current) / n;

  let filter = arr.filter(elem => elem > average);

  console.log(((filter.length / n) * 100).toFixed(3) + '%');
}
