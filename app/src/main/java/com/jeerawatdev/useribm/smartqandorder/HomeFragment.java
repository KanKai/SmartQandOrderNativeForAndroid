package com.jeerawatdev.useribm.smartqandorder;




import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View mRelative = inflater.inflate(R.layout.fragment_home, container, false);
        Button btnNextPage = (Button) mRelative.findViewById(R.id.btnNext);
        btnNextPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("Test","Click");
                Intent i = new Intent(getActivity(),BranchListActivity.class);
                startActivity(i);
            }
        });

        return mRelative;

    }



}
