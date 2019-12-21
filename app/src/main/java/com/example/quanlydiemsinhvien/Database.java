package com.example.quanlydiemsinhvien;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    private  static final String DATABASE_NAME="qlsv.sqlite";
    private  static final int DATABASE_VERSION=1;
    //table sinhvien
    public static final String TABLE_SINHVIEN="sinhvien";

    public static final String COLUMN_ID="id";
    public static final String COLUMN_TEN="ten";
    public static final String COLUMN_QUEQUAN="quequan";
    public static final String COLUMN_NAMSINH="namsinh";
    public static final String COLUMN_MAMH="maMH";

    //table monhoc
    public static final String TABLE_MONHOC="monhoc";

    private int maMH;
    private String tenMH;
    private int soTC;
    private int diemCC,diemBTL,diemTHI;

    public static final String COLUMN_IDMH="maMH";
    public static final String COLUMN_TENMH="tenMH";
    public static final String COLUMN_TINCHI="soTC";
    public static final String COLUMN_DIEMCC="diemCC";
    public static final String COLUMN_DIEMBTL="diemBTL";
    public static final String COLUMN_DIEMTHI="diemTHI";



    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
