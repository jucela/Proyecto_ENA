package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Evaluacion4 {
    private String EVALUACION4_ID;
    private String E4_P1_1;
    private String E4_P1_2;
    private String E4_P1_3;
    private String E4_P1_4;
    private String E4_P1_5;
    private String E4_P1_6;
    private String E4_P1_7;
    private String E4_P1_8;
    private String E4_P1_9;
    private String E4_P1_10;
    private String E4_P2_1;
    private String E4_P2_2;
    private String E4_P2_3;
    private String E4_P2_4;
    private String E4_P2_5;
    private String E4_P3_1;
    private String E4_P3_2;
    private String E4_P3_3;
    private String E4_P3_4;
    private String E4_P3_5;


    public Evaluacion4(){
        EVALUACION4_ID = "";
        E4_P1_1 = "";
        E4_P1_2 = "";
        E4_P1_3 = "";
        E4_P1_4 = "";
        E4_P1_5 = "";
        E4_P1_6 = "";
        E4_P1_7 = "";
        E4_P1_8 = "";
        E4_P1_9 = "";
        E4_P1_10 = "";
        E4_P2_1 = "";
        E4_P2_2 = "";
        E4_P2_3 = "";
        E4_P2_4 = "";
        E4_P2_5 = "";
        E4_P3_1 = "";
        E4_P3_2 = "";
        E4_P3_3 = "";
        E4_P3_4 = "";
        E4_P3_5 = "";

    }

    public Evaluacion4(String EVALUACION4_ID, String e4_P1_1, String e4_P1_2, String e4_P1_3, String e4_P1_4, String e4_P1_5, String e4_P1_6, String e4_P1_7, String e4_P1_8, String e4_P1_9, String e4_P1_10, String e4_P2_1, String e4_P2_2, String e4_P2_3, String e4_P2_4, String e4_P2_5, String e4_P3_1, String e4_P3_2, String e4_P3_3, String e4_P3_4, String e4_P3_5) {
        this.EVALUACION4_ID = EVALUACION4_ID;
        E4_P1_1 = e4_P1_1;
        E4_P1_2 = e4_P1_2;
        E4_P1_3 = e4_P1_3;
        E4_P1_4 = e4_P1_4;
        E4_P1_5 = e4_P1_5;
        E4_P1_6 = e4_P1_6;
        E4_P1_7 = e4_P1_7;
        E4_P1_8 = e4_P1_8;
        E4_P1_9 = e4_P1_9;
        E4_P1_10 = e4_P1_10;
        E4_P2_1 = e4_P2_1;
        E4_P2_2 = e4_P2_2;
        E4_P2_3 = e4_P2_3;
        E4_P2_4 = e4_P2_4;
        E4_P2_5 = e4_P2_5;
        E4_P3_1 = e4_P3_1;
        E4_P3_2 = e4_P3_2;
        E4_P3_3 = e4_P3_3;
        E4_P3_4 = e4_P3_4;
        E4_P3_5 = e4_P3_5;
    }

    public String getEVALUACION4_ID() {
        return EVALUACION4_ID;
    }

    public void setEVALUACION4_ID(String EVALUACION4_ID) {
        this.EVALUACION4_ID = EVALUACION4_ID;
    }

    public String getE4_P1_1() {
        return E4_P1_1;
    }

    public void setE4_P1_1(String e4_P1_1) {
        E4_P1_1 = e4_P1_1;
    }

    public String getE4_P1_2() {
        return E4_P1_2;
    }

    public void setE4_P1_2(String e4_P1_2) {
        E4_P1_2 = e4_P1_2;
    }

    public String getE4_P1_3() {
        return E4_P1_3;
    }

    public void setE4_P1_3(String e4_P1_3) {
        E4_P1_3 = e4_P1_3;
    }

    public String getE4_P1_4() {
        return E4_P1_4;
    }

    public void setE4_P1_4(String e4_P1_4) {
        E4_P1_4 = e4_P1_4;
    }

    public String getE4_P1_5() {
        return E4_P1_5;
    }

    public void setE4_P1_5(String e4_P1_5) {
        E4_P1_5 = e4_P1_5;
    }

    public String getE4_P1_6() {
        return E4_P1_6;
    }

    public void setE4_P1_6(String e4_P1_6) {
        E4_P1_6 = e4_P1_6;
    }

    public String getE4_P1_7() {
        return E4_P1_7;
    }

    public void setE4_P1_7(String e4_P1_7) {
        E4_P1_7 = e4_P1_7;
    }

    public String getE4_P1_8() {
        return E4_P1_8;
    }

    public void setE4_P1_8(String e4_P1_8) {
        E4_P1_8 = e4_P1_8;
    }

    public String getE4_P1_9() {
        return E4_P1_9;
    }

    public void setE4_P1_9(String e4_P1_9) {
        E4_P1_9 = e4_P1_9;
    }

    public String getE4_P1_10() {
        return E4_P1_10;
    }

    public void setE4_P1_10(String e4_P1_10) {
        E4_P1_10 = e4_P1_10;
    }

    public String getE4_P2_1() {
        return E4_P2_1;
    }

    public void setE4_P2_1(String e4_P2_1) {
        E4_P2_1 = e4_P2_1;
    }

    public String getE4_P2_2() {
        return E4_P2_2;
    }

    public void setE4_P2_2(String e4_P2_2) {
        E4_P2_2 = e4_P2_2;
    }

    public String getE4_P2_3() {
        return E4_P2_3;
    }

    public void setE4_P2_3(String e4_P2_3) {
        E4_P2_3 = e4_P2_3;
    }

    public String getE4_P2_4() {
        return E4_P2_4;
    }

    public void setE4_P2_4(String e4_P2_4) {
        E4_P2_4 = e4_P2_4;
    }

    public String getE4_P2_5() {
        return E4_P2_5;
    }

    public void setE4_P2_5(String e4_P2_5) {
        E4_P2_5 = e4_P2_5;
    }

    public String getE4_P3_1() {
        return E4_P3_1;
    }

    public void setE4_P3_1(String e4_P3_1) {
        E4_P3_1 = e4_P3_1;
    }

    public String getE4_P3_2() {
        return E4_P3_2;
    }

    public void setE4_P3_2(String e4_P3_2) {
        E4_P3_2 = e4_P3_2;
    }

    public String getE4_P3_3() {
        return E4_P3_3;
    }

    public void setE4_P3_3(String e4_P3_3) {
        E4_P3_3 = e4_P3_3;
    }

    public String getE4_P3_4() {
        return E4_P3_4;
    }

    public void setE4_P3_4(String e4_P3_4) {
        E4_P3_4 = e4_P3_4;
    }

    public String getE4_P3_5() {
        return E4_P3_5;
    }

    public void setE4_P3_5(String e4_P3_5) {
        E4_P3_5 = e4_P3_5;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.E4_ID,EVALUACION4_ID);
        contentValues.put(SQLConstantes.E4_P1_1,E4_P1_1);
        contentValues.put(SQLConstantes.E4_P1_2,E4_P1_2);
        contentValues.put(SQLConstantes.E4_P1_3,E4_P1_3);
        contentValues.put(SQLConstantes.E4_P1_4,E4_P1_4);
        contentValues.put(SQLConstantes.E4_P1_5,E4_P1_5);
        contentValues.put(SQLConstantes.E4_P1_6,E4_P1_6);
        contentValues.put(SQLConstantes.E4_P1_7,E4_P1_7);
        contentValues.put(SQLConstantes.E4_P1_8,E4_P1_8);
        contentValues.put(SQLConstantes.E4_P1_9,E4_P1_9);
        contentValues.put(SQLConstantes.E4_P1_10,E4_P1_10);
        contentValues.put(SQLConstantes.E4_P2_1,E4_P2_1);
        contentValues.put(SQLConstantes.E4_P2_2,E4_P2_2);
        contentValues.put(SQLConstantes.E4_P2_3,E4_P2_3);
        contentValues.put(SQLConstantes.E4_P2_4,E4_P2_4);
        contentValues.put(SQLConstantes.E4_P2_5,E4_P2_5);
        contentValues.put(SQLConstantes.E4_P3_1,E4_P3_1);
        contentValues.put(SQLConstantes.E4_P3_2,E4_P3_2);
        contentValues.put(SQLConstantes.E4_P3_3,E4_P3_3);
        contentValues.put(SQLConstantes.E4_P3_4,E4_P3_4);
        contentValues.put(SQLConstantes.E4_P3_5,E4_P3_5);
        return contentValues;

    }


}
