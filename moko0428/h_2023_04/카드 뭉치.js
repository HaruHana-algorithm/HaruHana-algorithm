function solution(cards1, cards2, goal) {
  let result = "Yes";

  let c1 = goal.filter((c) => cards1.includes(c));
  let c2 = goal.filter((c) => cards2.includes(c));

  c1.forEach((c, i) => {
    if (c != cards1[i]) result = "No";
  });

  c2.forEach((c, i) => {
    if (c != cards2[i]) answer = "No";
  });
  return "Yes";
}
