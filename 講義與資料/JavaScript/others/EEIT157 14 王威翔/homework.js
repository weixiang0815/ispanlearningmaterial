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
document.write(`<div class="divform">`);
document.write(`<label>姓名：</label>`);
document.write(`<input class="name">`);
document.write(`<span id="name"></span>`);
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
document.write(`<div class="divform">`);
document.write(`<label>密碼：</label>`);
document.write(`<input class="pw">`);
document.write(`<span id="pw"></span>`);
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
document.write(`<div class="divform">`);
document.write(`<label>日期：</label>`);
document.write(`<input class="date" onblur="checkDate()">`);
document.write(`<span id="date"></span>`);
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
document.write(`<div class="stars">`);
const imgs = ["img1", "img2", "img3", "img4", "img5"];
let flags = {};
for (let img of imgs) {
  document.write(`<img id="${img}" src="Images/star.gif" />`);
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
document.write(`<div class="text">`);
document.write(`<h3>點一下星星可評分，點兩下可重置</h3>`);
document.write(`<h3 id="stars">評分為....</h3>`);
document.write(`</div>`);
document.write(`</div>`);

// 第四題
document.write(`<div class="body">`);
document.write(`<h2>第四題</h2>`);
document.write(`<fieldset class="carousel">`);
document.write(`<legend>廣告輪播</legend>`);
document.write(`<a id="imglink" href="https://www.winentaste.com/magazine/tutorial_taste_step" disabled>`)
document.write(`<figure>`);
document.write(`<img id="playingimg" src="Images/品味，品酒.jfif" href="https://www.winentaste.com/magazine/tutorial_taste_step" alt="品味，品酒" title="品味，品酒"/ >`);
document.write(`</figure>`);
document.write(`</a>`);
document.write(`<div class="nums">`);
for (let i = 1; i <= 7; i++) {
  document.write(`<span id="num${i}">${i}</span>`);
}
const images = [
  {},
  {
    title: "品味，品酒",
    src: "Images/品味，品酒.jfif",
    url: "https://www.winentaste.com/magazine/tutorial_taste_step",
  },
  {
    title: "沙漠之旅",
    src: "Images/沙漠之旅.jfif",
    url: "https://www.skyscanner.com.tw/news/inspiration/the-5-best-desert-safaris-in-the-world",
  },
  {
    title: "戰爭思辨",
    src: "Images/戰爭思辨.jfif",
    url: "https://future.org.tw/civicrm/event/info?reset=1&id=113",
  },
  {
    title: "深愛的大海",
    src: "Images/深愛的大海.jfif",
    url: "https://www.greenpeace.org/taiwan/%E6%B5%B7%E6%B4%8B/",
  },
  {
    title: "排山倒海的大軍",
    src: "Images/排山倒海的大軍.jfif",
    url: "https://www.gvm.com.tw/article/39277",
  },
  {
    title: "世界最宜居城市",
    src: "Images/世界最宜居城市.jfif",
    url: "https://www.leo-travel.idv.tw/33354/holland-amsterdam-top-10-attractions",
  },
  {
    title: "環台有拜有保庇",
    src: "Images/環台有拜有保庇.jfif",
    url: "https://blog.tripbaa.com/taiwan-10-temple-attractions/",
  }
];
document.write(`</div>`);
document.write(`<div class="actions">`);
document.write(`<button id="prev" title="上一張"><i class="fa-solid fa-arrow-left"></i></button>`);
document.write(`<button id="play" title="播放/暫停"><i class="fa-solid fa-play"></i></button>`); // <i class="fa-solid fa-pause"></i>
document.write(`<button id="next" title="下一張"><i class="fa-solid fa-arrow-right"></i></button>`);
document.write(`</div>`);
$(`#num1`).css("font-size", "2em");
for (let i = 1; i <= 7; i++) {
  $(`#num${i}`).click(function () {
    for (let j = 1; j <= 7; j++) {
      if (images[j].title == $(`#playingimg`).attr("title")) {
        $(`#num${j}`).css("font-size", "1.3em");
        break;
      }
    }
    $(`#playingimg`).attr("src", images[i].src);
    $(`#playingimg`).attr("href", images[i].href);
    $(`#playingimg`).attr("title", images[i].title);
    $(`#playingimg`).attr("alt", images[i].title);
    $(`#num${i}`).css("font-size", "2em");
  });
}
$(`#prev`).click(() => {
  for (let i = 1; i <= 7; i++) {
    if (images[i].title == $(`#playingimg`).attr("title")) {
      let dest = i == 1 ? 7 : i - 1;
      $(`#playingimg`).attr("src", images[dest].src);
      $(`#playingimg`).attr("href", images[dest].href);
      $(`#playingimg`).attr("title", images[dest].title);
      $(`#playingimg`).attr("alt", images[dest].title);
      $(`#num${i}`).css("font-size", "1.3em");
      $(`#num${dest}`).css("font-size", "2em");
      break;
    }
  }
});
$(`#next`).click(nextImg);
function nextImg() {
  for (let i = 1; i <= 7; i++) {
    if (images[i].title == $(`#playingimg`).attr("title")) {
      let dest = i == 7 ? 1 : i + 1;
      $(`#playingimg`).attr("src", images[dest].src);
      $(`#playingimg`).attr("href", images[dest].href);
      $(`#playingimg`).attr("title", images[dest].title);
      $(`#playingimg`).attr("alt", images[dest].title);
      $(`#num${i}`).css("font-size", "1.3em");
      $(`#num${dest}`).css("font-size", "2em");
      break;
    }
  }
}
document.write(`</fieldset>`);
document.write(`</div>`);

// 第五題
document.write(`<div class="body">`);
document.write(`<h2>第五題</h2>`);
document.write(`</div>`);

// 第六題
document.write(`<div class="body">`);
document.write(`<h2>第六題</h2>`);
document.write(`</div>`);