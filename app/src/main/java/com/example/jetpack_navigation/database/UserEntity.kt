package com.example.jetpack_navigation.bean

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by djj on 2021/09/07.
 */

@Entity(tableName = "user_database")
data class UserDao(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "user_title") val title: String,
    @ColumnInfo(name = "user_content") val content: String
)
