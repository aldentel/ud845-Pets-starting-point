package com.example.android.pets.Data;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import android.content.Context;

public class PetDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetContract.PetsEntry.TABLE_NAME + " ("
        + PetContract.PetsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
        + PetContract.PetsEntry.COLUMN_NAME + "TEXT NOT NULL, "
        + PetContract.PetsEntry.COLUMN_BREED + "TEXT, "
        + PetContract.PetsEntry.COLUMN_GENDER + "INTEGER NOT NULL, "
        + PetContract.PetsEntry.COLUMN_WEIGHT + "INTEGER NOT NULL DEFAULT 0);";

    // Execute the SQL statement
    db.execSQL(SQL_CREATE_PETS_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}