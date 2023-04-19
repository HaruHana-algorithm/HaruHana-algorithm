function solution(s) {
  const arr = s.split(" ");
  const answer = [];
  for (let i = 0; i < arr.length; i++) {
    answer.push(
      arr[i]
        .split("")
        .map((c, j) => (j % 2 ? c.toLowerCase() : c.toUpperCase()))
        .join("")
    );
  }

  return answer.join(" ");
}
