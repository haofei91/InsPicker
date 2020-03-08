package com.octopepper.mediapickerinstagram.commons.modules;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LoadMoreModule {

    private RecyclerView recyclerView;
    private LoadMoreModuleDelegate delegate;

    public void LoadMoreUtils(RecyclerView r, LoadMoreModuleDelegate d, Context context) {
        this.recyclerView = r;
        this.delegate = d;
        addListener();
    }

    private void addListener() {
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager llm = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (llm.findFirstVisibleItemPosition() >= (llm.getItemCount() / 5)) {
                    delegate.shouldLoadMore();
                }
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int scrollState) {
            }
        });
    }

}
