package com.example.assignment

data class ChildDataClass(val title:String? = null,
                          val childArrayList : ArrayList<ChildItem>)

data class ChildItem(val name : String?=null,val image: String?=null)
