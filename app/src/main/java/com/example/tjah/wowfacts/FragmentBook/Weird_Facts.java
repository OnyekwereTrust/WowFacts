package com.example.tjah.wowfacts.FragmentBook;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.tjah.wowfacts.ColorWheel;
import com.example.tjah.wowfacts.Facts;
import com.example.tjah.wowfacts.R;

//import com.example.tjah.wowfacts.FactBook.techFactBook;

public class Weird_Facts extends Fragment {


    private Facts[] mTechFactBank = new Facts[]{
            new Facts(R.string.fact1),
            new Facts(R.string.fact2),
            new Facts(R.string.fact3),
            new Facts(R.string.fact4),
            new Facts(R.string.fact5),
    };

    private TextView mFactTextView;

    private int mCurrentIndex = 0;


    private void updateQuestion() {
        int question = mTechFactBank[mCurrentIndex].getFactId();
        mFactTextView.setText(question);
    }

    //declare our new variables
    //  private com.example.tjah.wowfacts.FactBook.techFactBook techFactBook = new techFactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private RelativeLayout relativeLayout;
    private TextView factTextView;
    private Button showFactButton;


    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.weird_fragment, container, false);
        mFactTextView = rootView.findViewById(R.id.weirdfactTextView);

        showFactButton = rootView.findViewById(R.id.weirdshowFactbutton);
        relativeLayout = rootView.findViewById(R.id.WeirdFragLayout);
        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //assigning the views from the layout file to the corresponding variable
                mCurrentIndex = (mCurrentIndex + 1) % mTechFactBank.length;
                updateQuestion();

            }
        });
        return rootView;

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Weird_Facts");
    }


}
