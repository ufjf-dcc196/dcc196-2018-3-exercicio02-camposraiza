package com.example.raiza.videoflix;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SeriesDbHelper extends SQLiteOpenHelper {

        public final static int DATABASE_VERSION = 1;
        public final static String  DATABASE_NAME = "Series.db";

        public SeriesDbHelper(Context context) {
            super(context, DATABASE_NAME,null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(SeriesContract.Lembrete.CREATE_SERIE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(SeriesContract.Lembrete.DROP_SERIES);
            onCreate(db);
        }

        @Override
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onUpgrade(db,oldVersion,newVersion);
        }

}
