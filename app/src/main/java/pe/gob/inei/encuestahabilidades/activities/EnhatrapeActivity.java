package pe.gob.inei.encuestahabilidades.activities;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.ExpandListAdapter;
import pe.gob.inei.encuestahabilidades.fragments.CaratulaFragment;
import pe.gob.inei.encuestahabilidades.fragments.InicioFragment;
import pe.gob.inei.encuestahabilidades.fragments.Modulo10Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Control1Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Control1Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Control2Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Control2Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Control3Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Control3Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Control4Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Control4Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Control5Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Control5Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Control6Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Control6Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Control7Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Control7Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment10;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment11;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment12;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment13;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment14;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment15;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment16;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment17;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment18;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment19;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment20;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment21;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment22;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment23;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment7;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment8;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment9;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment10;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment11;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment12;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment13;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment7;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment8;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment9;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo9Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.VisitaFragment1;
import pe.gob.inei.encuestahabilidades.fragments.VisitaFragment2;
import pe.gob.inei.encuestahabilidades.modelo.Data;
import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;
import pe.gob.inei.encuestahabilidades.pojos.BDFragment;
import pe.gob.inei.encuestahabilidades.pojos.Modulo1;
import pe.gob.inei.encuestahabilidades.pojos.Modulo2;
import pe.gob.inei.encuestahabilidades.pojos.Modulo3;
import pe.gob.inei.encuestahabilidades.pojos.Modulo4;
import pe.gob.inei.encuestahabilidades.pojos.Modulo5;
import pe.gob.inei.encuestahabilidades.pojos.Modulo6;
import pe.gob.inei.encuestahabilidades.pojos.Modulo7;
import pe.gob.inei.encuestahabilidades.pojos.Modulo8;
import pe.gob.inei.encuestahabilidades.pojos.Modulo9;
import pe.gob.inei.encuestahabilidades.pojos.OcupacionMod5P9;

public class EnhatrapeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ArrayList<String> listDataHeader;
    private ExpandableListView expListView;
    private HashMap<String, List<String>> listDataChild;
    private ExpandListAdapter listAdapter;
    private ViewPager pager;
    private Button btnAtras, btnSiguiente;
//    private MyPagerAdapter myPagerAdapter;
    private LinearLayout linearLayoutContainer;
    private int posicionFragment = 0;
    private Fragment fragmentActual = new Fragment();
    private Fragment fragmentSiguiente = new Fragment();
    private String idEmpresa = "";
    private Data data;
    private String observaciones = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhatrape);

        final Bundle recupera=getIntent().getExtras();
        if(recupera != null){
            idEmpresa = recupera.getString("idEmpresa");
        }

        data = new Data(this);
        data.open();
        String idInsertar = idEmpresa+0;
        if(!data.existeFragment(idInsertar)){
            ArrayList<BDFragment> bdFragments = new ArrayList<BDFragment>();
            BDFragment bdFragment = new BDFragment();
            for (int i = 0; i <= 67 ; i++) {
                bdFragment = new BDFragment(idEmpresa+i,"1","0");
                bdFragments.add(bdFragment);
            }
            data.insertarFragments(bdFragments);
        }
        data.close();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        btnAtras = (Button) findViewById(R.id.btn_anterior);
        btnSiguiente = (Button) findViewById(R.id.btn_siguiente);
        linearLayoutContainer = (LinearLayout) findViewById(R.id.container_encuesta_enhatrape);
        
//        pager = (ViewPager) findViewById(R.id.container_enhatrape);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocultarTeclado(btnAtras);
                if(posicionFragment - 1 >= 0){
                    data = new Data(getApplicationContext());
                    data.open();
                    int semaforo = 0;
                    posicionFragment--;
                    while(semaforo == 0){
                        BDFragment bdFragment = data.getFragment(idEmpresa+posicionFragment);
                        if(bdFragment.getFRAGMENT_HABILITADO().equals("1")){
                            semaforo = 1;
                        }else{
                            posicionFragment--;
                        }
                    }
                    setFragment(posicionFragment,-1);
                    data.close();
                }
//                launchHomeScreen();
//                int current = pager.getCurrentItem() - 1;
//                if (current > -1) {
//                    // move to next screen
//                    pager.setCurrentItem(current);}
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // checking for last page
                // if last page home screen will be launched
//                int current = pager.getCurrentItem() + 1;
//                if (current < myPagerAdapter.getCount()) {
//                    // move to next screen
//                    pager.setCurrentItem(current);}
                ocultarTeclado(btnSiguiente);
                if(posicionFragment + 1 <= 67){
                    if(validarFragment(posicionFragment)){
                        guardarFragment(posicionFragment);
                        guardarObservaciones(posicionFragment);
                        int semaforo = 0;
                        posicionFragment++;
                        data = new Data(getApplicationContext());
                        data.open();
                        while(semaforo == 0){
                            BDFragment bdFragment = data.getFragment(idEmpresa+posicionFragment);
                            if(bdFragment.getFRAGMENT_HABILITADO().equals("1")){
                                semaforo = 1;
                            }else{
                                posicionFragment++;
                            }
                        }

                        ContentValues contentValues = new ContentValues(1);
                        contentValues.put(SQLConstantes.FRAGMENT_AVANCE,"1");
                        data.actualizarFragment(idEmpresa+posicionFragment,contentValues);
                        data.close();
                        setFragment(posicionFragment,1);
                    }
                }else if(posicionFragment + 1 == 68){
                    if(validarFragment(posicionFragment)){
                        guardarFragment(posicionFragment);
                        posicionFragment = 2;
                        setFragment(posicionFragment,1);
                    }
                }
            }
        });

        setSupportActionBar(toolbar);
