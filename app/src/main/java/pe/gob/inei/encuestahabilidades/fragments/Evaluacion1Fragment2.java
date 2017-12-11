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
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Evaluacion1;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;

/**
 * A simple {@link Fragment} subclass.
 */
public class Evaluacion1Fragment2 extends Fragment {


    private RadioGroup e1_p4_rg;
    private RadioGroup e1_p5_rg1;
    private RadioGroup e1_p5_rg2;
    private RadioGroup e1_p5_rg3;
    private RadioGroup e1_p5_rg4;
    private RadioGroup e1_p5_rg5;
    private RadioGroup e1_p5_rg6;
    private RadioGroup e1_p5_rg7;
    private RadioGroup e1_p5_rg8;
    private RadioGroup e1_p5_rg9;
    private RadioGroup e1_p5_rg10;
    private RadioGroup e1_p5_rg11;

    private Identificacion identificacion;
    String informante;


    private String idempresa;
    private Evaluacion1 evaluacion1;
    private Context context;
    private Data data;

    //mapeo de variables
    int E1_P4;
    int E1_P5_1;
    int E1_P5_2;
    int E1_P5_3;
    int E1_P5_4;
    int E1_P5_5;
    int E1_P5_6;
    int E1_P5_7;
    int E1_P5_8;
    int E1_P5_9;
    int E1_P5_10;
    int E1_P5_11;





