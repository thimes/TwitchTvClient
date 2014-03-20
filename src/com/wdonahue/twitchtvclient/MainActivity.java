package com.wdonahue.twitchtvclient;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ProgressBar;

import com.wdonahue.twitchtvclient.adapters.NetrunnerCardAdapter;
import com.wdonahue.twitchtvclient.api.ApiClient;
import com.wdonahue.twitchtvclient.model.Card;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends Activity {

    private NetrunnerCardAdapter mAdapter;

    private ProgressBar mProgressBar;

    private boolean mIsDownloadInProgress = false;

    private static class ActivityState {
        private List<Card> cardData = new ArrayList<Card>();
    }

    /* Holds the state information for this activity. */
    private ActivityState mState = new ActivityState();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getLastNonConfigurationInstance() instanceof ActivityState) {
            mState = (ActivityState) getLastNonConfigurationInstance();
        }

        setContentView(R.layout.activity_main);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);

        // Create the array adapter and bind it to the gridview
        GridView gridView = (GridView) findViewById(R.id.grid);
        mAdapter = new NetrunnerCardAdapter(this, 0, mState.cardData);
        gridView.setAdapter(mAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = mState.cardData.get(position).getTitle();

                Intent viewCardIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mState.cardData.get(position).getUrl()));
                startActivity(viewCardIntent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mState.cardData.isEmpty()) {
            downloadData();
        }
    }

    @Override
    public Object onRetainNonConfigurationInstance() {
        // Return our state so we can later restore it in onCreate() via getLastNonConfigurationInstance();
        return mState;
    }

    private void downloadData() {
        if (!mIsDownloadInProgress) {
            mIsDownloadInProgress = true;

            mProgressBar.setVisibility(View.VISIBLE);

            ApiClient.getNetrunnerDBApiClient().getCards(new Callback<List<Card>>() {
                @Override
                public void success(List<Card> cards, Response response) {
                    consumeApiData(cards);
                }

                @Override
                public void failure(RetrofitError retrofitError) {
                    consumeApiData(null);
                }
            });
        }
    }

    private void consumeApiData(List<Card> cards) {
        if (cards != null) {
            // Add the found streams to our array to render
            mState.cardData.addAll(cards);

            // Tell the adapter that it needs to rerender
            mAdapter.notifyDataSetChanged();

            // Done loading; remove loading indicator
            mProgressBar.setVisibility(View.GONE);
        }

        mIsDownloadInProgress = false;
    }
}
