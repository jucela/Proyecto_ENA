package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Control1;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;

/**
 * A simple {@link Fragment} subclass.
 */
public class Control1Fragment2 extends Fragment {


    private RadioGroup con1_p4_rg1;
    private RadioGroup con1_p4_rg2;
    private RadioGroup con1_p4_rg3;
    private RadioGroup con1_p4_rg4;
    private RadioGroup con1_p4_rg5;
    private RadioGroup con1_p4_rg6;
    private RadioGroup con1_p4_rg7;
    private RadioGroup con1_p4_rg8;
    private RadioGroup con1_p4_rg9;
    private RadioGroup con1_p4_rg10;
    private RadioGroup con1_p4_rg11;
    private RadioGroup con1_p4_rg12;





    private Identificacion identificacion;
    String informante;


    private String idempresa;
    private Control1 control1;
    private Context context;
    private Data data;

    //mapeo de variables
    int C1_P4_1;
    int C1_P4_2;
    int C1_P4_3;
    int C1_P4_4;
    int C1_P4_5;
    int C1_P4_6;
    int C1_P4_7;
    int C1_P4_8;
    int C1_P4_9;
    int C1_P4_10;
    int C1_P4_11;
    int C1_P4_12;




    public Control1Fragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Control1Fragment2(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        //data = new Data(context);
        //data.open();
        //identificacion = data.getIdentificacion(idempresa);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_control1_fragment2, container, false);


        con1_p4_rg1  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg1);
        con1_p4_rg2  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg2);
        con1_p4_rg3  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg3);
        con1_p4_rg4  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg4);
        con1_p4_rg5  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg5);
        con1_p4_rg6  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg6);
        con1_p4_rg7  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg7);
        con1_p4_rg8  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg8);
        con1_p4_rg9  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg9);
        con1_p4_rg10  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg10);
        con1_p4_rg11  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg11);
        con1_p4_rg12  =(RadioGroup) rootView.findViewById(R.id.con1_p4_rg12);




        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cargarDatos();

    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    public void cargarDatos(){
        data = new Data(context);
        data.open();
        //verifico si ya existe un objeto con datos llenados previamente
       // if(data.existeControl1(idempresa)){
            //si existe traigo el objeto
            control1 = data.getControl1(idempresa);

            //pregunta 4.1
            if(!control1.getC1_P4_1().equals("")){
            int childPos41 = Integer.parseInt(control1.getC1_P4_1());
            ((RadioButton)con1_p4_rg1.getChildAt(childPos41)).setChecked(true);}
            //pregunta 4.2
            if(!control1.getC1_P4_2().equals("")){
            int childPos42 = Integer.parseInt(control1.getC1_P4_2());
            ((RadioButton)con1_p4_rg2.getChildAt(childPos42)).setChecked(true);}
            //pregunta 4.3
            if(!control1.getC1_P4_3().equals("")){
            int childPos43 = Integer.parseInt(control1.getC1_P4_3());
            ((RadioButton)con1_p4_rg3.getChildAt(childPos43)).setChecked(true);}
            //pregunta 4.4
            if(!control1.getC1_P4_4().equals("")){
            int childPos44 = Integer.parseInt(control1.getC1_P4_4());
            ((RadioButton)con1_p4_rg4.getChildAt(childPos44)).setChecked(true);}
            //pregunta 4.5
            if(!control1.getC1_P4_5().equals("")){
            int childPos45= Integer.parseInt(control1.getC1_P4_5());
            ((RadioButton)con1_p4_rg5.getChildAt(childPos45)).setChecked(true);}
            //pregunta 46
            if(!control1.getC1_P4_6().equals("")){
            int childPos46 = Integer.parseInt(control1.getC1_P4_6());
            ((RadioButton)con1_p4_rg6.getChildAt(childPos46)).setChecked(true);}
            //pregunta 4.7
            if(!control1.getC1_P4_7().equals("")){
            int childPos47 = Integer.parseInt(control1.getC1_P4_7());
            ((RadioButton)con1_p4_rg7.getChildAt(childPos47)).setChecked(true);}
            //pregunta 4.8
            if(!control1.getC1_P4_8().equals("")){
            int childPos48 = Integer.parseInt(control1.getC1_P4_8());
            ((RadioButton)con1_p4_rg8.getChildAt(childPos48)).setChecked(true);}
            //pregunta 4.9
            if(!control1.getC1_P4_9().equals("")){
            int childPos49 = Integer.parseInt(control1.getC1_P4_9());
            ((RadioButton)con1_p4_rg9.getChildAt(childPos49)).setChecked(true);}
            //pregunta 4.10
            if(!control1.getC1_P4_10().equals("")){
            int childPos410 = Integer.parseInt(control1.getC1_P4_10());
            ((RadioButton)con1_p4_rg10.getChildAt(childPos410)).setChecked(true);}
            //pregunta 4.11
            if(!control1.getC1_P4_11().equals("")){
            int childPos411 = Integer.parseInt(control1.getC1_P4_11());
            ((RadioButton)con1_p4_rg11.getChildAt(childPos411)).setChecked(true);}
            //pregunta 4.12
            if(!control1.getC1_P4_12().equals("")){
            int childPos412 = Integer.parseInt(control1.getC1_P4_12());
            ((RadioButton)con1_p4_rg12.getChildAt(childPos412)).setChecked(true);}


        //}
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 41
        int childPosP41 = con1_p4_rg1.indexOfChild(con1_p4_rg1.findViewById(con1_p4_rg1.getCheckedRadioButtonId()));
        C1_P4_1 = childPosP41;
        //pregunta 42
        int childPosP42 = con1_p4_rg2.indexOfChild(con1_p4_rg2.findViewById(con1_p4_rg2.getCheckedRadioButtonId()));
        C1_P4_2 = childPosP42;
        //pregunta 43
        int childPosP43 = con1_p4_rg3.indexOfChild(con1_p4_rg3.findViewById(con1_p4_rg3.getCheckedRadioButtonId()));
        C1_P4_3 = childPosP43;
        //pregunta 44
        int childPosP44 = con1_p4_rg4.indexOfChild(con1_p4_rg4.findViewById(con1_p4_rg4.getCheckedRadioButtonId()));
        C1_P4_4 = childPosP44;
        //pregunta 45
        int childPosP45 = con1_p4_rg5.indexOfChild(con1_p4_rg5.findViewById(con1_p4_rg5.getCheckedRadioButtonId()));
        C1_P4_5 = childPosP45;
        //pregunta 46
        int childPosP46 = con1_p4_rg6.indexOfChild(con1_p4_rg6.findViewById(con1_p4_rg6.getCheckedRadioButtonId()));
        C1_P4_6 = childPosP46;
        //pregunta 47
        int childPosP47 = con1_p4_rg7.indexOfChild(con1_p4_rg7.findViewById(con1_p4_rg7.getCheckedRadioButtonId()));
        C1_P4_7 = childPosP47;
        //pregunta 48
        int childPosP48 = con1_p4_rg8.indexOfChild(con1_p4_rg8.findViewById(con1_p4_rg8.getCheckedRadioButtonId()));
        C1_P4_8 = childPosP48;
        //pregunta 49
        int childPosP49 = con1_p4_rg9.indexOfChild(con1_p4_rg9.findViewById(con1_p4_rg9.getCheckedRadioButtonId()));
        C1_P4_9= childPosP49;
        //pregunta 410
        int childPosP410 = con1_p4_rg10.indexOfChild(con1_p4_rg10.findViewById(con1_p4_rg10.getCheckedRadioButtonId()));
        C1_P4_10 = childPosP410;
        //pregunta 411
        int childPosP411 = con1_p4_rg11.indexOfChild(con1_p4_rg11.findViewById(con1_p4_rg11.getCheckedRadioButtonId()));
        C1_P4_11 = childPosP411;
        //pregunta 412
        int childPosP412 = con1_p4_rg12.indexOfChild(con1_p4_rg12.findViewById(con1_p4_rg12.getCheckedRadioButtonId()));
        C1_P4_12 = childPosP412;

    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        ContentValues contentValues = new ContentValues(20);
        contentValues.put(SQLConstantes.C1_P4_1,C1_P4_1);
        contentValues.put(SQLConstantes.C1_P4_2,C1_P4_2);
        contentValues.put(SQLConstantes.C1_P4_3,C1_P4_3);
        contentValues.put(SQLConstantes.C1_P4_4,C1_P4_4);
        contentValues.put(SQLConstantes.C1_P4_5,C1_P4_5);
        contentValues.put(SQLConstantes.C1_P4_6,C1_P4_6);
        contentValues.put(SQLConstantes.C1_P4_7,C1_P4_7);
        contentValues.put(SQLConstantes.C1_P4_8,C1_P4_8);
        contentValues.put(SQLConstantes.C1_P4_9,C1_P4_9);
        contentValues.put(SQLConstantes.C1_P4_10,C1_P4_10);
        contentValues.put(SQLConstantes.C1_P4_11,C1_P4_11);
        contentValues.put(SQLConstantes.C1_P4_12,C1_P4_12);
        data.actualizarControl1(idempresa,contentValues);
            data.close();
    }
    public boolean validar(){
        boolean valido = true;
        llenarMapaVariables();
//        String mensaje = "";
//        boolean vC1_P0_1 = false;boolean vC1_P0_2 = false;boolean vC1_P0_3 = false;
//        boolean vC1_P1_1 = false;boolean vC1_P1_2 = false;
//        boolean vC1_P2_1_1 = false;boolean vC1_P2_1_2 = false;
//        boolean vC1_P2_2_1 = false;boolean vC1_P2_2_2 = false;
//        boolean vC1_P3 = false;boolean vC1_P3_0 = false;
//        boolean vC1_P4_1_1 = false;boolean vC1_P4_2_1 = false;
//
//        //cabecera
//        if(C1_P0_1.trim().length() != 0) vC1_P0_1 = true;
//        else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE REGISTRAR NOMBRE DE INFORMANTE";
//        if(C1_P0_2 >= 1 && C1_P0_2 <= 4){
//            vC1_P0_2 = true;
//            if(C1_P0_2 == 4){
//                if(C1_P0_3.trim().length() >= 3) vC1_P0_3 = true;
//                else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
//            }
//            else vC1_P0_3 = true;
//        }else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE INDICAR CARGO DEL INFORMANTE";
//        //p1
//        if(C1_P1_1.trim().length() != 0){
//            if(C1_P1_1.equals(C1_P2_1_1) || C1_P1_1.equals(C1_P2_2_1)){
//                if(mensaje.equals(""))mensaje = "PREGUNTA 1: NO DEBE REGISTRAR 2 VECES LA MISMA ACTIVIDAD ECONOMICA";
//            } else vC1_P1_1 = true;
//        }
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 1: DEBE REGISTRAR ACTIVIDAD ECONOMICA PRINCIPAL DE LA EMPRESA";
//        if(C1_P1_2.trim().length() != 0) vC1_P1_2 = true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 1: DEBE REGISTRAR EL CODIGO CIIU DE LA ACTIVIDAD ECONOMICA PRINCIPAL DE LA EMPRESA";
//        //p2
//        if(C1_P2_1_NO == 1){vC1_P2_1_1=true;vC1_P2_1_2=true;vC1_P2_2_1=true;vC1_P2_2_2=true;}
//        else{
//            if(C1_P2_1_1.trim().length() != 0){
//               if(C1_P2_1_1.equals(C1_P2_1_2) || C1_P2_1_1.equals(C1_P1_1)) {
//                   if(mensaje.equals(""))mensaje = "PREGUNTA 2: NO DEBE REGISTRAR 2 VECES LA MISMA ACTIVIDAD ECONOMICA";
//               }else vC1_P2_1_1 = true;
//            }
//            else{
//                if(C1_P2_2_1.trim().length() != 0){
//                    if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 1 PRIMERO";
//                }
//                else if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 1 O INDICAR QUE NO TIENE";
//            }
//            if(C1_P2_1_2.trim().length() != 0) vC1_P2_1_2 = true;
//            else if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR EL CODIGO CIUU DE LA ACTIVIDAD ECONOMICA SECUNDARIA 1";
//            if(C1_P2_2_NO == 1){vC1_P2_2_1=true;vC1_P2_2_2=true;}
//            else{
//                if(C1_P2_2_1.trim().length() != 0){
//                    if(C1_P2_2_1.equals(C1_P2_1_1) || C1_P2_2_1.equals(C1_P1_1)) {
//                        if(mensaje.equals(""))mensaje = "PREGUNTA 2: NO DEBE REGISTRAR 2 VECES LA MISMA ACTIVIDAD ECONOMICA";
//                    }else vC1_P2_2_1 = true;
//                } else if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 2 O INDICAR NO TIENE";
//                if(C1_P2_2_2.trim().length() != 0) vC1_P2_2_2 = true;
//                else if(mensaje.equals(""))mensaje = "PREGUNTA 2: DEBE REGISTRAR EL CODIGO CIUU DE LA ACTIVIDAD ECONOMICA SECUNDARIA 2";
//            }
//        }
//
//        //p3
//        if(C1_P3 >= 0 && C1_P3 <= 6){
//            vC1_P3=true;
//            if(C1_P3 == 6){
//                if(C1_P3_0.trim().length() >= 3) vC1_P3_0 = true;
//                else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
//            }
//            else  vC1_P3_0 = true;
//        }else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE INDICAR LA ORGANIZACION DE LA EMPRESA";
//        //p4
//        if(C1_P4_1_1 >= 0 && C1_P4_1_1 <= 2) vC1_P4_1_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR UN REGIMEN DE PROPIEDAD";
//        if(C1_P4_2_1 >= 0 && C1_P4_2_1 <= 1) vC1_P4_2_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR EL TIPO DE CONTROL DE SU EMPRESA";
//
//        valido = vC1_P0_1 && vC1_P0_2 && vC1_P0_3 && vC1_P1_1 &&
//                vC1_P1_2 && vC1_P2_1_1 && vC1_P2_1_2 && vC1_P2_2_1 &&
//                vC1_P2_2_2 && vC1_P3 && vC1_P3_0 && vC1_P4_1_1 && vC1_P4_2_1;
//        if(!valido) mostrarMensaje(mensaje);
        return valido;
    }
    public void mostrarMensaje(String m){
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(m);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
