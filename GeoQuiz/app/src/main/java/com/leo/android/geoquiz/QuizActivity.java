package com.leo.android.geoquiz;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButtom;
    private Button mFalseButtom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mFalseButtom = (Button) findViewById(R.id.false_button);
        mTrueButtom = (Button) findViewById(R.id.true_button);
        mTrueButtom.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(R.layout.activity_quiz);
    }

}
