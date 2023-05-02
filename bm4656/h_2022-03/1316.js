let fs = require('fs');
let input = fs.readFileSync('input.txt').toString().split('\n');

let cnt = 0;
for (let i = 1; i <= input[0]; i++) {
  let data = input[i];
  if (check(data)) {
    cnt++;
  }
}
console.log(cnt);

function check(data) {
  let setData = new Set(data[0]);
  for (let i = 0; i < data.length - 1; i++) {
    if (data[i] != data[i + 1]) {
      if (setData.has(data[i + 1])) {
        return false;
      } else {
        setData.add(data[i + 1]);
      }
    }
  }
  return true;
}
