function getWeather() {
  const cityInput = document.getElementById("cityInput");
  const cityName = cityInput.value.trim();

  if (!cityName) return;

  fetch(
    `https://api.openweathermap.org/data/2.5/weather?q=${cityName}&units=metric&appid=${API_KEY}`,
  )
    .then((res) => res.json())
    .then((data) => {
      if (data.cod !== 200) {
        alert("City not found");
        return;
      }

      document.getElementById("city").textContent = data.name;
      document.getElementById("temp").textContent =
        Math.round(data.main.temp) + "°C";
      document.getElementById("desc").textContent = data.weather[0].description;

      document.getElementById("humidity").textContent =
        data.main.humidity + "%";
      document.getElementById("wind").textContent = data.wind.speed + " km/h";
      document.getElementById("feels").textContent =
        Math.round(data.main.feels_like) + "°C";
    })
    .catch(() => {
      alert("Error fetching weather data");
    });
}
