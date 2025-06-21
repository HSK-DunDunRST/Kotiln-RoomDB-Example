# Kotlin RoomDB Example

A simple Android example project demonstrating how to use **Room Database** with **Kotlin** and **MVVM** architecture.

---

## Features

- Room Persistence Library Integration
- MVVM Architecture Pattern
- LiveData and ViewModel usage
- Simple UI for Adding, Viewing, and Deleting Items
- SQLite-backed Local Storage

---

## Tech Stack

- **Language**: Kotlin  
- **Architecture**: MVVM  
- **Database**: Room (SQLite)  
- **UI**: Jetpack Components (LiveData, ViewModel, RecyclerView)

---

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/HSK-DunDunRST/Kotiln-RoomDB-Example.git
   ```

2. Open the project in **Android Studio**

3. Sync Gradle and **Run the App**

---

## Project Structure

```
├── java/com/hsk/kotlinroomdb/
│   ├── dao/
│   │   ├── BaseDAO.kt
│   │   └── DataDAO.kt
│   ├── entity/
│   │   └── DataEntity.kt
│   ├── AppDatabase.kt
└───└── MainActivity.kt
```

---

## Example Usage

- Add a user with name and age
- View list of users
- Delete users by tapping them (if implemented)

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
