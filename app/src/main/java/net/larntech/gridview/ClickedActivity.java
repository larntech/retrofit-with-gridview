package net.larntech.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ClickedActivity extends AppCompatActivity {

    ImagesResponse imagesResponse;

    TextView tvName;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked);

        tvName = findViewById(R.id.selectedName);
        imageView = findViewById(R.id.selectedImage);




        Intent intent = getIntent();

        if(intent.getExtras() != null){
            imagesResponse = (ImagesResponse) intent.getSerializableExtra("data");
            tvName.setText(imagesResponse.getName());

            GlideApp.with(this).load(imagesResponse.getUrl()).into(imageView);

        }


    }
}