//        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
//        pager.setAdapter(myPagerAdapter);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        enableExpandableList();


//        pager.setCurrentItem(3);
        setFragment(0,1);
    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void guardarObservaciones(int tipo){
        data = new Data(EnhatrapeActivity.this);
                            data.open();
                            if(posicionFragment >= 4 && posicionFragment <= 5){

                                    ContentValues contentValues = new ContentValues(1);
                                    //contentValues.put(SQLConstantes.MODULO1_OBS_MOD_I,observaciones);
//                                    data.actualizarControl1(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 7 && posicionFragment <= 11){

                                    ContentValues contentValues = new ContentValues(1);
                                    //contentValues.put(SQLConstantes.MODULO2_OBS_MOD_II,observaciones);
 //                                   data.actualizarControl2(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 13 && posicionFragment <= 13){

                                    ContentValues contentValues = new ContentValues(1);
                                    //contentValues.put(SQLConstantes.MODULO3_OBS_MOD_III,observaciones);
 //                                   data.actualizarModulo3(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 15 && posicionFragment <= 16){

                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO4_OBS_MOD_IV,observaciones);
//                                    data.actualizarModulo4(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 18 && posicionFragment <= 39){

                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO5_OBS_MOD_V,observaciones);
//                                    data.actualizarModulo5(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 41 && posicionFragment <= 45){

                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO6_OBS_MOD_VI,observaciones);
//                                    data.actualizarModulo6(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 47 && posicionFragment <= 58){

                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO7_OBS_MOD_VII,observaciones);
//                                    data.actualizarModulo7(idEmpresa,contentValues);

                            }
                            if(posicionFragment >= 60 && posicionFragment <= 64){

                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO8_OBS_MOD_VIII,observaciones);
