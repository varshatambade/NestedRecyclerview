package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.parentitemlist.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        parentRecview.layoutManager = LinearLayoutManager(this)

        val arrayList = ArrayList<ChildDataClass>()
        val childItemLists = ArrayList<ChildItem>()
        val childItemLists1 = ArrayList<ChildItem>()
        val childItemLists2 = ArrayList<ChildItem>()
        val childItemLists3 = ArrayList<ChildItem>()
        val childItemLists4 = ArrayList<ChildItem>()
        val childItemLists5 = ArrayList<ChildItem>()

        childItemLists.add(ChildItem("Mumbai","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Mumbai-1.jpg"))
        childItemLists.add(ChildItem("Pune","https://www.fabhotels.com/blog/wp-content/uploads/2019/12/shaniwar-wada.jpg"))
        childItemLists.add(ChildItem("Mahabaleshwar","https://www.fabhotels.com/blog/wp-content/uploads/2019/04/Venna-Lake-2.jpg"))
        childItemLists.add(ChildItem("Lonavala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Lonavala.jpg"))
        childItemLists.add(ChildItem("Khandala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Khandala.jpg"))
        childItemLists.add(ChildItem("Matheran","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Matheran-3.jpg"))
        childItemLists.add(ChildItem("Lavasa","https://www.fabhotels.com/blog/wp-content/uploads/2018/06/Lavasa.jpg"))
        childItemLists.add(ChildItem("Nashik","https://www.fabhotels.com/blog/wp-content/uploads/2019/03/Dudhsagar-Waterfalls.jpg"))
        childItemLists.add(ChildItem("Alibaug","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Alibaug-1.jpg"))

        childItemLists1.add(ChildItem("Pune","https://www.fabhotels.com/blog/wp-content/uploads/2019/12/shaniwar-wada.jpg"))
        childItemLists1.add(ChildItem("Mumbai","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Mumbai-1.jpg"))
        childItemLists1.add(ChildItem("Lonavala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Lonavala.jpg"))
        childItemLists1.add(ChildItem("Mahabaleshwar","https://www.fabhotels.com/blog/wp-content/uploads/2019/04/Venna-Lake-2.jpg"))
        childItemLists1.add(ChildItem("Matheran","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Matheran-3.jpg"))
        childItemLists1.add(ChildItem("Khandala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Khandala.jpg"))
        childItemLists1.add(ChildItem("Nashik","https://www.fabhotels.com/blog/wp-content/uploads/2019/03/Dudhsagar-Waterfalls.jpg"))

        childItemLists2.add(ChildItem("Pune","https://www.fabhotels.com/blog/wp-content/uploads/2019/12/shaniwar-wada.jpg"))
        childItemLists2.add(ChildItem("Mahabaleshwar","https://www.fabhotels.com/blog/wp-content/uploads/2019/04/Venna-Lake-2.jpg"))
        childItemLists2.add(ChildItem("Lonavala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Lonavala.jpg"))
        childItemLists2.add(ChildItem("Khandala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Khandala.jpg"))
        childItemLists2.add(ChildItem("Matheran","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Matheran-3.jpg"))
        childItemLists2.add(ChildItem("Lavasa","https://www.fabhotels.com/blog/wp-content/uploads/2018/06/Lavasa.jpg"))
        childItemLists2.add(ChildItem("Nashik","https://www.fabhotels.com/blog/wp-content/uploads/2019/03/Dudhsagar-Waterfalls.jpg"))
        childItemLists2.add(ChildItem("Alibaug","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Alibaug-1.jpg"))
        childItemLists2.add(ChildItem("Mumbai","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Mumbai-1.jpg"))

        childItemLists3.add(ChildItem("Mumbai","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Mumbai-1.jpg"))
        childItemLists3.add(ChildItem("Mahabaleshwar","https://www.fabhotels.com/blog/wp-content/uploads/2019/04/Venna-Lake-2.jpg"))
        childItemLists3.add(ChildItem("Pune","https://www.fabhotels.com/blog/wp-content/uploads/2019/12/shaniwar-wada.jpg"))
        childItemLists3.add(ChildItem("Khandala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Khandala.jpg"))
        childItemLists3.add(ChildItem("Lonavala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Lonavala.jpg"))
        childItemLists3.add(ChildItem("Matheran","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Matheran-3.jpg"))
        childItemLists3.add(ChildItem("Nashik","https://www.fabhotels.com/blog/wp-content/uploads/2019/03/Dudhsagar-Waterfalls.jpg"))
        childItemLists3.add(ChildItem("Lavasa","https://www.fabhotels.com/blog/wp-content/uploads/2018/06/Lavasa.jpg"))
        childItemLists3.add(ChildItem("Alibaug","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Alibaug-1.jpg"))
        childItemLists3.add(ChildItem("Alibaug","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Alibaug-1.jpg"))

        childItemLists4.add(ChildItem("Pune","https://www.fabhotels.com/blog/wp-content/uploads/2019/12/shaniwar-wada.jpg"))
        childItemLists4.add(ChildItem("Mahabaleshwar","https://www.fabhotels.com/blog/wp-content/uploads/2019/04/Venna-Lake-2.jpg"))
        childItemLists4.add(ChildItem("Mumbai","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Mumbai-1.jpg"))
        childItemLists4.add(ChildItem("Khandala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Khandala.jpg"))
        childItemLists4.add(ChildItem("Lonavala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Lonavala.jpg"))
        childItemLists4.add(ChildItem("Lavasa","https://www.fabhotels.com/blog/wp-content/uploads/2018/06/Lavasa.jpg"))
        childItemLists4.add(ChildItem("Alibaug","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Alibaug-1.jpg"))
        childItemLists4.add(ChildItem("Nashik","https://www.fabhotels.com/blog/wp-content/uploads/2019/03/Dudhsagar-Waterfalls.jpg"))

        childItemLists5.add(ChildItem("Khandala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Khandala.jpg"))
        childItemLists5.add(ChildItem("Nashik","https://www.fabhotels.com/blog/wp-content/uploads/2019/03/Dudhsagar-Waterfalls.jpg"))
        childItemLists5.add(ChildItem("Matheran","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Matheran-3.jpg"))
        childItemLists5.add(ChildItem("Mumbai","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Mumbai-1.jpg"))
        childItemLists5.add(ChildItem("Lavasa","https://www.fabhotels.com/blog/wp-content/uploads/2018/06/Lavasa.jpg"))
        childItemLists5.add(ChildItem("Pune","https://www.fabhotels.com/blog/wp-content/uploads/2019/12/shaniwar-wada.jpg"))
        childItemLists5.add(ChildItem("Mahabaleshwar","https://www.fabhotels.com/blog/wp-content/uploads/2019/04/Venna-Lake-2.jpg"))
        childItemLists5.add(ChildItem("Lonavala","https://www.fabhotels.com/blog/wp-content/uploads/2018/09/Lonavala.jpg"))
        childItemLists5.add(ChildItem("Alibaug","https://www.fabhotels.com/blog/wp-content/uploads/2018/03/Alibaug-1.jpg"))

        arrayList.add(ChildDataClass("Fav Places 1",childItemLists))
        arrayList.add(ChildDataClass("Fav Places 2",childItemLists1))
        arrayList.add(ChildDataClass("Fav Places 3",childItemLists2))
        arrayList.add(ChildDataClass("Fav Places 4",childItemLists3))
        arrayList.add(ChildDataClass("Fav Places 5",childItemLists4))
        arrayList.add(ChildDataClass("Fav Places 6",childItemLists5))
        arrayList.add(ChildDataClass("Fav Places 7",childItemLists))
        arrayList.add(ChildDataClass("Fav Places 8",childItemLists1))

        val adapter = ParentAdapter(this,arrayList)
        parentRecview.adapter = adapter

    }
}