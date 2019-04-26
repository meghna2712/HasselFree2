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

public class promotionadapter   extends ArrayAdapter<promotions> {


    private Context mContext;
    private List<promotions> promotionsList = new ArrayList<>();

    public promotionadapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<promotions> list) {
        super(context, 0, list);
        mContext = context;
        promotionsList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.activity_list_item, parent, false);

        promotions currentMovie = promotionsList.get(position);

        TextView title = (TextView) listItem.findViewById(R.id.textView_name);
        title.setText(currentMovie.getmName());

        TextView code = (TextView) listItem.findViewById(R.id.textView_name);
        code.setText(currentMovie.getmName());

        TextView rating = (TextView) listItem.findViewById(R.id.textView_name);
        rating.setText(currentMovie.getmName());

        return listItem;
    }
}