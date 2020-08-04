package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtstory;
    Button upperbtn;
    Button lowerbtn;
    private int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtstory=findViewById(R.id.storyTextView);
        upperbtn=findViewById(R.id.buttonTop);
        lowerbtn=findViewById(R.id.buttonBottom);

        upperbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex==1)
                {
                    txtstory.setText(R.string.T3_Story);
                    upperbtn.setText(R.string.T3_Ans1);
                    lowerbtn.setText(R.string.T3_Ans2);
                    mStoryIndex=mStoryIndex+1;
                }
                else if (mStoryIndex==2 && (txtstory.getText().equals(getResources().getString(R.string.T3_Story))))
                {
                    txtstory.setText(R.string.T6_End);
                    upperbtn.setVisibility(View.GONE);
                    lowerbtn.setVisibility(View.GONE);
                }

                else if (mStoryIndex==2 && (txtstory.getText().equals(getResources().getString(R.string.T2_Story))))
                {
                    txtstory.setText(R.string.T3_Story);
                    upperbtn.setText(R.string.T3_Ans1);
                    lowerbtn.setText(R.string.T3_Ans2);
                }



            }
        });

        lowerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex==1)
                {
                    txtstory.setText(R.string.T2_Story);
                    upperbtn.setText(R.string.T2_Ans1);
                    lowerbtn.setText(R.string.T2_Ans2);
                    mStoryIndex=mStoryIndex+1;
                }
                else if (mStoryIndex==2 && (txtstory.getText().equals(getResources().getString(R.string.T3_Story))))
                {
                    txtstory.setText(R.string.T5_End);
                    upperbtn.setVisibility(View.GONE);
                    lowerbtn.setVisibility(View.GONE);

                }
                else if (mStoryIndex==2 && (txtstory.getText().equals(getResources().getString(R.string.T2_Story))))
                {
                    txtstory.setText(R.string.T4_End);
                    upperbtn.setVisibility(View.GONE);
                    lowerbtn.setVisibility(View.GONE);

                }

            }
        });

    }
}
