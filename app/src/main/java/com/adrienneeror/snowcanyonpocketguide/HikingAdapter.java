package com.adrienneeror.snowcanyonpocketguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class HikingAdapter extends ArrayAdapter<Hiking> {

    private static final String LOG_TAG = HikingAdapter.class.getSimpleName();

    public HikingAdapter(Activity context, ArrayList<Hiking> Hiking) {
        super(context, 0, Hiking);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get hike object located at this position in the list
        Hiking currentHiking = getItem(position);

        // hike names
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.names_text_view);
        nameTextView.setText(currentHiking.getAboutNames());

        //hike descriptions
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentHiking.getAboutDescriptions());

        //images
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        iconView.setImageResource(currentHiking.getImage());


        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;
    }
}