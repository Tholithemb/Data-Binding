package bindingdata.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import bindingdata.com.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Object od user class
        User user =new User("Siyanda",20,true,"https://moodle.htwchur.ch/pluginfile.php/124614/mod_page/content/4/example.jpg");

        // root activity to layout
        ActivityMainBinding activityMainBinding =DataBindingUtil.setContentView(this,R.layout.activity_main);

        activityMainBinding.setMyTopheader("Data Binding App");

        activityMainBinding.setUser(user);
        activityMainBinding.setNextButton("Data Binding with RecyclerView");
        activityMainBinding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),RecyclerActivity.class);
                startActivity(intent);
            }
        });

        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Hi " +user.getName(), Toast.LENGTH_SHORT).show();
            }

            //Glide.with(this)
            //        .load("url here") // image url
            //        .placeholder(R.drawable.placeholder) // any placeholder to load at start
            //        .error(R.drawable.imagenotfound)  // any image in case of error
            //        .override(200, 200); // resizing
            //        .centerCrop();
            //        .into(imageView);  // imageview object

        });

    }
}