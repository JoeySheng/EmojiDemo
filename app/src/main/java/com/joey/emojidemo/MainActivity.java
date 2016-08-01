package com.joey.emojidemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;

import com.joey.emojidemo.recyclerView.CommonRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv = null;

    private TextView tv = null;

    /**
     * 显示表情的适配器
     */
    private CommonRecyclerViewAdapter adapter = null;

    /**
     * 管理表情的布局管理器
     */
    private StaggeredGridLayoutManager layoutManager = null;

    /**
     * 显示的数据
     */
    private List<Integer> data = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化列表控件
        rv = (RecyclerView) findViewById(R.id.rv);
        tv = (TextView) findViewById(R.id.tv);

        //添加emoji表情资源
        addAllEmogi();

        rv.setBackgroundColor(Color.GRAY);

        //创建适配器
        adapter = new SelectEmojiFragmentAdapter(this, data);

        //创建布局管理器
        layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);
        rv.setLayoutManager(layoutManager);

        //创建条目间隔
        EmojiSpaceItemDecoration itemDecoration = new EmojiSpaceItemDecoration();
        rv.addItemDecoration(itemDecoration);

        //设置适配器
        rv.setAdapter(adapter);

        adapter.setOnRecyclerViewItemClickListener(new CommonRecyclerViewAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                SpannableString s = new SpannableString("emoji");
                ImageSpan i = new ImageSpan(MainActivity.this, data.get(position));
                s.setSpan(i, 0, 5, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
                tv.append(s);
            }
        });

    }

    /**
     * 加入所有表情
     */
    private void addAllEmogi() {
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);
        data.add(R.mipmap.emoji_0);

    }

}
