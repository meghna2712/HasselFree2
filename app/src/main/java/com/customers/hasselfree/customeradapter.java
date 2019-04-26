package com.customers.hasselfree;
import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class customeradapter   extends ArrayAdapter<customers> {


    private Context mContext;
    private List<customers> customerlist = new ArrayList<>();

    public customeradapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<customers> list) {
        super(context, 0, list);
        mContext = context;
        customerlist = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.activity_list_item, parent, false);

        customers currentMovie = customerlist.get(position);

        ImageView image = (ImageView) listItem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentMovie.getmImageDrawable());

        TextView name = (TextView) listItem.findViewById(R.id.textView_name);
        name.setText(currentMovie.getmName());

        RatingBar release = (RatingBar) listItem.findViewById(R.id.rating);
        release.setRating(currentMovie.getmRelease());

        return listItem;
    }
}


