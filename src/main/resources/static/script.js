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
