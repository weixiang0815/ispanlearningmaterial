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
document.write(`<button id="play" title="暫停"><i class="fa-solid fa-pause"></i></button>`); // <i class="fa-solid fa-pause"></i>
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
    $(`#playingimg`).attr({
      "src": images[i].src,
      "href": images[i].href,
      "title": images[i].title,
      "alt": images[i].title
    });
    $(`#num${i}`).css("font-size", "2em");
  });
}
$(`#prev`).click(() => {
  for (let i = 1; i <= 7; i++) {
    if (images[i].title == $(`#playingimg`).attr("title")) {
      let dest = i == 1 ? 7 : i - 1;
      $(`#playingimg`).attr({
        "src": images[dest].src,
        "href": images[dest].href,
        "title": images[dest].title,
        "alt": images[dest].title
      });
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
      $(`#playingimg`).attr({
        "src": images[dest].src,
        "href": images[dest].href,
        "title": images[dest].title,
        "alt": images[dest].title
      });
      $(`#num${i}`).css("font-size", "1.3em");
      $(`#num${dest}`).css("font-size", "2em");
      break;
    }
  }
}
let intervalID = window.setInterval(nextImg, 2000);
let isPlaying = true;
$(`#play`).click(() => {
  let icon = document.querySelector("#play>i");
  $(`#play`).attr("title", isPlaying ? "播放" : "暫停");
  icon.className = isPlaying ? `fa-solid fa-play` : `fa-solid fa-pause`;
  if (isPlaying) {
    isPlaying = false;
    window.clearInterval(intervalID);
  }
  else {
    isPlaying = true;
    intervalID = window.setInterval(nextImg, 2000);
  }
});
document.write(`</fieldset>`);
document.write(`</div>`);