const username = prompt("Kullanıcı adınızı giriniz: ");

if(username !== null) {
    console.log(username)
    const usernameInput = document.querySelector("#myName");
    usernameInput.innerHTML += username
} else {
    console.log("Hatalı giriş! Tekrar deneyiniz...")
}

function showCurrentTime() {
    const currentTime = new Date()
    const hours = currentTime.getHours()
    const minutes = currentTime.getMinutes()
    const seconds = currentTime.getSeconds()

    // saat, dakika ve saniye degerlerini iki basamaklı hale getirme
    const formattedHours = formatTimeValue(hours)
    const formattedMinutes = formatTimeValue(minutes)
    const formattedSeconds = formatTimeValue(seconds)

    const timeString = `${formattedHours}:${formattedMinutes}:${formattedSeconds}`

    const timeDisplay = document.querySelector("#myClock")
    timeDisplay.innerHTML = timeString
}

// tek basamaklı değerleri iki basamaklı hale getirir
function formatTimeValue(value) {
    return value < 10 ? "0" + value : value
}

window.onload = function() {
    showCurrentTime()
}