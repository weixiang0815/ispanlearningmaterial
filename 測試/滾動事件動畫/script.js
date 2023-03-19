const divs = $("div");
console.log(divs);
for (let i = 0; i < divs.length; i++) {
    $(divs[i]).attr({
        "id": i + 1,
    }).text(i + 1);
    let index = parseInt((i + 1) / 10);
    switch (index) {
        case 0:
            $(divs[i]).attr("data-aos", "fade-up");
            break;
        case 1:
            $(divs[i]).attr("data-aos", "zoom-in-down");
            break;
        case 2:
            $(divs[i]).attr("data-aos", "fade-down");
            break;
        case 3:
            $(divs[i]).attr("data-aos", "fade-left");
            break;
        case 4:
            $(divs[i]).attr("data-aos", "fade-right");
            break;
        case 5:
            $(divs[i]).attr("data-aos", "fade-up-left");
            break;
        case 6:
            $(divs[i]).attr("data-aos", "fade-up-right");
            break;
        case 7:
            $(divs[i]).attr("data-aos", "fade-down-left");
            break;
        case 8:
            $(divs[i]).attr("data-aos", "fade-down-right");
            break;
        case 9:
            $(divs[i]).attr("data-aos", "zoom-in-up");
            break;
        case 10:
            $(divs[i]).attr("data-aos", "zoom-in-down");
            break;
    }
    console.log(divs[i]);
}
AOS.init();