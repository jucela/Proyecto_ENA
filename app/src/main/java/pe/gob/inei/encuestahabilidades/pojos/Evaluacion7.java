package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Evaluacion7 {
    private String EVALUACION7_ID;
    private String E7_P1_1;
    private String E7_P1_2;
    private String E7_P1_3;
    private String E7_P1_4;
    private String E7_P1_5;
    private String E7_P1_6;
    private String E7_P1_7;
    private String E7_P1_8;
    private String E7_P1_9;
    private String E7_P1_10;
    private String E7_P1_11;
    private String E7_P1_12;
    private String E7_P1_13;
    private String E7_P2;
    private String E7_P3_1;
    private String E7_P3_2;
    private String E7_P3_3;
    private String E7_P3_4;
    private String E7_P3_5;





    public Evaluacion7(){
        EVALUACION7_ID = "";
        E7_P1_1 = "";
        E7_P1_2 = "";
        E7_P1_3 = "";
        E7_P1_4 = "";
        E7_P1_5 = "";
        E7_P1_6 = "";
        E7_P1_7 = "";
        E7_P1_8 = "";
        E7_P1_9 = "";
        E7_P1_10 = "";
        E7_P1_11 = "";
        E7_P1_12 = "";
        E7_P1_13 = "";
        E7_P2 = "";
        E7_P3_1 = "";
        E7_P3_2 = "";
        E7_P3_3 = "";
        E7_P3_4 = "";
        E7_P3_5 = "";
    }

    public Evaluacion7(String EVALUACION7_ID, String e7_P1_1, String e7_P1_2, String e7_P1_3, String e7_P1_4, String e7_P1_5, String e7_P1_6, String e7_P1_7, String e7_P1_8, String e7_P1_9, String e7_P1_10, String e7_P1_11, String e7_P1_12, String e7_P1_13, String e7_P2, String e7_P3_1, String e7_P3_2, String e7_P3_3, String e7_P3_4, String e7_P3_5) {
        this.EVALUACION7_ID = EVALUACION7_ID;
        E7_P1_1 = e7_P1_1;
        E7_P1_2 = e7_P1_2;
        E7_P1_3 = e7_P1_3;
        E7_P1_4 = e7_P1_4;
        E7_P1_5 = e7_P1_5;
        E7_P1_6 = e7_P1_6;
        E7_P1_7 = e7_P1_7;
        E7_P1_8 = e7_P1_8;
        E7_P1_9 = e7_P1_9;
        E7_P1_10 = e7_P1_10;
        E7_P1_11 = e7_P1_11;
        E7_P1_12 = e7_P1_12;
        E7_P1_13 = e7_P1_13;
        E7_P2 = e7_P2;
        E7_P3_1 = e7_P3_1;
        E7_P3_2 = e7_P3_2;
        E7_P3_3 = e7_P3_3;
        E7_P3_4 = e7_P3_4;
        E7_P3_5 = e7_P3_5;
    }

    public String getEVALUACION7_ID() {
        return EVALUACION7_ID;
    }

    public void setEVALUACION7_ID(String EVALUACION7_ID) {
        this.EVALUACION7_ID = EVALUACION7_ID;
    }

    public String getE7_P1_1() {
        return E7_P1_1;
    }

    public void setE7_P1_1(String e7_P1_1) {
        E7_P1_1 = e7_P1_1;
    }

    public String getE7_P1_2() {
        return E7_P1_2;
    }

    public void setE7_P1_2(String e7_P1_2) {
        E7_P1_2 = e7_P1_2;
    }

    public String getE7_P1_3() {
        return E7_P1_3;
    }

    public void setE7_P1_3(String e7_P1_3) {
        E7_P1_3 = e7_P1_3;
    }

    public String getE7_P1_4() {
        return E7_P1_4;
    }

    public void setE7_P1_4(String e7_P1_4) {
        E7_P1_4 = e7_P1_4;
    }

    public String getE7_P1_5() {
        return E7_P1_5;
    }

    public void setE7_P1_5(String e7_P1_5) {
        E7_P1_5 = e7_P1_5;
    }

    public String getE7_P1_6() {
        return E7_P1_6;
    }

    public void setE7_P1_6(String e7_P1_6) {
        E7_P1_6 = e7_P1_6;
    }

    public String getE7_P1_7() {
        return E7_P1_7;
    }

    public void setE7_P1_7(String e7_P1_7) {
        E7_P1_7 = e7_P1_7;
    }

    public String getE7_P1_8() {
        return E7_P1_8;
    }

    public void setE7_P1_8(String e7_P1_8) {
        E7_P1_8 = e7_P1_8;
    }

    public String getE7_P1_9() {
        return E7_P1_9;
    }

    public void setE7_P1_9(String e7_P1_9) {
        E7_P1_9 = e7_P1_9;
    }

    public String getE7_P1_10() {
        return E7_P1_10;
    }

    public void setE7_P1_10(String e7_P1_10) {
        E7_P1_10 = e7_P1_10;
    }

    public String getE7_P1_11() {
        return E7_P1_11;
    }

    public void setE7_P1_11(String e7_P1_11) {
        E7_P1_11 = e7_P1_11;
    }

    public String getE7_P1_12() {
        return E7_P1_12;
    }

    public void setE7_P1_12(String e7_P1_12) {
        E7_P1_12 = e7_P1_12;
    }

    public String getE7_P1_13() {
        return E7_P1_13;
    }

    public void setE7_P1_13(String e7_P1_13) {
        E7_P1_13 = e7_P1_13;
    }

    public String getE7_P2() {
        return E7_P2;
    }

    public void setE7_P2(String e7_P2) {
        E7_P2 = e7_P2;
    }

    public String getE7_P3_1() {
        return E7_P3_1;
    }

    public void setE7_P3_1(String e7_P3_1) {
        E7_P3_1 = e7_P3_1;
    }

    public String getE7_P3_2() {
        return E7_P3_2;
    }

    public void setE7_P3_2(String e7_P3_2) {
        E7_P3_2 = e7_P3_2;
    }

    public String getE7_P3_3() {
        return E7_P3_3;
    }

    public void setE7_P3_3(String e7_P3_3) {
        E7_P3_3 = e7_P3_3;
    }

    public String getE7_P3_4() {
        return E7_P3_4;
    }

    public void setE7_P3_4(String e7_P3_4) {
        E7_P3_4 = e7_P3_4;
    }

    public String getE7_P3_5() {
        return E7_P3_5;
    }

    public void setE7_P3_5(String e7_P3_5) {
        E7_P3_5 = e7_P3_5;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.E7_ID,EVALUACION7_ID);
        contentValues.put(SQLConstantes.E7_P1_1,E7_P1_1);
        contentValues.put(SQLConstantes.E7_P1_2,E7_P1_2);
        contentValues.put(SQLConstantes.E7_P1_3,E7_P1_3);
        contentValues.put(SQLConstantes.E7_P1_4,E7_P1_4);
        contentValues.put(SQLConstantes.E7_P1_5,E7_P1_5);
        contentValues.put(SQLConstantes.E7_P1_6,E7_P1_6);
        contentValues.put(SQLConstantes.E7_P1_7,E7_P1_7);
        contentValues.put(SQLConstantes.E7_P1_8,E7_P1_8);
        contentValues.put(SQLConstantes.E7_P1_9,E7_P1_9);
        contentValues.put(SQLConstantes.E7_P1_10,E7_P1_10);
        contentValues.put(SQLConstantes.E7_P1_11,E7_P1_11);
        contentValues.put(SQLConstantes.E7_P1_12,E7_P1_12);
        contentValues.put(SQLConstantes.E7_P1_13,E7_P1_13);
        contentValues.put(SQLConstantes.E7_P2,E7_P2);
        contentValues.put(SQLConstantes.E7_P3_1,E7_P3_1);
        contentValues.put(SQLConstantes.E7_P3_2,E7_P3_2);
        contentValues.put(SQLConstantes.E7_P3_3,E7_P3_3);
        contentValues.put(SQLConstantes.E7_P3_4,E7_P3_4);
        contentValues.put(SQLConstantes.E7_P3_5,E7_P3_5);



        return contentValues;

    }


}
