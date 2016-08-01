package com.joey.emojidemo;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 文件描述
 * Date: 16/8/1
 *
 * @author xusheng
 */
public class EmojiSpaceItemDecoration extends RecyclerView.ItemDecoration {

    /**
     * 水平方向的间距
     */
    private int hSpace;


    public EmojiSpaceItemDecoration() {
        hSpace = 60;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
//        if (parent.getChildAdapterPosition(view) > 0) {
        outRect.left = hSpace;
        outRect.right = hSpace;
//        }
    }
}