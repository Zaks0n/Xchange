package com.zaksontech.www.xchange.data.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.ahmed.alcassessment.utils.AppConstants;
import com.example.ahmed.alcassessment.utils.DBSchema;



class SQLHelper extends SQLiteOpenHelper {
    SQLHelper(Context context) {
        super(context, DBSchema.tableName, null, AppConstants.version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DBSchema.createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DBSchema.dropTable);

        onCreate(sqLiteDatabase);
    }
}
