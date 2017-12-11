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
public class Evaluacion1Fragment1 extends Fragment {


    private RadioGroup e1_p1_rg;
    private RadioGroup e1_p2_rg;
    private EditText e1_p3_et1;
    private EditText e1_p3_et2;
    private EditText e1_p3_et3;
    private EditText e1_p3_et4;





    private Identificacion identificacion;
    String informante;


    private String idempresa;
    private Evaluacion1 evaluacion1;
    private Context context;
    private Data data;

    //mapeo de variables
    int E1_P1;
    int E1_P2;
    String E1_P3_1;
    String E1_P3_2;
    String E1_P3_3;
    String E1_P3_4;




    public Evaluacion1Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Evaluacion1Fragment1(String idempresa, Context context) {
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


        e1_p1_rg  =(RadioGroup) rootView.findViewById(R.id.e1_p1_rg);
        e1_p2_rg  =(RadioGroup) rootView.findViewById(R.id.e1_p2_rg);
        e1_p3_et1 =(EditText) rootView.findViewById(R.id.e1_p3_et1);
        e1_p3_et2 =(EditText) rootView.findViewById(R.id.e1_p3_et2);
        e1_p3_et3 =(EditText) rootView.findViewById(R.id.e1_p3_et3);
        e1_p3_et4 =(EditText) rootView.findViewById(R.id.e1_p3_et4);




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

            //pregunta 1.1
            if(!evaluacion1.getE1_P1().equals("")){
            int childPos41 = Integer.parseInt(evaluacion1.getE1_P1());
            ((RadioButton)e1_p1_rg.getChildAt(childPos41)).setChecked(true);}
            //pregunta 1.2
            if(!evaluacion1.getE1_P2().equals("")){
            int childPos42 = Integer.parseInt(evaluacion1.getE1_P2());
            ((RadioButton)e1_p2_rg.getChildAt(childPos42)).setChecked(true);}
            //4.1
             e1_p3_et1.setText(evaluacion1.getE1_P3_1());
            //4.2
             e1_p3_et2.setText(evaluacion1.getE1_P3_2());
            //4.3
             e1_p3_et3.setText(evaluacion1.getE1_P3_3());
            //4.4
             e1_p3_et4.setText(evaluacion1.getE1_P3_4());

            


        //}
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 41
        int childPosP41 = e1_p1_rg.indexOfChild(e1_p1_rg.findViewById(e1_p1_rg.getCheckedRadioButtonId()));
        E1_P1 = childPosP41;
        //pregunta 42
        int childPosP42 = e1_p2_rg.indexOfChild(e1_p2_rg.findViewById(e1_p2_rg.getCheckedRadioButtonId()));
        E1_P2 = childPosP42;
        //3.1
        E1_P3_1 = e1_p3_et1.getText().toString();
        //3.2
        E1_P3_2 = e1_p3_et2.getText().toString();
        //3.3
        E1_P3_3 = e1_p3_et3.getText().toString();
        //3.4
        E1_P3_4 = e1_p3_et4.getText().toString();


    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeEvaluacion1(idempresa)){
        ContentValues contentValues = new ContentValues(20);
        contentValues.put(SQLConstantes.E1_P1,E1_P1+"");
        contentValues.put(SQLConstantes.E1_P2,E1_P2+"");
        contentValues.put(SQLConstantes.E1_P3_1,E1_P3_1);
        contentValues.put(SQLConstantes.E1_P3_2,E1_P3_2);
        contentValues.put(SQLConstantes.E1_P3_3,E1_P3_3);
        contentValues.put(SQLConstantes.E1_P3_4,E1_P3_4);
        data.actualizarEvaluacion1(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            evaluacion1 = new Evaluacion1();
            //llena el objeto a insertar
            evaluacion1.setEVALUACION1_ID(idempresa);
            evaluacion1.setE1_P1(E1_P1+"");
            evaluacion1.setE1_P2(E1_P2+"");
            evaluacion1.setE1_P3_1(E1_P3_1);
            evaluacion1.setE1_P3_2(E1_P3_2);
            evaluacion1.setE1_P3_3(E1_P3_3);
            evaluacion1.setE1_P3_4(E1_P3_4);
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
//        boolean vE1_P1_1 = false;boolean vE1_P1_2_1 = false;
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
//        if(E1_P1_1 >= 0 && E1_P1_1 <= 2) vE1_P1_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR UN REGIMEN DE PROPIEDAD";
//        if(E1_P1_2_1 >= 0 && E1_P1_2_1 <= 1) vE1_P1_2_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR EL TIPO DE CONTROL DE SU EMPRESA";
//
//        valido = vC1_P0_1 && vC1_P0_2 && vC1_P0_3 && vC1_P1_1 &&
//                vC1_P1_2 && vC1_P2_1_1 && vC1_P2_1_2 && vC1_P2_2_1 &&
//                vC1_P2_2_2 && vC1_P3 && vC1_P3_0 && vE1_P1_1 && vE1_P1_2_1;
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
