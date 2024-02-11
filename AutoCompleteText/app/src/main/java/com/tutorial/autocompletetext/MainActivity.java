package com.tutorial.autocompletetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

   String[] contryname={"India","Nepal","U.S.A","China","Korea","Germany"};
   AutoCompleteTextView autoCompleteTextView;
   ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView=findViewById(R.id.auto_complete_view);
        ArrayAdapter adapter= new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, contryname);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
    }
}