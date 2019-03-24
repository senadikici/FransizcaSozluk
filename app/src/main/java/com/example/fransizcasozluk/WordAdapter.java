package com.example.fransizcasozluk;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends BaseAdapter {

    private Context context;
    private List<Word> words;
    private int resimId;


    public WordAdapter(Context context, List<Word> words,int resimId) {
        this.context=context;
        this.words=words;
        this.resimId=resimId;
    }

    @Override
    public int getCount() {
        return words.size();
    }

    @Override
    public Object getItem(int position) {
        return words.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=View.inflate(context,R.layout.list_item,null);
        ImageView iv=(ImageView)view.findViewById(R.id.image);
        TextView tvFransizca=(TextView)view.findViewById(R.id.fransizca_tv);
        TextView tvTurkce=(TextView)view.findViewById(R.id.turkce_tv);
        iv.setImageResource(words.get(position).getResimId());
        LinearLayout layout=(LinearLayout)view.findViewById(R.id.text_container);
        tvFransizca.setText(words.get(position).getFransizca());
        tvTurkce.setText(words.get(position).getTurkce());

        

        return view;
    }
}
