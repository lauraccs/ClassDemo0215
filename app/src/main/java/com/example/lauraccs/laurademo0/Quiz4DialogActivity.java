package com.example.lauraccs.laurademo0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.OnClick;

public class Quiz4DialogActivity extends BaseActivity {

    private int rdgID;

    @BindView(R.id.rdg_quiz4)
    RadioGroup rdgQuiz4;
    @OnClick(R.id.bt_ok_quiz4)
    public void okClick(){

        switch (rdgID){
            case R.id.rb1_quiz4:
              toActivity(DialogActivity.class);
                break;
            case R.id.rb2_quiz4:
                toActivity(ListViewActivity.class);
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4_dialog);
    }
}
