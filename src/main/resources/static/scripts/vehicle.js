// Fetch data from "/allvehicles" endpoint
fetch("/allvehicles")
  .then((response) => response.json())
  .then((data) => {
    // Populate the table with data
    const tableBody = document.querySelector("#vehicleTable tbody");

    data.forEach((vehicle) => {
      const row = document.createElement("tr");
      row.innerHTML = `
                    <td>${vehicle.vid}</td>
                    <td>${vehicle.model_year}</td>
                    <td>${vehicle.manufacturer}</td>
                    <td>${vehicle.model}</td>
                    <td>${vehicle.color}</td>
                    <td>${vehicle.mileage}</td>
                    <td>${vehicle.registation_number}</td>
                    <td>${vehicle.price}</td>
                    <td><button onclick="deleteVehicle(${vehicle.vid})">Delete</button></td>
                `;
      tableBody.appendChild(row);
    });
  })
  .catch((error) => console.error("Error fetching data:", error));

// Function to handle the deletion of a vehicle
function deleteVehicle(vehicleId) {
  // Assuming you want to confirm the deletion
  const confirmDelete = confirm(
    "Are you sure you want to delete this vehicle?"
  );

  if (confirmDelete) {
    // Send a DELETE request to "/deleteVehicle/{id}" endpoint
    fetch(`/deleteVehicle/${vehicleId}`, { method: "DELETE" })
      .then((response) => {
        if (response.ok) {
          // Reload the page or update the table as needed
          location.reload();
        } else {
          console.error("Error deleting vehicle:", response.statusText);
        }
      })
      .catch((error) => console.error("Error deleting vehicle:", error));
  }
}
