# Carpooling System: A Smart and Privacy-Focused Ride-Sharing Solution

## 📌 Introduction
The **Carpooling System** is an intelligent ride-sharing platform that enables users to share rides efficiently, reducing travel costs, congestion, and carbon footprints. The system connects riders and drivers securely while ensuring privacy and convenience.

---

## 🚀 Features

### 1️⃣ Pool Creation & Joining
#### 👨‍✈️ Creating a Ride Pool (For Drivers)
Drivers can create a ride pool by providing:
- **Pickup & Drop Locations** – Exact or approximate locations.
- **Departure Time & Date** – Ride start schedule.
- **Available Seats** – Maximum passengers allowed.
- **Vehicle Details** – Car model, license plate, and other information.
- **Preferences & Rules** – Music, smoking, pet-friendly, etc.

#### 📌 Process:
1. The driver posts a new ride.
2. The ride becomes visible to nearby users.
3. Interested riders send a join request.
4. The driver approves or rejects requests.

#### 🚖 Joining a Ride Pool (For Riders)
Riders can:
- Search for available ride pools based on destination and time.
- Filter rides by preferences (e.g., female-only, no smoking, etc.).
- Request to join and wait for approval.
- Receive ride details upon approval.

🔹 **Benefits:**
- Reduces individual travel costs.
- Helps minimize traffic congestion.
- Encourages community-based carpooling.

---

### 2️⃣ Intelligent Ride Matching
The system automatically matches riders with available carpools based on:
- **Proximity** – Matches users with nearby rides.
- **Route Similarity** – Ensures a shared path.
- **Timing & Availability** – Matches rides fitting the user's schedule.
- **Preferences & Restrictions** – Considers smoking, pets, gender preferences, etc.

#### 📌 Process:
1. The system fetches all available rides.
2. It compares routes, start points, and destinations.
3. Rides are ranked based on match scores.
4. Riders select a suitable ride and send a request.

🔹 **Key Advantages:**
- **Optimized Ride Sharing** – Minimal detours for drivers.
- **Efficient Filtering** – Riders see only relevant options.
- **Flexible Matching** – Users choose rides based on convenience.

---

### 3️⃣ Route Matching Percentage
The **Route Match Percentage** helps users find the best-matching rides.

✅ **How It Works:**
- The system analyzes the driver’s planned route.
- It compares this with the rider’s preferred route.
- A **match percentage** is displayed (e.g., 85%).

#### 📊 Example:
- **100% Match** – Perfect route alignment.
- **75% Match** – Covers most of the rider’s route.
- **50% Match** – Covers half, requiring additional transport.

🔹 **Benefits:**
- Users quickly identify the best rides.
- Reduces unnecessary diversions.
- Improves driver-passenger compatibility.

---

### 4️⃣ Privacy Protection
To ensure safety, the system protects user data with **anonymization features**.

✅ **Phone Number Privacy**:
- Calls and messages are routed through an **in-app VoIP system**.
- Temporary numbers are used for calls.
- Numbers automatically disconnect post-ride.

✅ **Profile Security**:
- Users can hide their **full name**, displaying only initials.
- **Profile pictures** can be blurred until confirmation.
- Only essential ride details are shared.

✅ **SOS & Emergency Features**:
- **Live Location Sharing** – Riders can share real-time location.
- **Panic Button** – Alerts local authorities in case of emergencies.

🔹 **Advantages:**
- Ensures anonymity and prevents unsolicited contact.
- Prevents data misuse.
- Enhances user trust and security.

---

## 🛠️ Technologies Used
- **Frontend**: React.js / Flutter
- **Backend**: Node.js / Spring Boot
- **Database**: MongoDB / MySQL
- **Authentication**: Firebase / OAuth
- **Mapping & Routing**: Google Maps API

---

## ⚙️ Installation & Setup

### Prerequisites:
- Install **Node.js**, **MongoDB/MySQL**, and **npm/yarn**.
- Set up an API key for **Google Maps API**.

### Steps:
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-repo/carpooling-system.git
   cd carpooling-system
