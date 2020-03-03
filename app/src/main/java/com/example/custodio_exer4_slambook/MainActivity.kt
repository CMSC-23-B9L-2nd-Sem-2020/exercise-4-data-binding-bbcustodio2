package com.example.custodio_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.custodio_exer4_slambook.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val userInfo: UserInfo = UserInfo("Bien Chrisitan Custodio")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.userInfo = userInfo

        binding.done.setOnClickListener {
            addInfo(it)
        }
    }

    private fun addInfo(view: View){
        binding.apply {
            userInfo?.name = nameEdit.text.toString()
            userInfo?.nickname = nicknameEdit.text.toString()
            userInfo?.age = ageEdit.text.toString()
            userInfo?.birthday = birthdayEdit.text.toString()
            userInfo?.phoneNumber = phoneNumberEdit.text.toString()
            userInfo?.email = emailEdit.text.toString()
            userInfo?.course = courseEdit.text.toString()
            userInfo?.dream = dreamEdit.text.toString()
            userInfo?.crush = crushEdit.text.toString()
            userInfo?.message = messageEdit.text.toString()
            invalidateAll()
            hello.visibility = View.GONE
            name.visibility = View.GONE
            nameEdit.visibility = View.GONE
            nickname.visibility = View.GONE
            nicknameEdit.visibility = View.GONE
            age.visibility = View.GONE
            ageEdit.visibility = View.GONE
            birthday.visibility = View.GONE
            birthdayEdit.visibility = View.GONE
            phoneNumber.visibility = View.GONE
            phoneNumberEdit.visibility = View.GONE
            email.visibility = View.GONE
            emailEdit.visibility = View.GONE
            course.visibility = View.GONE
            courseEdit.visibility = View.GONE
            dream.visibility = View.GONE
            dreamEdit.visibility = View.GONE
            crush.visibility = View.GONE
            crushEdit.visibility = View.GONE
            message.visibility = View.GONE
            messageEdit.visibility = View.GONE
            done.visibility = View.GONE

            nameInfo.visibility = View.VISIBLE
            nicknameInfo.visibility = View.VISIBLE
            ageInfo.visibility = View.VISIBLE
            thankYou.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)


    }
}
