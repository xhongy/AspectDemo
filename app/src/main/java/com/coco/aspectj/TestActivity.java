package com.coco.aspectj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.coco.aspectjlib.TimeSpend;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {
    Button btn,camare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camare=(findViewById(R.id.camera));
        camare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                camera();
            }
        });

        Animal animal = new Animal();
        animal.hurt();
    }

    public void onViewClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                Animal animal = new Animal();
                int h = animal.getHeight();
                animal.getTest(56);
                test();
                break;
            case R.id.login1:
                attemptLogin();
                break;
        }
    }
    //    @MPermisson(value = Manifest.permission.CAMERA)
    public void camera() {
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(getExternalCacheDir() + "photo.jpg")));
//        startActivity(intent);
    }
    public void test(){

    }

    @TimeSpend("登录")
    private void attemptLogin() {
    }
}