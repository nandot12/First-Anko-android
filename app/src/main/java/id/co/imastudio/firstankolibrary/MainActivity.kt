package id.co.imastudio.firstankolibrary

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import android.content.pm.PackageManager
import android.Manifest.permission
import android.Manifest.permission.CALL_PHONE
import android.annotation.SuppressLint
import android.net.Uri
import android.support.v4.app.ActivityCompat
import android.telephony.SmsManager


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //alert dialog


        //alert dialog tanpa anko
//        var alert = AlertDialog.Builder(this)
//        alert.setTitle("Information")
//        alert.setMessage("hello")
//        alert.setPositiveButton("Ya", DialogInterface.OnClickListener {
//            dialogInterface, i ->
//            //do something
//        })
//        alert.setNegativeButton("tidak", DialogInterface.OnClickListener {
//            dialogInterface, i ->
//
//            //dome something
//        })
//        alert.show()

        alert("message"){
            noButton {
                //do something
            }
            yesButton {
                //do something
            }
        }.show()


        //onclick

//        button.setOnClickListener {
//
//            //do something
//        }



        button.onClick {
            //do something
        }

        //tanpa anko
        var intent = Intent(this,Main2Activity::class.java)
        intent.putExtra("hei","iya kamu")
        intent.putExtra("hei2",1)
        startActivity(intent)

        startActivity(intentFor<Main2Activity>("hei" to "iya kamu","hei2" to 1))

//
//        Toast.makeText(this,"hei .. !!",Toast.LENGTH_SHORT).show()
//
//        toast("hei aku lebih simple")
//        longToast("hei")




        //call phone
//        val callIntent = Intent(Intent.ACTION_CALL)
//        callIntent.data = Uri.parse("tel:0377778888")
//
//        if (ActivityCompat.checkSelfPermission(this@MainActivity,
//                android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//            return
//        }
//        startActivity(callIntent)

        makeCall("0377778888")


        //sms
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage("phoneNo", null, "sms message", null, null)

        //menggunakan anko
        sendSMS("0843483")

        browse("url anda")
        share("hei", "nandohusni93@gmail.com")
        email("nandohusni93@gmail.com", "information", "hei")






    }






}
