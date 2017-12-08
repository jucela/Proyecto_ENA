package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control3 {
    private String CONTROL3_ID;
    private String C3_P1_1;
    private String C3_P1_2;
    private String C3_P1_3;
    private String C3_P1_4;
    private String C3_P1_5;
    private String C3_P1_6;
    private String C3_P1_7;
    private String C3_P1_8;
    private String C3_P1_9;
    private String C3_P1_10;
    private String C3_P1_11;
    private String C3_P1_12;
    private String C3_P1_13;
    private String C3_P1_14;
    private String C3_P1_15;
    private String C3_P2_1;
    private String C3_P2_2;
    private String C3_P2_3;
    private String C3_P2_4;
    private String C3_P2_5;

    public Control3(){
        CONTROL3_ID = "";
        C3_P1_1 = "";
        C3_P1_2 = "";
        C3_P1_3 = "";
        C3_P1_4 = "";
        C3_P1_5 = "";
        C3_P1_6 = "";
        C3_P1_7 = "";
        C3_P1_8 = "";
        C3_P1_9 = "";
        C3_P1_10 = "";
        C3_P1_11 = "";
        C3_P1_12 = "";
        C3_P1_13 = "";
        C3_P1_14 = "";
        C3_P1_15 = "";
        C3_P2_1 = "";
        C3_P2_2 = "";
        C3_P2_3 = "";
        C3_P2_4 = "";
        C3_P2_5 = "";


    }

    public Control3(String CONTROL3_ID, String c3_P1_1, String c3_P1_2, String c3_P1_3, String c3_P1_4, String c3_P1_5, String c3_P1_6, String c3_P1_7, String c3_P1_8, String c3_P1_9, String c3_P1_10, String c3_P1_11, String c3_P1_12, String c3_P1_13, String c3_P1_14, String c3_P1_15, String c3_P2_1, String c3_P2_2, String c3_P2_3, String c3_P2_4, String c3_P2_5) {
        this.CONTROL3_ID = CONTROL3_ID;
        C3_P1_1 = c3_P1_1;
        C3_P1_2 = c3_P1_2;
        C3_P1_3 = c3_P1_3;
        C3_P1_4 = c3_P1_4;
        C3_P1_5 = c3_P1_5;
        C3_P1_6 = c3_P1_6;
        C3_P1_7 = c3_P1_7;
        C3_P1_8 = c3_P1_8;
        C3_P1_9 = c3_P1_9;
        C3_P1_10 = c3_P1_10;
        C3_P1_11 = c3_P1_11;
        C3_P1_12 = c3_P1_12;
        C3_P1_13 = c3_P1_13;
        C3_P1_14 = c3_P1_14;
        C3_P1_15 = c3_P1_15;
        C3_P2_1 = c3_P2_1;
        C3_P2_2 = c3_P2_2;
        C3_P2_3 = c3_P2_3;
        C3_P2_4 = c3_P2_4;
        C3_P2_5 = c3_P2_5;
    }

    public String getCONTROL3_ID() {
        return CONTROL3_ID;
    }

    public void setCONTROL3_ID(String CONTROL3_ID) {
        this.CONTROL3_ID = CONTROL3_ID;
    }

    public String getC3_P1_1() {
        return C3_P1_1;
    }

    public void setC3_P1_1(String c3_P1_1) {
        C3_P1_1 = c3_P1_1;
    }

    public String getC3_P1_2() {
        return C3_P1_2;
    }

    public void setC3_P1_2(String c3_P1_2) {
        C3_P1_2 = c3_P1_2;
    }

    public String getC3_P1_3() {
        return C3_P1_3;
    }

    public void setC3_P1_3(String c3_P1_3) {
        C3_P1_3 = c3_P1_3;
    }

    public String getC3_P1_4() {
        return C3_P1_4;
    }

    public void setC3_P1_4(String c3_P1_4) {
        C3_P1_4 = c3_P1_4;
    }

    public String getC3_P1_5() {
        return C3_P1_5;
    }

    public void setC3_P1_5(String c3_P1_5) {
        C3_P1_5 = c3_P1_5;
    }

    public String getC3_P1_6() {
        return C3_P1_6;
    }

    public void setC3_P1_6(String c3_P1_6) {
        C3_P1_6 = c3_P1_6;
    }

    public String getC3_P1_7() {
        return C3_P1_7;
    }

    public void setC3_P1_7(String c3_P1_7) {
        C3_P1_7 = c3_P1_7;
    }

    public String getC3_P1_8() {
        return C3_P1_8;
    }

    public void setC3_P1_8(String c3_P1_8) {
        C3_P1_8 = c3_P1_8;
    }

    public String getC3_P1_9() {
        return C3_P1_9;
    }

    public void setC3_P1_9(String c3_P1_9) {
        C3_P1_9 = c3_P1_9;
    }

    public String getC3_P1_10() {
        return C3_P1_10;
    }

    public void setC3_P1_10(String c3_P1_10) {
        C3_P1_10 = c3_P1_10;
    }

    public String getC3_P1_11() {
        return C3_P1_11;
    }

    public void setC3_P1_11(String c3_P1_11) {
        C3_P1_11 = c3_P1_11;
    }

    public String getC3_P1_12() {
        return C3_P1_12;
    }

    public void setC3_P1_12(String c3_P1_12) {
        C3_P1_12 = c3_P1_12;
    }

    public String getC3_P1_13() {
        return C3_P1_13;
    }

    public void setC3_P1_13(String c3_P1_13) {
        C3_P1_13 = c3_P1_13;
    }

    public String getC3_P1_14() {
        return C3_P1_14;
    }

    public void setC3_P1_14(String c3_P1_14) {
        C3_P1_14 = c3_P1_14;
    }

    public String getC3_P1_15() {
        return C3_P1_15;
    }

    public void setC3_P1_15(String c3_P1_15) {
        C3_P1_15 = c3_P1_15;
    }

    public String getC3_P2_1() {
        return C3_P2_1;
    }

    public void setC3_P2_1(String c3_P2_1) {
        C3_P2_1 = c3_P2_1;
    }

    public String getC3_P2_2() {
        return C3_P2_2;
    }

    public void setC3_P2_2(String c3_P2_2) {
        C3_P2_2 = c3_P2_2;
    }

    public String getC3_P2_3() {
        return C3_P2_3;
    }

    public void setC3_P2_3(String c3_P2_3) {
        C3_P2_3 = c3_P2_3;
    }

    public String getC3_P2_4() {
        return C3_P2_4;
    }

    public void setC3_P2_4(String c3_P2_4) {
        C3_P2_4 = c3_P2_4;
    }

    public String getC3_P2_5() {
        return C3_P2_5;
    }

    public void setC3_P2_5(String c3_P2_5) {
        C3_P2_5 = c3_P2_5;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.C3_ID,CONTROL3_ID);
        contentValues.put(SQLConstantes.C3_P1_1,C3_P1_1);
        contentValues.put(SQLConstantes.C3_P1_2,C3_P1_2);
        contentValues.put(SQLConstantes.C3_P1_3,C3_P1_3);
        contentValues.put(SQLConstantes.C3_P1_4,C3_P1_4);
        contentValues.put(SQLConstantes.C3_P1_5,C3_P1_5);
        contentValues.put(SQLConstantes.C3_P1_6,C3_P1_6);
        contentValues.put(SQLConstantes.C3_P1_7,C3_P1_7);
        contentValues.put(SQLConstantes.C3_P1_8,C3_P1_8);
        contentValues.put(SQLConstantes.C3_P1_9,C3_P1_9);
        contentValues.put(SQLConstantes.C3_P1_10,C3_P1_10);
        contentValues.put(SQLConstantes.C3_P1_11,C3_P1_11);
        contentValues.put(SQLConstantes.C3_P1_12,C3_P1_12);
        contentValues.put(SQLConstantes.C3_P1_13,C3_P1_13);
        contentValues.put(SQLConstantes.C3_P1_14,C3_P1_14);
        contentValues.put(SQLConstantes.C3_P1_15,C3_P1_15);
        contentValues.put(SQLConstantes.C3_P2_1,C3_P2_1);
        contentValues.put(SQLConstantes.C3_P2_2,C3_P2_2);
        contentValues.put(SQLConstantes.C3_P2_3,C3_P2_3);
        contentValues.put(SQLConstantes.C3_P2_4,C3_P2_4);
        contentValues.put(SQLConstantes.C3_P2_5,C3_P2_5);


        return contentValues;

    }


}
