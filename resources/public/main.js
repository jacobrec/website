var light = "#42a7f4";
var dark = "#494949";

function setColors(fore, back) {
  document.documentElement.style.setProperty("--foreground", fore);
  document.documentElement.style.setProperty("--background", back);
}

function isDark() {
  return window.localStorage.getItem("isDark", false) === "true";
}

window.onload = function () {
  document.querySelector('#butInvert').onclick = function (e) {
    e.stopPropagation();
    var iDark = isDark();
    !iDark ? setColors(dark, light) : setColors(light, dark);
    window.localStorage.isDark = !iDark;
  }
}


isDark() ? setColors(dark, light) : setColors(light, dark);
