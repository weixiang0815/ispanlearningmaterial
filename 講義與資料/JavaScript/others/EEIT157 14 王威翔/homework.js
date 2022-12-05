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
  if (myName.value.trim() == "") {
    document.getElementById("name").innerHTML =
      '<i class="fa-solid fa-xmark"></i>不可為空白';
  }
  else if (/^.{1}$/.exec(myName.value) != null) {
    document.getElementById("name").innerHTML =
      '<i class="fa-solid fa-xmark"></i>需至少兩個字';
  }
  else {
    if (/^[\u4E00-\u9FFF]{2,}$/.exec(myName.value) != null) {
      document.getElementById("name").innerHTML =
        '<i class="fa-regular fa-circle"></i>驗證成功';
    }
    else {
      document.getElementById("name").innerHTML =
        '<i class="fa-solid fa-xmark"></i>需全為中文字';
    }
  }
});
// 密碼
document.write(`<div class=\"divform\">`);
document.write(`<label>密碼：</label>`);
document.write(`<input class=\"pw\">`);
document.write(`<span id=\"pw\"></span>`);
document.write(
  `<p>（1.不可空白 2.至少6個字且必須包含英數字、特殊字元[!@#$%^&*]）</p>`
);
document.write(`</div>`);
document.getElementsByClassName("pw")[0].addEventListener("blur", () => {
  let myPW = document.getElementsByClassName("pw")[0];
  if (myPW.value.trim() == "") {
    document.getElementById("pw").innerHTML =
      '<i class="fa-solid fa-xmark"></i>不可空白';
  }
  else if (/^.{1,5}$/.exec(myPW.value) != null) {
    document.getElementById("pw").innerHTML =
      '<i class="fa-solid fa-xmark"></i>需至少六個字';
  }
  else {
    if (/^\D{6,}$/.exec(myPW.value) != null) {
      document.getElementById("pw").innerHTML =
        '<i class="fa-solid fa-xmark"></i>需包含數字';
    }
    else if (/^[^a-zA-Z]{6,}$/.exec(myPW.value) != null) {
      document.getElementById("pw").innerHTML =
        '<i class="fa-solid fa-xmark"></i>需包含英文';
    }
    else if (/^[^!@#$^&*]{6,}$/.exec(myPW.value) != null) {
      document.getElementById("pw").innerHTML =
        '<i class="fa-solid fa-xmark"></i>需包含特殊字元[!@#$%^&*]';
    }
    else if (/^(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$^&*])[a-zA-Z\d!@#$^&*]{6,}$/.exec(myPW.value) != null) {
      document.getElementById("pw").innerHTML =
        '<i class="fa-regular fa-circle"></i>驗證成功';
    }
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
    document.getElementById("date").innerHTML =
      '<i class="fa-solid fa-xmark"></i>請依照格式要求輸入';
  } else {
    let d = new Date(myDate.value);
    let month =
      d.getMonth() + 1 >= 10 ? d.getMonth() + 1 : "0" + (d.getMonth() + 1);
    let day = d.getDate() >= 10 ? d.getDate() : "0" + d.getDate();
    let date = d.getFullYear() + "/" + month + "/" + day;
    if (date != myDate.value) {
      document.getElementById("date").innerHTML =
        '<i class="fa-solid fa-xmark"></i>日期不存在';
    } else {
      document.getElementById("date").innerHTML =
        '<i class="fa-regular fa-circle"></i>驗證成功';
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
const imgs = ["img1", "img2", "img3", "img4", "img5"];
let flags = {};
for (let img of imgs) {
  document.write(`<img id=\"${img}\" src=\"Images/star.gif\" />`);
  flags[img] = false;
}
for (let img of imgs) {
  $(`#${img}`).on({
    mouseenter: function () {
      if (Object.values(flags).indexOf(true) == -1) {
        $("#stars").text("評分為...." + $(this).attr("id").charAt(3));
      }
      for (let i of imgs) {
        if (i <= $(this).attr("id")) {
          $(`#${i}`).attr("src", "Images/chngstar.gif");
        }
      }
    },
    mouseleave: function () {
      if (Object.values(flags).indexOf(true) == -1) {
        $("#stars").text("評分為....");
        for (let i of imgs) {
          $(`#${i}`).attr("src", "Images/star.gif");
        }
      }
      else {
        for (let i of imgs) {
          if (!flags[i]) {
            $(`#${i}`).attr("src", "Images/star.gif");
          }
          else {
            $(`#${i}`).attr("src", "Images/chngstar.gif");
          }
        }
      }
    },
    click: function () {
      if (Object.values(flags).indexOf(true) == -1) {
        $("#stars").text("你給" + $(this).attr("id").charAt(3) + "顆星");
        for (let i of imgs) {
          if (i <= $(this).attr("id")) {
            $(`#${i}`).attr("src", "Images/chngstar.gif");
            flags[i] = true;
          }
        }
      }
    },
    dblclick: function () {
      $("#stars").text("評分為....");
      for (let i of imgs) {
        $(`#${i}`).attr("src", "Images/star.gif");
        flags[i] = false;
      }
    }
  })
}
document.write(`</div>`);
document.write(`<div class=\"text\">`);
document.write(`<h3>點一下星星可評分，點兩下可重置</h3>`);
document.write(`<h3 id=\"stars\">評分為....</h3>`);
document.write(`</div>`);
document.write(`</div>`);

// 第四題
document.write(`<div class="body">`);
document.write(`<h2>第四題</h2>`);
document.write(`</div>`);

// 第五題
document.write(`<div class="body">`);
document.write(`<h2>第五題</h2>`);
document.write(`</div>`);

// 第六題
document.write(`<div class="body">`);
document.write(`<h2>第六題</h2>`);
document.write(`</div>`);