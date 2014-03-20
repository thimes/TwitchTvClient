package com.wdonahue.twitchtvclient.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.wdonahue.twitchtvclient.R;
import com.wdonahue.twitchtvclient.model.Card;

import java.util.List;

public class NetrunnerCardAdapter extends ArrayAdapter<Card> {
    private LayoutInflater mInflater;

    public NetrunnerCardAdapter(Context context, int textViewResourceId, List<Card> objects) {
        super(context, textViewResourceId, objects);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Holder holder;

        if (view == null) {
            // View doesn't exist so create it and create the holder
            view = mInflater.inflate(R.layout.grid_item_card, parent, false);

            holder = new Holder();
            holder.cardImage = (ImageView) view.findViewById(R.id.imgCard);

            view.setTag(holder);
        } else {
            // Just get our existing holder
            holder = (Holder) view.getTag();
        }

        // Populate via the holder for speed
        Card card = getItem(position);

        // Populate the item contents

        Log.v("TRAVIS", "img src = " + card.getImagePath());

        // Load the card image with picasso
        Picasso.with(getContext())
                .load(card.getImagePath())
                .placeholder(R.drawable.white)
                .into(holder.cardImage)
                ;

        return view;
    }

    // Holder class used to efficiently recycle view positions
    private static final class Holder {
        public ImageView cardImage;
    }
}
