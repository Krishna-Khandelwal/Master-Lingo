package com.example.masterlingo.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.masterlingo.EnglishModule;
import com.example.masterlingo.Login;
import com.example.masterlingo.R;
import com.example.masterlingo.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

//    public HomeFragment(){
//    }

    private HomeViewModel homeViewModel;
//    private FragmentHomeBinding binding;
    private CardView englishCard;
//    Button logOutBtn;
    Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        context = getActivity();
//        homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);

//
//        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

    public void onStart(){
        super.onStart();
        CardView card = (CardView) context.findViewById(R.id.english_card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EnglishModule.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        binding = null;
    }
}