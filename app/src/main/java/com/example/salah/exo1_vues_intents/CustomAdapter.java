package com.example.salah.exo1_vues_intents;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Salah on 29/02/2016.
 */
public class CustomAdapter extends BaseAdapter {
    Context context;
    List<Book> list;

    public CustomAdapter(Context context, List<Book> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {

        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = parent.inflate(context, R.layout.list_item, null);

        TextView titre = (TextView) convertView.findViewById(R.id.titre);
        TextView auteur = (TextView) convertView.findViewById(R.id.auteur);
        TextView editeur = (TextView) convertView.findViewById(R.id.editeur);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);
        titre.setText(list.get(position).getTitle());
        auteur.setText(list.get(position).getAuthor());
        editeur.setText(list.get(position).getEditeur());
        imageView.setImageResource(list.get(position).getCover());
        return convertView;
    }
}