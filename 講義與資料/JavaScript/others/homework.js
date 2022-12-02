document.write(`<div class="body">`);
document.write(`<h2>第一題</h2>`);
document.write(`<table><tr>`);
for (let i = 1; i <= 9; i++) {
    document.write(`<td>`);
    for (let j = 2; j <= 9; j++) {
        document.write(`<p>${j} × ${i} = ${i * j}</p>`);
    }
    document.write(`</td>`);
}
document.write(`</tr></table>`);
document.write(`</div>`);

document.write(`<div class="body">`);
document.write(`<h2>第二題</h2>`);
document.write(`<form>`);
document.write(`<fieldset>`);
document.write(`<legend>Form Check</legend>`);
// 姓名
document.write(`<div class=\"divform\">`);
document.write(`<label>姓名：</label>`);
document.write(`<input class=\"name\" onblur=\"checkName()\">`);
document.write(`<span id=\"name\"></span>`);
document.write(`<p>（1.不可空白 2.至少兩個字以上 3.必須全部為中文字）</p>`);
document.write(`</div>`);
let checkName = () => {
    let myName = document.getElementsByClassName("name")[0];
    let regex = /^[\u4E00-\u9FFF]{2,}$/;
    if (regex.exec(myName.value) == null) {
        document.getElementById("name").innerHTML = '<i class="fa-solid fa-xmark"></i>驗證失敗，請符合規則';
    } else {
        document.getElementById("name").innerHTML = '<i class="fa-regular fa-circle"></i>驗證成功';
    }
};
// 密碼
document.write(`<div class=\"divform\">`);
document.write(`<label>密碼：</label>`);
document.write(`<input class=\"pw\" onblur=\"checkPW()\">`);
document.write(`<span id=\"pw\"></span>`);
document.write(`<p>（1.不可空白 2.至少6個字且必須包含英數字、特殊字元[!@#$%^&*]）</p>`);
document.write(`</div>`);
let checkPW = () => {
    let myPW = document.getElementsByClassName("pw")[0];
    let regex = /^(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$^&*])[a-zA-Z\d!@#$^&*]{6,}$/;
    if (regex.exec(myPW.value) == null) {
        document.getElementById("pw").innerHTML = '<i class="fa-solid fa-xmark"></i>驗證失敗，請符合規則';
    } else {
        document.getElementById("pw").innerHTML = '<i class="fa-regular fa-circle"></i>驗證成功';
    }
};
// 日期
document.write(`<div class=\"divform\">`);
document.write(`<label>日期：</label>`);
document.write(`<input class=\"date\" onblur=\"checkDate()\">`);
document.write(`<span id=\"date\"></span>`);
document.write(`<p>格式:西元年/月/日（yyyy/mm/dd）</p>`);
document.write(`</div>`);
let checkDate = () => {
    let myDate = document.getElementsByClassName("date")[0];
    let regex = /^\d{4}\/\d{2}\/\d{2}$/;
    if (regex.exec(myDate.value) == null) {
        document.getElementById("date").innerHTML = '<i class="fa-solid fa-xmark"></i>驗證失敗，請符合規則';
    } else {
        console.log(myDate.value);
        // console.log(regex.exec(myDate.value)[0]);
        let d = new Date(myDate.value);
        let date = d.getFullYear() + "/" + (d.getMonth() + 1) + "/" + d.getDate();
        console.log(date);
        if (date != myDate.value) {
            document.getElementById("date").innerHTML = '<i class="fa-solid fa-xmark"></i>驗證失敗，請符合規則';
        }
        else {
            document.getElementById("date").innerHTML = '<i class="fa-regular fa-circle"></i>驗證成功';
        }
    }
};

document.write(`</fieldset>`);
document.write(`</form>`);
document.write(`</div>`);

document.write(`<div class="body">`);
document.write(`<h2>第三題</h2>`);
document.write(`</div>`);

document.write(`<div class="body">`);
document.write(`<h2>第四題</h2>`);
document.write(`</div>`);