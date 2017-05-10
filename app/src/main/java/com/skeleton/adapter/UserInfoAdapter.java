package com.skeleton.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.activity.MainActivity;
import com.skeleton.fragment.UserDetails;
import com.skeleton.modal.UserInfo;

import java.util.List;

/**
 * Created by admin23 on 5/5/17.
 */

public class UserInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<UserInfo> userInfoList;

    /**
     * @param context      context
     * @param userInfoList userinfodisplay
     */
    public UserInfoAdapter(final Context context, final List<UserInfo> userInfoList) {
        this.context = context;
        this.userInfoList = userInfoList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.info_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        UserInfo userdetail = userInfoList.get(position);


    }

    @Override
    public int getItemCount() {
        return userInfoList.size();
    }

    /**
     * view holder class
     */
    private final class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvusername, tvuserid, tvusercompany;

        /**
         *
         * @param itemView view
         */
        public MyViewHolder(final View itemView) {
            super(itemView);
            init();
        }

        /**
         * init initialzation method
         */
        public void init() {
            tvusername = (TextView) itemView.findViewById(R.id.username);
            tvuserid = (TextView) itemView.findViewById(R.id.user_id);
            tvusercompany = (TextView) itemView.findViewById(R.id.user_company);

        }

        @Override
        public void onClick(final View v) {
            FragmentManager manager = ((MainActivity) context).getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            int pos = getAdapterPosition();
            if (pos != RecyclerView.NO_POSITION) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("obj", userInfoList.get(pos));
                UserDetails fragment = new UserDetails();
                fragment.setArguments(bundle);
                transaction.replace(R.id.ll, fragment);
                transaction.commit();
            }
        }
    }
}
