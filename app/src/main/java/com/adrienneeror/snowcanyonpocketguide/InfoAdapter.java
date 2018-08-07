package com.adrienneeror.snowcanyonpocketguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info> {

    private static final String LOG_TAG = InfoAdapter.class.getSimpleName();

    public InfoAdapter(Activity context, ArrayList<Info> Info) {
        super(context, 0, Info);
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
        Info currentInfo = getItem(position);

        // hike names
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.names_text_view);
        nameTextView.setText(currentInfo.getAboutNames());

        //hike descriptions
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentInfo.getAboutDescriptions());

        //images
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        iconView.setImageResource(currentInfo.getImage());

        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;
    }
}

