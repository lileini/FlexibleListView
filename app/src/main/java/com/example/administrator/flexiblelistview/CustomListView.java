package com.example.administrator.flexiblelistview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ListView;

public class CustomListView extends ListView {
    private int mMaxOverScrollY = 100;

    public CustomListView(Context context) {
        super(context);
        init();
    }

    private void init() {
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        float density = metrics.density;
        mMaxOverScrollY = (int) (density*mMaxOverScrollY);
    }

    public CustomListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, mMaxOverScrollY, isTouchEvent);
    }
}
