let slideIndex = 1;
showSlide(slideIndex);

function nextSlide() {
    showSlide(slideIndex += 1);
}

function prevSlide() {
    showSlide(slideIndex -= 1);
}

function showSlide(n) {
    let slides = document.getElementsByClassName("slide");
    if (n > slides.length) { slideIndex = 1 }
    if (n < 1) { slideIndex = slides.length }
    for (let i = 0; i < slides.length; i++) {
        slides[i].classList.remove("active-slide", "prev-slide", "next-slide");
    }
    slides[slideIndex - 1].classList.add("active-slide");
    if (slideIndex > 1) {
        slides[slideIndex - 2].classList.add("prev-slide");
    } else {
        slides[slides.length - 1].classList.add("prev-slide");
    }
    if (slideIndex < slides.length) {
        slides[slideIndex].classList.add("next-slide");
    } else {
        slides[0].classList.add("next-slide");
    }
}