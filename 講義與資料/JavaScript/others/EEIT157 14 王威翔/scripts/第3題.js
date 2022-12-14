// 第三題
document.write(`<div class="body">`);
document.write(`<h2>第三題</h2>`);
document.write(`<div class="stars">`);
let imgs = [];
for (i = 1; i <= 5; i++){
  imgs = imgs.concat(`img${i}`);
}
let flags = {};
for (let img of imgs) {
  document.write(`<img id="${img}" src="Images/star.gif" />`);
  flags[img] = false;
}
for (let img of imgs) {
  $(`#${img}`).on({
    mouseenter: function () {
      if (Object.values(flags).indexOf(true) == -1) {
        $("#stars").text("評分為...." + $(this).attr("id").substring(3));
      }
      for (let i of imgs) {
        if (parseInt(i.substring(3)) <= parseInt($(this).attr("id").substring(3))) {
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
          let filename = !flags[i] ? "star" : "chngstar";
          $(`#${i}`).attr("src", "Images/" + filename + ".gif");
        }
      }
    },
    click: function () {
        $("#stars").text("你給" + $(this).attr("id").substring(3) + "顆星");
        for (let i of imgs) {
          if (parseInt(i.substring(3)) <= parseInt($(this).attr("id").substring(3))) {
            $(`#${i}`).attr("src", "Images/chngstar.gif");
            flags[i] = true;
          }
          else {
            $(`#${i}`).attr("src", "Images/star.gif");
            flags[i] = false;
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