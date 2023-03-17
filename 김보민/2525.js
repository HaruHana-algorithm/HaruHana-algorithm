let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let [h, m] = input[0].split(' ').map(Number);
let endTime = Number(input[1]);

let totalM = h * 60 + m + endTime;
//하루가 지날 수도 있으니
totalM %= 1440;
let hour = parseInt(totalM / 60);
let minute = totalM % 60;
console.log(hour + ' ' + minute);
