package com.example.xaydungmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //load menuvua thietke len
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_example,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.mnxemds:
                Toast.makeText(this,"Xem dach sach",Toast.LENGTH_LONG).show();
                return true;
            case R.id.mnxemdssv:
                Toast.makeText(this,"Xemdssv",Toast.LENGTH_LONG).show();
                return true;
            case R.id.mnsuads:
                return true;
                default:
                    return super.onOptionsItemSelected(item);

        }
    }
}
