package com.skeleton.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.modal.PostData;

import java.util.List;

/**
 * Created by admin23 on 9/5/17.
 */

public class PostDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<PostData> postDataList;
    private Context context;


    /**
     * @param context      context
     * @param postDataList datalist
     */
    public PostDataAdapter(final Context context, final List<PostData> postDataList) {

        this.postDataList = postDataList;
        this.context = context;

    }

    /**
     *
     * @param parent parent
     * @param viewType viewtype
     * @return return
     */

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item_list, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        PostData postDataobj = postDataList.get(position);
        ViewHolder viewholder = (ViewHolder) holder;
        viewholder.tvUserId.setText(String.valueOf(postDataobj.getId()));
        viewholder.tvUserTitle.setText(String.valueOf(postDataobj.getTitle()));
        viewholder.tvDetails.setText(String.valueOf(postDataobj.getBody()));

    }

    @Override
    public int getItemCount() {
        return postDataList.size();
    }

    /**
     * class viewholder
     */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvUserId;
        private TextView tvUserTitle;
        private TextView tvDetails;
        /**
         *
         * @param itemView itemview;
         */
        public ViewHolder(final View itemView) {
            super(itemView);

            tvUserId = (TextView) itemView.findViewById(R.id.tv_user_id);
            tvUserTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvDetails = (TextView) itemView.findViewById(R.id.tv_body);


        }
    }
}
