let fs = require('fs');
let [a, b] = fs.readFileSync('/dev/stdin').toString().split('\n');
let answer = '';

answer += a * b[2] + '\n';
answer += a * b[1] + '\n';
answer += a * b[0] + '\n';
answer += a * b;

console.log(answer);

//정수형 변환하지 않아도 계산이 됨...