//                                    data.actualizarModulo8(idEmpresa,contentValues);

                            }
                            data.close();
    }
    public boolean validarFragment(int tipo){
        boolean correcto = false;
        switch (tipo){
            case 0:
                Control1Fragment1 Control1Fragment1 = (Control1Fragment1) fragmentActual;
                correcto = Control1Fragment1.validar();
                break;
            case 1:
                Control1Fragment2 Control1Fragment2= (Control1Fragment2) fragmentActual;
                correcto = Control1Fragment2.validar();
                break;
            case 2:
                Control2Fragment1 Control2Fragment1= (Control2Fragment1) fragmentActual;
                correcto = Control2Fragment1.validar();
                break;
            case 3:
                Control2Fragment2 Control2Fragment2 = (Control2Fragment2) fragmentActual;
                correcto = Control2Fragment2.validar();
                break;
            case 4:
                Control3Fragment1 Control3Fragment1 = (Control3Fragment1) fragmentActual;
                correcto = Control3Fragment1.validar();
                break;
            case 5:
                Control3Fragment2 Control3Fragment2 = (Control3Fragment2) fragmentActual;
                correcto = Control3Fragment2.validar();
                break;
            case 6:
                Control4Fragment1 Control4Fragment1 = (Control4Fragment1) fragmentActual;
                correcto = Control4Fragment1.validar();
                break;
            case 7:
                Control4Fragment2 Control4Fragment2 = (Control4Fragment2) fragmentActual;
                correcto = Control4Fragment2.validar();
                break;
            case 8:
                Control5Fragment1 Control5Fragment1 = (Control5Fragment1) fragmentActual;
                correcto = Control5Fragment1.validar();
                break;
            case 9:
                Control5Fragment2 Control5Fragment2 = (Control5Fragment2) fragmentActual;
                correcto = Control5Fragment2.validar();
                break;
            case 10:
                Control6Fragment1 Control6Fragment1 = (Control6Fragment1) fragmentActual;
                correcto = Control6Fragment1.validar();
                break;
            case 11:
                Control6Fragment2 Control6Fragment2 = (Control6Fragment2) fragmentActual;
                correcto = Control6Fragment2.validar();
                break;
            case 12:
                Control7Fragment1 Control7Fragment1 = (Control7Fragment1) fragmentActual;
                correcto = Control7Fragment1.validar();
                break;
            case 13:
                Control7Fragment2 Control7Fragment2 = (Control7Fragment2) fragmentActual;
                correcto = Control7Fragment2.validar();
                break;



        }
        return correcto;
    }

    public void guardarFragment(int tipo){
        switch (tipo){
//            case 0:
//                CaratulaFragment caratulaFragment = (CaratulaFragment) fragmentActual;
//                caratulaFragment.guardarDatos();break;
//            case 1:
//                VisitaFragment1 visitaFragment1 = (VisitaFragment1) fragmentActual;
//                visitaFragment1.guardarDatos();break;
//            case 2:
//                VisitaFragment2 visitaFragment2 = (VisitaFragment2) fragmentActual;
//                visitaFragment2.guardarDatos();break;
//            case 3:
//                InicioFragment inicioFragment = (InicioFragment) fragmentActual;
//                inicioFragment.guardarDatos();break;
            case 0:
                Control1Fragment1 Control1Fragment1 = (Control1Fragment1) fragmentActual;
                Control1Fragment1.guardarDatos();break;
            case 1:
                Control1Fragment2 Control1Fragment2 = (Control1Fragment2) fragmentActual;
                Control1Fragment2.guardarDatos();break;
            case 2:
                Control2Fragment1 Control2Fragment1= (Control2Fragment1) fragmentActual;
                Control2Fragment1.guardarDatos();break;
            case 3:
                Control2Fragment2 Control2Fragment2 = (Control2Fragment2) fragmentActual;
                Control2Fragment2.guardarDatos();break;
            case 4:
                Control3Fragment1 Control3Fragment1 = (Control3Fragment1) fragmentActual;
                Control3Fragment1.guardarDatos();break;
            case 5:
                Control3Fragment2 Control3Fragment2 = (Control3Fragment2) fragmentActual;
                Control3Fragment2.guardarDatos();break;
            case 6:
                Control4Fragment1 Control4Fragment1 = (Control4Fragment1) fragmentActual;
                Control4Fragment1.guardarDatos();break;
            case 7:
                Control4Fragment2 Control4Fragment2 = (Control4Fragment2) fragmentActual;
                Control4Fragment2.guardarDatos();break;
            case 8:
                Control5Fragment1 Control5Fragment1 = (Control5Fragment1) fragmentActual;
                Control5Fragment1.guardarDatos();break;
            case 9:
                Control5Fragment2 Control5Fragment2 = (Control5Fragment2) fragmentActual;
                Control5Fragment2.guardarDatos();break;
            case 10:
                Control6Fragment1 Control6Fragment1 = (Control6Fragment1) fragmentActual;
                Control6Fragment1.guardarDatos();break;
            case 11:
                Control6Fragment2 Control6Fragment2 = (Control6Fragment2) fragmentActual;
                Control6Fragment2.guardarDatos();break;
            case 12:
                Control7Fragment1 Control7Fragment1 = (Control7Fragment1) fragmentActual;
                Control7Fragment1.guardarDatos();break;
            case 13:
                Control7Fragment2 Control7Fragment2 = (Control7Fragment2) fragmentActual;
                Control7Fragment2.guardarDatos();break;

        }
    }

    public void setFragment(int pos,int direccion){
        observaciones = "";
        data = new Data(this);
        data.open();
        if(posicionFragment >= 4 && posicionFragment <= 6){
            //observaciones = data.getControl1(idEmpresa).getOBS_MOD_I();
        }
        if(posicionFragment >= 7 && posicionFragment <= 12){
            //observaciones = data.getModulo2(idEmpresa).getOBS_MOD_II();
        }
        if(posicionFragment >= 13 && posicionFragment <= 14){
         //   observaciones = data.getModulo3(idEmpresa).getOBS_MOD_III();
        }
        if(posicionFragment >= 15 && posicionFragment <= 17){
            observaciones = data.getModulo4(idEmpresa).getOBS_MOD_IV();
        }
        if(posicionFragment >= 18 && posicionFragment <= 40){
            observaciones = data.getModulo5(idEmpresa).getOBS_MOD_V();
        }
        if(posicionFragment >= 41 && posicionFragment <= 46){
            observaciones = data.getModulo6(idEmpresa).getOBS_MOD_VI();
        }
        if(posicionFragment >= 47 && posicionFragment <= 59){
            observaciones = data.getModulo7(idEmpresa).getOBS_MOD_VII();
        }
        if(posicionFragment >= 60 && posicionFragment <= 65){
            observaciones = data.getModulo8(idEmpresa).getOBS_MOD_VIII();
        }
        if(posicionFragment == 66){
            observaciones = data.getModulo9(idEmpresa).getOBS_MOD_IX();
        }
        if(posicionFragment == 67){
            observaciones = data.getModulo10(idEmpresa).getOBS_MOD_X();
        }
        data.close();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(direccion > 0){
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);
        }else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
        }

        switch (pos){
//            case 0:
//                fragmentActual = new CaratulaFragment(idEmpresa,this);
//                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
//                break;
//            case 1:
//                fragmentActual = new VisitaFragment1(idEmpresa,this);
//                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
//                break;
//            case 2:
//                fragmentActual = new VisitaFragment2(idEmpresa,this);
//                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
//                break;
//            case 3:
//                fragmentActual = new InicioFragment(idEmpresa,this);
//                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
//                break;
            case 0:
                fragmentActual = new Control1Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 1:
                fragmentActual = new Control1Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 2:
                fragmentActual = new Control2Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 3:
                fragmentActual = new Control2Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 4:
                fragmentActual = new Control3Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 5:
                fragmentActual = new Control3Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 6:
                fragmentActual = new Control4Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 7:
                fragmentActual = new Control4Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 8:
                fragmentActual = new Control5Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 9:
                fragmentActual = new Control5Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 10:
                fragmentActual = new Control6Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 11:
                fragmentActual = new Control6Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 12:
                fragmentActual = new Control7Fragment1(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;
            case 13:
                fragmentActual = new Control7Fragment2(idEmpresa,this);
                fragmentTransaction.replace(R.id.container_encuesta_enhatrape, fragmentActual);
                break;







        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.enhatrape, menu);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if(posicionFragment > 3 && posicionFragment!=6
                && posicionFragment!=12
                && posicionFragment!=14
                && posicionFragment!=17
                && posicionFragment!=40
                && posicionFragment!=46
                && posicionFragment!=59
                && posicionFragment!=65
                && posicionFragment!=66
                && posicionFragment!=67
                ) getMenuInflater().inflate(R.menu.enhatrape, menu);
        else getMenuInflater().inflate(R.menu.enhatrape_simple, menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final int id = item.getItemId();
        if (id == R.id.action_marco || id == R.id.action_marco_simple) {
            onBackPressed();
            return true;
        }
        if( id == R.id.action_observaciones){
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            final View dialogView = this.getLayoutInflater().inflate(R.layout.dialog_observaciones, null);
            LinearLayout lytObservaciones = dialogView.findViewById(R.id.dialog_lytObservaciones);
            final EditText edtObservaciones = dialogView.findViewById(R.id.dialog_edtObservaciones);
            dialog.setView(dialogView);
            dialog.setTitle("Observaciones");
            dialog.setPositiveButton("Guardar",null);
            dialog.setNegativeButton("Cancelar",null);
            final AlertDialog alertDialog = dialog.create();
            alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public void onShow(DialogInterface dialogInterface) {

                    edtObservaciones.setText(observaciones);
//                    data.close();
                    Button b = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                    b.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // TODO Do something
//                            data = new Data(EnhatrapeActivity.this);
//                            data.open();
//                            if(posicionFragment >= 4 && posicionFragment <= 6){
//                                if(!data.existeModulo1(idEmpresa)){
//                                    Modulo1 modulo1 = new Modulo1();
//                                    modulo1.setMODULO1_ID(idEmpresa);
//                                    modulo1.setOBS_MOD_I(edtObservaciones.getText().toString());
//                                    data.insertarModulo1(modulo1);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO1_OBS_MOD_I,observaciones);
//                                    data.actualizarModulo1(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 7 && posicionFragment <= 12){
//                                if(!data.existeModulo2(idEmpresa)){
//                                    Modulo2 modulo2 = new Modulo2();
//                                    modulo2.setOBS_MOD_II(edtObservaciones.getText().toString());
//                                    data.insertarModulo2(modulo2);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO2_OBS_MOD_II,observaciones);
//                                    data.actualizarModulo2(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 13 && posicionFragment <= 14){
//                                if(!data.existeModulo3(idEmpresa)){
//                                    Modulo3 modulo3 = new Modulo3();
//                                    modulo3.setOBS_MOD_III(edtObservaciones.getText().toString());
//                                    data.insertarModulo3(modulo3);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO3_OBS_MOD_III,observaciones);
//                                    data.actualizarModulo3(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 15 && posicionFragment <= 17){
//                                if(!data.existeModulo4(idEmpresa)){
//                                    Modulo4 modulo4 = new Modulo4();
//                                    modulo4.setOBS_MOD_IV(edtObservaciones.getText().toString());
//                                    data.insertarModulo4(modulo4);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO4_OBS_MOD_IV,observaciones);
//                                    data.actualizarModulo4(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 18 && posicionFragment <= 40){
//                                if(!data.existeModulo5(idEmpresa)){
//                                    Modulo5 modulo5 = new Modulo5();
//                                    modulo5.setOBS_MOD_V(edtObservaciones.getText().toString());
//                                    data.insertarModulo5(modulo5);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO5_OBS_MOD_V,observaciones);
//                                    data.actualizarModulo5(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 41 && posicionFragment <= 46){
//                                if(!data.existeModulo6(idEmpresa)){
//                                    Modulo6 modulo6 = new Modulo6();
//                                    modulo6.setOBS_MOD_VI(edtObservaciones.getText().toString());
//                                    data.insertarModulo6(modulo6);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO6_OBS_MOD_VI,observaciones);
//                                    data.actualizarModulo6(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 47 && posicionFragment <= 59){
//                                if(!data.existeModulo7(idEmpresa)){
//                                    Modulo7 modulo7 = new Modulo7();
//                                    modulo7.setOBS_MOD_VII(edtObservaciones.getText().toString());
//                                    data.insertarModulo7(modulo7);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO7_OBS_MOD_VII,observaciones);
//                                    data.actualizarModulo7(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment >= 60 && posicionFragment <= 65){
//                                if(!data.existeModulo8(idEmpresa)){
//                                    Modulo8 modulo8 = new Modulo8();
//                                    modulo8.setOBS_MOD_VIII(edtObservaciones.getText().toString());
//                                    data.insertarModulo8(modulo8);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO8_OBS_MOD_VIII,observaciones);
//                                    data.actualizarModulo8(idEmpresa,contentValues);
//                                }
//                            }
//                            if(posicionFragment == 66){
//                                if(!data.existeModulo9(idEmpresa)){
//                                    Modulo9 modulo9 = new Modulo9();
//                                    modulo9.setOBS_MOD_IX(edtObservaciones.getText().toString());
//                                    data.insertarModulo9(modulo9);
//                                }else{
//                                    ContentValues contentValues = new ContentValues(1);
//                                    contentValues.put(SQLConstantes.MODULO9_OBS_MOD_IX,observaciones);
//                                    data.actualizarModulo9(idEmpresa,contentValues);
//                                }
//                            }
//                            data.close();
                            observaciones = edtObservaciones.getText().toString();
                            alertDialog.dismiss();
                        }
                    });
                }
            });
            alertDialog.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void enableExpandableList() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        expListView = (ExpandableListView) findViewById(R.id.left_drawer);

        prepareListData(listDataHeader, listDataChild);
        listAdapter = new ExpandListAdapter(this, listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);

        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });


        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                // Temporary code:

                // till here
