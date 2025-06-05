package com.hsk.kotilnroomdb.dao

import androidx.room.Dao
import androidx.room.Query
import com.hsk.kotilnroomdb.entity.DataEntity

@Dao
interface DataDAO : BaseDAO<DataEntity> {
    @Query("SELECT * FROM data_table WHERE id = :id")
    fun selectById(id : Long) : Array<DataEntity>

    @Query("SELECT * FROM data_table")
    fun selectAll() : Array<DataEntity>

    @Query("SELECT * FROM data_table WHERE date = :date")
    fun selectByDate(date : String) : DataEntity

    @Query("DELETE FROM data_table WHERE id = :id")
    fun deleteById(id : Long)
}