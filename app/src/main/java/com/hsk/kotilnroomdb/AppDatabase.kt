package com.hsk.kotilnroomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hsk.kotilnroomdb.dao.DataDAO
import com.hsk.kotilnroomdb.entity.DataEntity

// 데이터베이스 객체는 싱글톤으로 구성해 한 개만 갖고 있도록 함.
@Database(entities = [DataEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    // 데이터 접근 객체(DAO)를 반환하는 추상 메서드. 이를 통해 데이터베이스 조작이 가능.
    abstract fun dataDao(): DataDAO

    companion object {
        // AppDatabase의 인스턴스를 저장하는 변수. 처음에는 null로 초기화.
        private var INSTANCE: AppDatabase? = null

        // AppDatabase의 인스턴스를 반환하는 메서드. 싱글톤 패턴으로 구현되어 여러 번 호출해도
        // 단일 인스턴스만 생성됨.
        fun getInstance(context: Context): AppDatabase? {
            // INSTANCE가 null인 경우에만 데이터베이스를 생성.
            if (INSTANCE == null) {
                // 여러 스레드가 동시에 접근해도 한 번만 데이터베이스가 생성되도록 synchronized 블록 사용.
                synchronized(AppDatabase::class) {
                    // Room을 사용해 데이터베이스 빌더를 생성하고 데이터베이스 파일 이름을 "room_example.db"로 지정.
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "room_example.db"
                    ).build()
                }
            }
            // 생성된 혹은 기존의 데이터베이스 인스턴스를 반환.
            return INSTANCE
        }
    }
}
