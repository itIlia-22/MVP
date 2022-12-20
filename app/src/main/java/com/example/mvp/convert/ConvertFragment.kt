package com.example.mvp.convert


import android.content.res.AssetManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvp.App
import com.example.mvp.databinding.ConvertFragmentBinding
import com.example.mvp.interfacs.OnBackPressendListener
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import java.io.ByteArrayOutputStream
import java.io.IOException


class ConvertFragment : MvpAppCompatFragment(), OnBackPressendListener, ViewConvert {
    private val assetManager: AssetManager? = null
    private lateinit var binding: ConvertFragmentBinding
    private val presenter by moxyPresenter { ConvertPresenter(App.instance.router) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val bitmap = assetsToBitmap("april.jpg")
        bitmap?.let {

            binding.imageView.setImageBitmap(bitmap)
        }
        binding.button.setOnClickListener {
            if (bitmap != null) {
                val compress = bitmap.compress(Bitmap.CompressFormat.PNG)
                binding.imageView2.setImageBitmap(compress)
                binding.textView2.text
            }
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return ConvertFragmentBinding.inflate(inflater, container, false).also {
            binding = it
        }.root
    }


    companion object {
        fun newInstance() = ConvertFragment()
    }

    private fun assetsToBitmap(file: String): Bitmap? {
        return try {
            val stream = assetManager?.open(file)
            BitmapFactory.decodeStream(stream)
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }


    override fun onBackPressend(): Boolean {
        return presenter.onBackPressed()
    }
}

fun Bitmap.compress(
    format: Bitmap.CompressFormat = Bitmap.CompressFormat.PNG,
    quality: Int = 100,
): Bitmap {
    val stream = ByteArrayOutputStream()
    this.compress(format, quality, stream)
    val byteArray = stream.toByteArray()
    return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
}
