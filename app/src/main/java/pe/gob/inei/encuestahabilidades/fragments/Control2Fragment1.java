package pe.gob.inei.encuestahabilidades.fragments;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Control2;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;

/**
 * A simple {@link Fragment} subclass.
 */
public class Control2Fragment1 extends Fragment {


    private RadioGroup c2_p1_rg1;
    private RadioGroup c2_p1_rg2;
    private RadioGroup c2_p1_rg3;
    private RadioGroup c2_p1_rg4;
    private RadioGroup c2_p1_rg5;
    private RadioGroup c2_p1_rg6;
    private RadioGroup c2_p1_rg7;
    private RadioGroup c2_p1_rg8;
    private RadioGroup c2_p1_rg9;
    private RadioGroup c2_p1_rg10;
    private RadioGroup c2_p1_rg11;
    private RadioGroup c2_p1_rg12;
    private RadioGroup c2_p1_rg13;





    private Identificacion identificacion;
    String informante;


    private String idempresa;
    private Control2 control2;
    private Context context;
    private Data data;

    //mapeo de variables
    int C2_P1_1;
    int C2_P1_2;
    int C2_P1_3;
    int C2_P1_4;
    int C2_P1_5;
    int C2_P1_6;
    int C2_P1_7;
    int C2_P1_8;
    int C2_P1_9;
    int C2_P1_10;
    int C2_P1_11;
    int C2_P1_12;
    int C2_P1_13;




