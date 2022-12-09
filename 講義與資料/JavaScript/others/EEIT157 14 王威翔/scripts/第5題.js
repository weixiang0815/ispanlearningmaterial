// 第五題
const weekdays = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
document.write(`<div class="body">`);
document.write(`<h2>第五題</h2>`);
document.write(`<select id="year">`);
for (let i = 2030; i >= 1900; i--) {
    document.write(`<option value="${i}">${i}</option>`);
}
document.write(`</select>`);
let y = document.getElementById("year").value;
document.write(`<label>年</label>`);
document.write(`<select id="month">`);
for (let i = 1; i <= 12; i++) {
    document.write(`<option value="${i}">${i}</option>`);
}
document.write(`</select>`);
let m = document.getElementById("month").value;
document.write(`<label>月</label>`);
document.write(`<select id="day">`);
for (let i = 1; i <= 31; i++) {
    let opt = i >= 29 ? `<option class="chnday">${i}</option>` : `<option>${i}</option>`;
    $(`#day`).append(opt);
}
document.write(`</select>`);
let d = document.getElementById("day").value;
document.write(`<label>日</label>`);
document.write(`<span id="dateinfo"></span>`);
document.write(`<div id="calendar"></div>`);
document.write(`</div>`);
$(`#year`).on({
    change: () => {
        y = document.getElementById("year").value;
        setDayOption(y, m);
        d = document.getElementById("day").value;
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
        setCalendar(y, m, d);
    },
    focus: () => {
        $(`#dateinfo`).text(`日期選擇中...`);
    },
    blur: () => {
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
    }
});
$(`#month`).on({
    change: () => {
        m = document.getElementById("month").value;
        setDayOption(y, m);
        d = document.getElementById("day").value;
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
        setCalendar(y, m, d);
    },
    focus: () => {
        $(`#dateinfo`).text(`日期選擇中...`);
    },
    blur: () => {
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
    }
});
$(`#day`).on({
    change: () => {
        d = document.getElementById("day").value;
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
        setCalendar(y, m, d);
    },
    focus: () => {
        $(`#dateinfo`).text(`日期選擇中...`);
    },
    blur: () => {
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
    }
});
function setDayOption(y, m) {
    $(`.chnday`).remove();
    for (let i = 29; i <= new Date(y, m, 0).getDate(); i++) {
        $(`#day`).append(`<option class="chnday">${i}</option>`);
    }
}
function setCalendar(y, m, d) {
    if ($(`#calendar>table`) != null) {
        $(`#calendar`).empty();
    }
    let cal = `<table><thead><tr>`;
    for (let weekday of weekdays) {
        cal = cal.concat(`<th>${weekday}</th>`);
    }
    cal = cal.concat(`</tr></thead><tbody>`);
    for (let i = 0; i < new Date(y, m-1, 1).getDay(); i++) {
        cal = cal.concat(`<td></td>`);
    }
    let day = new Date(y, m-1, d).getDate();
    for (let i = 1; i <= new Date(y, m, 0).getDate(); i++) {
        cal = cal.concat(i != day ? `<td>${i}</td>` : `<td id="theDate">${i}</td>`);
        if (i == new Date(y, m, 0).getDate()) {
            for (let j = new Date(y, m, 0).getDay()+1; j <= 6 ; j++) {
                cal = cal.concat(`<td></td>`);
            }
            cal = cal.concat(`</tr>`);
        }
        if (new Date(y, m-1, i).getDay() == 6) {
            cal = cal.concat(`</tr><tr>`);
        }
    }
    cal = cal.concat(`</tbody></table>`);
    $(`#calendar`).append(cal);
}