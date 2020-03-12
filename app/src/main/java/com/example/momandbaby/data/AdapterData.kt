package com.example.momandbaby.data

import android.content.Context
import android.content.Intent
import android.icu.text.IDNA
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.momandbaby.InfoBabyActivity
import com.example.momandbaby.InfoMomActivity
import com.example.momandbaby.Main.MainActivity
import com.example.momandbaby.R
import kotlinx.android.synthetic.main.slider_item_container.view.*

class AdapterData(private val dataSlides: List<DataSlide>) :
    RecyclerView.Adapter<AdapterData.AdapterDataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterDataViewHolder {
        return AdapterDataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slider_item_container,
                parent,
                false
            )
        )
    }
    override fun getItemCount(): Int {
        return dataSlides.size
    }
    override fun onBindViewHolder(holder: AdapterDataViewHolder, position: Int) {
        holder.bind(dataSlides[position])
        val context= holder.thongtinbe.context
        holder.thongtinbe.setOnClickListener {
            val intent = Intent(context, InfoBabyActivity::class.java)
            Log.d("1111",dataSlides.get(position).danh_muc_hinh_anh_be.toString())
            intent.putExtra("thongtinbe",dataSlides.get(position).thong_tin_thai_nhi)
            intent.putExtra("danmuchinh",dataSlides.get(position).danh_muc_hinh_anh_be)
            context.startActivity(intent)
        }
        holder.loikhuyen.setOnClickListener {
            val intent = Intent(context, InfoMomActivity::class.java)
            intent.putExtra("thongtinme",dataSlides.get(position).dieu_me_can_lam)
            context.startActivity(intent)
        }

      var anim: Animation = AnimationUtils.loadAnimation(context,R.anim.fade_left)
        holder.dateTime.startAnimation(anim)
        holder.thongtinbe.startAnimation(anim)
        holder.loikhuyen.startAnimation(anim)
        holder.label1.startAnimation(anim)
        holder.layoytsub2.startAnimation(anim)
        holder.imglogo3.startAnimation(anim)
        holder.loikhuyensub.startAnimation(anim)
        holder.imglogo4.startAnimation(anim)
    }
    inner class AdapterDataViewHolder(view: View) :RecyclerView.ViewHolder(view){
        public val dateTime=   view.findViewById<TextView>(R.id.txtdate)
        public val thongtinbe= view.findViewById<TextView>(R.id.txtchieucao)
        public val loikhuyen= view.findViewById<TextView>(R.id.txtloikhuyen)
        val label1= view.findViewById<TextView>(R.id.txtlabel1)
        val layoytsub2= view.findViewById<LinearLayout>(R.id.layoutsub2)
        val imglogo3= view.findViewById<ImageView>(R.id.imglogo3)
        val loikhuyensub= view.findViewById<TextView>(R.id.txtloikhuyensub)
        val imglogo4= view.findViewById<ImageView>(R.id.imglogo4)
        fun bind(dataSlide: DataSlide){
            dateTime.text= dataSlide.data_time.toString();
            thongtinbe.text= dataSlide.thong_tin_thai_nhi;
            loikhuyen.text= dataSlide.dieu_me_can_lam;
        }
    }

}