// 第五題
const weekdays = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"];
document.write(`<div class="body">`);
document.write(`<h2>第五題</h2>`);
document.write(`<select id="year">`);
for (let i = 2030; i >= 1900; i--) {
    document.write(`<option value="${i}">${i}</option>`);
}
document.write(`</select>`);
let y = $(`#year`).val();
document.write(`<label>年</label>`);
document.write(`<select id="month">`);
for (let i = 1; i <= 12; i++) {
    document.write(`<option value="${i}">${i}</option>`);
}
document.write(`</select>`);
let m = $(`#month`).val();
document.write(`<label>月</label>`);
document.write(`<select id="day">`);
for (let i = 1; i <= 31; i++) {
    let opt = i >= 29 ? `<option class="chnday">${i}</option>` : `<option>${i}</option>`;
    $(`#day`).append(opt);
}
document.write(`</select>`);
let d = $(`#day`).val();
document.write(`<label>日</label>`);
document.write(`<span id="dateinfo"></span>`);
document.write(`<div id="calendar"></div>`);
document.write(`</div>`);
let openYear = false;
$(`#year`).on({
    change: () => {
        y = $(`#year`).val();
        setDayOption(y, m);
        d = $(`#day`).val();
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
        setCalendar(y, m, d);
        $(`#year`).blur();
    },
    focus: () => {
        $(`#dateinfo`).text(`日期選擇中...`);
    },
    blur: () => {
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
    },
    mouseup: () => {
        if (openYear) {
            openYear = false;
            $(`#year`).blur();
        }
        else {
            openYear = true;
        }
    }
});
let openMonth = false;
$(`#month`).on({
    change: () => {
        m = $(`#month`).val();
        setDayOption(y, m);
        d = $(`#day`).val();
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
        setCalendar(y, m, d);
        $(`#month`).blur();
    },
    focus: () => {
        $(`#dateinfo`).text(`日期選擇中...`);
    },
    blur: () => {
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
    },
    mouseup: () => {
        if (openMonth) {
            openMonth = false;
            $(`#month`).blur();
        }
        else {
            openMonth = true;
        }
    }
});
let openDay = false;
$(`#day`).on({
    change: () => {
        d = $(`#day`).val();
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
        setCalendar(y, m, d);
        $(`#day`).blur();
    },
    focus: () => {
        $(`#dateinfo`).text(`日期選擇中...`);
    },
    blur: () => {
        $(`#dateinfo`).text(`你選擇的日期是${y}年${m}月${d}日`);
        setCalendar(y, m, d);
    },
    mouseup: () => {
        if (openDay) {
            openDay = false;
            $(`#day`).blur();
        }
        else {
            openDay = true;
        }
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
    let cal = `<table><caption>${y}.${m}</caption><thead><tr>`;
    for (let weekday of weekdays) {
        cal = cal.concat(`<th>${weekday}</th>`);
    }
    cal = cal.concat(`</tr></thead><tbody>`);
    for (let i = 0; i < new Date(y, m - 1, 1).getDay(); i++) {
        cal = cal.concat(`<td></td>`);
    }
    let day = new Date(y, m - 1, d).getDate();
    for (let i = 1; i <= new Date(y, m, 0).getDate(); i++) {
        cal = cal.concat(i != day ? `<td>${i}</td>` : `<td id="theDate">${i}</td>`);
        if (i == new Date(y, m, 0).getDate()) {
            for (let j = new Date(y, m, 0).getDay() + 1; j <= 6; j++) {
                cal = cal.concat(`<td></td>`);
            }
            cal = cal.concat(`</tr>`);
        }
        if (new Date(y, m - 1, i).getDay() == 6) {
            cal = cal.concat(`</tr><tr>`);
        }
    }
    cal = cal.concat(`</tbody></table>`);
    $(`#calendar`).append(cal);
}