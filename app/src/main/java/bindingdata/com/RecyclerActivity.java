package bindingdata.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        UserRecyclerView userRecyclerView =new UserRecyclerView(getUserList());
        recyclerView.setAdapter(userRecyclerView);

    }
    private List<User> getUserList(){
        List<User> userList =new ArrayList<>();
        userList.add(new User("Siyanda",20,true,"https://moodle.htwchur.ch/pluginfile.php/124614/mod_page/content/4/example.jpg"));
        userList.add(new User("Tholithemba",20,false,"https://moodle.htwchur.ch/pluginfile.php/124614/mod_page/content/4/example.jpg"));
        userList.add(new User("John",20,true,"https://moodle.htwchur.ch/pluginfile.php/124614/mod_page/content/4/example.jpg"));
        userList.add(new User("Aarron",20,false,"https://moodle.htwchur.ch/pluginfile.php/124614/mod_page/content/4/example.jpg"));
        userList.add(new User("Micheal",20,true,"https://moodle.htwchur.ch/pluginfile.php/124614/mod_page/content/4/example.jpg"));

        return userList;
    }
}