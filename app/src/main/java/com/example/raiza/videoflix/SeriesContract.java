package com.example.raiza.videoflix;

import android.provider.BaseColumns;

public class SeriesContract {
    public final class Lembrete implements BaseColumns{
        public final static String TABLE_NAME = "Series";
        public final static String COLUMN_NAME_TITULO = "titulo";
        public final static String COLUMN_NAME_TEMPORADA = "temporada";
        public final static String COLUMN_NAME_EP = "episódio";
        public final static String CREATE_SERIE =
                "CREATE TABLE " + Lembrete.TABLE_NAME + " ("
                        + Lembrete._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + Lembrete.COLUMN_NAME_TITULO+ " TEXT, "
                        + Lembrete.COLUMN_NAME_TEMPORADA+ " INTEGER, "
                        + Lembrete.COLUMN_NAME_EP+ " INTEGER"
                        +")";
        public final static String DROP_SERIES = "DROP TABLE IF EXISTS "
                + Lembrete.TABLE_NAME;
        public static final String COLUMN_NAME_ID = "_id";
    }

}
