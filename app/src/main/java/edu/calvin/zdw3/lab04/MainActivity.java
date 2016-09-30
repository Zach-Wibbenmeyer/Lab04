package edu.calvin.zdw3.lab04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    /* Homepage for Lab04
     * CS 262 - Software Engineering
     * Professor: Keith Vanderlinden
     * Author: Zach Wibbenmeyer
     * Date: September 30, 2016
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* onCreateOptionsMenu() - Creates the menu on the homepage
     * @param: menu (type -> Menu)
     * @return: boolean
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    /* - onOptionsItemSelected() - Allows the user to select the menu
     * @param: item (type -> MenuItem)
     * @return: boolean
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_about:
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
