package com.example.theroadaccidentssolver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.BaseMenuPresenter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTxtDesc,editTxtCause;
    TextView textView3,textView4,textView6,textView2;
    ImageButton imageBtn,imageBtn2,imageBtnCam,imageBtnCall;
    Button btnPhoto,btnReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        editTxtDesc = (EditText) findViewById(R.id.editTxtDesc);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4=(TextView) findViewById(R.id.textView4);
        textView6=(TextView) findViewById(R.id.textView6);
        textView2=(TextView) findViewById(R.id.textView2);
        imageBtn= (ImageButton) findViewById(R.id.imageBtn);
        imageBtnCam=(ImageButton) findViewById(R.id.imageBtn2);
        imageBtn2=(ImageButton) findViewById(R.id.imageBtn2);
        imageBtnCall=(ImageButton) findViewById(R.id.imageBtnCall);
        btnPhoto=(Button) findViewById(R.id.btnPhoto);
        btnReport=(Button) findViewById(R.id.btnReport);

        editTxtDesc.setOnClickListener((View.OnClickListener) this);
        textView3.setOnClickListener((View.OnClickListener) this);
        textView4.setOnClickListener(this);
        textView6.setOnClickListener(this);
        textView2.setOnClickListener(this);
        imageBtn.setOnClickListener(this);
        imageBtnCam.setOnClickListener(this);
        imageBtn2.setOnClickListener(this);
        imageBtnCall.setOnClickListener(this);
        btnPhoto.setOnClickListener(this);
        btnReport.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
      //  BaseMenuPresenter view;
        //if(view.getId()==R.id.editTxtDesc){

    }
}
