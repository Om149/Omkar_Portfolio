document.addEventListener("DOMContentLoaded", function () {
    // Mobile menu
    var toggle = document.querySelector(".nav-toggle");
    var links = document.querySelector(".nav-links");
    if (toggle && links) {
        toggle.addEventListener("click", function () {
            var open = links.classList.toggle("open");
            toggle.setAttribute("aria-expanded", open ? "true" : "false");
        });
    }

    // Footer year
    var year = document.getElementById("year");
    if (year) year.textContent = new Date().getFullYear();

    // Typing effect on the home page
    var typed = document.getElementById("typed");
    if (typed) {
        var words = typed.getAttribute("data-words").split(",");
        var w = 0, c = 0, deleting = false;
        (function tick() {
            var word = words[w];
            typed.textContent = word.substring(0, c);
            var delay = deleting ? 45 : 95;
            if (!deleting && c === word.length) { deleting = true; delay = 1400; }
            else if (deleting && c === 0) { deleting = false; w = (w + 1) % words.length; delay = 350; }
            c += deleting ? -1 : 1;
            setTimeout(tick, delay);
        })();
    }
});
