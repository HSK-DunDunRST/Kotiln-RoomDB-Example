# Kotlin RoomDB 예제

**Kotlin** 및 **MVVM** 아키텍처에서 **Room Database**를 사용하는 방법을 보여주는 간단한 Android 예제 프로젝트입니다.

---

## 기능
- Room Persistence 라이브러리 통합
- MVVM 아키텍처 패턴
- LiveData 및 ViewModel 사용
- 항목 추가, 보기 및 삭제를 위한 간편한 UI
- SQLite 기반 로컬 저장소

---

## 기술 스택
- **언어**: Kotlin
- **아키텍처**: MVVM
- **데이터베이스**: Room(SQLite)
- **UI**: Jetpack 구성 요소(LiveData, ViewModel, RecyclerView)

---

## 설정

1. 저장소를 복제합니다.
```bash
git clone https://github.com/HSK-DunDunRST/Kotiln-RoomDB-Example.git
```

2. **Android Studio**에서 프로젝트를 엽니다.

3. Gradle 동기화 및 **앱 실행**

---

## 프로젝트 구조
```
├── java/com/hsk/kotlinroomdb/
│ ├── dao/
│ │ ├── BaseDAO.kt
│ │ └── DataDAO.kt
│ ├── entity/
│ │ └── DataEntity.kt
│ ├── AppDatabase.kt
└───└── MainActivity.kt
```

---

## 사용 예시
- 이름과 나이를 사용하여 사용자 추가
- 사용자 목록 보기
- 탭하여 사용자 삭제(구현된 경우)

---

## 라이선스
이 프로젝트는 MIT 라이선스에 따라 라이선스가 부여됩니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조하세요.
