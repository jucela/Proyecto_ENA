package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Evaluacion5 {
    private String EVALUACION5_ID;
    private String E5_P1_1;
    private String E5_P1_2;
    private String E5_P1_3;
    private String E5_P1_4;
    private String E5_P1_5;
    private String E5_P1_6;
    private String E5_P1_7;
    private String E5_P1_8;
    private String E5_P1_9;
    private String E5_P1_10;
    private String E5_P1_11;
    private String E5_P1_12;
    private String E5_P2;
    private String E5_P3_1;
    private String E5_P3_2;
    private String E5_P3_3;
    private String E5_P3_4;
    private String E5_P3_5;
    private String E5_P3_6;



    public Evaluacion5(){
        EVALUACION5_ID = "";
        E5_P1_1 = "";
        E5_P1_2 = "";
        E5_P1_3 = "";
        E5_P1_4 = "";
        E5_P1_5 = "";
        E5_P1_6 = "";
        E5_P1_7 = "";
        E5_P1_8 = "";
        E5_P1_9 = "";
        E5_P1_10 = "";
        E5_P1_11 = "";
        E5_P1_12 = "";
        E5_P2 = "";
        E5_P3_1 = "";
        E5_P3_2 = "";
        E5_P3_3 = "";
        E5_P3_4 = "";
        E5_P3_5 = "";
        E5_P3_6 = "";
    }

    public Evaluacion5(String EVALUACION5_ID, String e5_P1_1, String e5_P1_2, String e5_P1_3, String e5_P1_4, String e5_P1_5, String e5_P1_6, String e5_P1_7, String e5_P1_8, String e5_P1_9, String e5_P1_10, String e5_P1_11, String e5_P1_12, String e5_P2, String e5_P3_1, String e5_P3_2, String e5_P3_3, String e5_P3_4, String e5_P3_5, String e5_P3_6) {
        this.EVALUACION5_ID = EVALUACION5_ID;
        E5_P1_1 = e5_P1_1;
        E5_P1_2 = e5_P1_2;
        E5_P1_3 = e5_P1_3;
        E5_P1_4 = e5_P1_4;
        E5_P1_5 = e5_P1_5;
        E5_P1_6 = e5_P1_6;
        E5_P1_7 = e5_P1_7;
        E5_P1_8 = e5_P1_8;
        E5_P1_9 = e5_P1_9;
        E5_P1_10 = e5_P1_10;
        E5_P1_11 = e5_P1_11;
        E5_P1_12 = e5_P1_12;
        E5_P2 = e5_P2;
        E5_P3_1 = e5_P3_1;
        E5_P3_2 = e5_P3_2;
        E5_P3_3 = e5_P3_3;
        E5_P3_4 = e5_P3_4;
        E5_P3_5 = e5_P3_5;
        E5_P3_6 = e5_P3_6;
    }

    public String getEVALUACION5_ID() {
        return EVALUACION5_ID;
    }

    public void setEVALUACION5_ID(String EVALUACION5_ID) {
        this.EVALUACION5_ID = EVALUACION5_ID;
    }

    public String getE5_P1_1() {
        return E5_P1_1;
    }

    public void setE5_P1_1(String e5_P1_1) {
        E5_P1_1 = e5_P1_1;
    }

    public String getE5_P1_2() {
        return E5_P1_2;
    }

    public void setE5_P1_2(String e5_P1_2) {
        E5_P1_2 = e5_P1_2;
    }

    public String getE5_P1_3() {
        return E5_P1_3;
    }

    public void setE5_P1_3(String e5_P1_3) {
        E5_P1_3 = e5_P1_3;
    }

    public String getE5_P1_4() {
        return E5_P1_4;
    }

    public void setE5_P1_4(String e5_P1_4) {
        E5_P1_4 = e5_P1_4;
    }

    public String getE5_P1_5() {
        return E5_P1_5;
    }

    public void setE5_P1_5(String e5_P1_5) {
        E5_P1_5 = e5_P1_5;
    }

    public String getE5_P1_6() {
        return E5_P1_6;
    }

    public void setE5_P1_6(String e5_P1_6) {
        E5_P1_6 = e5_P1_6;
    }

    public String getE5_P1_7() {
        return E5_P1_7;
    }

    public void setE5_P1_7(String e5_P1_7) {
        E5_P1_7 = e5_P1_7;
    }

    public String getE5_P1_8() {
        return E5_P1_8;
    }

    public void setE5_P1_8(String e5_P1_8) {
        E5_P1_8 = e5_P1_8;
    }

    public String getE5_P1_9() {
        return E5_P1_9;
    }

    public void setE5_P1_9(String e5_P1_9) {
        E5_P1_9 = e5_P1_9;
    }

    public String getE5_P1_10() {
        return E5_P1_10;
    }

    public void setE5_P1_10(String e5_P1_10) {
        E5_P1_10 = e5_P1_10;
    }

    public String getE5_P1_11() {
        return E5_P1_11;
    }

    public void setE5_P1_11(String e5_P1_11) {
        E5_P1_11 = e5_P1_11;
    }

    public String getE5_P1_12() {
        return E5_P1_12;
    }

    public void setE5_P1_12(String e5_P1_12) {
        E5_P1_12 = e5_P1_12;
    }

    public String getE5_P2() {
        return E5_P2;
    }

    public void setE5_P2(String e5_P2) {
        E5_P2 = e5_P2;
    }

    public String getE5_P3_1() {
        return E5_P3_1;
    }

    public void setE5_P3_1(String e5_P3_1) {
        E5_P3_1 = e5_P3_1;
    }

    public String getE5_P3_2() {
        return E5_P3_2;
    }

    public void setE5_P3_2(String e5_P3_2) {
        E5_P3_2 = e5_P3_2;
    }

    public String getE5_P3_3() {
        return E5_P3_3;
    }

    public void setE5_P3_3(String e5_P3_3) {
        E5_P3_3 = e5_P3_3;
    }

    public String getE5_P3_4() {
        return E5_P3_4;
    }

    public void setE5_P3_4(String e5_P3_4) {
        E5_P3_4 = e5_P3_4;
    }

    public String getE5_P3_5() {
        return E5_P3_5;
    }

    public void setE5_P3_5(String e5_P3_5) {
        E5_P3_5 = e5_P3_5;
    }

    public String getE5_P3_6() {
        return E5_P3_6;
    }

    public void setE5_P3_6(String e5_P3_6) {
        E5_P3_6 = e5_P3_6;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.E5_ID,EVALUACION5_ID);
        contentValues.put(SQLConstantes.E5_P1_1,E5_P1_1);
        contentValues.put(SQLConstantes.E5_P1_2,E5_P1_2);
        contentValues.put(SQLConstantes.E5_P1_3,E5_P1_3);
        contentValues.put(SQLConstantes.E5_P1_4,E5_P1_4);
        contentValues.put(SQLConstantes.E5_P1_5,E5_P1_5);
        contentValues.put(SQLConstantes.E5_P1_6,E5_P1_6);
        contentValues.put(SQLConstantes.E5_P1_7,E5_P1_7);
        contentValues.put(SQLConstantes.E5_P1_8,E5_P1_8);
        contentValues.put(SQLConstantes.E5_P1_9,E5_P1_9);
        contentValues.put(SQLConstantes.E5_P1_10,E5_P1_10);
        contentValues.put(SQLConstantes.E5_P1_11,E5_P1_11);
        contentValues.put(SQLConstantes.E5_P1_12,E5_P1_12);
        contentValues.put(SQLConstantes.E5_P2,E5_P2);
        contentValues.put(SQLConstantes.E5_P3_1,E5_P3_1);
        contentValues.put(SQLConstantes.E5_P3_2,E5_P3_2);
        contentValues.put(SQLConstantes.E5_P3_3,E5_P3_3);
        contentValues.put(SQLConstantes.E5_P3_4,E5_P3_4);
        contentValues.put(SQLConstantes.E5_P3_5,E5_P3_5);
        contentValues.put(SQLConstantes.E5_P3_6,E5_P3_6);



        return contentValues;

    }


}
