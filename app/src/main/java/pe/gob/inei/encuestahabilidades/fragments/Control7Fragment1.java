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
import android.widget.Spinner;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.Control7;
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;

/**
 * A simple {@link Fragment} subclass.
 */
public class Control7Fragment1 extends Fragment {



    private Spinner c7_p1_sp1;
    private Spinner c7_p1_sp2;
    private Spinner c7_p1_sp3;
    private Spinner c7_p1_sp4;
    private Spinner c7_p1_sp5;
    private Spinner c7_p1_sp6;





    private Identificacion identificacion;


    private String idempresa;
    private Control7 control7;
    private Context context;
    private Data data;

    //mapeo de variables
    int C7_P1_1;
    int C7_P1_2;
    int C7_P1_3;
    int C7_P1_4;
    int C7_P1_5;
    int C7_P1_6;


    public Control7Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Control7Fragment1(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();
        identificacion = data.getIdentificacion(idempresa);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_control7_fragment1, container, false);


        
        c7_p1_sp1 = (Spinner) rootView.findViewById(R.id.c7_p1_sp1);
        c7_p1_sp2 = (Spinner) rootView.findViewById(R.id.c7_p1_sp2);
        c7_p1_sp3 = (Spinner) rootView.findViewById(R.id.c7_p1_sp3);
        c7_p1_sp4 = (Spinner) rootView.findViewById(R.id.c7_p1_sp4);
        c7_p1_sp5 = (Spinner) rootView.findViewById(R.id.c7_p1_sp5);
        c7_p1_sp6 = (Spinner) rootView.findViewById(R.id.c7_p1_sp6);



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
        if(data.existeControl7(idempresa)){
            //si existe traigo el objeto
            control7 = data.getControl7(idempresa);

            //pregunta 1
            c7_p1_sp1.setSelection(Integer.parseInt(control7.getC7_P1_1()));
            c7_p1_sp2.setSelection(Integer.parseInt(control7.getC7_P1_2()));
            c7_p1_sp3.setSelection(Integer.parseInt(control7.getC7_P1_3()));
            c7_p1_sp4.setSelection(Integer.parseInt(control7.getC7_P1_4()));
            c7_p1_sp5.setSelection(Integer.parseInt(control7.getC7_P1_5()));
            c7_p1_sp6.setSelection(Integer.parseInt(control7.getC7_P1_6()));

        }
        data.close();
    }
    public void llenarMapaVariables(){


        //pregunta 1
        C7_P1_1 = c7_p1_sp1.getSelectedItemPosition();
        C7_P1_2 = c7_p1_sp2.getSelectedItemPosition();
        C7_P1_3 = c7_p1_sp3.getSelectedItemPosition();
        C7_P1_4 = c7_p1_sp4.getSelectedItemPosition();
        C7_P1_5 = c7_p1_sp5.getSelectedItemPosition();
        C7_P1_6 = c7_p1_sp6.getSelectedItemPosition();

    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeControl7(idempresa)){
            ContentValues contentValues = new ContentValues(20);
            contentValues.put(SQLConstantes.C7_P1_1,C7_P1_1+"");
            contentValues.put(SQLConstantes.C7_P1_2,C7_P1_2+"");
            contentValues.put(SQLConstantes.C7_P1_3,C7_P1_3+"");
            contentValues.put(SQLConstantes.C7_P1_4,C7_P1_4+"");
            contentValues.put(SQLConstantes.C7_P1_5,C7_P1_5+"");
            contentValues.put(SQLConstantes.C7_P1_6,C7_P1_6+"");
            data.actualizarControl7(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            control7 = new Control7();
            //llena el objeto a insertar
            control7.setCONTROL7_ID(idempresa);
            control7.setC7_P1_1(C7_P1_1+"");
            control7.setC7_P1_2(C7_P1_2+"");
            control7.setC7_P1_3(C7_P1_3+"");
            control7.setC7_P1_4(C7_P1_4+"");
            control7.setC7_P1_5(C7_P1_5+"");
            control7.setC7_P1_6(C7_P1_6+"");
            data.insertarControl7(control7);
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
//        boolean vC1_P3 = false;boolean vC7_P1_0 = false;
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
//                if(C7_P1_0.trim().length() >= 3) vC7_P1_0 = true;
//                else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE REGISTRAR INFORMACION VALIDA EN ESPECIFIQUE";
//            }
//            else  vC7_P1_0 = true;
//        }else if(mensaje.equals(""))mensaje = "PREGUNTA 3: DEBE INDICAR LA ORGANIZACION DE LA EMPRESA";
//        //p4
//        if(C1_P4_1_1 >= 0 && C1_P4_1_1 <= 2) vC1_P4_1_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR UN REGIMEN DE PROPIEDAD";
//        if(C1_P4_2_1 >= 0 && C1_P4_2_1 <= 1) vC1_P4_2_1=true;
//        else if(mensaje.equals(""))mensaje = "PREGUNTA 4: DEBE INDICAR EL TIPO DE CONTROL DE SU EMPRESA";
//
//        valido = vC1_P0_1 && vC1_P0_2 && vC1_P0_3 && vC1_P1_1 &&
//                vC1_P1_2 && vC1_P2_1_1 && vC1_P2_1_2 && vC1_P2_2_1 &&
//                vC1_P2_2_2 && vC1_P3 && vC7_P1_0 && vC1_P4_1_1 && vC1_P4_2_1;
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
