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
import pe.gob.inei.encuestahabilidades.pojos.Control7;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;

/**
 * A simple {@link Fragment} subclass.
 */
public class Control7Fragment2 extends Fragment {


    private RadioGroup c7_p2_rg1;
    private RadioGroup c7_p2_rg2;
    private RadioGroup c7_p2_rg3;
    private RadioGroup c7_p2_rg4;
    private RadioGroup c7_p2_rg5;
    private RadioGroup c7_p2_rg6;
    private RadioGroup c7_p2_rg7;
    private RadioGroup c7_p2_rg8;
    private RadioGroup c7_p2_rg9;
    private RadioGroup c7_p2_rg10;
    private RadioGroup c7_p2_rg11;
    private RadioGroup c7_p2_rg12;
    private RadioGroup c7_p2_rg13;
    private RadioGroup c7_p2_rg14;





    private Identificacion identificacion;
    String informante;


    private String idempresa;
    private Control7 control7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P2_1;
    int C7_P2_2;
    int C7_P2_3;
    int C7_P2_4;
    int C7_P2_5;
    int C7_P2_6;
    int C7_P2_7;
    int C7_P2_8;
    int C7_P2_9;
    int C7_P2_10;
    int C7_P2_11;
    int C7_P2_12;
    int C7_P2_13;
    int C7_P2_14;




