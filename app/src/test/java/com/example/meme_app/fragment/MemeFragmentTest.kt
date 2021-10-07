package com.example.meme_app.fragment

import com.example.meme_app.RetroFit.RetrofitClient

import org.junit.jupiter.api.Assertions.*

internal class MemeFragmentTest {

    @org.junit.jupiter.api.Test
    fun onViewCreated() {

        println("\n\n\t\t onViewCreated called in test class\n\n")

        val response = RetrofitClient.getPosts().execute()
        val auth = response.body()
        assertTrue(response.isSuccessful)
        println(auth!!.data.children[2].data2.url)


//        RetrofitClient.getPosts().enqueue(object: Callback<Posts> {
//
//            override fun onResponse(call: Call<Posts>, response: Response<Posts>) {
//                val data = response.body()
//                data!!.data.children[2].data2.score
////                Log.d("testonResponse", "onResponse: ???")
//                Log.e("onResponse","SUCCSAISAESASE")
//                println("SUCCESS22")
//                println("WHAT IS THIS")
//            }
//
//            override fun onFailure(call: Call<Posts>, t: Throwable) {
//                Log.d("testonFailure", "onFailure: FAILED!!!!!!!")
//                println("Failed")
//            }
//
//
//        })
//
    }
}

/*


//    @Test
//    fun onCreateView() {
//    }

//    lateinit var v: Any
//    init {
//        testV()
//    }
//
//    private fun testV() {
//        println(onViewCreated())
//    }

    var x:Any = ""

    @Test
    fun xx() = object : Callback<Posts> {

            @Test
            override fun onResponse(call: Call<Posts>, response: Response<Posts>) {
//                Log.d("testonResponse", "onResponse: ???")
                Log.e("onResponse","SUCCSAISAESASE")
                println("SUCCESS22")
                println("WHAT IS THIS")
            }
            @Test
            override fun onFailure(call: Call<Posts>, t: Throwable) {
                Log.d("testonFailure", "onFailure: FAILED!!!!!!!")
                println("Failed")
            }
        }



    @Test
    fun onViewCreated() {

        println("ALSOCALLED")

//        println(xx())

//        xx(object: Callback<Posts> {
        object: Callback<Posts> {

            override fun onResponse(call: Call<Posts>, response: Response<Posts>) {
//                Log.d("testonResponse", "onResponse: ???")
                Log.e("onResponse","SUCCSAISAESASE")
                println("SUCCESS22")
                println("WHAT IS THIS")
            }

            override fun onFailure(call: Call<Posts>, t: Throwable) {
                Log.d("testonFailure", "onFailure: FAILED!!!!!!!")
                println("Failed")
            }


        }


    }

 */