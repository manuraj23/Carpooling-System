// **Rider Signup**
async function registerRider() {
    const rider = {
        firstName: document.getElementById("riderFirstName").value,
        lastName: document.getElementById("riderLastName").value,
        email: document.getElementById("riderEmail").value,
        mobile: document.getElementById("riderMobile").value,
        password: document.getElementById("riderPassword").value
    };

    const response = await fetch("/api/auth/rider/signup", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(rider)
    });

    const message = await response.text();
    alert(message);
    if (message.includes("Signup successful")) {
        window.location.href = "riderLogin.html";
    }
}

// **Rider Login**
async function loginRider() {
    const email = document.getElementById("riderLoginEmail").value;
    const password = document.getElementById("riderLoginPassword").value;

    const response = await fetch(`/api/auth/rider/login?email=${email}&password=${password}`, {
        method: "POST"
    });

    if (response.ok) {
        localStorage.setItem("riderEmail", email);
        window.location.href = "riderDashboard.html";
    } else {
        alert("Invalid credentials");
    }
}

// **Driver Signup**
async function registerDriver() {
    const driver = {
        firstName: document.getElementById("driverFirstName").value,
        lastName: document.getElementById("driverLastName").value,
        email: document.getElementById("driverEmail").value,
        mobile: document.getElementById("driverMobile").value,
        password: document.getElementById("driverPassword").value
    };

    const response = await fetch("/api/auth/driver/signup", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(driver)
    });

    const message = await response.text();
    alert(message);
    if (message.includes("Signup successful")) {
        window.location.href = "driverLogin.html";
    }
}

// **Driver Login**
async function loginDriver() {
    const email = document.getElementById("driverLoginEmail").value;
    const password = document.getElementById("driverLoginPassword").value;

    const response = await fetch(`/api/auth/driver/login?email=${email}&password=${password}`, {
        method: "POST"
    });

    if (response.ok) {
        localStorage.setItem("driverEmail", email);
        window.location.href = "driverDashboard.html";
    } else {
        alert("Invalid credentials");
    }
}

// **Logout**
function logout() {
    localStorage.clear();
    window.location.href = "index.html";
}

document.addEventListener("DOMContentLoaded", function () {
    console.log("Script loaded successfully");

    // Attach event listener to Create Ride button
    document.getElementById("createRideBtn").addEventListener("click", function () {
        console.log("Create Ride button clicked");
        openRideForm();
    });
});

// Function to open the ride creation pop-up
function openRideForm() {
    console.log("Opening ride form");
    document.getElementById("rideFormPopup").style.display = "block";
}

// Function to close the ride creation pop-up
function closeRideForm() {
    document.getElementById("rideFormPopup").style.display = "none";
}

// Function to submit ride details to the backend
function submitRide() {
    console.log("Submit button clicked");

    const ride = {
        startDestination: document.getElementById("startDestination").value,
        endDestination: document.getElementById("endDestination").value,
        dateOfStart: document.getElementById("dateOfStart").value,
        timeOfStart: document.getElementById("timeOfStart").value,
        fare: document.getElementById("fare").value,
        seatsAvailable: document.getElementById("seatsAvailable").value
    };

    console.log("Ride Data:", ride);

    // Send ride data to backend
    fetch("http://localhost:8080/api/rides", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(ride)
    })
        .then(response => response.json())
        .then(data => {
            console.log("Ride created successfully:", data);
            closeRideForm();
            fetchRides(); // Refresh the ride list
        })
        .catch(error => console.error("Error submitting ride:", error));
}

// Function to fetch and display rides created by the driver
function fetchRides() {
    fetch("http://localhost:8080/api/rides")
        .then(response => response.json())
        .then(data => {
            console.log("Fetched Rides:", data);

            let rideList = document.getElementById("rideList");
            rideList.innerHTML = ""; // Clear previous rides

            data.forEach(ride => {
                let rideItem = document.createElement("div");
                rideItem.classList.add("ride-item");
                rideItem.innerHTML = `
                    <p><strong>From:</strong> ${ride.startDestination} - <strong>To:</strong> ${ride.endDestination}</p>
                    <p><strong>Date:</strong> ${ride.dateOfStart} | <strong>Time:</strong> ${ride.timeOfStart}</p>
                    <p><strong>Fare:</strong> ₹${ride.fare} | <strong>Seats Available:</strong> ${ride.seatsAvailable}</p>
                `;
                rideList.appendChild(rideItem);
            });
        })
        .catch(error => console.error("Error fetching rides:", error));
}

// Load rides when the page loads
document.addEventListener("DOMContentLoaded", fetchRides);
