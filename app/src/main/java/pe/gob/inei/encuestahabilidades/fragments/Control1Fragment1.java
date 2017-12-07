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
import pe.gob.inei.encuestahabilidades.pojos.Identificacion;
import pe.gob.inei.encuestahabilidades.pojos.Control1;

/**
 * A simple {@link Fragment} subclass.
 */
public class Control1Fragment1 extends Fragment {


    private RadioGroup con1_p1_rg;
    private RadioGroup con1_p2_rg;
    private Spinner con1_p3_sp1;
    private Spinner con1_p3_sp2;
    private Spinner con1_p3_sp3;
    private Spinner con1_p3_sp4;





    private Identificacion identificacion;


    private String idempresa;
    private Control1 control1;
    private Context context;
    private Data data;

    //mapeo de variables
    int C1_P1;
    int C1_P2;
    int C1_P3_1;
    int C1_P3_2;
    int C1_P3_3;
    int C1_P3_4;

    String C1_P0_1;int C1_P0_2;String C1_P0_3;

    int sp1;int sp2;int sp3;int sp4;
    int C1_P1_1;int C1_P1_2;String C1_P1_2_DETALLE;int C1_P2_1_1;int C1_P2_1_2;
    String C1_P2_1_2_DETALLE;int C1_P2_1_NO;String C1_P2_2_1;String C1_P2_2_2;String C1_P2_2_2_DETALLE;
    int C1_P2_2_NO;int C1_P3;String C1_P3_0;
    int C1_P4_1_1;int C1_P4_2_1;


    public Control1Fragment1() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Control1Fragment1(String idempresa, Context context) {
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

        View rootView = inflater.inflate(R.layout.fragment_control1_fragment1, container, false);


        ///ena
        con1_p1_rg  =(RadioGroup) rootView.findViewById(R.id.con1_p1_rg);
        con1_p2_rg  =(RadioGroup) rootView.findViewById(R.id.con1_p2_rg);

        con1_p3_sp1 = (Spinner) rootView.findViewById(R.id.con1_p3_sp1);
        con1_p3_sp2 = (Spinner) rootView.findViewById(R.id.con1_p3_sp2);
        con1_p3_sp3 = (Spinner) rootView.findViewById(R.id.con1_p3_sp3);
        con1_p3_sp4 = (Spinner) rootView.findViewById(R.id.con1_p3_sp4);

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
        if(data.existeControl1(idempresa)){
            //si existe traigo el objeto
            control1 = data.getControl1(idempresa);

            //pregunta 1
            int childPos1 = Integer.parseInt(control1.getC1_P1());
            ((RadioButton)con1_p1_rg.getChildAt(childPos1)).setChecked(true);
            //pregunta 2
            int childPos2 = Integer.parseInt(control1.getC1_P2());
            ((RadioButton)con1_p2_rg.getChildAt(childPos2)).setChecked(true);
            //pregunta 3
            con1_p3_sp1.setSelection(Integer.parseInt(control1.getC1_P3_1()));
            con1_p3_sp2.setSelection(Integer.parseInt(control1.getC1_P3_2()));
            con1_p3_sp3.setSelection(Integer.parseInt(control1.getC1_P3_3()));
            con1_p3_sp4.setSelection(Integer.parseInt(control1.getC1_P3_4()));

        }
        data.close();
    }
    public void llenarMapaVariables(){

        //pregunta 1
        int childPosP1 = con1_p1_rg.indexOfChild(con1_p1_rg.findViewById(con1_p1_rg.getCheckedRadioButtonId()));
        C1_P1 = childPosP1;
        //pregunta 2
        int childPosP2 = con1_p2_rg.indexOfChild(con1_p2_rg.findViewById(con1_p2_rg.getCheckedRadioButtonId()));
        C1_P2 = childPosP2;


        //pregunta 3
        C1_P3_1 = con1_p3_sp1.getSelectedItemPosition();
        C1_P3_2 = con1_p3_sp2.getSelectedItemPosition();
        C1_P3_3 = con1_p3_sp3.getSelectedItemPosition();
        C1_P3_4 = con1_p3_sp4.getSelectedItemPosition();

    }
    public void guardarDatos(){
        data = new Data(context);
        data.open();
        if(data.existeControl1(idempresa)){
            ContentValues contentValues = new ContentValues(20);
            contentValues.put(SQLConstantes.C1_P1,C1_P1+"");
            contentValues.put(SQLConstantes.C1_P2,C1_P2+"");
            contentValues.put(SQLConstantes.C1_P3_1,C1_P3_1+"");
            contentValues.put(SQLConstantes.C1_P3_2,C1_P3_2+"");
            contentValues.put(SQLConstantes.C1_P3_3,C1_P3_3+"");
            contentValues.put(SQLConstantes.C1_P3_4,C1_P3_4+"");
            data.actualizarControl1(idempresa,contentValues);
        }else{
            //si no existe el elemento, lo construye para insertarlo
            control1 = new Control1();
            //llena el objeto a insertar
            control1.setCONTROL1_ID(idempresa);
            control1.setC1_P1(C1_P1+"");
            control1.setC1_P2(C1_P2+"");
            control1.setC1_P3_1(C1_P3_1+"");
            control1.setC1_P3_2(C1_P3_2+"");
            control1.setC1_P3_3(C1_P3_3+"");
            control1.setC1_P3_4(C1_P3_4+"");
            data.insertarControl1(control1);
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
