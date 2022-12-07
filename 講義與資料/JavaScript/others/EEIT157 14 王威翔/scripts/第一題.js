// 第一題
document.write(`<div class="body">`);
document.write(`<h2>第一題</h2>`);
document.write(`<table><tr>`);
for (i = 2; i <= 9; i++) {
  document.write(`<td>`);
  for (j = 1; j <= 9; j++) {
    document.write(`<p>${i} × ${j} = ${i * j}</p>`);
  }
  document.write(`</td>`);
}
document.write(`</tr></table>`);
document.write(`</div>`);