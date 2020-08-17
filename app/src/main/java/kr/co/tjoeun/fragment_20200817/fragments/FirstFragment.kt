package kr.co.tjoeun.fragment_20200817.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*
import kr.co.tjoeun.fragment_20200817.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        프래그먼트에 있는 버튼이 눌리면 => 텍스트뷰 문구 변경

        changeTextBtn.setOnClickListener {
            contentTxt.text = "프래그먼트에서 버튼 누름"
        }

    }

}