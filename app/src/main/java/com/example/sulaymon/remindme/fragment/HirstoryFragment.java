package com.example.sulaymon.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sulaymon.remindme.R;
import com.example.sulaymon.remindme.adapter.RemindListAdapter;
import com.example.sulaymon.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sulaymon on 08.07.2017.
 */

public class HirstoryFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;


    public static HirstoryFragment getInstance (Context context){
        Bundle args = new Bundle();
        HirstoryFragment fragment = new HirstoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));
        return view;
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<RemindDTO>();
        data.add(new RemindDTO("item 1"));
        data.add(new RemindDTO("item 2"));
        data.add(new RemindDTO("item 3"));
        data.add(new RemindDTO("item 4"));
        data.add(new RemindDTO("item 5"));
        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
