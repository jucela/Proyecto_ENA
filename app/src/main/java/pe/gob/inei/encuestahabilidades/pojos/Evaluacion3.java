package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Evaluacion3 {
    private String EVALUACION3_ID;
    private String E3_P1;
    private String E3_P2;
    private String E3_P3_1;
    private String E3_P3_2;
    private String E3_P3_3;
    private String E3_P3_4;
    private String E3_P4_1;
    private String E3_P4_2;
    private String E3_P4_3;
    private String E3_P4_4;
    private String E3_P4_5;
    private String E3_P4_6;
    private String E3_P4_7;
    private String E3_P4_8;
    private String E3_P4_9;
    private String E3_P4_10;



    public Evaluacion3(){
        EVALUACION3_ID = "";
        E3_P1 = "";
        E3_P2 = "";
        E3_P3_1 = "";
        E3_P3_2 = "";
        E3_P3_3 = "";
        E3_P3_4 = "";
        E3_P4_1 = "";
        E3_P4_2 = "";
        E3_P4_3 = "";
        E3_P4_4 = "";
        E3_P4_5 = "";
        E3_P4_6 = "";
        E3_P4_7 = "";
        E3_P4_8 = "";
        E3_P4_9 = "";
        E3_P4_10 = "";

    }

    public Evaluacion3(String EVALUACION3_ID, String e3_P1, String e3_P2, String e3_P3_1, String e3_P3_2, String e3_P3_3, String e3_P3_4, String e3_P4_1, String e3_P4_2, String e3_P4_3, String e3_P4_4, String e3_P4_5, String e3_P4_6, String e3_P4_7, String e3_P4_8, String e3_P4_9, String e3_P4_10) {
        this.EVALUACION3_ID = EVALUACION3_ID;
        E3_P1 = e3_P1;
        E3_P2 = e3_P2;
        E3_P3_1 = e3_P3_1;
        E3_P3_2 = e3_P3_2;
        E3_P3_3 = e3_P3_3;
        E3_P3_4 = e3_P3_4;
        E3_P4_1 = e3_P4_1;
        E3_P4_2 = e3_P4_2;
        E3_P4_3 = e3_P4_3;
        E3_P4_4 = e3_P4_4;
        E3_P4_5 = e3_P4_5;
        E3_P4_6 = e3_P4_6;
        E3_P4_7 = e3_P4_7;
        E3_P4_8 = e3_P4_8;
        E3_P4_9 = e3_P4_9;
        E3_P4_10 = e3_P4_10;
    }

    public String getEVALUACION3_ID() {
        return EVALUACION3_ID;
    }

    public void setEVALUACION3_ID(String EVALUACION3_ID) {
        this.EVALUACION3_ID = EVALUACION3_ID;
    }

    public String getE3_P1() {
        return E3_P1;
    }

    public void setE3_P1(String e3_P1) {
        E3_P1 = e3_P1;
    }

    public String getE3_P2() {
        return E3_P2;
    }

    public void setE3_P2(String e3_P2) {
        E3_P2 = e3_P2;
    }

    public String getE3_P3_1() {
        return E3_P3_1;
    }

    public void setE3_P3_1(String e3_P3_1) {
        E3_P3_1 = e3_P3_1;
    }

    public String getE3_P3_2() {
        return E3_P3_2;
    }

    public void setE3_P3_2(String e3_P3_2) {
        E3_P3_2 = e3_P3_2;
    }

    public String getE3_P3_3() {
        return E3_P3_3;
    }

    public void setE3_P3_3(String e3_P3_3) {
        E3_P3_3 = e3_P3_3;
    }

    public String getE3_P3_4() {
        return E3_P3_4;
    }

    public void setE3_P3_4(String e3_P3_4) {
        E3_P3_4 = e3_P3_4;
    }

    public String getE3_P4_1() {
        return E3_P4_1;
    }

    public void setE3_P4_1(String e3_P4_1) {
        E3_P4_1 = e3_P4_1;
    }

    public String getE3_P4_2() {
        return E3_P4_2;
    }

    public void setE3_P4_2(String e3_P4_2) {
        E3_P4_2 = e3_P4_2;
    }

    public String getE3_P4_3() {
        return E3_P4_3;
    }

    public void setE3_P4_3(String e3_P4_3) {
        E3_P4_3 = e3_P4_3;
    }

    public String getE3_P4_4() {
        return E3_P4_4;
    }

    public void setE3_P4_4(String e3_P4_4) {
        E3_P4_4 = e3_P4_4;
    }

    public String getE3_P4_5() {
        return E3_P4_5;
    }

    public void setE3_P4_5(String e3_P4_5) {
        E3_P4_5 = e3_P4_5;
    }

    public String getE3_P4_6() {
        return E3_P4_6;
    }

    public void setE3_P4_6(String e3_P4_6) {
        E3_P4_6 = e3_P4_6;
    }

    public String getE3_P4_7() {
        return E3_P4_7;
    }

    public void setE3_P4_7(String e3_P4_7) {
        E3_P4_7 = e3_P4_7;
    }

    public String getE3_P4_8() {
        return E3_P4_8;
    }

    public void setE3_P4_8(String e3_P4_8) {
        E3_P4_8 = e3_P4_8;
    }

    public String getE3_P4_9() {
        return E3_P4_9;
    }

    public void setE3_P4_9(String e3_P4_9) {
        E3_P4_9 = e3_P4_9;
    }

    public String getE3_P4_10() {
        return E3_P4_10;
    }

    public void setE3_P4_10(String e3_P4_10) {
        E3_P4_10 = e3_P4_10;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.E3_ID,EVALUACION3_ID);
        contentValues.put(SQLConstantes.E3_P1,E3_P1);
        contentValues.put(SQLConstantes.E3_P2,E3_P2);
        contentValues.put(SQLConstantes.E3_P3_1,E3_P3_1);
        contentValues.put(SQLConstantes.E3_P3_2,E3_P3_2);
        contentValues.put(SQLConstantes.E3_P3_3,E3_P3_3);
        contentValues.put(SQLConstantes.E3_P3_4,E3_P3_4);
        contentValues.put(SQLConstantes.E3_P4_1,E3_P4_1);
        contentValues.put(SQLConstantes.E3_P4_2,E3_P4_2);
        contentValues.put(SQLConstantes.E3_P4_3,E3_P4_3);
        contentValues.put(SQLConstantes.E3_P4_4,E3_P4_4);
        contentValues.put(SQLConstantes.E3_P4_5,E3_P4_5);
        contentValues.put(SQLConstantes.E3_P4_6,E3_P4_6);
        contentValues.put(SQLConstantes.E3_P4_7,E3_P4_7);
        contentValues.put(SQLConstantes.E3_P4_8,E3_P4_8);
        contentValues.put(SQLConstantes.E3_P4_9,E3_P4_9);
        contentValues.put(SQLConstantes.E3_P4_10,E3_P4_10);
        return contentValues;

    }


}
