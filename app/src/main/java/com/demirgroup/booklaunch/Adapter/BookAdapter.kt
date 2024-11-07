package com.demirgroup.booklaunch.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.demirgroup.booklaunch.Activity.BookLaunchDeatils
import com.demirgroup.booklaunch.BookSingleton
import com.demirgroup.booklaunch.Model.BookModel
import com.demirgroup.booklaunch.databinding.BookLaunchItemsBinding

class BookAdapter(val bookList:ArrayList<BookModel>) : RecyclerView.Adapter<BookAdapter.BookHolder>(){
    class BookHolder(val binding:BookLaunchItemsBinding) : RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        val binding:BookLaunchItemsBinding = BookLaunchItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BookHolder(binding)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        val booksObject = bookList.get(position)
        holder.binding.BookName.text = booksObject.BookName
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,BookLaunchDeatils::class.java)
            BookSingleton.singleBooks = booksObject
            holder.itemView.context.startActivity(intent)
        }
    }


}