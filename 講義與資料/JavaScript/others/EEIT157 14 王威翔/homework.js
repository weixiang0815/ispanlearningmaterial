// 第一題
document.write(`<div class="body">`);
document.write(`<h2>第一題</h2>`);
document.write(`<table><tr>`);
for (let i = 2; i <= 9; i++) {
    document.write(`<td>`);
    for (let j = 1; j <= 9; j++) {
        document.write(`<p>${i} × ${j} = ${i * j}</p>`);
    }
    document.write(`</td>`);
}
document.write(`</tr></table>`);
document.write(`</div>`);

// 第二題
document.write(`<div class="body">`);
document.write(`<h2>第二題</h2>`);
document.write(`<form>`);
document.write(`<fieldset>`);
document.write(`<legend>Form Check</legend>`);
// 姓名
document.write(`<div class=\"divform\">`);
document.write(`<label>姓名：</label>`);
document.write(`<input class=\"name\">`);
document.write(`<span id=\"name\"></span>`);
document.write(`<p>（1.不可空白 2.至少兩個字以上 3.必須全部為中文字）</p>`);
document.write(`</div>`);
document.getElementsByClassName("name")[0].addEventListener("blur", () => {
    let myName = document.getElementsByClassName("name")[0];
    let regex = /^[\u4E00-\u9FFF]{2,}$/;
    if (regex.exec(myName.value) == null) {
        document.getElementById("name").innerHTML = '<i class="fa-solid fa-xmark"></i>驗證失敗，請符合規則';
    } else {
        document.getElementById("name").innerHTML = '<i class="fa-regular fa-circle"></i>驗證成功';
    }
});
// 密碼
document.write(`<div class=\"divform\">`);
document.write(`<label>密碼：</label>`);
document.write(`<input class=\"pw\">`);
document.write(`<span id=\"pw\"></span>`);
document.write(`<p>（1.不可空白 2.至少6個字且必須包含英數字、特殊字元[!@#$%^&*]）</p>`);
document.write(`</div>`);
document.getElementsByClassName("pw")[0].addEventListener("blur", () => {
    let myPW = document.getElementsByClassName("pw")[0];
    let regex = /^(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$^&*])[a-zA-Z\d!@#$^&*]{6,}$/;
    if (regex.exec(myPW.value) == null) {
        document.getElementById("pw").innerHTML = '<i class="fa-solid fa-xmark"></i>驗證失敗，請符合規則';
    } else {
        document.getElementById("pw").innerHTML = '<i class="fa-regular fa-circle"></i>驗證成功';
    }
});
// 日期
document.write(`<div class=\"divform\">`);
document.write(`<label>日期：</label>`);
document.write(`<input class=\"date\" onblur=\"checkDate()\">`);
document.write(`<span id=\"date\"></span>`);
document.write(`<p>格式:西元年/月/日（yyyy/mm/dd）</p>`);
document.write(`</div>`);
document.getElementsByClassName("date")[0].addEventListener("blur", () => {
    let myDate = document.getElementsByClassName("date")[0];
    let regex = /^\d{4}\/\d{2}\/\d{2}$/;
    if (regex.exec(myDate.value) == null) {
        document.getElementById("date").innerHTML = '<i class="fa-solid fa-xmark"></i>驗證失敗，請符合規則';
    } else {
        let d = new Date(myDate.value);
        let month = d.getMonth() + 1 >= 10 ? d.getMonth() + 1 : "0" + (d.getMonth() + 1);
        let day = d.getDate() >= 10 ? d.getDate() : "0" + d.getDate();
        let date = d.getFullYear() + "/" + month + "/" + day;
        if (date != myDate.value) {
            document.getElementById("date").innerHTML = '<i class="fa-solid fa-xmark"></i>驗證失敗，請符合規則';
        }
        else {
            document.getElementById("date").innerHTML = '<i class="fa-regular fa-circle"></i>驗證成功';
        }
    }
});
document.write(`</fieldset>`);
document.write(`</form>`);
document.write(`</div>`);

// 第三題
document.write(`<div class="body">`);
document.write(`<h2>第三題</h2>`);
document.write(`<div class=\"stars\">`);
for (let i = 1; i <= 5; i++) {
    document.write(`<img id=\"img` + i + `\" src=\"star.gif\" />`);
}
document.write(`<h3>點一下星星可評分，點兩下可重置</h3>`);
document.write(`<h3 id=\"stars\">評分為....</h3>`);
for (let i = 0; i < 5; i++) {
    let id = "img" + i;
    document.getElementById(id).addEventListener("mouseover", mouseover(id));
    document.getElementById(id).addEventListener("mouseout", mouseout(id));
    document.getElementById(id).addEventListener("click", click(i));
    document.getElementById(id).addEventListener("dblclick", dblclick);
}
function mouseover(id) {
    document.getElementById(id).src = "chngstar.gif";
};
function mouseout(id) {
    document.getElementById(id).src = "star.gif";
};
function click(num) {
    let id = "img" + num;
    document.getElementById(id).src = "chngstar.gif";
};
function dblclick() {
    for (let i = 0; i < 5; i++) {
        let id = "img" + i;
        document.getElementById(id).src = "star.gif";
    }
};

document.write(`</div>`)
document.write(`</div>`);

// 第四題
document.write(`<div class="body">`);
document.write(`<h2>第四題</h2>`);
document.write(`</div>`);