package com.demirgroup.booklaunch.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demirgroup.booklaunch.BookSingleton
import com.demirgroup.booklaunch.Model.BookModel
import com.demirgroup.booklaunch.R
import com.demirgroup.booklaunch.databinding.ActivityBookLaunchDeatilsBinding

class BookLaunchDeatils : AppCompatActivity() {
    private lateinit var binding : ActivityBookLaunchDeatilsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookLaunchDeatilsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val booksInfo:BookModel? = BookSingleton.singleBooks
        binding.bookLauncherImage.setImageResource(booksInfo!!.bookImage)
        binding.BookLauncherAuthor.text = booksInfo.author
        binding.bookLauncherName.text = booksInfo.BookName
        binding.BookLauncherSummary.text = booksInfo.BookSummary
    }
}