package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Evaluacion2 {
    private String EVALUACION2_ID;
    private String E2_P1_1;
    private String E2_P1_2;
    private String E2_P1_3;
    private String E2_P1_4;
    private String E2_P1_5;
    private String E2_P1_6;
    private String E2_P1_7;
    private String E2_P1_8;
    private String E2_P1_9;
    private String E2_P1_10;
    private String E2_P1_11;
    private String E2_P1_12;
    private String E2_P1_13;
    private String E2_P1_14;
    private String E2_P1_15;
    private String E2_P1_16;
    private String E2_P2_1;
    private String E2_P2_2;
    private String E2_P2_3;
    private String E2_P2_4;
    private String E2_P2_5;
    private String E2_P3_1;
    private String E2_P3_2;
    private String E2_P3_3;
    private String E2_P3_4;
    private String E2_P3_5;

    public Evaluacion2(){
        EVALUACION2_ID = "";
        E2_P1_1 = "";
        E2_P1_2 = "";
        E2_P1_3 = "";
        E2_P1_4 = "";
        E2_P1_5 = "";
        E2_P1_6 = "";
        E2_P1_7 = "";
        E2_P1_8 = "";
        E2_P1_9 = "";
        E2_P1_10 = "";
        E2_P1_11 = "";
        E2_P1_12 = "";
        E2_P1_13 = "";
        E2_P1_14 = "";
        E2_P1_15 = "";
        E2_P1_16 = "";
        E2_P2_1 = "";
        E2_P2_2 = "";
        E2_P2_3 = "";
        E2_P2_4 = "";
        E2_P2_5 = "";
        E2_P3_1 = "";
        E2_P3_2 = "";
        E2_P3_3 = "";
        E2_P3_4 = "";
        E2_P3_5 = "";
    }

    public Evaluacion2(String EVALUACION2_ID, String e2_P1_1, String e2_P1_2, String e2_P1_3, String e2_P1_4, String e2_P1_5, String e2_P1_6, String e2_P1_7, String e2_P1_8, String e2_P1_9, String e2_P1_10, String e2_P1_11, String e2_P1_12, String e2_P1_13, String e2_P1_14, String e2_P1_15, String e2_P1_16, String e2_P2_1, String e2_P2_2, String e2_P2_3, String e2_P2_4, String e2_P2_5, String e2_P3_1, String e2_P3_2, String e2_P3_3, String e2_P3_4, String e2_P3_5) {
        this.EVALUACION2_ID = EVALUACION2_ID;
        E2_P1_1 = e2_P1_1;
        E2_P1_2 = e2_P1_2;
        E2_P1_3 = e2_P1_3;
        E2_P1_4 = e2_P1_4;
        E2_P1_5 = e2_P1_5;
        E2_P1_6 = e2_P1_6;
        E2_P1_7 = e2_P1_7;
        E2_P1_8 = e2_P1_8;
        E2_P1_9 = e2_P1_9;
        E2_P1_10 = e2_P1_10;
        E2_P1_11 = e2_P1_11;
        E2_P1_12 = e2_P1_12;
        E2_P1_13 = e2_P1_13;
        E2_P1_14 = e2_P1_14;
        E2_P1_15 = e2_P1_15;
        E2_P1_16 = e2_P1_16;
        E2_P2_1 = e2_P2_1;
        E2_P2_2 = e2_P2_2;
        E2_P2_3 = e2_P2_3;
        E2_P2_4 = e2_P2_4;
        E2_P2_5 = e2_P2_5;
        E2_P3_1 = e2_P3_1;
        E2_P3_2 = e2_P3_2;
        E2_P3_3 = e2_P3_3;
        E2_P3_4 = e2_P3_4;
        E2_P3_5 = e2_P3_5;
    }

    public String getEVALUACION2_ID() {
        return EVALUACION2_ID;
    }

    public void setEVALUACION2_ID(String EVALUACION2_ID) {
        this.EVALUACION2_ID = EVALUACION2_ID;
    }

    public String getE2_P1_1() {
        return E2_P1_1;
    }

    public void setE2_P1_1(String e2_P1_1) {
        E2_P1_1 = e2_P1_1;
    }

    public String getE2_P1_2() {
        return E2_P1_2;
    }

    public void setE2_P1_2(String e2_P1_2) {
        E2_P1_2 = e2_P1_2;
    }

    public String getE2_P1_3() {
        return E2_P1_3;
    }

    public void setE2_P1_3(String e2_P1_3) {
        E2_P1_3 = e2_P1_3;
    }

    public String getE2_P1_4() {
        return E2_P1_4;
    }

    public void setE2_P1_4(String e2_P1_4) {
        E2_P1_4 = e2_P1_4;
    }

    public String getE2_P1_5() {
        return E2_P1_5;
    }

    public void setE2_P1_5(String e2_P1_5) {
        E2_P1_5 = e2_P1_5;
    }

    public String getE2_P1_6() {
        return E2_P1_6;
    }

    public void setE2_P1_6(String e2_P1_6) {
        E2_P1_6 = e2_P1_6;
    }

    public String getE2_P1_7() {
        return E2_P1_7;
    }

    public void setE2_P1_7(String e2_P1_7) {
        E2_P1_7 = e2_P1_7;
    }

    public String getE2_P1_8() {
        return E2_P1_8;
    }

    public void setE2_P1_8(String e2_P1_8) {
        E2_P1_8 = e2_P1_8;
    }

    public String getE2_P1_9() {
        return E2_P1_9;
    }

    public void setE2_P1_9(String e2_P1_9) {
        E2_P1_9 = e2_P1_9;
    }

    public String getE2_P1_10() {
        return E2_P1_10;
    }

    public void setE2_P1_10(String e2_P1_10) {
        E2_P1_10 = e2_P1_10;
    }

    public String getE2_P1_11() {
        return E2_P1_11;
    }

    public void setE2_P1_11(String e2_P1_11) {
        E2_P1_11 = e2_P1_11;
    }

    public String getE2_P1_12() {
        return E2_P1_12;
    }

    public void setE2_P1_12(String e2_P1_12) {
        E2_P1_12 = e2_P1_12;
    }

    public String getE2_P1_13() {
        return E2_P1_13;
    }

    public void setE2_P1_13(String e2_P1_13) {
        E2_P1_13 = e2_P1_13;
    }

    public String getE2_P1_14() {
        return E2_P1_14;
    }

    public void setE2_P1_14(String e2_P1_14) {
        E2_P1_14 = e2_P1_14;
    }

    public String getE2_P1_15() {
        return E2_P1_15;
    }

    public void setE2_P1_15(String e2_P1_15) {
        E2_P1_15 = e2_P1_15;
    }

    public String getE2_P1_16() {
        return E2_P1_16;
    }

    public void setE2_P1_16(String e2_P1_16) {
        E2_P1_16 = e2_P1_16;
    }

    public String getE2_P2_1() {
        return E2_P2_1;
    }

    public void setE2_P2_1(String e2_P2_1) {
        E2_P2_1 = e2_P2_1;
    }

    public String getE2_P2_2() {
        return E2_P2_2;
    }

    public void setE2_P2_2(String e2_P2_2) {
        E2_P2_2 = e2_P2_2;
    }

    public String getE2_P2_3() {
        return E2_P2_3;
    }

    public void setE2_P2_3(String e2_P2_3) {
        E2_P2_3 = e2_P2_3;
    }

    public String getE2_P2_4() {
        return E2_P2_4;
    }

    public void setE2_P2_4(String e2_P2_4) {
        E2_P2_4 = e2_P2_4;
    }

    public String getE2_P2_5() {
        return E2_P2_5;
    }

    public void setE2_P2_5(String e2_P2_5) {
        E2_P2_5 = e2_P2_5;
    }

    public String getE2_P3_1() {
        return E2_P3_1;
    }

    public void setE2_P3_1(String e2_P3_1) {
        E2_P3_1 = e2_P3_1;
    }

    public String getE2_P3_2() {
        return E2_P3_2;
    }

    public void setE2_P3_2(String e2_P3_2) {
        E2_P3_2 = e2_P3_2;
    }

    public String getE2_P3_3() {
        return E2_P3_3;
    }

    public void setE2_P3_3(String e2_P3_3) {
        E2_P3_3 = e2_P3_3;
    }

    public String getE2_P3_4() {
        return E2_P3_4;
    }

    public void setE2_P3_4(String e2_P3_4) {
        E2_P3_4 = e2_P3_4;
    }

    public String getE2_P3_5() {
        return E2_P3_5;
    }

    public void setE2_P3_5(String e2_P3_5) {
        E2_P3_5 = e2_P3_5;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.E2_ID,EVALUACION2_ID);
        contentValues.put(SQLConstantes.E2_P1_1,E2_P1_1);
        contentValues.put(SQLConstantes.E2_P1_2,E2_P1_2);
        contentValues.put(SQLConstantes.E2_P1_3,E2_P1_3);
        contentValues.put(SQLConstantes.E2_P1_4,E2_P1_4);
        contentValues.put(SQLConstantes.E2_P1_5,E2_P1_5);
        contentValues.put(SQLConstantes.E2_P1_6,E2_P1_6);
        contentValues.put(SQLConstantes.E2_P1_7,E2_P1_7);
        contentValues.put(SQLConstantes.E2_P1_8,E2_P1_8);
        contentValues.put(SQLConstantes.E2_P1_9,E2_P1_9);
        contentValues.put(SQLConstantes.E2_P1_10,E2_P1_10);
        contentValues.put(SQLConstantes.E2_P1_11,E2_P1_11);
        contentValues.put(SQLConstantes.E2_P1_12,E2_P1_12);
        contentValues.put(SQLConstantes.E2_P1_13,E2_P1_13);
        contentValues.put(SQLConstantes.E2_P1_14,E2_P1_14);
        contentValues.put(SQLConstantes.E2_P1_15,E2_P1_15);
        contentValues.put(SQLConstantes.E2_P1_16,E2_P1_16);
        contentValues.put(SQLConstantes.E2_P2_1,E2_P2_1);
        contentValues.put(SQLConstantes.E2_P2_2,E2_P2_2);
        contentValues.put(SQLConstantes.E2_P2_3,E2_P2_3);
        contentValues.put(SQLConstantes.E2_P2_4,E2_P2_4);
        contentValues.put(SQLConstantes.E2_P2_5,E2_P2_5);
        contentValues.put(SQLConstantes.E2_P3_1,E2_P3_1);
        contentValues.put(SQLConstantes.E2_P3_2,E2_P3_2);
        contentValues.put(SQLConstantes.E2_P3_3,E2_P3_3);
        contentValues.put(SQLConstantes.E2_P3_4,E2_P3_4);
        contentValues.put(SQLConstantes.E2_P3_5,E2_P3_5);
        return contentValues;

    }


}
