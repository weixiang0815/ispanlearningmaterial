// 第五題
let y = 1900;
document.write(`<div class="body">`);
document.write(`<h2>第五題</h2>`);
document.write(`<select id="year">`);
for (let i = 1900; i <= 2030; i++) {
    document.write(`<option value="${i}">${i}</option>`);
}
$(`#year`).change(function () {
    y = document.getElementById("year").value;
    setDayOption(y, m);
});
document.write(`</select>`);
document.write(`<label>年</label>`);
document.write(`<select id="month">`);
for (let i = 1; i <= 12; i++) {
    document.write(`<option value="${i}">${i}</option>`);
}
let m = 1;
$(`#month`).change(function () {
    m = document.getElementById("month").value;
    setDayOption(y, m);
});
document.write(`</select>`);
document.write(`<label>月</label>`);
document.write(`<select id="day">`);
setDayOption(y, m);
function setDayOption(y, m) {
    $(`#day`).empty();
    for (let i = 1; i <= new Date(y, m, 0).getDate(); i++) {
        $(`#day`).append(`<option>${i}</option>`);
    }
}
let d = 1;
$(`#day`).change(function () {
    d = document.getElementById("day").value;
});
document.write(`</select>`);
document.write(`<label>日</label>`);
document.write(`<span></span>`);
document.write(`</div>`);