    public Evaluacion1Fragment2() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Evaluacion1Fragment2(String idempresa, Context context) {
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

        View rootView = inflater.inflate(R.layout.fragment_evaluacion1_fragment1, container, false);


        e1_p4_rg  =(RadioGroup) rootView.findViewById(R.id.e1_p4_rg);
        e1_p5_rg1  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg1);
        e1_p5_rg2  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg2);
        e1_p5_rg3  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg3);
        e1_p5_rg4  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg4);
        e1_p5_rg5  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg5);
        e1_p5_rg6  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg6);
        e1_p5_rg7  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg7);
        e1_p5_rg8  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg8);
        e1_p5_rg9  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg9);
        e1_p5_rg10  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg10);
        e1_p5_rg11  =(RadioGroup) rootView.findViewById(R.id.e1_p5_rg11);
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
            evaluacion1 = data.getEvaluacion1(idempresa);

            //pregunta 4
            if(!evaluacion1.getE1_P4().equals("")){
            int childPos41 = Integer.parseInt(evaluacion1.getE1_P4());
            ((RadioButton)e1_p4_rg.getChildAt(childPos41)).setChecked(true);}
            //pregunta 5.1
            if(!evaluacion1.getE1_P5_1().equals("")){
            int childPos51 = Integer.parseInt(evaluacion1.getE1_P5_1());
            ((RadioButton)e1_p5_rg1.getChildAt(childPos51)).setChecked(true);}
            //pregunta 5.2
        if(!evaluacion1.getE1_P5_2().equals("")){
            int childPos52 = Integer.parseInt(evaluacion1.getE1_P5_2());
            ((RadioButton)e1_p5_rg2.getChildAt(childPos52)).setChecked(true);}
        //pregunta 5.3
        if(!evaluacion1.getE1_P5_3().equals("")){
            int childPos53 = Integer.parseInt(evaluacion1.getE1_P5_3());
            ((RadioButton)e1_p5_rg3.getChildAt(childPos53)).setChecked(true);}
        //pregunta 5.4
        if(!evaluacion1.getE1_P5_4().equals("")){
            int childPos54 = Integer.parseInt(evaluacion1.getE1_P5_4());
            ((RadioButton)e1_p5_rg4.getChildAt(childPos54)).setChecked(true);}
        //pregunta 5.5
        if(!evaluacion1.getE1_P5_5().equals("")){
            int childPos55 = Integer.parseInt(evaluacion1.getE1_P5_5());
            ((RadioButton)e1_p5_rg5.getChildAt(childPos55)).setChecked(true);}
        //pregunta 5.6
        if(!evaluacion1.getE1_P5_6().equals("")){
            int childPos56 = Integer.parseInt(evaluacion1.getE1_P5_6());
            ((RadioButton)e1_p5_rg6.getChildAt(childPos56)).setChecked(true);}
        //pregunta 5.7
        if(!evaluacion1.getE1_P5_7().equals("")){
            int childPos57 = Integer.parseInt(evaluacion1.getE1_P5_7());
            ((RadioButton)e1_p5_rg7.getChildAt(childPos57)).setChecked(true);}
        //pregunta 5.8
        if(!evaluacion1.getE1_P5_8().equals("")){
            int childPos58 = Integer.parseInt(evaluacion1.getE1_P5_8());
            ((RadioButton)e1_p5_rg8.getChildAt(childPos58)).setChecked(true);}
        //pregunta 5.9
        if(!evaluacion1.getE1_P5_9().equals("")){
            int childPos59 = Integer.parseInt(evaluacion1.getE1_P5_9());
            ((RadioButton)e1_p5_rg9.getChildAt(childPos59)).setChecked(true);}
        //pregunta 5.10
        if(!evaluacion1.getE1_P5_10().equals("")){
            int childPos510 = Integer.parseInt(evaluacion1.getE1_P5_10());
            ((RadioButton)e1_p5_rg10.getChildAt(childPos510)).setChecked(true);}
        //pregunta 5.11
        if(!evaluacion1.getE1_P5_11().equals("")){
            int childPos511 = Integer.parseInt(evaluacion1.getE1_P5_11());
            ((RadioButton)e1_p5_rg11.getChildAt(childPos511)).setChecked(true);}

            


        //}
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 4
        int childPosP41 = e1_p4_rg.indexOfChild(e1_p4_rg.findViewById(e1_p4_rg.getCheckedRadioButtonId()));
        E1_P4 = childPosP41;
        //pregunta 5.1
        int childPosP51 = e1_p5_rg1.indexOfChild(e1_p5_rg1.findViewById(e1_p5_rg1.getCheckedRadioButtonId()));
        E1_P5_1 = childPosP51;
        //pregunta 5.2
        int childPosP52 = e1_p5_rg2.indexOfChild(e1_p5_rg2.findViewById(e1_p5_rg2.getCheckedRadioButtonId()));
        E1_P5_2 = childPosP52;
        //pregunta 5.3
        int childPosP53 = e1_p5_rg3.indexOfChild(e1_p5_rg3.findViewById(e1_p5_rg3.getCheckedRadioButtonId()));
        E1_P5_3 = childPosP53;
        //pregunta 5.4
        int childPosP54 = e1_p5_rg4.indexOfChild(e1_p5_rg4.findViewById(e1_p5_rg4.getCheckedRadioButtonId()));
        E1_P5_4 = childPosP54;
        //pregunta 5.5
        int childPosP55 = e1_p5_rg5.indexOfChild(e1_p5_rg5.findViewById(e1_p5_rg5.getCheckedRadioButtonId()));
        E1_P5_5 = childPosP55;
        //pregunta 5.6
        int childPosP56 = e1_p5_rg6.indexOfChild(e1_p5_rg6.findViewById(e1_p5_rg6.getCheckedRadioButtonId()));
        E1_P5_6 = childPosP56;
        //pregunta 5.7
        int childPosP57 = e1_p5_rg7.indexOfChild(e1_p5_rg7.findViewById(e1_p5_rg7.getCheckedRadioButtonId()));
        E1_P5_7 = childPosP57;
        //pregunta 5.8
        int childPosP58 = e1_p5_rg8.indexOfChild(e1_p5_rg8.findViewById(e1_p5_rg8.getCheckedRadioButtonId()));
        E1_P5_8 = childPosP58;
        //pregunta 5.9
        int childPosP59 = e1_p5_rg9.indexOfChild(e1_p5_rg9.findViewById(e1_p5_rg9.getCheckedRadioButtonId()));
        E1_P5_9 = childPosP59;
        //pregunta 5.10
        int childPosP510 = e1_p5_rg10.indexOfChild(e1_p5_rg10.findViewById(e1_p5_rg10.getCheckedRadioButtonId()));
        E1_P5_10 = childPosP510;
        //pregunta 5.11
        int childPosP511 = e1_p5_rg11.indexOfChild(e1_p5_rg11.findViewById(e1_p5_rg11.getCheckedRadioButtonId()));
        E1_P5_11 = childPosP511;



    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeEvaluacion1(idempresa)){
        ContentValues contentValues = new ContentValues(20);
        contentValues.put(SQLConstantes.E1_P4,E1_P4+"");
        contentValues.put(SQLConstantes.E1_P5_1,E1_P5_1+"");
        contentValues.put(SQLConstantes.E1_P5_2,E1_P5_2+"");
        contentValues.put(SQLConstantes.E1_P5_3,E1_P5_3+"");
        contentValues.put(SQLConstantes.E1_P5_4,E1_P5_4+"");
        contentValues.put(SQLConstantes.E1_P5_5,E1_P5_5+"");
        contentValues.put(SQLConstantes.E1_P5_6,E1_P5_6+"");
        contentValues.put(SQLConstantes.E1_P5_7,E1_P5_7+"");
        contentValues.put(SQLConstantes.E1_P5_8,E1_P5_8+"");
        contentValues.put(SQLConstantes.E1_P5_9,E1_P5_9+"");
        contentValues.put(SQLConstantes.E1_P5_10,E1_P5_10+"");
        contentValues.put(SQLConstantes.E1_P5_11,E1_P5_11+"");


        data.actualizarEvaluacion1(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            evaluacion1 = new Evaluacion1();
            //llena el objeto a insertar
            evaluacion1.setEVALUACION1_ID(idempresa);
            evaluacion1.setE1_P4(E1_P4+"");
            evaluacion1.setE1_P5_1(E1_P5_1+"");
            evaluacion1.setE1_P5_2(E1_P5_2+"");
            evaluacion1.setE1_P5_3(E1_P5_3+"");
            evaluacion1.setE1_P5_4(E1_P5_4+"");
            evaluacion1.setE1_P5_5(E1_P5_5+"");
            evaluacion1.setE1_P5_6(E1_P5_6+"");
            evaluacion1.setE1_P5_7(E1_P5_7+"");
            evaluacion1.setE1_P5_8(E1_P5_8+"");
            evaluacion1.setE1_P5_9(E1_P5_9+"");
            evaluacion1.setE1_P5_10(E1_P5_10+"");
            evaluacion1.setE1_P5_11(E1_P5_11+"");
            data.insertarEvaluacion1(evaluacion1);
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
//        boolean vE1_P4_1 = false;boolean vE1_P4_2_1 = false;
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
//        if(E1_P4_1 >= 0 && E1_P4_1 <= 2) vE1_P4_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR UN REGIMEN DE PROPIEDAD";
//        if(E1_P4_2_1 >= 0 && E1_P4_2_1 <= 1) vE1_P4_2_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR EL TIPO DE CONTROL DE SU EMPRESA";
//
//        valido = vC1_P0_1 && vC1_P0_2 && vC1_P0_3 && vC1_P1_1 &&
//                vC1_P1_2 && vC1_P2_1_1 && vC1_P2_1_2 && vC1_P2_2_1 &&
//                vC1_P2_2_2 && vC1_P3 && vC1_P3_0 && vE1_P4_1 && vE1_P4_2_1;
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
