package com.tsu.footer.fragment;

import info.androidhive.slidingmenu.R;

import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DishItemAdapter extends BaseAdapter {
	private List<String> mDishName;
	private Activity mActivity;
	
	private static class ViewHolder {
		ImageView snapshot;
		TextView name;
	}
	
	public DishItemAdapter(Activity activity, List<String> dishName) {
		mActivity = activity;
		mDishName = dishName;
	}

	@Override
	public int getCount() {
		return mDishName.size();
	}

	@Override
	public Object getItem(int position) {
		return mDishName.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
    	final ViewHolder holder;
    	LayoutInflater inflater = LayoutInflater.from(mActivity);
    	
    	if(convertView == null) {
    		convertView = inflater.inflate(R.layout.fragment_dish_item, parent, false);
    		holder = new ViewHolder();
    		holder.snapshot = (ImageView) convertView.findViewById(R.id.dish_item_snapshot);
    		holder.name = (TextView) convertView.findViewById(R.id.dish_item_des);
    		convertView.setTag(holder);
    	} else {
    		holder = (ViewHolder) convertView.getTag();
    	} 
		return convertView;
	}

}
