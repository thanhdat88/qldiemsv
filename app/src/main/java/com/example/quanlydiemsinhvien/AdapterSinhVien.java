package com.example.quanlydiemsinhvien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSinhVien extends BaseAdapter {
    Context context;
    ArrayList<SinhVien> list;

    public AdapterSinhVien(Context context, ArrayList<SinhVien> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.list_sinhvien_row,null);

        //anhxa
        TextView txtID = (TextView) row.findViewById(R.id.txtID);
        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtQuequan = (TextView) row.findViewById(R.id.txtQuequan);
        TextView txtNamsinh = (TextView) row.findViewById(R.id.txtNamsinh);
        TextView txtMaMH = (TextView) row.findViewById(R.id.txtMaMH);
        Button btnSua = (Button) row.findViewById(R.id.btnSua);
        Button btnXoa = (Button) row.findViewById(R.id.btnXoa);


        //xet gia tri

        SinhVien sinhvien = list.get(position);
        txtID.setText(sinhvien.getId()+"");
        txtTen.setText(sinhvien.getTen()+"");
        txtQuequan.setText(sinhvien.getQuequan()+"");
        txtNamsinh.setText(sinhvien.getNamsinh()+"");
        txtMaMH.setText(sinhvien.getMaMH()+"");

        return row;

    }
}
