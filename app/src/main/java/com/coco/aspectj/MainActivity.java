package com.coco.aspectj;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import com.coco.aspectjlib.MPermisson;
import com.coco.aspectjlib.TimeSpend;

import java.io.File;

public class MainActivity extends AppCompatActivity {
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

    }

    public void onViewClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                test();
                break;
            case R.id.login1:
                attemptLogin();
                break;
        }
    }
    @TimeSpend("camera")
    @MPermisson(value = Manifest.permission.CAMERA)
    public void camera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(getExternalCacheDir() + "photo.jpg")));
        startActivity(intent);
    }
    @TimeSpend("test")
    public void test(){
        Intent intent = new Intent(this,TestActivity.class);
        startActivity(intent);
    }

    @TimeSpend("登录")
    private void attemptLogin() {
    }
}
