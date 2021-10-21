package com.vlad.doomsday;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switchToActivity(item.getItemId());

        return super.onOptionsItemSelected(item);
    }

    private void switchToActivity(int itemId) {

        Intent intent;

        switch (itemId) {

            case R.id.home:
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.model_selection:
                intent = new Intent(this, ModelSelection.class);
                break;
            case R.id.settings:
                intent = new Intent(this, Settings.class);
                break;
            default:
                intent = new Intent(this, MainActivity.class);
        }

        startActivity(intent);
    }
}