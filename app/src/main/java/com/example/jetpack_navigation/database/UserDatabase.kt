package com.example.jetpack_navigation.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.RoomMasterTable
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Created by djj on 2021/09/07.
 */

@Database(entities = arrayOf(UserEntity::class), version = 1, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    private class UserDatabaseCallBack(
        private val scope: CoroutineScope
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch {
                    var userDao = database.userDao()

                    //delete
                    userDao.deleteUser()

                    //add
                    var userEntity = UserEntity(0,"title01","content01")
                    userDao.insertUser(userEntity)

                    userEntity = UserEntity(0,"title02","content02")
                    userDao.insertUser(userEntity)

                    userEntity = UserEntity(0,"title03","content03")
                    userDao.insertUser(userEntity)

                }
            }
        }
    }

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): UserDatabase {

            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_database"
                ).addCallback(UserDatabaseCallBack(scope)).build()
                INSTANCE = instance
                return instance
            }
        }

    }
}