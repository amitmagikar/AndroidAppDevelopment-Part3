package com.example.amitmagikar.imagegallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageGallery extends AppCompatActivity {

    private ImageView imageView;
    private Button nextButton;
    private Button previousButton;

    private int current_image_index = 1;
    int[] images = {R.mipmap.genie11, R.mipmap.genie12, R.mipmap.genie13, R.mipmap.genie14, R.mipmap.genie15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_gallery);

        imageView = (ImageView) findViewById(R.id.imageView);
        nextButton = (Button) findViewById(R.id.nextButton);
        previousButton = (Button) findViewById(R.id.previousButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image_index++;
                if(current_image_index > 4){
                    current_image_index = 0;
                }
                imageView.setImageResource(images[current_image_index]);

            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image_index--;
                if(current_image_index < 0){
                    current_image_index = 4;
                }
                imageView.setImageResource(images[current_image_index]);

            }
        });
    }
}
