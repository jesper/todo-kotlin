package com.fofism.todo.db

import android.provider.BaseColumns

class TaskContract {
    companion object {
        val DB_NAME = "com.fofism.todo.db"
        val DB_VERSION = 1
    }

    class TaskEntry : BaseColumns {

        companion object {
            val TABLE = "tasks"
            val COL_TASK_TITLE = "title"
            val _ID = BaseColumns._ID
        }
    }
}