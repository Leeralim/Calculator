package ru.edu.masu.calculationgood

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    //val txtV1: TextView
    //val txtV2: TextView = findViewById(R.id.txtV2)
    //val Part1: Double;
    var Part1: String ="";
    var Part2: String="";
    var Part3: String="";
    //val Part3: Double;
    //private val KEY_Txt1: String = ""
    //private val KEY_Txt2: String = ""

    private val KEY_P1: String = "P1"
    private val KEY_P2: String = "P2"
    private val KEY_P3: String = "P3"

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val activity_main: View? = findViewById(R.id.activity_main)

        val txtV1: TextView = findViewById(R.id.txtV1)
        val txtV2: TextView = findViewById(R.id.txtV2)
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)
        val btnZap: Button = findViewById(R.id.btnZap)
        val btnRav: Button = findViewById(R.id.btnRav)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnMinus: Button = findViewById(R.id.btnMinus)
        val btnUmnoj: Button = findViewById(R.id.btnUmnoj)
        val btnDelen: Button = findViewById(R.id.btnDelen)
        val btnClear: Button = findViewById(R.id.btnClear)

        val btnAbout: Button = findViewById(R.id.btnAbout)

        btnAbout.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }

        val switchtheme: Switch = findViewById(R.id.SWT)
        val rotatebtn: Button = findViewById(R.id.btn)

        switchtheme.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                btn0.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn0.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn1.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn2.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn3.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn4.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn5.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn6.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn7.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn8.setBackgroundColor(resources.getColor(R.color.teal_200))
                btn9.setBackgroundColor(resources.getColor(R.color.teal_200))
                btnZap.setBackgroundColor(resources.getColor(R.color.teal_200))
                btnRav.setBackgroundColor(resources.getColor(R.color.teal_200))
                btnPlus.setBackgroundColor(resources.getColor(R.color.purple_700))
                btnMinus.setBackgroundColor(resources.getColor(R.color.purple_700))
                btnUmnoj.setBackgroundColor(resources.getColor(R.color.purple_700))
                btnDelen.setBackgroundColor(resources.getColor(R.color.purple_700))
                btnClear.setBackgroundColor(resources.getColor(R.color.purple_700))
                btnAbout.setBackgroundColor(resources.getColor(R.color.white))
                btnAbout.setTextColor(resources.getColor(R.color.black))
                rotatebtn.setBackgroundColor(resources.getColor(R.color.white))
                switchtheme.setTextColor(resources.getColor(R.color.black))
                switchtheme.setText(resources.getString(R.string.theme_dark))
                activity_main?.setBackgroundColor(resources.getColor(R.color.white))
                txtV1.setTextColor(resources.getColor(R.color.black))
                txtV2.setTextColor(resources.getColor(R.color.black))

            } else {
                btn0.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn0.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn1.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn2.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn3.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn4.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn5.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn6.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn7.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn8.setBackgroundColor(resources.getColor(R.color.dark_green))
                btn9.setBackgroundColor(resources.getColor(R.color.dark_green))
                btnZap.setBackgroundColor(resources.getColor(R.color.dark_green))
                btnRav.setBackgroundColor(resources.getColor(R.color.dark_green))
                btnPlus.setBackgroundColor(resources.getColor(R.color.dark_blue))
                btnMinus.setBackgroundColor(resources.getColor(R.color.dark_blue))
                btnUmnoj.setBackgroundColor(resources.getColor(R.color.dark_blue))
                btnDelen.setBackgroundColor(resources.getColor(R.color.dark_blue))
                btnClear.setBackgroundColor(resources.getColor(R.color.dark_blue))
                btnAbout.setBackgroundColor(resources.getColor(R.color.black))
                btnAbout.setTextColor(resources.getColor(R.color.white))
                rotatebtn.setBackgroundColor(resources.getColor(R.color.black))
                switchtheme.setTextColor(resources.getColor(R.color.white))
                switchtheme.setText(resources.getString(R.string.theme_light))
                activity_main?.setBackgroundColor(resources.getColor(R.color.black))
                txtV1.setTextColor(resources.getColor(R.color.white))
                txtV2.setTextColor(resources.getColor(R.color.white))

            }


        }





        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            val btnModul: Button = findViewById(R.id.btnModul)
            val btnPerevIz: Button = findViewById(R.id.btnPerevIz)
            val btnLn: Button = findViewById(R.id.btnLn)
            val btnLog: Button = findViewById(R.id.btnLog)
            val btnSin: Button = findViewById(R.id.btnSin)
            val btnCos: Button = findViewById(R.id.btnCos)
            val btnTan: Button = findViewById(R.id.btnTan)
            val btnZnak: Button = findViewById(R.id.btnZnak)
            val btnFac: Button = findViewById(R.id.btnFac)
            val btnPi: Button = findViewById(R.id.btnPi)
            val btnE: Button = findViewById(R.id.btnE)
            val btnStepen: Button = findViewById(R.id.btnStepen)
            val btnCoren: Button = findViewById(R.id.btnCoren)
            val btnProcent: Button = findViewById(R.id.btnProcent)



            switchtheme.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    btn0.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn0.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn1.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn2.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn3.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn4.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn5.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn6.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn7.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn8.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btn9.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btnZap.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btnRav.setBackgroundColor(resources.getColor(R.color.teal_200))
                    btnPlus.setBackgroundColor(resources.getColor(R.color.purple_700))
                    btnMinus.setBackgroundColor(resources.getColor(R.color.purple_700))
                    btnUmnoj.setBackgroundColor(resources.getColor(R.color.purple_700))
                    btnDelen.setBackgroundColor(resources.getColor(R.color.purple_700))
                    btnClear.setBackgroundColor(resources.getColor(R.color.purple_700))
                    btnAbout.setBackgroundColor(resources.getColor(R.color.white))
                    btnAbout.setTextColor(resources.getColor(R.color.black))
                    rotatebtn.setBackgroundColor(resources.getColor(R.color.white))
                    switchtheme.setTextColor(resources.getColor(R.color.black))
                    switchtheme.setText(resources.getString(R.string.theme_dark))
                    activity_main?.setBackgroundColor(resources.getColor(R.color.white))
                    txtV1.setTextColor(resources.getColor(R.color.black))
                    txtV2.setTextColor(resources.getColor(R.color.black))

                    btnModul.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnPerevIz.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnLn.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnLog.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnSin.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnCos.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnTan.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnZnak.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnFac.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnPi.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnE.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnStepen.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnCoren.setBackgroundColor(resources.getColor(R.color.purple_200))
                    btnProcent.setBackgroundColor(resources.getColor(R.color.purple_200))

                } else {
                    btn0.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn0.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn1.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn2.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn3.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn4.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn5.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn6.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn7.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn8.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btn9.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btnZap.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btnRav.setBackgroundColor(resources.getColor(R.color.dark_green))
                    btnPlus.setBackgroundColor(resources.getColor(R.color.dark_blue))
                    btnMinus.setBackgroundColor(resources.getColor(R.color.dark_blue))
                    btnUmnoj.setBackgroundColor(resources.getColor(R.color.dark_blue))
                    btnDelen.setBackgroundColor(resources.getColor(R.color.dark_blue))
                    btnClear.setBackgroundColor(resources.getColor(R.color.dark_blue))
                    btnAbout.setBackgroundColor(resources.getColor(R.color.black))
                    btnAbout.setTextColor(resources.getColor(R.color.white))
                    rotatebtn.setBackgroundColor(resources.getColor(R.color.black))
                    switchtheme.setTextColor(resources.getColor(R.color.white))
                    switchtheme.setText(resources.getString(R.string.theme_light))
                    activity_main?.setBackgroundColor(resources.getColor(R.color.black))
                    txtV1.setTextColor(resources.getColor(R.color.white))
                    txtV2.setTextColor(resources.getColor(R.color.white))

                    btnModul.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnPerevIz.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnLn.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnLog.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnSin.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnCos.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnTan.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnZnak.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnFac.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnPi.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnE.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnStepen.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnCoren.setBackgroundColor(resources.getColor(R.color.dark_pink))
                    btnProcent.setBackgroundColor(resources.getColor(R.color.dark_pink))

                }


            }






            btnModul.setOnClickListener{
                if(Part3.isEmpty()){
                    Part2 = "+"
                    Part3 = "0"
                }
                Schet(txtV2);
                Ravno(txtV2);
                val P1 = Part1.toDouble();
                if(P1<0){
                    Part1 = ""+(P1*(-1))
                }
                Write(txtV1);
            }
            btnPerevIz.setOnClickListener{
                if(Part1.isNotEmpty())Part2="->";
                Write(txtV1);Schet(txtV2);
            }

            btnLn.setOnClickListener{
                Part1 = " ";Part2="Ln";
                Write(txtV1);Schet(txtV2)
            }
            btnLog.setOnClickListener{
                Part1 = " ";Part2="Log";
                Write(txtV1);Schet(txtV2)
            }
            btnSin.setOnClickListener{
                Part1 = " ";Part2="Sin";
                Write(txtV1);Schet(txtV2)
            }
            btnCos.setOnClickListener{
                Part1 = " ";Part2="Cos";
                Write(txtV1);Schet(txtV2)
            }
            btnTan.setOnClickListener{
                Part1 = " ";Part2="Tan";
                Write(txtV1);Schet(txtV2)
            }

            btnZnak.setOnClickListener{
                if(Part1.isNotEmpty()) {
                    if(Part2.isNotEmpty()) {
                        if(Part3.isNotEmpty()) {
                            val P3 = Part3.toDouble();
                            Part3 = ""+(P3*(-1))
                        }
                    }else{
                        val P1 = Part1.toDouble();
                        Part1 = ""+(P1*(-1))
                    }
                }
                Write(txtV1);
                Schet(txtV2);
            }

            btnFac.setOnClickListener{
                if((Part1.isNotEmpty())&&(Part1 != " ")){
                    val P11 = Part1.toDouble()
                    val P1 = P11.toInt()

                    if((P1>0)&&(Part3.isEmpty())){
                        var res = 1
                        for(i in 2..P1){
                            res*=i
                        }
                        Part2=""
                        Part1 = ""+res
                    }
                    Write(txtV1);
                }
            }

            btnPi.setOnClickListener{
                if(Part2.isNotEmpty()) {
                    //Part3 = "3.141592653"
                    Part3 = ""+Math.PI
                }else{
                    //Part1 = "3.141592653"
                    Part1 = ""+Math.PI
                }
                Write(txtV1);
                Schet(txtV2);
            }

            btnE.setOnClickListener{
                if(Part2.isNotEmpty()) {
                    //Part3 = "2.718281828"
                    Part3 = ""+Math.E
                }else{
                    //Part1 = "2.718281828"
                    Part1 = ""+Math.E
                }
                Write(txtV1);
                Schet(txtV2);
            }

            btnStepen.setOnClickListener{
                if(Part1.isNotEmpty())Part2="^";
                Write(txtV1);Schet(txtV2)

            }

            btnCoren.setOnClickListener{
                Part1 = " ";Part2="√";
                Write(txtV1);Schet(txtV2)
                //Part1 = " "
                //Part2 = "√"
            }

            btnProcent.setOnClickListener{
                if(Part1.isNotEmpty()) {
                    if(Part2.isNotEmpty()) {
                        if(Part3.isNotEmpty()) {
                            val P1 = Part1.toDouble()
                            val P3 = (Part3.toDouble())/100;
                            var result = 0.0
                            when(Part2){
                                "+" -> result=P1+(P1*P3)
                                "-" -> result=P1-(P1*P3)
                                "*" -> result=P1*(P1*P3)
                                "/" -> result=P1/(P1*P3)
                            }
                            Part3 = ""
                            Part2 = ""
                            Part1 = ""+result
                        }
                    }else{
                        val P1 = (Part1.toDouble())/100;
                        Part1 = ""+P1
                    }
                }
                Write(txtV1);
                Schet(txtV2);
            }

        }






        if (savedInstanceState != null) {
            Part1 = savedInstanceState.getString(KEY_P1,"")
            Part2 = savedInstanceState.getString(KEY_P2,"")
            Part3 = savedInstanceState.getString(KEY_P3,"")
            Write(txtV1)
            Schet(txtV2)
        }








        rotatebtn.setOnClickListener(){rotate(rotatebtn) }
        //42
        btn0.setOnClickListener(){Addnum(0);Write(txtV1);Schet(txtV2);}
        btn1.setOnClickListener(){Addnum(1);Write(txtV1);Schet(txtV2);}
        btn2.setOnClickListener(){Addnum(2);Write(txtV1);Schet(txtV2);}
        btn3.setOnClickListener(){Addnum(3);Write(txtV1);Schet(txtV2);}
        btn4.setOnClickListener(){Addnum(4);Write(txtV1);Schet(txtV2);}
        btn5.setOnClickListener(){Addnum(5);Write(txtV1);Schet(txtV2);}
        btn6.setOnClickListener(){Addnum(6);Write(txtV1);Schet(txtV2);}
        btn7.setOnClickListener(){Addnum(7);Write(txtV1);Schet(txtV2);}
        btn8.setOnClickListener(){Addnum(8);Write(txtV1);Schet(txtV2);}
        btn9.setOnClickListener(){Addnum(9);Write(txtV1);Schet(txtV2);}
        btnZap.setOnClickListener(){Addnum(666);Write(txtV1);Schet(txtV2);}
        btnRav.setOnClickListener(){
            Ravno(txtV2);
            Write(txtV1);
        }
        btnPlus.setOnClickListener(){
            if(Part1.isNotEmpty())Part2="+";
            Write(txtV1);Schet(txtV2);}

        btnMinus.setOnClickListener(){
            if(Part1.isNotEmpty()){
                Part2="-"
                if(Part1 == "-")Part1 = "-0"
            };
            else Part1="-";
            Write(txtV1);Schet(txtV2);}

        btnUmnoj.setOnClickListener(){
            if(Part1.isNotEmpty())Part2="*";
            Write(txtV1);Schet(txtV2);}

        btnDelen.setOnClickListener(){
            if(Part1.isNotEmpty())Part2="/";
            Write(txtV1);Schet(txtV2);}

        btnClear.setOnClickListener(){

            val P1 = Part1;
            val P2 = Part2;
            val P3 = Part3;
            if(P1.isNotEmpty()) {
                if(P2.isNotEmpty()) {
                    if(P3.isNotEmpty()) {
                        Part3 = Part3.reversed()
                        Part3 = Part3.drop(1)
                        Part3 = Part3.reversed()
                    }else{
                        Part2 = Part2.reversed()
                        Part2 = Part2.drop(1)
                        Part2 = Part2.reversed()
                    }
                }else{
                    Part1 = Part1.reversed()
                    Part1 = Part1.drop(1);
                    Part1 = Part1.reversed()
                }
            }
            Write(txtV1);
            Schet(txtV2);
        }


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(KEY_P1, Part1)
        outState.putString(KEY_P2, Part2)
        outState.putString(KEY_P3, Part3)
    }







    private fun Ravno(txtV2: TextView) {
        //Schet(txtV2);
        val aaa = txtV2.text;
        if(aaa=="")return;
        Part1= ""+aaa;
        Part2="";
        Part3="";
        txtV2.text="";
    }
    private fun Write(txtV1: TextView) {
        txtV1.text = Part1+Part2+Part3;
    }

    private fun Schet(txtV2: TextView) {

        if(Part3==""){
            txtV2.text = "";
            return

        }
        var P1 = 0.0
        if(Part1 == " ")
        else P1 = Part1.toDouble();

        val P3 = Part3.toDouble();
        var result = 0.0;
        when(Part2){
            "+" -> result=P1+P3
            "-" -> result=P1-P3
            "*" -> result=P1*P3
            "/" -> result=P1/P3
            "√" -> result= Math.sqrt(P3)
            "Ln" -> result= Math.log(P3)
            "Log" -> result= Math.log10(P3)
            "Sin" -> result= Math.sin(P3)
            "Cos" -> result= Math.cos(P3)
            "Tan" -> result= Math.tan(P3)
            "^" -> {
                val Stepen = P3.toInt()
                result = P1
                for (i in 2..Stepen) {
                    result *= P1
                }
            }
            "->" -> {
                val P33 = P3.toInt()
                val P11 = P1.toInt()
                if(P33<2)return
                txtV2.text = P11.toString(P33)
                return
            }
        }

        txtV2.text = ""+result;

    }
    private fun Addnum(Numb: Int) {
        if(Numb==666){
            if(Part2 == ""){
                if(Part1.contains(".", ignoreCase = true))return;
                if(Part1==""){Part1+="0.";}else{
                    Part1+=".";
                }
            }else{
                if(Part3.contains(".", ignoreCase = true))return;
                if(Part3==""){Part3+="0.";}else{
                    Part3+=".";
            }
            }
        }else{
            if(Part2 == ""){
                if((Part1=="0")&&(Numb==0))return;
                Part1+=Numb;
            }else{
                if((Part3=="0")&&(Numb==0))return;
                Part3+=Numb;
            }
        }

        //Schet(txtV2)
    }

    private  fun rotate(State: Button){
        if(State.text == "\uD83D\uDD04"+"\uD83D\uDD13"){
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LOCKED;
            State.text = "\uD83D\uDD04"+"\uD83D\uDD12"
        }else{
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED;
            State.text = "\uD83D\uDD04"+"\uD83D\uDD13"
        }
    }
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        var Orient: String = "";
        // Проверяем ориентацию экрана
        val orientation = when(newConfig.orientation){
            //Configuration.ORIENTATION_PORTRAIT -> Orient = "Portrait"
            //Configuration.ORIENTATION_LANDSCAPE -> Orient = "Landscape"
            //Configuration.ORIENTATION_PORTRAIT -> setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            //Configuration.ORIENTATION_LANDSCAPE -> setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            //Configuration.ORIENTATION_LANDSCAPE -> setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            //Configuration.ORIENTATION_PORTRAIT -> setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            Configuration.ORIENTATION_UNDEFINED -> Orient = "Undefined"
            else -> Orient = "Error"
        }


    }
}