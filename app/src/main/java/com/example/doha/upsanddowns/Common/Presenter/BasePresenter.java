package com.example.doha.upsanddowns.Common.Presenter;

import android.support.annotation.Nullable;

import com.example.doha.upsanddowns.Common.Model.BaseModel;
import com.example.doha.upsanddowns.Common.View.IView;

/**
 * Created by doha on 23/02/18.
 */

public class BasePresenter<V extends IView, M extends BaseModel> {

    protected V view;
    protected M model;

    public V getView() {
        return view;
    }

    public void setView(V view) {
        this.view = view;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
