package com.example.konstant.kulinary_directory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ItemAdapter extends BaseAdapter {

    private Context mContext;


    public Integer[] mThumbIds = { R.drawable.desert1, R.drawable.desert2,
            R.drawable.desert3, R.drawable.desert4, R.drawable.desert5,
            R.drawable.desert6, R.drawable.desert7, R.drawable.desert8,
            };

    public ItemAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mThumbIds.length; // длина массива
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(525,425));
        return imageView;
    }
}