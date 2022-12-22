$("div#rating>img").on({
    mouseenter: function () {
        $(this).attr("src", "images/chngstar.gif").prevAll().attr("src", "images/chngstar.gif")
            .end().nextAll().attr("src", "images/star.gif");
    },
    mouseleave: function () {
        $("div#rating>img:checked").attr("src", "images/chngstar.gif");
        $("div#rating>img[checked=false]").attr("src", "images/star.gif");
    },
    click: function () {
        $(this).attr({
            "src": "images/chngstar.gif",
            "checked": true
        });
        $(this).prevAll().attr({
            "src": "images/chngstar.gif",
            "checked": true
        });
        $(this).nextAll().attr({
            "src": "images/star.gif",
            "checked": false
        });
    },
    dblclick: function () {
        $("div#rating>img").attr({
            "src": "images/star.gif",
            "checked": false
        });
    }
});