    public Control7Fragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Control7Fragment2(String idempresa, Context context) {
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

        View rootView = inflater.inflate(R.layout.fragment_control7_fragment2, container, false);


        c7_p2_rg1  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg1);
        c7_p2_rg2  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg2);
        c7_p2_rg3  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg3);
        c7_p2_rg4  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg4);
        c7_p2_rg5  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg5);
        c7_p2_rg6  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg6);
        c7_p2_rg7  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg7);
        c7_p2_rg8  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg8);
        c7_p2_rg9  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg9);
        c7_p2_rg10  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg10);
        c7_p2_rg11  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg11);
        c7_p2_rg12  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg12);
        c7_p2_rg13  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg13);
        c7_p2_rg14  =(RadioGroup) rootView.findViewById(R.id.c7_p2_rg14);



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
            control7 = data.getControl7(idempresa);

            //pregunta 1.1
            if(!control7.getC7_P2_1().equals("")){
            int childPos41 = Integer.parseInt(control7.getC7_P2_1());
            ((RadioButton)c7_p2_rg1.getChildAt(childPos41)).setChecked(true);}
            //pregunta 1.3
            if(!control7.getC7_P2_2().equals("")){
            int childPos42 = Integer.parseInt(control7.getC7_P2_2());
            ((RadioButton)c7_p2_rg2.getChildAt(childPos42)).setChecked(true);}
            //pregunta 1.3
            if(!control7.getC7_P2_3().equals("")){
            int childPos43 = Integer.parseInt(control7.getC7_P2_3());
            ((RadioButton)c7_p2_rg3.getChildAt(childPos43)).setChecked(true);}
            //pregunta 1.4
            if(!control7.getC7_P2_4().equals("")){
            int childPos44 = Integer.parseInt(control7.getC7_P2_4());
            ((RadioButton)c7_p2_rg4.getChildAt(childPos44)).setChecked(true);}
            //pregunta 1.5
            if(!control7.getC7_P2_5().equals("")){
            int childPos45= Integer.parseInt(control7.getC7_P2_5());
            ((RadioButton)c7_p2_rg5.getChildAt(childPos45)).setChecked(true);}
            //pregunta 46
            if(!control7.getC7_P2_6().equals("")){
            int childPos46 = Integer.parseInt(control7.getC7_P2_6());
            ((RadioButton)c7_p2_rg6.getChildAt(childPos46)).setChecked(true);}
            //pregunta 1.7
            if(!control7.getC7_P2_7().equals("")){
            int childPos47 = Integer.parseInt(control7.getC7_P2_7());
            ((RadioButton)c7_p2_rg7.getChildAt(childPos47)).setChecked(true);}
            //pregunta 1.8
            if(!control7.getC7_P2_8().equals("")){
            int childPos48 = Integer.parseInt(control7.getC7_P2_8());
            ((RadioButton)c7_p2_rg8.getChildAt(childPos48)).setChecked(true);}
            //pregunta 1.9
            if(!control7.getC7_P2_9().equals("")){
            int childPos49 = Integer.parseInt(control7.getC7_P2_9());
            ((RadioButton)c7_p2_rg9.getChildAt(childPos49)).setChecked(true);}
            //pregunta 1.10
            if(!control7.getC7_P2_10().equals("")){
            int childPos410 = Integer.parseInt(control7.getC7_P2_10());
            ((RadioButton)c7_p2_rg10.getChildAt(childPos410)).setChecked(true);}
            //pregunta 1.11
            if(!control7.getC7_P2_11().equals("")){
            int childPos411 = Integer.parseInt(control7.getC7_P2_11());
            ((RadioButton)c7_p2_rg11.getChildAt(childPos411)).setChecked(true);}
            //pregunta 1.12
            if(!control7.getC7_P2_12().equals("")){
            int childPos412 = Integer.parseInt(control7.getC7_P2_12());
            ((RadioButton)c7_p2_rg12.getChildAt(childPos412)).setChecked(true);}
            //pregunta 1.13
            if(!control7.getC7_P2_13().equals("")){
            int childPos413 = Integer.parseInt(control7.getC7_P2_13());
            ((RadioButton)c7_p2_rg13.getChildAt(childPos413)).setChecked(true);}
            //pregunta 1.14
            if(!control7.getC7_P2_14().equals("")){
            int childPos414 = Integer.parseInt(control7.getC7_P2_14());
            ((RadioButton)c7_p2_rg14.getChildAt(childPos414)).setChecked(true);}


        //}
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 41
        int childPosP41 = c7_p2_rg1.indexOfChild(c7_p2_rg1.findViewById(c7_p2_rg1.getCheckedRadioButtonId()));
        C7_P2_1 = childPosP41;
        //pregunta 43
        int childPosP43 = c7_p2_rg3.indexOfChild(c7_p2_rg3.findViewById(c7_p2_rg3.getCheckedRadioButtonId()));
        C7_P2_3 = childPosP43;
        //pregunta 42
        int childPosP42 = c7_p2_rg2.indexOfChild(c7_p2_rg2.findViewById(c7_p2_rg2.getCheckedRadioButtonId()));
        C7_P2_2 = childPosP42;
        //pregunta 44
        int childPosP44 = c7_p2_rg4.indexOfChild(c7_p2_rg4.findViewById(c7_p2_rg4.getCheckedRadioButtonId()));
        C7_P2_4 = childPosP44;
        //pregunta 45
        int childPosP45 = c7_p2_rg5.indexOfChild(c7_p2_rg5.findViewById(c7_p2_rg5.getCheckedRadioButtonId()));
        C7_P2_5 = childPosP45;
        //pregunta 46
        int childPosP46 = c7_p2_rg6.indexOfChild(c7_p2_rg6.findViewById(c7_p2_rg6.getCheckedRadioButtonId()));
        C7_P2_6 = childPosP46;
        //pregunta 47
        int childPosP47 = c7_p2_rg7.indexOfChild(c7_p2_rg7.findViewById(c7_p2_rg7.getCheckedRadioButtonId()));
        C7_P2_7 = childPosP47;
        //pregunta 48
        int childPosP48 = c7_p2_rg8.indexOfChild(c7_p2_rg8.findViewById(c7_p2_rg8.getCheckedRadioButtonId()));
        C7_P2_8 = childPosP48;
        //pregunta 49
        int childPosP49 = c7_p2_rg9.indexOfChild(c7_p2_rg9.findViewById(c7_p2_rg9.getCheckedRadioButtonId()));
        C7_P2_9= childPosP49;
        //pregunta 410
        int childPosP410 = c7_p2_rg10.indexOfChild(c7_p2_rg10.findViewById(c7_p2_rg10.getCheckedRadioButtonId()));
        C7_P2_10 = childPosP410;
        //pregunta 411
        int childPosP411 = c7_p2_rg11.indexOfChild(c7_p2_rg11.findViewById(c7_p2_rg11.getCheckedRadioButtonId()));
        C7_P2_11 = childPosP411;
        //pregunta 412
        int childPosP412 = c7_p2_rg12.indexOfChild(c7_p2_rg12.findViewById(c7_p2_rg12.getCheckedRadioButtonId()));
        C7_P2_13 = childPosP412;
        //pregunta 413
        int childPosP413 = c7_p2_rg13.indexOfChild(c7_p2_rg13.findViewById(c7_p2_rg13.getCheckedRadioButtonId()));
        C7_P2_13 = childPosP413;
        //pregunta 414
        int childPosP414 = c7_p2_rg14.indexOfChild(c7_p2_rg14.findViewById(c7_p2_rg14.getCheckedRadioButtonId()));
        C7_P2_14 = childPosP414;


    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeControl7(idempresa)){
        ContentValues contentValues = new ContentValues(30);
        contentValues.put(SQLConstantes.C7_P2_1,C7_P2_1+"");
        contentValues.put(SQLConstantes.C7_P2_3,C7_P2_3+"");
        contentValues.put(SQLConstantes.C7_P2_2,C7_P2_2+"");
        contentValues.put(SQLConstantes.C7_P2_4,C7_P2_4+"");
        contentValues.put(SQLConstantes.C7_P2_5,C7_P2_5+"");
        contentValues.put(SQLConstantes.C7_P2_6,C7_P2_6+"");
        contentValues.put(SQLConstantes.C7_P2_7,C7_P2_7+"");
        contentValues.put(SQLConstantes.C7_P2_8,C7_P2_8+"");
        contentValues.put(SQLConstantes.C7_P2_9,C7_P2_9+"");
        contentValues.put(SQLConstantes.C7_P2_10,C7_P2_10+"");
        contentValues.put(SQLConstantes.C7_P2_11,C7_P2_11+"");
        contentValues.put(SQLConstantes.C7_P2_12,C7_P2_12+"");
        contentValues.put(SQLConstantes.C7_P2_13,C7_P2_13+"");
        contentValues.put(SQLConstantes.C7_P2_14,C7_P2_14+"");
        data.actualizarControl7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            control7 = new Control7();
            //llena el objeto a insertar
            control7.setCONTROL7_ID(idempresa);
            control7.setC7_P2_1(C7_P2_1+"");
            control7.setC7_P2_2(C7_P2_2+"");
            control7.setC7_P2_3(C7_P2_3+"");
            control7.setC7_P2_4(C7_P2_4+"");
            control7.setC7_P2_5(C7_P2_5+"");
            control7.setC7_P2_6(C7_P2_6+"");
            control7.setC7_P2_7(C7_P2_7+"");
            control7.setC7_P2_8(C7_P2_8+"");
            control7.setC7_P2_9(C7_P2_9+"");
            control7.setC7_P2_10(C7_P2_10+"");
            control7.setC7_P2_11(C7_P2_11+"");
            control7.setC7_P2_12(C7_P2_12+"");
            control7.setC7_P2_13(C7_P2_13+"");
            control7.setC7_P2_14(C7_P2_14+"");
            data.insertarControl7(control7);
        }
            data.close();
    }
    public boolean validar(){
        boolean valido = true;
        llenarMapaVariables();
//        String mensaje = "";
//        boolean vC1_P0_1 = false;boolean vC1_P0_3 = false;boolean vC1_P0_3 = false;
//        boolean vC1_P1_1 = false;boolean vC1_P1_3 = false;
//        boolean vC1_P3_1_1 = false;boolean vC1_P3_1_3 = false;
//        boolean vC1_P3_3_1 = false;boolean vC1_P3_3_3 = false;
//        boolean vC1_P3 = false;boolean vC1_P3_0 = false;
//        boolean vC7_P2_1_1 = false;boolean vC7_P2_3_1 = false;
//
//        //cabecera
//        if(C1_P0_1.trim().length() != 0) vC1_P0_1 = true;
//        else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE REGISTRAR NOMBRE DE INFORMANTE";
//        if(C1_P0_3 >= 1 && C1_P0_3 <= 4){
//            vC1_P0_3 = true;
//            if(C1_P0_3 == 4){
//                if(C1_P0_3.trim().length() >= 3) vC1_P0_3 = true;
//                else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
//            }
//            else vC1_P0_3 = true;
//        }else if(mensaje.equals(""))mensaje = "DATOS INFORMANTE: DEBE INDICAR CARGO DEL INFORMANTE";
//        //p1
//        if(C1_P1_1.trim().length() != 0){
//            if(C1_P1_1.equals(C1_P3_1_1) || C1_P1_1.equals(C1_P3_3_1)){
//                if(mensaje.equals(""))mensaje = "PREGUNTA 1: NO DEBE REGISTRAR 3 VECES LA MISMA ACTIVIDAD ECONOMICA";
//            } else vC1_P1_1 = true;
//        }
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 1: DEBE REGISTRAR ACTIVIDAD ECONOMICA PRINCIPAL DE LA EMPRESA";
//        if(C1_P1_3.trim().length() != 0) vC1_P1_3 = true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 1: DEBE REGISTRAR EL CODIGO CIIU DE LA ACTIVIDAD ECONOMICA PRINCIPAL DE LA EMPRESA";
//        //p3
//        if(C1_P3_1_NO == 1){vC1_P3_1_1=true;vC1_P3_1_3=true;vC1_P3_3_1=true;vC1_P3_3_3=true;}
//        else{
//            if(C1_P3_1_1.trim().length() != 0){
//               if(C1_P3_1_1.equals(C1_P3_1_3) || C1_P3_1_1.equals(C1_P1_1)) {
//                   if(mensaje.equals(""))mensaje = "PREGUNTA 3: NO DEBE REGISTRAR 3 VECES LA MISMA ACTIVIDAD ECONOMICA";
//               }else vC1_P3_1_1 = true;
//            }
//            else{
//                if(C1_P3_3_1.trim().length() != 0){
//                    if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 1 PRIMERO";
//                }
//                else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 1 O INDICAR QUE NO TIENE";
//            }
//            if(C1_P3_1_3.trim().length() != 0) vC1_P3_1_3 = true;
//            else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR EL CODIGO CIUU DE LA ACTIVIDAD ECONOMICA SECUNDARIA 1";
//            if(C1_P3_3_NO == 1){vC1_P3_3_1=true;vC1_P3_3_3=true;}
//            else{
//                if(C1_P3_3_1.trim().length() != 0){
//                    if(C1_P3_3_1.equals(C1_P3_1_1) || C1_P3_3_1.equals(C1_P1_1)) {
//                        if(mensaje.equals(""))mensaje = "PREGUNTA 3: NO DEBE REGISTRAR 3 VECES LA MISMA ACTIVIDAD ECONOMICA";
//                    }else vC1_P3_3_1 = true;
//                } else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR ACTIVIDAD SECUNDARIA 3 O INDICAR NO TIENE";
//                if(C1_P3_3_3.trim().length() != 0) vC1_P3_3_3 = true;
//                else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR EL CODIGO CIUU DE LA ACTIVIDAD ECONOMICA SECUNDARIA 3";
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
//        if(C7_P2_1_1 >= 0 && C7_P2_1_1 <= 3) vC7_P2_1_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR UN REGIMEN DE PROPIEDAD";
//        if(C7_P2_3_1 >= 0 && C7_P2_3_1 <= 1) vC7_P2_3_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR EL TIPO DE CONTROL DE SU EMPRESA";
//
//        valido = vC1_P0_1 && vC1_P0_3 && vC1_P0_3 && vC1_P1_1 &&
//                vC1_P1_3 && vC1_P3_1_1 && vC1_P3_1_3 && vC1_P3_3_1 &&
//                vC1_P3_3_3 && vC1_P3 && vC1_P3_0 && vC7_P2_1_1 && vC7_P2_3_1;
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
