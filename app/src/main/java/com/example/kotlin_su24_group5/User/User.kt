package com.example.kotlin_su24_group5.User

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    var userName: String,
    var password: String,
    var email: String,
    var role: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)