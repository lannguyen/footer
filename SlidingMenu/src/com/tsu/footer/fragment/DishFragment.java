package com.tsu.footer.fragment;

import info.androidhive.slidingmenu.R;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class DishFragment extends Fragment {
	private ListView mDishItemLV;
	private Activity mActivity;
	private DishItemAdapter mAdapter;
	
	public DishFragment() {}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		mActivity = activity;
	}

	@Override
	public void onDetach() {
		super.onDetach();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Log.i(Constants.TAG, "onCreateView");
		View root = inflater.inflate(R.layout.fragment_dish, container, false);
		mDishItemLV = (ListView) root.findViewById(R.id.list_dish_item);
		mDishItemLV.setAdapter(mAdapter);
		
		return root;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	}
	
	public void setAdapter(DishItemAdapter adapter) {
		mAdapter = adapter;
	}
}
