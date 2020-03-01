package com.example.momandbaby.Main

import android.content.Context
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

 class Adapter(val mViewColors : List<String>,
                     val mAnimal : List<String>,
                     val mInflater: Inflater,
                     val mClickListener: AdapterView.OnItemClickListener,
                     val context: Context
): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
}