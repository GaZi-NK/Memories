package com.example.redma.memories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(list : List<MemoryData>) : RecyclerView.Adapter<RecyclerViewHolder>() {

    //データクラスの配列を用意
    lateinit var list:List<MemoryData>

    //一行文のレイアウト(RecyclerView_layout)をインフレートし、それを引数にホルダー(RecyclerViewHolder)を作成し返す
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        var inflate = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_layout, parent, false)
        var vh = RecyclerViewHolder(inflate)
        return vh
    }

    //MemoryData(データクラス)から一行文のデータを取得しViewHolder(RecyclerViewHolder)に表示させる
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.title.setText(list.get(position).title)
    }

    //データクラス(MemoryData)のサイズを返す
    override fun getItemCount(): Int {
        return list.size
    }

}