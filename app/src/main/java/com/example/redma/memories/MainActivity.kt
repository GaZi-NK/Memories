package com.example.redma.memories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.recyclerview_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = RecyclerViewAdapter(createDataset())    //アダプターのインスタンスを作成
        var lim = LinearLayoutManager(this)    //レイアウトマネージャーのインスタンスを取得
        //表示するデータの数が固定長であれば、リソースを有効活用し、パフォーマンスを向上させる設定。
        MemoriesView.setHasFixedSize(true)
        //レスポンシブにデータを表示するために使用するLayoutManagerを設定
        MemoriesView.layoutManager = lim
        //RecyclerView(MemoriewView)にアダプターをセット
        MemoriesView.adapter = adapter

        //スタートボタン押下時の動作
        //TODO ①startbtn.setOnClickListener{}

        //編集ボタンクリックで編集画面へ
        //adapter.setOnItemClickListener{
        }

        //削除ボタン押下時の動作
        // TODO ②deletebtn.setOnClickListener{}

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
