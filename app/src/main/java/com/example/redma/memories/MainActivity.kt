package com.example.redma.memories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //アダプターのインスタンスを作成
        var adapter = RecyclerViewAdapter(createDataset())

        //レイアウトマネージャーのインスタンスを取得
        var lim = LinearLayoutManager(this)

        MemoriesView.setHasFixedSize(true)

        MemoriesView.layoutManager = lim

        //RecyclerView(MemoriewView)にアダプターをセット
        MemoriesView.adapter = adapter


    }
    private fun createDataset() : MutableList<MemoryData> {
        var  list : MutableList<MemoryData> = mutableListOf()
        for (i in 0..50){
            var data = MemoryData()
            data.title = "データ"+i
            list.add(data)
        }
        return list
    }
}
