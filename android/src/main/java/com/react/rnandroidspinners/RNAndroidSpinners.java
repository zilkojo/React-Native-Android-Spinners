package com.react.rnandroidspinners;


import android.support.annotation.Nullable;
import android.view.View;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;


public class RNAndroidSpinners extends SimpleViewManager<RNAndroidSpinnersView> {

    ReactApplicationContext mContext;

    double mSize = 48;

    public RNAndroidSpinners(ReactApplicationContext reactContext) {
        mContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAndroidSpinners";
    }

    @Override
    protected RNAndroidSpinnersView createViewInstance(ThemedReactContext reactContext) {
        return new RNAndroidSpinnersView(reactContext);
    }

    @ReactProp(name = "isVisible")
    public void setIsVisible(RNAndroidSpinnersView view, @Nullable Boolean visible) {
        if(visible)
            view.setVisibility(View.VISIBLE);
        else
            view.setVisibility(View.INVISIBLE);
    }

    @ReactProp(name = "color")
    public void setColor(RNAndroidSpinnersView view, @Nullable int color) {
        view.setSpriteColor(color);
    }

    @ReactProp(name = "size")
    public void setSize(RNAndroidSpinnersView view, @Nullable double size) {
        view.setSpriteSize(size);
    }

    @ReactProp(name = "type")
    public void setType(RNAndroidSpinnersView view, @Nullable String spinnerType) {
        view.setSpriteType(spinnerType);

    }

}
