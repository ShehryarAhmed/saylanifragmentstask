package com.example.sayla.secondprojectfragment;


import android.content.Context;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor
    }

   public  interface  fragmentinterface{
       void dosmomework(String msg);
   }
    private fragmentinterface callback;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_fragment1, container, false);
        final EditText editText = (EditText) rootview.findViewById(R.id.edittext);
        Button button = (Button) rootview.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),""+editText.getText(),Toast.LENGTH_SHORT).show();
                callback.dosmomework(editText.getText().toString());
            }
        });

        return rootview;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback = (fragmentinterface) context;
    }
}
