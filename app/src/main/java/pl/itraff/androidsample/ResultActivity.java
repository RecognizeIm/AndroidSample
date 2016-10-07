package pl.itraff.androidsample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Set imageView's source image from the Uri passed in the Intent's extra data
        Intent myIntent = getIntent();
        Uri imageUri = myIntent.getParcelableExtra(MainActivity.EXTRA_IMAGE_URI);
        ImageView imageViewResult = (ImageView) findViewById(R.id.imageView);
        imageViewResult.setRotation(90.0f);
        imageViewResult.setImageURI(null);
        imageViewResult.setImageURI(imageUri);
    }

}