//                Toast.makeText(
//                        getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition)+ "\n"+groupPosition, Toast.LENGTH_SHORT)
//                        .show();
                int posicion = 0;
                switch (groupPosition){
                    case 0:
                        switch (childPosition){
                            case 0:setFragment(childPosition,1);posicionFragment = childPosition;break;
                            case 1:
//                                data = new Data(getApplicationContext());
//                                data.open();
//                                if(data.getFragment(idEmpresa + childPosition).getFRAGMENT_AVANCE().equals("1")){
                                posicionFragment = childPosition;setFragment(childPosition,1);

//                                }else{Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();}
//                                data.close();
                                break;
                            case 2:
//                                data = new Data(getApplicationContext());
//                                data.open();
//                                if(data.getFragment(idEmpresa + childPosition).getFRAGMENT_AVANCE().equals("1")){
                                posicionFragment = childPosition;setFragment(childPosition,1);

//                                }else{
//                                    Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                                }
//                                data.close();
                                break;
                            case 3:
//                                data = new Data(getApplicationContext());
//                                data.open();
//                                if(data.getFragment(idEmpresa + childPosition).getFRAGMENT_AVANCE().equals("1")){
                                posicionFragment = childPosition;setFragment(childPosition,1);

//                                }else{
//                                    Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                                }
//                                data.close();
                                break;
                        }
                        break;
                    case 1:
                        posicion = childPosition + 4;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 2:
                        posicion = childPosition + 7;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 3:
                        posicion = childPosition + 13;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 4:
                        posicion = childPosition + 15;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 5:
                        posicion = childPosition + 18;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 6:
                        posicion = childPosition + 41;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 7:
                        posicion = childPosition + 47;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 8:
                        posicion = childPosition + 60;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 9:
                        posicion = childPosition + 66;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                    case 10:
                        posicion = childPosition + 67;
//                        data = new Data(getApplicationContext());
//                        data.open();
//                        if(data.getFragment(idEmpresa + posicion).getFRAGMENT_AVANCE().equals("1")){
                        posicionFragment = posicion;setFragment(posicion,1);
//                        }else{
//                            Toast.makeText(EnhatrapeActivity.this, "Aún no puede pasar a esta pantalla", Toast.LENGTH_SHORT).show();
//                        }
//                        data.close();
                        break;
                }
                return false;
            }
        });
    }


    @SuppressLint("NewApi")
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Está seguro que desea volver al marco y salir de la encuesta?")
                    .setTitle("Aviso")
                    .setCancelable(false)
                    .setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            })
                    .setPositiveButton("Sí",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    finish();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
        }
        return super.onKeyDown(keyCode, event);
    }

    private void prepareListData(List<String> listDataHeader, Map<String, List<String>> listDataChild) {

        // Adding child data
        //listDataHeader.add("INICIO");
        listDataHeader.add("CONTROL I");listDataHeader.add("CONTROL II");listDataHeader.add("CONTROL III");
        listDataHeader.add("CONTROL IV");listDataHeader.add("CONTROL V");listDataHeader.add("CONTROL VI");
        listDataHeader.add("CONTROL VII");listDataHeader.add("EVALUACIÓN I");listDataHeader.add("EVALUACIÓN II");
        listDataHeader.add("EVALUACIÓN III");
        // Adding child data
        List<String> inicio = new ArrayList<String>();
        inicio.add("Carátula");inicio.add("Datos de la Entrevista");
        inicio.add("Control de Visitas");inicio.add("Identificación de la empresa");

//        List<String> modulo1 = new ArrayList<String>();
//        modulo1.add("Módulo I: P1 - P4");modulo1.add("Módulo I: P5 - P7");modulo1.add("Módulo I: P8 - P12");
//
//        List<String> modulo2 = new ArrayList<String>();
//        modulo2.add("Módulo II: P1 - P5");modulo2.add("Módulo II: P6 - P13");modulo2.add("Módulo II: P14 - P17");
//        modulo2.add("Módulo II: P18 - P19");modulo2.add("Módulo II: P20 - P22");modulo2.add("Módulo II: P23 - P25");
//
//        List<String> modulo3 = new ArrayList<String>();
//        modulo3.add("Módulo III: P1 - P6");modulo3.add("Módulo III: P7 - P12");
//
//        List<String> modulo4 = new ArrayList<String>();
//        modulo4.add("Módulo IV: P1 - P3");modulo4.add("Módulo IV: P4 - P7");modulo4.add("Módulo IV: P8 - P10");
//
//        List<String> modulo5 = new ArrayList<String>();
//        modulo5.add("Módulo V: P1");modulo5.add("Módulo V: P2");modulo5.add("Módulo V: P3 - P5");
//        modulo5.add("Módulo V: P6 - P8");modulo5.add("Módulo V: P9");modulo5.add("Módulo V: P10");
//        modulo5.add("Módulo V: P11");modulo5.add("Módulo V: P12");modulo5.add("Módulo V: P13");
//        modulo5.add("Módulo V: P14");modulo5.add("Módulo V: P15");modulo5.add("Módulo V: P16");
//        modulo5.add("Módulo V: P17");modulo5.add("Módulo V: P18");modulo5.add("Módulo V: P19");
//        modulo5.add("Módulo V: P20");modulo5.add("Módulo V: P21");modulo5.add("Módulo V: P22");
//        modulo5.add("Módulo V: P23");modulo5.add("Módulo V: P24");modulo5.add("Módulo V: P25");
//        modulo5.add("Módulo V: P26");modulo5.add("Módulo V: P27");
//
//        List<String> modulo6 = new ArrayList<String>();
//        modulo6.add("Módulo VI: P1 - P3");modulo6.add("Módulo VI: P4");modulo6.add("Módulo VI: P5");
//        modulo6.add("Módulo VI: P6");modulo6.add("Módulo VI: P7 - P8");modulo6.add("Módulo VI: P9 - P10");
//
//        List<String> modulo7 = new ArrayList<String>();
//        modulo7.add("Módulo VII: P1 - P4");modulo7.add("Módulo VII: P5 - P7");modulo7.add("Módulo VII: P8");
//        modulo7.add("Módulo VII: P9");modulo7.add("Módulo VII: P10 - P14");modulo7.add("Módulo VII: P15 - P17");
//        modulo7.add("Módulo VII: P18");modulo7.add("Módulo VII: P19");modulo7.add("Módulo VII: P20 - P33");
//        modulo7.add("Módulo VII: P34 - P36");modulo7.add("Módulo VII: P37 - P39");
//        modulo7.add("Módulo VII: P40 - P43");modulo7.add("Módulo VII: P44 - P46");
//
//        List<String> modulo8 = new ArrayList<String>();
//        modulo8.add("Módulo VIII: Inteligencia Artificial/Aprendizaje Automático");modulo8.add("Módulo VIII: Robótica Avanzada");
//        modulo8.add("Módulo VIII: Transporte Autónomo");modulo8.add("Módulo VIII: Manufactura Avanzada");
//        modulo8.add("Módulo VIII: Producción con impresión en 3D");modulo8.add("Módulo VIII: Servicios Avanzados en Redes (Computacion en la nube, BIG DATA)");
//
//        List<String> modulo9 = new ArrayList<String>();
//        modulo9.add("Módulo IX: P1 - P2");
//
//        List<String> modulo10 = new ArrayList<String>();
//        modulo10.add("Módulo X: P1 - P4");

//        listDataChild.put(listDataHeader.get(0), inicio);// Header, Child data
//        listDataChild.put(listDataHeader.get(1), modulo1);
//        listDataChild.put(listDataHeader.get(2), modulo2);
//        listDataChild.put(listDataHeader.get(3), modulo3);
//        listDataChild.put(listDataHeader.get(4), modulo4);
//        listDataChild.put(listDataHeader.get(5), modulo5);
//        listDataChild.put(listDataHeader.get(6), modulo6);
//        listDataChild.put(listDataHeader.get(7), modulo7);
//        listDataChild.put(listDataHeader.get(8), modulo8);
//        listDataChild.put(listDataHeader.get(9), modulo9);
//        listDataChild.put(listDataHeader.get(10), modulo10);
        List<String> control1 = new ArrayList<String>();
        control1.add("Control I: P1 - P3");control1.add("Control I: P4");

        List<String> control2 = new ArrayList<String>();
        control2.add("Control II: P1");control2.add("Control II: P2");

        List<String> control3 = new ArrayList<String>();
        control3.add("Control III: P1");control3.add("Control III: P2");

        List<String> control4 = new ArrayList<String>();
        control4.add("Control IV: P1");control4.add("Control IV: P2");

        List<String> control5 = new ArrayList<String>();
        control5.add("Control V: P1");control5.add("Control V: P2");

        List<String> control6 = new ArrayList<String>();
        control6.add("Control VI: P1");control6.add("Control VI: P2");

        List<String> control7 = new ArrayList<String>();
        control7.add("Control VII: P1");control7.add("Control VII: P2");

        List<String> evaluacion1 = new ArrayList<String>();
        evaluacion1.add("Evaluacion I: P1 - P3");evaluacion1.add("Evaluacion I: P4 - P5");

        List<String> evaluacion2 = new ArrayList<String>();
        evaluacion2.add("Evaluacion II: P1 - P2");

        List<String> evaluacion3 = new ArrayList<String>();
        evaluacion3.add("Evaluacion III: P1 - P2");
        listDataChild.put(listDataHeader.get(0), control1);
        listDataChild.put(listDataHeader.get(1), control2);
        listDataChild.put(listDataHeader.get(2), control3);
        listDataChild.put(listDataHeader.get(3), control4);
        listDataChild.put(listDataHeader.get(4), control5);
        listDataChild.put(listDataHeader.get(5), control6);
        listDataChild.put(listDataHeader.get(6), control7);
        listDataChild.put(listDataHeader.get(7), evaluacion1);
        listDataChild.put(listDataHeader.get(8), evaluacion2);
        listDataChild.put(listDataHeader.get(9), evaluacion3);
    }

