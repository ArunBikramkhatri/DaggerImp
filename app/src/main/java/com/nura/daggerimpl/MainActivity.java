package com.nura.daggerimpl;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nura.daggerimpl.dagger.DaggerUserComponent;
import com.nura.daggerimpl.dagger.UserComponent;
import com.nura.daggerimpl.models.User;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button btnShowDetails;
    TextView txtUserDetails;

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initModelsData();
        initFields();
        initListeners();
    }

    private void initModelsData() {
        UserComponent userComponent = DaggerUserComponent.builder().build();
        userComponent.inject(this);
    }


    void initFields() {
        btnShowDetails = findViewById(R.id.btn_dagger_impl);
        txtUserDetails = findViewById(R.id.txt_user_details);
    }

    void initListeners() {
        if (btnShowDetails == null) {
            Log.d(TAG, "initListeners : btnShowDetails is null");
            return;
        }
        if (txtUserDetails == null) {
            Log.d(TAG, "initListeners : txtUserDetails is null");
            return;
        }
        if (user == null) {
            Log.d(TAG, "initListeners : user is null");
            return;
        }
        btnShowDetails.setOnClickListener(v -> {
            txtUserDetails.setText(user.toString());
        });
    }

}