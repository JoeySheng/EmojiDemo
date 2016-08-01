package com.joey.emojidemo;

import android.content.Context;

import com.joey.emojidemo.recyclerView.CommonRecyclerViewAdapter;
import com.joey.emojidemo.recyclerView.CommonRecyclerViewHolder;

import java.util.List;

/**
 * 文件描述
 * Date: 16/8/1
 *
 * @author xusheng
 */
public class SelectEmojiFragmentAdapter extends CommonRecyclerViewAdapter<Integer> {

    /**
     * 构造函数
     *
     * @param context 上下文
     * @param data    显示的数据
     */
    public SelectEmojiFragmentAdapter(Context context, List<Integer> data) {
        super(context, data);
    }

    @Override
    public void convert(CommonRecyclerViewHolder h, Integer entity, int position) {
        h.setImage(R.id.iv, entity);
    }

    @Override
    public int getLayoutViewId(int viewType) {
        return R.layout.item;
    }
}
