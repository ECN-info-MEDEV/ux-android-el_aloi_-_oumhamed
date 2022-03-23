package com.example.myapplication.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private ListView listHabits;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        View root= inflater.inflate(R.layout.fragment_home, container, false);
        listHabits = (ListView) root.findViewById(R.id.listhabits);

        ArrayList<String> arrayList = new ArrayList<>();
        Category cat = new Category("Food", Color.alpha(15));
        Habit habit1 = new Habit("Drink Water", 5, cat);
        arrayList.add(habit1.getName());
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.getActivity(), R.layout.singlehabit, R.id.textView3, arrayList);
        listHabits.setAdapter(arrayAdapter);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}