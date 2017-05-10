package com.skeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.skeleton.R;
import com.skeleton.activity.PostActivity;
import com.skeleton.modal.Address;
import com.skeleton.modal.Company;
import com.skeleton.modal.UserInfo;

/**
 * Created by admin23 on 9/5/17.
 */

public class UserDetails extends BaseFragment {
    private TextView tvUsername, tvName, tvEmail, tvStreet, tvPhonenumber, tvcompany;
    private Button btnDisplay;
    private UserInfo userinfo;
    private Company company;
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_details, container, false);
        init(view);
        Bundle bundle = getArguments();
        userinfo = bundle.getParcelable("obj");
        tvUsername.setText(userinfo.getUsername());
        tvName.setText(userinfo.getName());
        tvEmail.setText(userinfo.getEmail());
        Address address = userinfo.getAddress();
        String street = address.getStreet();
        tvStreet.setText(street);
        tvPhonenumber.setText(userinfo.getPhone());
        company = userinfo.getCompany();
        String companyname;
        companyname = company.getName();
        tvcompany.setText(companyname);
        return view;
    }

    /**
     * @param view view
     */
    private void init(final View view) {
        tvUsername = (TextView) view.findViewById(R.id.tvUsername);
        tvName = (TextView) view.findViewById(R.id.tvName);
        tvEmail = (TextView) view.findViewById(R.id.tvEmail);
        tvcompany = (TextView) view.findViewById(R.id.tvcompany_name);
        tvStreet = (TextView) view.findViewById(R.id.tvStreet);
        tvPhonenumber = (TextView) view.findViewById(R.id.tvPhone_number);
        btnDisplay = (Button) view.findViewById(R.id.btnGet_Data);
        btnDisplay.setOnClickListener(this);

    }

    @Override
    public void onClick(final View v) {
        super.onClick(v);
        Intent intent = new Intent(getContext(), PostActivity.class);
        intent.putExtra("id", userinfo.getId());
        startActivity(intent);
    }
}


