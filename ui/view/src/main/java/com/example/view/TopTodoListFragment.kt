package com.example.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.view.databinding.FragmentListTodoTopBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TopTodoListFragment : Fragment(R.layout.fragment_list_todo_top) {
    private var _binding: FragmentListTodoTopBinding? = null
    private val binding: FragmentListTodoTopBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentListTodoTopBinding.bind(view)
    }
}