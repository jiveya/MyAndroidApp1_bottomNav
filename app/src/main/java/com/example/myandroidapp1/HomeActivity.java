package com.example.myandroidapp1;

import static com.example.myandroidapp1.R.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.example.myandroidapp1.databinding.ActivityHomeBinding;
import com.example.myandroidapp1.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                replaceFragment(new HomeFragment());
            } else if (item.getItemId() == R.id.desc) {
                replaceFragment(new DescFragment());
            } else if (item.getItemId() == R.id.summary) {
                replaceFragment(new SummaryFragment());
            } else {
                replaceFragment(new ProfileFragment());}
            return true;
        });
            //return true;
        //});

//        binding.bottomNavigationView.setOnItemSelectedListener(item ->{
//            switch(item.getItemId()){
//                case R.id.home:
//                    replaceFragment(new HomeFragment());
//                    break;
//                case R.id.desc:
//                    replaceFragment(new DescFragment());
//                    break;
//                case R.id.summary:
//                    replaceFragment(new SummaryFragment());
//                    break;
//                case R.id.profile:
//                    replaceFragment(new ProfileFragment());
//                    break;
//            }
//            return true;
//        });
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(layout.activity_home);

        //Toolbar tb=(Toolbar)findViewById(R.id.toolbar);
        //tb.setTitle("Home");
        //setSupportActionBar(tb);

        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.backspace);

    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
    //  @Override
    //  public boolean onCreateOptionsMenu(Menu menu) {
    //      getMenuInflater().inflate(R.menu.menu_item,menu);
    //      return true;
    //  }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_item,menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id=item.getItemId();
//        if(id==R.id.action_settings){
//            Intent intent=new Intent(HomeActivity.this,Setting.class);
//            startActivity(intent);
//            return true;
//        }
//        else
//        if(id==R.id.bluetooth_connection) {
//            Intent intent=new Intent(HomeActivity.this,Bluetooth.class);
//            startActivity(intent);
//            return true;
//        }
//        else
//        if(id==R.id.notification) {
//            Intent intent=new Intent(HomeActivity.this,Notification.class);
//            startActivity(intent);
//            return true;
//        }
//        else
//        if(id==R.id.contact) {
//            Intent intent=new Intent(HomeActivity.this,ContactUs.class);
//            startActivity(intent);
//            return true;
//        }
//        else
//        if(id==R.id.exit) {
//            Intent intent=new Intent(HomeActivity.this,Exit.class);
//            startActivity(intent);
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}