package com.example.abhisheki.androidsession5_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final  int MENU_ITEM_ITEM1 = 1;
    private static final  int MENU_ITEM_ITEM2 = 2;
    private static final  int MENU_ITEM_ITEM3 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, MENU_ITEM_ITEM1, Menu.NONE, "Computer");
        menu.add(Menu.NONE, MENU_ITEM_ITEM2, Menu.NONE, "Gamepad");
        menu.add(Menu.NONE, MENU_ITEM_ITEM3, Menu.NONE, "Camera");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_ITEM_ITEM1:
                Toast.makeText(this, "You clicked Computer", Toast.LENGTH_SHORT).show();
                return true;
            case MENU_ITEM_ITEM2:
                Toast.makeText(this, "You clicked Gamepad", Toast.LENGTH_SHORT).show();
                return true;
            case MENU_ITEM_ITEM3:
                Toast.makeText(this, "You clicked Camera", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
