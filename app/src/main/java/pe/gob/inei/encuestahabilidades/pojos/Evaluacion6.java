package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Evaluacion6 {
    private String EVALUACION6_ID;
    private String E6_P1_1;
    private String E6_P1_2;
    private String E6_P1_3;
    private String E6_P1_4;
    private String E6_P1_5;
    private String E6_P1_6;
    private String E6_P1_7;
    private String E6_P1_8;
    private String E6_P1_9;
    private String E6_P1_10;
    private String E6_P1_11;
    private String E6_P1_12;
    private String E6_P2;
    private String E6_P3_1;
    private String E6_P3_2;
    private String E6_P3_3;
    private String E6_P3_4;
    private String E6_P3_5;
    private String E6_P3_6;


    public Evaluacion6(){
        EVALUACION6_ID = "";
        E6_P1_1 = "";
        E6_P1_2 = "";
        E6_P1_3 = "";
        E6_P1_4 = "";
        E6_P1_5 = "";
        E6_P1_6 = "";
        E6_P1_7 = "";
        E6_P1_8 = "";
        E6_P1_9 = "";
        E6_P1_10 = "";
        E6_P1_11 = "";
        E6_P1_12 = "";
        E6_P2 = "";
        E6_P3_1 = "";
        E6_P3_2 = "";
        E6_P3_3 = "";
        E6_P3_4 = "";
        E6_P3_5 = "";
        E6_P3_6 = "";

    }

    public Evaluacion6(String EVALUACION6_ID, String e6_P1_1, String e6_P1_2, String e6_P1_3, String e6_P1_4, String e6_P1_5, String e6_P1_6, String e6_P1_7, String e6_P1_8, String e6_P1_9, String e6_P1_10, String e6_P1_11, String e6_P1_12, String e6_P2, String e6_P3_1, String e6_P3_2, String e6_P3_3, String e6_P3_4, String e6_P3_5, String e6_P3_6) {
        this.EVALUACION6_ID = EVALUACION6_ID;
        E6_P1_1 = e6_P1_1;
        E6_P1_2 = e6_P1_2;
        E6_P1_3 = e6_P1_3;
        E6_P1_4 = e6_P1_4;
        E6_P1_5 = e6_P1_5;
        E6_P1_6 = e6_P1_6;
        E6_P1_7 = e6_P1_7;
        E6_P1_8 = e6_P1_8;
        E6_P1_9 = e6_P1_9;
        E6_P1_10 = e6_P1_10;
        E6_P1_11 = e6_P1_11;
        E6_P1_12 = e6_P1_12;
        E6_P2 = e6_P2;
        E6_P3_1 = e6_P3_1;
        E6_P3_2 = e6_P3_2;
        E6_P3_3 = e6_P3_3;
        E6_P3_4 = e6_P3_4;
        E6_P3_5 = e6_P3_5;
        E6_P3_6 = e6_P3_6;
    }

    public String getEVALUACION6_ID() {
        return EVALUACION6_ID;
    }

    public void setEVALUACION6_ID(String EVALUACION6_ID) {
        this.EVALUACION6_ID = EVALUACION6_ID;
    }

    public String getE6_P1_1() {
        return E6_P1_1;
    }

    public void setE6_P1_1(String e6_P1_1) {
        E6_P1_1 = e6_P1_1;
    }

    public String getE6_P1_2() {
        return E6_P1_2;
    }

    public void setE6_P1_2(String e6_P1_2) {
        E6_P1_2 = e6_P1_2;
    }

    public String getE6_P1_3() {
        return E6_P1_3;
    }

    public void setE6_P1_3(String e6_P1_3) {
        E6_P1_3 = e6_P1_3;
    }

    public String getE6_P1_4() {
        return E6_P1_4;
    }

    public void setE6_P1_4(String e6_P1_4) {
        E6_P1_4 = e6_P1_4;
    }

    public String getE6_P1_5() {
        return E6_P1_5;
    }

    public void setE6_P1_5(String e6_P1_5) {
        E6_P1_5 = e6_P1_5;
    }

    public String getE6_P1_6() {
        return E6_P1_6;
    }

    public void setE6_P1_6(String e6_P1_6) {
        E6_P1_6 = e6_P1_6;
    }

    public String getE6_P1_7() {
        return E6_P1_7;
    }

    public void setE6_P1_7(String e6_P1_7) {
        E6_P1_7 = e6_P1_7;
    }

    public String getE6_P1_8() {
        return E6_P1_8;
    }

    public void setE6_P1_8(String e6_P1_8) {
        E6_P1_8 = e6_P1_8;
    }

    public String getE6_P1_9() {
        return E6_P1_9;
    }

    public void setE6_P1_9(String e6_P1_9) {
        E6_P1_9 = e6_P1_9;
    }

    public String getE6_P1_10() {
        return E6_P1_10;
    }

    public void setE6_P1_10(String e6_P1_10) {
        E6_P1_10 = e6_P1_10;
    }

    public String getE6_P1_11() {
        return E6_P1_11;
    }

    public void setE6_P1_11(String e6_P1_11) {
        E6_P1_11 = e6_P1_11;
    }

    public String getE6_P1_12() {
        return E6_P1_12;
    }

    public void setE6_P1_12(String e6_P1_12) {
        E6_P1_12 = e6_P1_12;
    }

    public String getE6_P2() {
        return E6_P2;
    }

    public void setE6_P2(String e6_P2) {
        E6_P2 = e6_P2;
    }

    public String getE6_P3_1() {
        return E6_P3_1;
    }

    public void setE6_P3_1(String e6_P3_1) {
        E6_P3_1 = e6_P3_1;
    }

    public String getE6_P3_2() {
        return E6_P3_2;
    }

    public void setE6_P3_2(String e6_P3_2) {
        E6_P3_2 = e6_P3_2;
    }

    public String getE6_P3_3() {
        return E6_P3_3;
    }

    public void setE6_P3_3(String e6_P3_3) {
        E6_P3_3 = e6_P3_3;
    }

    public String getE6_P3_4() {
        return E6_P3_4;
    }

    public void setE6_P3_4(String e6_P3_4) {
        E6_P3_4 = e6_P3_4;
    }

    public String getE6_P3_5() {
        return E6_P3_5;
    }

    public void setE6_P3_5(String e6_P3_5) {
        E6_P3_5 = e6_P3_5;
    }

    public String getE6_P3_6() {
        return E6_P3_6;
    }

    public void setE6_P3_6(String e6_P3_6) {
        E6_P3_6 = e6_P3_6;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.E6_ID,EVALUACION6_ID);
        contentValues.put(SQLConstantes.E6_P1_1,E6_P1_1);
        contentValues.put(SQLConstantes.E6_P1_2,E6_P1_2);
        contentValues.put(SQLConstantes.E6_P1_3,E6_P1_3);
        contentValues.put(SQLConstantes.E6_P1_4,E6_P1_4);
        contentValues.put(SQLConstantes.E6_P1_5,E6_P1_5);
        contentValues.put(SQLConstantes.E6_P1_6,E6_P1_6);
        contentValues.put(SQLConstantes.E6_P1_7,E6_P1_7);
        contentValues.put(SQLConstantes.E6_P1_8,E6_P1_8);
        contentValues.put(SQLConstantes.E6_P1_9,E6_P1_9);
        contentValues.put(SQLConstantes.E6_P1_10,E6_P1_10);
        contentValues.put(SQLConstantes.E6_P1_11,E6_P1_11);
        contentValues.put(SQLConstantes.E6_P1_12,E6_P1_12);
        contentValues.put(SQLConstantes.E6_P2,E6_P2);
        contentValues.put(SQLConstantes.E6_P3_1,E6_P3_1);
        contentValues.put(SQLConstantes.E6_P3_2,E6_P3_2);
        contentValues.put(SQLConstantes.E6_P3_3,E6_P3_3);
        contentValues.put(SQLConstantes.E6_P3_4,E6_P3_4);
        contentValues.put(SQLConstantes.E6_P3_5,E6_P3_5);
        contentValues.put(SQLConstantes.E6_P3_6,E6_P3_6);
        return contentValues;

    }


}