    public Control2Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Control2Fragment1(String idempresa, Context context) {
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

        View rootView = inflater.inflate(R.layout.fragment_control2_fragment1, container, false);


        c2_p1_rg1  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg1);
        c2_p1_rg2  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg2);
        c2_p1_rg3  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg3);
        c2_p1_rg4  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg4);
        c2_p1_rg5  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg5);
        c2_p1_rg6  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg6);
        c2_p1_rg7  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg7);
        c2_p1_rg8  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg8);
        c2_p1_rg9  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg9);
        c2_p1_rg10  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg10);
        c2_p1_rg11  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg11);
        c2_p1_rg12  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg12);
        c2_p1_rg13  =(RadioGroup) rootView.findViewById(R.id.c2_p1_rg13);




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
            control2 = data.getControl2(idempresa);

            //pregunta 1.1
            if(!control2.getC2_P1_1().equals("")){
            int childPos41 = Integer.parseInt(control2.getC2_P1_1());
            ((RadioButton)c2_p1_rg1.getChildAt(childPos41)).setChecked(true);}
            //pregunta 1.2
            if(!control2.getC2_P1_2().equals("")){
            int childPos42 = Integer.parseInt(control2.getC2_P1_2());
            ((RadioButton)c2_p1_rg2.getChildAt(childPos42)).setChecked(true);}
            //pregunta 1.3
            if(!control2.getC2_P1_3().equals("")){
            int childPos43 = Integer.parseInt(control2.getC2_P1_3());
            ((RadioButton)c2_p1_rg3.getChildAt(childPos43)).setChecked(true);}
            //pregunta 1.4
            if(!control2.getC2_P1_4().equals("")){
            int childPos44 = Integer.parseInt(control2.getC2_P1_4());
            ((RadioButton)c2_p1_rg4.getChildAt(childPos44)).setChecked(true);}
            //pregunta 1.5
            if(!control2.getC2_P1_5().equals("")){
            int childPos45= Integer.parseInt(control2.getC2_P1_5());
            ((RadioButton)c2_p1_rg5.getChildAt(childPos45)).setChecked(true);}
            //pregunta 46
            if(!control2.getC2_P1_6().equals("")){
            int childPos46 = Integer.parseInt(control2.getC2_P1_6());
            ((RadioButton)c2_p1_rg6.getChildAt(childPos46)).setChecked(true);}
            //pregunta 1.7
            if(!control2.getC2_P1_7().equals("")){
            int childPos47 = Integer.parseInt(control2.getC2_P1_7());
            ((RadioButton)c2_p1_rg7.getChildAt(childPos47)).setChecked(true);}
            //pregunta 1.8
            if(!control2.getC2_P1_8().equals("")){
            int childPos48 = Integer.parseInt(control2.getC2_P1_8());
            ((RadioButton)c2_p1_rg8.getChildAt(childPos48)).setChecked(true);}
            //pregunta 1.9
            if(!control2.getC2_P1_9().equals("")){
            int childPos49 = Integer.parseInt(control2.getC2_P1_9());
            ((RadioButton)c2_p1_rg9.getChildAt(childPos49)).setChecked(true);}
            //pregunta 1.10
            if(!control2.getC2_P1_10().equals("")){
            int childPos410 = Integer.parseInt(control2.getC2_P1_10());
            ((RadioButton)c2_p1_rg10.getChildAt(childPos410)).setChecked(true);}
            //pregunta 1.11
            if(!control2.getC2_P1_11().equals("")){
            int childPos411 = Integer.parseInt(control2.getC2_P1_11());
            ((RadioButton)c2_p1_rg11.getChildAt(childPos411)).setChecked(true);}
            //pregunta 1.12
            if(!control2.getC2_P1_12().equals("")){
            int childPos412 = Integer.parseInt(control2.getC2_P1_12());
            ((RadioButton)c2_p1_rg12.getChildAt(childPos412)).setChecked(true);}
            //pregunta 1.13
            if(!control2.getC2_P1_13().equals("")){
            int childPos413 = Integer.parseInt(control2.getC2_P1_13());
            ((RadioButton)c2_p1_rg13.getChildAt(childPos413)).setChecked(true);}


        //}
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 41
        int childPosP41 = c2_p1_rg1.indexOfChild(c2_p1_rg1.findViewById(c2_p1_rg1.getCheckedRadioButtonId()));
        C2_P1_1 = childPosP41;
        //pregunta 42
        int childPosP42 = c2_p1_rg2.indexOfChild(c2_p1_rg2.findViewById(c2_p1_rg2.getCheckedRadioButtonId()));
        C2_P1_2 = childPosP42;
        //pregunta 43
        int childPosP43 = c2_p1_rg3.indexOfChild(c2_p1_rg3.findViewById(c2_p1_rg3.getCheckedRadioButtonId()));
        C2_P1_3 = childPosP43;
        //pregunta 44
        int childPosP44 = c2_p1_rg4.indexOfChild(c2_p1_rg4.findViewById(c2_p1_rg4.getCheckedRadioButtonId()));
        C2_P1_4 = childPosP44;
        //pregunta 45
        int childPosP45 = c2_p1_rg5.indexOfChild(c2_p1_rg5.findViewById(c2_p1_rg5.getCheckedRadioButtonId()));
        C2_P1_5 = childPosP45;
        //pregunta 46
        int childPosP46 = c2_p1_rg6.indexOfChild(c2_p1_rg6.findViewById(c2_p1_rg6.getCheckedRadioButtonId()));
        C2_P1_6 = childPosP46;
        //pregunta 47
        int childPosP47 = c2_p1_rg7.indexOfChild(c2_p1_rg7.findViewById(c2_p1_rg7.getCheckedRadioButtonId()));
        C2_P1_7 = childPosP47;
        //pregunta 48
        int childPosP48 = c2_p1_rg8.indexOfChild(c2_p1_rg8.findViewById(c2_p1_rg8.getCheckedRadioButtonId()));
        C2_P1_8 = childPosP48;
        //pregunta 49
        int childPosP49 = c2_p1_rg9.indexOfChild(c2_p1_rg9.findViewById(c2_p1_rg9.getCheckedRadioButtonId()));
        C2_P1_9= childPosP49;
        //pregunta 410
        int childPosP410 = c2_p1_rg10.indexOfChild(c2_p1_rg10.findViewById(c2_p1_rg10.getCheckedRadioButtonId()));
        C2_P1_10 = childPosP410;
        //pregunta 411
        int childPosP411 = c2_p1_rg11.indexOfChild(c2_p1_rg11.findViewById(c2_p1_rg11.getCheckedRadioButtonId()));
        C2_P1_11 = childPosP411;
        //pregunta 412
        int childPosP412 = c2_p1_rg12.indexOfChild(c2_p1_rg12.findViewById(c2_p1_rg12.getCheckedRadioButtonId()));
        C2_P1_12 = childPosP412;
        //pregunta 413
        int childPosP413 = c2_p1_rg13.indexOfChild(c2_p1_rg13.findViewById(c2_p1_rg13.getCheckedRadioButtonId()));
        C2_P1_13 = childPosP413;

    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeControl2(idempresa)){
        ContentValues contentValues = new ContentValues(20);
        contentValues.put(SQLConstantes.C2_P1_1,C2_P1_1+"");
        contentValues.put(SQLConstantes.C2_P1_2,C2_P1_2+"");
        contentValues.put(SQLConstantes.C2_P1_3,C2_P1_3+"");
        contentValues.put(SQLConstantes.C2_P1_4,C2_P1_4+"");
        contentValues.put(SQLConstantes.C2_P1_5,C2_P1_5+"");
        contentValues.put(SQLConstantes.C2_P1_6,C2_P1_6+"");
        contentValues.put(SQLConstantes.C2_P1_7,C2_P1_7+"");
        contentValues.put(SQLConstantes.C2_P1_8,C2_P1_8+"");
        contentValues.put(SQLConstantes.C2_P1_9,C2_P1_9+"");
        contentValues.put(SQLConstantes.C2_P1_10,C2_P1_10+"");
        contentValues.put(SQLConstantes.C2_P1_11,C2_P1_11+"");
        contentValues.put(SQLConstantes.C2_P1_12,C2_P1_12+"");
        contentValues.put(SQLConstantes.C2_P1_13,C2_P1_13+"");
        data.actualizarcontrol2(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            control2 = new Control2();
            //llena el objeto a insertar
            control2.setCONTROL2_ID(idempresa);
            control2.setC2_P1_1(C2_P1_1+"");
            control2.setC2_P1_2(C2_P1_2+"");
            control2.setC2_P1_3(C2_P1_3+"");
            control2.setC2_P1_4(C2_P1_4+"");
            control2.setC2_P1_5(C2_P1_5+"");
            control2.setC2_P1_6(C2_P1_6+"");
            control2.setC2_P1_7(C2_P1_7+"");
            control2.setC2_P1_8(C2_P1_8+"");
            control2.setC2_P1_9(C2_P1_9+"");
            control2.setC2_P1_10(C2_P1_10+"");
            control2.setC2_P1_11(C2_P1_11+"");
            control2.setC2_P1_12(C2_P1_12+"");
            control2.setC2_P1_13(C2_P1_13+"");

            data.insertarControl2(control2);
        }
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
//        boolean vC2_P1_1_1 = false;boolean vC2_P1_2_1 = false;
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
//        if(C2_P1_1_1 >= 0 && C2_P1_1_1 <= 2) vC2_P1_1_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR UN REGIMEN DE PROPIEDAD";
//        if(C2_P1_2_1 >= 0 && C2_P1_2_1 <= 1) vC2_P1_2_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR EL TIPO DE CONTROL DE SU EMPRESA";
//
//        valido = vC1_P0_1 && vC1_P0_2 && vC1_P0_3 && vC1_P1_1 &&
//                vC1_P1_2 && vC1_P2_1_1 && vC1_P2_1_2 && vC1_P2_2_1 &&
//                vC1_P2_2_2 && vC1_P3 && vC1_P3_0 && vC2_P1_1_1 && vC2_P1_2_1;
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
