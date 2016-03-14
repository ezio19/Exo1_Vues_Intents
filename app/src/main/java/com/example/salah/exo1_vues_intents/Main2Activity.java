package com.example.salah.exo1_vues_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        TextView titre = (TextView) findViewById(R.id.titre);
        TextView auteur = (TextView) findViewById(R.id.auteur);
        TextView editeur = (TextView) findViewById(R.id.editeur);
        TextView annee = (TextView) findViewById(R.id.annee);
        TextView resume = (TextView) findViewById(R.id.resume);

        Intent intent = getIntent();

        Book book = (Book) intent.getSerializableExtra("book");

        titre.setText(book.getTitle());
        auteur.setText("Auteur: "+book.getAuthor());
        annee.setText("Année: "+book.getAnnée());
        editeur.setText("Edition: "+book.getEditeur());
        resume.setText("Résumé: \n"+book.getRsume());
       // Log.d("resumé", (String) resume.getText());
        imageView.setImageResource(book.getBigCover());


       // try {
//            InputStream stream = getAssets().open("drawable/c_in_a_nutshell_2nd_edition.jpg");
//            Drawable drawable = Drawable.createFromStream(stream, null);
//            imageView.setImageDrawable(drawable);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
