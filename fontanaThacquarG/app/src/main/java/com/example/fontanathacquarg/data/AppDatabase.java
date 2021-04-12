package com.example.fontanathacquarg.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.fontanathacquarg.culture.Culture;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDAO userDao();
    public abstract CultureDAO cultureDAO();
}