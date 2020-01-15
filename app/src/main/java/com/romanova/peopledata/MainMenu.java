package com.romanova.peopledata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickNewEvent(View view) {
        Intent intent = new Intent(MainMenu.this, NewEvent.class);
        startActivity(intent);
    }

    public void onClickNewFact(View view) {
        Intent intent = new Intent(MainMenu.this, NewFact.class);
        startActivity(intent);
    }

    public void onClickNewPerson(View view) {
        Intent intent = new Intent(MainMenu.this, NewPerson.class);
        startActivity(intent);
    }

    public void onClickEdit(View view) {
        Intent intent = new Intent(MainMenu.this, Edit.class);
        startActivity(intent);
    }
}
