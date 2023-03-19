const input = $("input#fileInput");
const contentPlace = $("div#fileContent");
const markdown = document.getElementById("markdown");

input.on("change", function(e) {
    const file = e.target.files[0];
    const reader = new FileReader();

    reader.onload = e => {
        const content = e.target.result;
        contentPlace.text(content);
        markdown.innerHTML = marked.parse(content);
    };

    reader.readAsText(file);
});