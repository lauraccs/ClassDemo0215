package com.example.lauraccs.laurademo0.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.lauraccs.laurademo0.DialogActivity;
import com.example.lauraccs.laurademo0.R;
import com.example.lauraccs.laurademo0.ViewPagerActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lauraccs on 3/8/17.
 */

public class Quiz4Dialog extends Dialog {

    private int rdgID;


    @BindView(R.id.rdg_quiz4)
    RadioGroup rdg;
    public Quiz4Dialog(Context context, CustomDialogEventListener listener) {
        super(context, R.style.dialog);
        this.listener = listener;

    }

    @OnClick(R.id.bt_cancel_quiz4)
    public void cancelClick(){
        listener.onClickListener();
        dismiss();
    }

    @OnClick(R.id.bt_ok_quiz4)
    public void okClick(){
        listener.onClickListener();

        switch (rdgID){
            case R.id.rb1_quiz4:
                break;
            case R.id.rb2_quiz4:
                break;

        }
        dismiss();
    }

   private CustomDialogEventListener listener;

  public interface CustomDialogEventListener{
      public void onClickListener();
  }

    public void toActivity(){

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4_dialog);
        ButterKnife.bind(this);
    }


}
