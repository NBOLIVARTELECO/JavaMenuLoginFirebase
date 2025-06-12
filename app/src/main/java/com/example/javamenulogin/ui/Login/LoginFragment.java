package com.example.javamenulogin.ui.Login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.javamenulogin.databinding.FragmentGalleryBinding;
import com.example.javamenulogin.databinding.FragmentLoginBinding;
import com.example.javamenulogin.ui.Login.LoginViewModel;


import java.text.BreakIterator;


public class LoginFragment extends Fragment implements View.OnClickListener {

    private FragmentLoginBinding binding;
    //test
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        com.example.javamenulogin.ui.Login.LoginViewModel homeViewModel =
                new ViewModelProvider(this).get(com.example.javamenulogin.ui.Login.LoginViewModel.class);

        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLogin;

        textView.setText(LoginViewModel.getText());
        Button btn = binding.buttonLogin;

        btn.setOnClickListener(this);
        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View v) {
        System.out.println("Click realizado");
    }
}