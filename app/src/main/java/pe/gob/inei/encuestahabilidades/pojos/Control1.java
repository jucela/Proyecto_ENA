package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control1 {
    private String CONTROL1_ID;
    private String C1_P1;
    private String C1_P2;
    private String C1_P3_1;
    private String C1_P3_2;
    private String C1_P3_3;
    private String C1_P3_4;
    private String C1_P4_1;
    private String C1_P4_2;
    private String C1_P4_3;
    private String C1_P4_4;
    private String C1_P4_5;
    private String C1_P4_6;
    private String C1_P4_7;
    private String C1_P4_8;
    private String C1_P4_9;
    private String C1_P4_10;
    private String C1_P4_11;
    private String C1_P4_12;



    public Control1(){
        CONTROL1_ID = "";
        C1_P1 = "";
        C1_P2 = "";
        C1_P3_1 = "";
        C1_P3_2 = "";
        C1_P3_3 = "";
        C1_P3_4 = "";
        C1_P4_1 = "";
        C1_P4_2 = "";
        C1_P4_3 = "";
        C1_P4_4 = "";
        C1_P4_5 = "";
        C1_P4_6 = "";
        C1_P4_7 = "";
        C1_P4_8 = "";
        C1_P4_9 = "";
        C1_P4_10 = "";
        C1_P4_11 = "";
        C1_P4_12 = "";


    }

    public Control1(String CONTROL1_ID, String c1_P1, String c1_P2, String c1_P3_1, String c1_P3_2, String c1_P3_3, String c1_P3_4, String c1_P4_1, String c1_P4_2, String c1_P4_3, String c1_P4_4, String c1_P4_5, String c1_P4_6, String c1_P4_7, String c1_P4_8, String c1_P4_9, String c1_P4_10, String c1_P4_11, String c1_P4_12) {
        this.CONTROL1_ID = CONTROL1_ID;
        C1_P1 = c1_P1;
        C1_P2 = c1_P2;
        C1_P3_1 = c1_P3_1;
        C1_P3_2 = c1_P3_2;
        C1_P3_3 = c1_P3_3;
        C1_P3_4 = c1_P3_4;
        C1_P4_1 = c1_P4_1;
        C1_P4_2 = c1_P4_2;
        C1_P4_3 = c1_P4_3;
        C1_P4_4 = c1_P4_4;
        C1_P4_5 = c1_P4_5;
        C1_P4_6 = c1_P4_6;
        C1_P4_7 = c1_P4_7;
        C1_P4_8 = c1_P4_8;
        C1_P4_9 = c1_P4_9;
        C1_P4_10 = c1_P4_10;
        C1_P4_11 = c1_P4_11;
        C1_P4_12 = c1_P4_12;
    }

    public String getCONTROL1_ID() {
        return CONTROL1_ID;
    }

    public void setCONTROL1_ID(String CONTROL1_ID) {
        this.CONTROL1_ID = CONTROL1_ID;
    }

    public String getC1_P1() {
        return C1_P1;
    }

    public void setC1_P1(String c1_P1) {
        C1_P1 = c1_P1;
    }

    public String getC1_P2() {
        return C1_P2;
    }

    public void setC1_P2(String c1_P2) {
        C1_P2 = c1_P2;
    }

    public String getC1_P3_1() {
        return C1_P3_1;
    }

    public void setC1_P3_1(String c1_P3_1) {
        C1_P3_1 = c1_P3_1;
    }

    public String getC1_P3_2() {
        return C1_P3_2;
    }

    public void setC1_P3_2(String c1_P3_2) {
        C1_P3_2 = c1_P3_2;
    }

    public String getC1_P3_3() {
        return C1_P3_3;
    }

    public void setC1_P3_3(String c1_P3_3) {
        C1_P3_3 = c1_P3_3;
    }

    public String getC1_P3_4() {
        return C1_P3_4;
    }

    public void setC1_P3_4(String c1_P3_4) {
        C1_P3_4 = c1_P3_4;
    }

    public String getC1_P4_1() {
        return C1_P4_1;
    }

    public void setC1_P4_1(String c1_P4_1) {
        C1_P4_1 = c1_P4_1;
    }

    public String getC1_P4_2() {
        return C1_P4_2;
    }

    public void setC1_P4_2(String c1_P4_2) {
        C1_P4_2 = c1_P4_2;
    }

    public String getC1_P4_3() {
        return C1_P4_3;
    }

    public void setC1_P4_3(String c1_P4_3) {
        C1_P4_3 = c1_P4_3;
    }

    public String getC1_P4_4() {
        return C1_P4_4;
    }

    public void setC1_P4_4(String c1_P4_4) {
        C1_P4_4 = c1_P4_4;
    }

    public String getC1_P4_5() {
        return C1_P4_5;
    }

    public void setC1_P4_5(String c1_P4_5) {
        C1_P4_5 = c1_P4_5;
    }

    public String getC1_P4_6() {
        return C1_P4_6;
    }

    public void setC1_P4_6(String c1_P4_6) {
        C1_P4_6 = c1_P4_6;
    }

    public String getC1_P4_7() {
        return C1_P4_7;
    }

    public void setC1_P4_7(String c1_P4_7) {
        C1_P4_7 = c1_P4_7;
    }

    public String getC1_P4_8() {
        return C1_P4_8;
    }

    public void setC1_P4_8(String c1_P4_8) {
        C1_P4_8 = c1_P4_8;
    }

    public String getC1_P4_9() {
        return C1_P4_9;
    }

    public void setC1_P4_9(String c1_P4_9) {
        C1_P4_9 = c1_P4_9;
    }

    public String getC1_P4_10() {
        return C1_P4_10;
    }

    public void setC1_P4_10(String c1_P4_10) {
        C1_P4_10 = c1_P4_10;
    }

    public String getC1_P4_11() {
        return C1_P4_11;
    }

    public void setC1_P4_11(String c1_P4_11) {
        C1_P4_11 = c1_P4_11;
    }

    public String getC1_P4_12() {
        return C1_P4_12;
    }

    public void setC1_P4_12(String c1_P4_12) {
        C1_P4_12 = c1_P4_12;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(20);
        contentValues.put(SQLConstantes.C1_ID,CONTROL1_ID);
        contentValues.put(SQLConstantes.C1_P1,C1_P1);
        contentValues.put(SQLConstantes.C1_P2,C1_P2);
        contentValues.put(SQLConstantes.C1_P3_1,C1_P3_1);
        contentValues.put(SQLConstantes.C1_P3_2,C1_P3_2);
        contentValues.put(SQLConstantes.C1_P3_3,C1_P3_3);
        contentValues.put(SQLConstantes.C1_P3_4,C1_P3_4);
        contentValues.put(SQLConstantes.C1_P4_1,C1_P4_1);
        contentValues.put(SQLConstantes.C1_P4_2,C1_P4_2);
        contentValues.put(SQLConstantes.C1_P4_3,C1_P4_3);
        contentValues.put(SQLConstantes.C1_P4_4,C1_P4_4);
        contentValues.put(SQLConstantes.C1_P4_5,C1_P4_5);
        contentValues.put(SQLConstantes.C1_P4_6,C1_P4_6);
        contentValues.put(SQLConstantes.C1_P4_7,C1_P4_7);
        contentValues.put(SQLConstantes.C1_P4_8,C1_P4_8);
        contentValues.put(SQLConstantes.C1_P4_9,C1_P4_9);
        contentValues.put(SQLConstantes.C1_P4_10,C1_P4_10);
        contentValues.put(SQLConstantes.C1_P4_11,C1_P4_11);
        contentValues.put(SQLConstantes.C1_P4_12,C1_P4_12);
        return contentValues;

    }


}
