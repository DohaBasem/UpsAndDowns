package com.example.doha.upsanddowns.Common.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.doha.upsanddowns.Common.Presenter.BasePresenter;
import com.example.doha.upsanddowns.Common.View.IView;
import com.example.doha.upsanddowns.R;

public class BaseActivity<P extends BasePresenter> extends AppCompatActivity
        implements IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base2);
    }
}