//    private class MyPagerAdapter extends FragmentPagerAdapter {
//
//        public MyPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int pos) {
//
//            switch(pos) {
//                case 0: return new InicioFragment();
//                case 1: return new CaratulaFragment();
//                case 2: return new VisitaFragment2();
//
//                case 3: return new Control1Fragment1();
//                case 4: return new Control1Fragment2();
//                case 5: return new Modulo1Fragment3();
//
//                case 6: return new Modulo2Fragment1();
//                case 7: return new Modulo2Fragment2();
//                case 8: return new Modulo2Fragment3();
//                case 9: return new Modulo2Fragment4();
//                case 10: return new Modulo2Fragment5();
//                case 11: return new Modulo2Fragment6();
//
//                case 12: return new Modulo3Fragment1();
//                case 13: return new Modulo3Fragment2();
//
//                case 14: return new Modulo4Fragment1();
//                case 15: return new Modulo4Fragment2();
//                case 16: return new Modulo4Fragment3();
//
//                case 17: return new Modulo5Fragment1();
//                case 18: return new Modulo5Fragment2();
//                case 19: return new Modulo5Fragment3();
//                case 20: return new Modulo5Fragment4();
//                case 21: return new Modulo5Fragment5();
//                case 22: return new Modulo5Fragment6();
//                case 23: return new Modulo5Fragment7();
//                case 24: return new Modulo5Fragment8();
//                case 25: return new Modulo5Fragment9();
//                case 26: return new Modulo5Fragment10();
//                case 27: return new Modulo5Fragment11();
//                case 28: return new Modulo5Fragment12();
//                case 29: return new Modulo5Fragment13();
//                case 30: return new Modulo5Fragment14();
//                case 31: return new Modulo5Fragment15();
//                case 32: return new Modulo5Fragment16();
//                case 33: return new Modulo5Fragment17();
//                case 34: return new Modulo5Fragment18();
//                case 35: return new Modulo5Fragment19();
//                case 36: return new Modulo5Fragment20();
//                case 37: return new Modulo5Fragment21();
//                case 38: return new Modulo5Fragment22();
//                case 39: return new Modulo5Fragment23();
//
//                case 40: return new Modulo6Fragment1();
//                case 41: return new Modulo6Fragment2();
//                case 42: return new Modulo6Fragment3();
//                case 43: return new Modulo6Fragment4();
//                case 44: return new Modulo6Fragment5();
//                case 45: return new Modulo6Fragment6();
//
//                case 46: return new Modulo7Fragment1();
//                case 47: return new Modulo7Fragment2();
//                case 48: return new Modulo7Fragment3();
//                case 49: return new Modulo7Fragment4();
//                case 50: return new Modulo7Fragment5();
//                case 51: return new Modulo7Fragment6();
//                case 52: return new Modulo7Fragment7();
//                case 53: return new Modulo7Fragment8();
//                case 54: return new Modulo7Fragment9();
//                case 55: return new Modulo7Fragment10();
//                case 56: return new Modulo7Fragment11();
//                case 57: return new Modulo7Fragment12();
//                case 58: return new Modulo7Fragment13();
//                case 59: return new Modulo7Fragment10();
//                case 60: return new Modulo7Fragment11();
//                case 61: return new Modulo7Fragment12();
//                case 62: return new Modulo7Fragment13();
//
//                case 63: return new Modulo8Fragment1();
//                case 64: return new Modulo8Fragment2();
//                case 65: return new Modulo8Fragment3();
//                case 66: return new Modulo8Fragment4();
//                case 67: return new Modulo8Fragment5();
//                case 68: return new Modulo8Fragment6();
//
//                case 69: return new Modulo9Fragment1();
//
//                default: return new InicioFragment();
//            }
//        }
//
//        @Override
//        public int getCount() {
//            return 70;
//        }
//
//        public void setFragment(int pos){
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            switch (pos){
//                case 0:
//                    CaratulaFragment caratulaFragment = new CaratulaFragment();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, caratulaFragment);
//                    break;
//                case 1:
//                    VisitaFragment2 visitaFragment = new VisitaFragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, visitaFragment);
//                    break;
//                case 2:
//                    InicioFragment inicioFragment = new InicioFragment();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, inicioFragment);
//                    break;
//                case 3:
//                    Control1Fragment1 Control1Fragment1 = new Control1Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, Control1Fragment1);
//                    break;
//                case 4:
//                    Control1Fragment2 Control1Fragment2= new Control1Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, Control1Fragment2);
//                    break;
//                case 5:
//                    Modulo1Fragment3 modulo1Fragment3= new Modulo1Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo1Fragment3);
//                    break;
//                case 6:
//                    Modulo2Fragment1 modulo2Fragment1= new Modulo2Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment1);
//                    break;
//                case 7:
//                    Modulo2Fragment2 modulo2Fragment2 = new Modulo2Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment2);
//                    break;
//                case 8:
//                    Modulo2Fragment3 modulo2Fragment3 = new Modulo2Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment3);
//                    break;
//                case 9:
//                    Modulo2Fragment4 modulo2Fragment4 = new Modulo2Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment4);
//                    break;
//                case 10:
//                    Modulo2Fragment5 modulo2Fragment5 = new Modulo2Fragment5();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment5);
//                    break;
//                case 11:
//                    Modulo2Fragment6 modulo2Fragment6 = new Modulo2Fragment6();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo2Fragment6);
//                    break;
//                case 12:
//                    Modulo3Fragment1 modulo3Fragment1 = new Modulo3Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo3Fragment1);
//                    break;
//                case 13:
//                    Modulo3Fragment2 modulo3Fragment2 = new Modulo3Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo3Fragment2);
//                    break;
//                case 15:
//                    Modulo4Fragment1 modulo4Fragment1 = new Modulo4Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo4Fragment1);
//                    break;
//                case 16:
//                    Modulo4Fragment2 modulo4Fragment2 = new Modulo4Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo4Fragment2);
//                    break;
//                case 17:
//                    Modulo4Fragment3 modulo4Fragment3 = new Modulo4Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo4Fragment3);
//                    break;
//                case 18:
//                    Modulo5Fragment1 modulo5Fragment1 = new Modulo5Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment1);
//                    break;
//                case 19:
//                    Modulo5Fragment2 modulo5Fragment2 = new Modulo5Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment2);
//                    break;
//                case 20:
//                    Modulo5Fragment3 modulo5Fragment3 = new Modulo5Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment3);
//                    break;
//                case 21:
//                    Modulo5Fragment4 modulo5Fragment4 = new Modulo5Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment4);
//                    break;
//                case 22:
//                    Modulo5Fragment5 modulo5Fragment5 = new Modulo5Fragment5();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment5);
//                    break;
//                case 23:
//                    Modulo5Fragment6 modulo5Fragment6 = new Modulo5Fragment6();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo5Fragment6);
//                    break;
//                case 24:
//                    Modulo6Fragment1 modulo6Fragment1 = new Modulo6Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo6Fragment1);
//                    break;
//                case 25:
//                    Modulo6Fragment2 modulo6Fragment2 = new Modulo6Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo6Fragment2);
//                    break;
//                case 26:
//                    Modulo6Fragment3 modulo6Fragment3 = new Modulo6Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo6Fragment3);
//                    break;
//                case 27:
//                    Modulo6Fragment4 modulo6Fragment4 = new Modulo6Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo6Fragment4);
//                    break;
//                case 28:
//                    Modulo7Fragment1 modulo7Fragment1 = new Modulo7Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment1);
//                    break;
//                case 29:
//                    Modulo7Fragment2 modulo7Fragment2 = new Modulo7Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment2);
//                    break;
//                case 30:
//                    Modulo7Fragment3 modulo7Fragment3 = new Modulo7Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment3);
//                    break;
//                case 31:
//                    Modulo7Fragment4 modulo7Fragment4 = new Modulo7Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment4);
//                    break;
//                case 32:
//                    Modulo7Fragment5 modulo7Fragment5 = new Modulo7Fragment5();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment5);
//                    break;
//                case 33:
//                    Modulo7Fragment6 modulo7Fragment6 = new Modulo7Fragment6();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment6);
//                    break;
//                case 34:
//                    Modulo7Fragment7 modulo7Fragment7 = new Modulo7Fragment7();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment7);
//                    break;
//                case 35:
//                    Modulo7Fragment8 modulo7Fragment8 = new Modulo7Fragment8();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment8);
//                    break;
//                case 36:
//                    Modulo7Fragment9 modulo7Fragment9 = new Modulo7Fragment9();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment9);
//                    break;
//                case 37:
//                    Modulo7Fragment10 modulo7Fragment10 = new Modulo7Fragment10();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment10);
//                    break;
//                case 38:
//                    Modulo7Fragment11 modulo7Fragment11 = new Modulo7Fragment11();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment11);
//                    break;
//                case 39:
//                    Modulo7Fragment12 modulo7Fragment12 = new Modulo7Fragment12();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment12);
//                    break;
//                case 40:
//                    Modulo7Fragment13 modulo7Fragment13 = new Modulo7Fragment13();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment13);
//                    break;
//                case 41:
//                    Modulo7Fragment10 modulo7Fragment14 = new Modulo7Fragment10();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment14);
//                    break;
//                case 42:
//                    Modulo7Fragment11 modulo7Fragment15 = new Modulo7Fragment11();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment15);
//                    break;
//                case 43:
//                    Modulo7Fragment12 modulo7Fragment16 = new Modulo7Fragment12();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment16);
//                    break;
//                case 44:
//                    Modulo7Fragment13 modulo7Fragment17 = new Modulo7Fragment13();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo7Fragment17);
//                    break;
//                case 45:
//                    Modulo8Fragment1 modulo8Fragment1 = new Modulo8Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment1);
//                    break;
//                case 46:
//                    Modulo8Fragment2 modulo8Fragment2 = new Modulo8Fragment2();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment2);
//                    break;
//                case 47:
//                    Modulo8Fragment3 modulo8Fragment3 = new Modulo8Fragment3();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment3);
//                    break;
//                case 48:
//                    Modulo8Fragment4 modulo8Fragment4 = new Modulo8Fragment4();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment4);
//                    break;
//                case 49:
//                    Modulo8Fragment5 modulo8Fragment5 = new Modulo8Fragment5();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment5);
//                    break;
//                case 50:
//                    Modulo8Fragment6 modulo8Fragment6 = new Modulo8Fragment6();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo8Fragment6);
//                    break;
//                case 52:
//                    Modulo9Fragment1 modulo9Fragment1 = new Modulo9Fragment1();
//                    fragmentTransaction.replace(R.id.container_encuesta_enhatrape, modulo9Fragment1);
//                    break;
//            }
//            fragmentTransaction.commit();
//        }
//    }
}
