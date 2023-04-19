function solution(s) {
  let stack = [];

  [...s].forEach((i) => {
    if (indexOf(i) === lastIndexOf(i)) stack.push(i);
  });
  return stack.sort().join("");
}
