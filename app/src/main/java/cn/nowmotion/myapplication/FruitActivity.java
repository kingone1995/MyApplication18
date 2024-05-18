package cn.nowmotion.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;


import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.widget.Toolbar;


import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;




public class FruitActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsing;

    private Toolbar toolbar;
    private FloatingActionButton floating;
    private TextView tv_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
