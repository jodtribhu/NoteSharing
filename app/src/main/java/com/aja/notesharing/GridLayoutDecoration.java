package com.aja.notesharing;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutDecoration  extends RecyclerView.ItemDecoration {

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildLayoutPosition(view);

        GridLayoutManager manager = (GridLayoutManager) parent.getLayoutManager();

        if (parent.getChildLayoutPosition(view) < manager.getSpanCount())
            outRect.top = 2;

        if (position % 2 != 0) {
            outRect.right = 2;
        }

        outRect.left = 2;
        outRect.bottom = 2;
    }
}
