package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Evaluacion1 {
    private String EVALUACION1_ID;
    private String E1_P1;
    private String E1_P2;
    private String E1_P3_1;
    private String E1_P3_2;
    private String E1_P3_3;
    private String E1_P3_4;
    private String E1_P4;
    private String E1_P5_1;
    private String E1_P5_2;
    private String E1_P5_3;
    private String E1_P5_4;
    private String E1_P5_5;
    private String E1_P5_6;
    private String E1_P5_7;
    private String E1_P5_8;
    private String E1_P5_9;
    private String E1_P5_10;
    private String E1_P5_11;




    public Evaluacion1(){
        EVALUACION1_ID = "";
        E1_P1 = "";
        E1_P2 = "";
        E1_P3_1 = "";
        E1_P3_2 = "";
        E1_P3_3 = "";
        E1_P3_4 = "";
        E1_P4 = "";
        E1_P5_1 = "";
        E1_P5_2 = "";
        E1_P5_3 = "";
        E1_P5_4 = "";
        E1_P5_5 = "";
        E1_P5_6 = "";
        E1_P5_7 = "";
        E1_P5_8 = "";
        E1_P5_9 = "";
        E1_P5_10 = "";
        E1_P5_11 = "";


    }

    public Evaluacion1(String EVALUACION1_ID, String e1_P1, String e1_P2, String e1_P3_1, String e1_P3_2, String e1_P3_3, String e1_P3_4, String e1_P4, String e1_P5_1, String e1_P5_2, String e1_P5_3, String e1_P5_4, String e1_P5_5, String e1_P5_6, String e1_P5_7, String e1_P5_8, String e1_P5_9, String e1_P5_10, String e1_P5_11) {
        this.EVALUACION1_ID = EVALUACION1_ID;
        E1_P1 = e1_P1;
        E1_P2 = e1_P2;
        E1_P3_1 = e1_P3_1;
        E1_P3_2 = e1_P3_2;
        E1_P3_3 = e1_P3_3;
        E1_P3_4 = e1_P3_4;
        E1_P4 = e1_P4;
        E1_P5_1 = e1_P5_1;
        E1_P5_2 = e1_P5_2;
        E1_P5_3 = e1_P5_3;
        E1_P5_4 = e1_P5_4;
        E1_P5_5 = e1_P5_5;
        E1_P5_6 = e1_P5_6;
        E1_P5_7 = e1_P5_7;
        E1_P5_8 = e1_P5_8;
        E1_P5_9 = e1_P5_9;
        E1_P5_10 = e1_P5_10;
        E1_P5_11 = e1_P5_11;
    }

    public String getEVALUACION1_ID() {
        return EVALUACION1_ID;
    }

    public void setEVALUACION1_ID(String EVALUACION1_ID) {
        this.EVALUACION1_ID = EVALUACION1_ID;
    }

    public String getE1_P1() {
        return E1_P1;
    }

    public void setE1_P1(String e1_P1) {
        E1_P1 = e1_P1;
    }

    public String getE1_P2() {
        return E1_P2;
    }

    public void setE1_P2(String e1_P2) {
        E1_P2 = e1_P2;
    }

    public String getE1_P3_1() {
        return E1_P3_1;
    }

    public void setE1_P3_1(String e1_P3_1) {
        E1_P3_1 = e1_P3_1;
    }

    public String getE1_P3_2() {
        return E1_P3_2;
    }

    public void setE1_P3_2(String e1_P3_2) {
        E1_P3_2 = e1_P3_2;
    }

    public String getE1_P3_3() {
        return E1_P3_3;
    }

    public void setE1_P3_3(String e1_P3_3) {
        E1_P3_3 = e1_P3_3;
    }

    public String getE1_P3_4() {
        return E1_P3_4;
    }

    public void setE1_P3_4(String e1_P3_4) {
        E1_P3_4 = e1_P3_4;
    }

    public String getE1_P4() {
        return E1_P4;
    }

    public void setE1_P4(String e1_P4) {
        E1_P4 = e1_P4;
    }

    public String getE1_P5_1() {
        return E1_P5_1;
    }

    public void setE1_P5_1(String e1_P5_1) {
        E1_P5_1 = e1_P5_1;
    }

    public String getE1_P5_2() {
        return E1_P5_2;
    }

    public void setE1_P5_2(String e1_P5_2) {
        E1_P5_2 = e1_P5_2;
    }

    public String getE1_P5_3() {
        return E1_P5_3;
    }

    public void setE1_P5_3(String e1_P5_3) {
        E1_P5_3 = e1_P5_3;
    }

    public String getE1_P5_4() {
        return E1_P5_4;
    }

    public void setE1_P5_4(String e1_P5_4) {
        E1_P5_4 = e1_P5_4;
    }

    public String getE1_P5_5() {
        return E1_P5_5;
    }

    public void setE1_P5_5(String e1_P5_5) {
        E1_P5_5 = e1_P5_5;
    }

    public String getE1_P5_6() {
        return E1_P5_6;
    }

    public void setE1_P5_6(String e1_P5_6) {
        E1_P5_6 = e1_P5_6;
    }

    public String getE1_P5_7() {
        return E1_P5_7;
    }

    public void setE1_P5_7(String e1_P5_7) {
        E1_P5_7 = e1_P5_7;
    }

    public String getE1_P5_8() {
        return E1_P5_8;
    }

    public void setE1_P5_8(String e1_P5_8) {
        E1_P5_8 = e1_P5_8;
    }

    public String getE1_P5_9() {
        return E1_P5_9;
    }

    public void setE1_P5_9(String e1_P5_9) {
        E1_P5_9 = e1_P5_9;
    }

    public String getE1_P5_10() {
        return E1_P5_10;
    }

    public void setE1_P5_10(String e1_P5_10) {
        E1_P5_10 = e1_P5_10;
    }

    public String getE1_P5_11() {
        return E1_P5_11;
    }

    public void setE1_P5_11(String e1_P5_11) {
        E1_P5_11 = e1_P5_11;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.E1_ID,EVALUACION1_ID);
        contentValues.put(SQLConstantes.E1_P1,E1_P1);
        contentValues.put(SQLConstantes.E1_P2,E1_P2);
        contentValues.put(SQLConstantes.E1_P3_1,E1_P3_1);
        contentValues.put(SQLConstantes.E1_P3_2,E1_P3_2);
        contentValues.put(SQLConstantes.E1_P3_3,E1_P3_3);
        contentValues.put(SQLConstantes.E1_P3_4,E1_P3_4);
        contentValues.put(SQLConstantes.E1_P4,E1_P4);
        contentValues.put(SQLConstantes.E1_P5_1,E1_P5_1);
        contentValues.put(SQLConstantes.E1_P5_2,E1_P5_2);
        contentValues.put(SQLConstantes.E1_P5_3,E1_P5_3);
        contentValues.put(SQLConstantes.E1_P5_4,E1_P5_4);
        contentValues.put(SQLConstantes.E1_P5_5,E1_P5_5);
        contentValues.put(SQLConstantes.E1_P5_6,E1_P5_6);
        contentValues.put(SQLConstantes.E1_P5_7,E1_P5_7);
        contentValues.put(SQLConstantes.E1_P5_8,E1_P5_8);
        contentValues.put(SQLConstantes.E1_P5_9,E1_P5_9);
        contentValues.put(SQLConstantes.E1_P5_10,E1_P5_10);
        contentValues.put(SQLConstantes.E1_P5_11,E1_P5_11);
        return contentValues;

    }


}
