document.write(`<h2>第一題</h2>`);
document.write(`<table>`);
document.write(`<tr>`);
for(let i = 1; i <= 9; i ++){
    document.write(`<td>`);
    for(let j = 2; j <= 9; j ++){
        document.write(`<p>${j} × ${i} = ${i * j}</p>`);
    }
    document.write(`</td>`);
}
document.write(`</tr>`);
document.write(`</table>`);