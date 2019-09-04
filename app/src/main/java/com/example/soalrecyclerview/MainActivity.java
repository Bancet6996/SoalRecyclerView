package com.example.soalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Mail> mailList;
    private MailAdapter mailAdapter;

    String [] kar = {"S", "F", "G", "T", "P", "J"};
    String [] nama = {"Sam", "Facebook", "Google+", "Twitter", "Pinterest Weekly", "Josh"};
    String [] judul = {"Weekend Adventure", "James, you have 1 notification", "Top suggested Google+ pages for you", "Follow T-Mobile, Samsung Mobile U", "Pinch you'll love!", "Going Lunch"};
    String [] isi = {"Let's go fishing with John and others. We will do...", "A lot has happened on Facebook since", "Top suggested Google+ pages for you", "James, some people may you know", "Have you seen these Pins yet? Pinterest", "Don't forget our lunch at 3PM in Pizza hut"};
    String [] jam = {"10:42am", "16:04pm", "18:44pm", "20:04pm", "09:04pm", "01:04am"};
    int [] pics = {
            R.drawable.rounded_drawable_s,
            R.drawable.rounded_drawable_f,
            R.drawable.rounded_drawable_g,
            R.drawable.rounded_drawable_t,
            R.drawable.rounded_drawable_p,
            R.drawable.rounded_drawable_j
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(mLayoutManager);

        Random random =new Random();
        mailList = new ArrayList<>();

        for (int i = 0; i<nama.length; i++){

//            int gambar = random.nextInt(nama.length-1);
            Mail mail = new Mail(kar[i], nama[i], judul[i], isi[i], jam[i], pics[i]);
            mailList.add(mail);
        }
        mailAdapter = new MailAdapter(mailList);

        mRecyclerView.setAdapter(mailAdapter);
        mailAdapter.notifyDataSetChanged();
    }
}
