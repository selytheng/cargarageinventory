function addVehicle() {
  const formElement = document.getElementById("addVehicleForm");
  const formData = new FormData(formElement);

  fetch("/addVehicle", {
    method: "POST",
    body: formData,
  })
    .then((response) => {
      if (response.ok) {
        alert("Vehicle added successfully!");
        // Redirect or handle success as needed
      } else {
        console.error("Error adding vehicle:", response.statusText);
      }
    })
    .catch((error) => console.error("Error adding vehicle:", error));
}
