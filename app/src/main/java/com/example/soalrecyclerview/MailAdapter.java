package com.example.soalrecyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MailAdapter extends RecyclerView.Adapter<MailAdapter.ViewHolder> {

    private List<Mail> mailList;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView char1, judul, nama, isi, jam;
        public ImageView bulat;

        public ViewHolder(View v) {
            super(v);
            char1 = (TextView) v.findViewById(R.id.txtChar);
            judul = (TextView) v.findViewById(R.id.txtJudul);
            nama = (TextView) v.findViewById(R.id.txtNama);
            isi = (TextView) v.findViewById(R.id.txtIsi);
            jam = (TextView) v.findViewById(R.id.txtJam);
            bulat = v.findViewById(R.id.imgBulat);
         }
    }

    public MailAdapter(List<Mail> mailList){
        this.mailList = mailList;
    }

    @Override
    public MailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_mail, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MailAdapter.ViewHolder holder, int position) {
        Mail mail = mailList.get(position);
        holder.char1.setText(mail.getKar());
        holder.nama.setText(mail.getNama());
        holder.judul.setText(mail.getJudul());
        holder.isi.setText(mail.getIsi());
        holder.jam.setText(mail.getJam());
        Log.d("sdsd",String.valueOf(mail.getBulat()));
        holder.bulat.setBackgroundResource(mail.getBulat());
    }

    @Override
    public int getItemCount() {
        return mailList.size();
    }
}
