package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control6 {
    private String CONTROL6_ID;
    private String C6_P1_1;
    private String C6_P1_2;
    private String C6_P1_3;
    private String C6_P1_4;
    private String C6_P1_5;
    private String C6_P1_6;
    private String C6_P1_7;
    private String C6_P1_8;
    private String C6_P1_9;
    private String C6_P1_10;
    private String C6_P1_11;
    private String C6_P1_12;
    private String C6_P1_13;
    private String C6_P1_14;
    private String C6_P1_15;
    private String C6_P2_1;
    private String C6_P2_2;
    private String C6_P2_3;
    private String C6_P2_4;
    private String C6_P2_5;




    public Control6(){
        CONTROL6_ID = "";
        C6_P1_1 = "";
        C6_P1_2 = "";
        C6_P1_3 = "";
        C6_P1_4 = "";
        C6_P1_5 = "";
        C6_P1_6 = "";
        C6_P1_7 = "";
        C6_P1_8 = "";
        C6_P1_9 = "";
        C6_P1_10 = "";
        C6_P1_11 = "";
        C6_P1_12 = "";
        C6_P1_13 = "";
        C6_P1_14 = "";
        C6_P1_15 = "";
        C6_P2_1 = "";
        C6_P2_2 = "";
        C6_P2_3 = "";
        C6_P2_4 = "";
        C6_P2_5 = "";
    }

    public Control6(String CONTROL6_ID, String c6_P1_1, String c6_P1_2, String c6_P1_3, String c6_P1_4, String c6_P1_5, String c6_P1_6, String c6_P1_7, String c6_P1_8, String c6_P1_9, String c6_P1_10, String c6_P1_11, String c6_P1_12, String c6_P1_13, String c6_P1_14, String c6_P1_15, String c6_P2_1, String c6_P2_2, String c6_P2_3, String c6_P2_4, String c6_P2_5) {
        this.CONTROL6_ID = CONTROL6_ID;
        C6_P1_1 = c6_P1_1;
        C6_P1_2 = c6_P1_2;
        C6_P1_3 = c6_P1_3;
        C6_P1_4 = c6_P1_4;
        C6_P1_5 = c6_P1_5;
        C6_P1_6 = c6_P1_6;
        C6_P1_7 = c6_P1_7;
        C6_P1_8 = c6_P1_8;
        C6_P1_9 = c6_P1_9;
        C6_P1_10 = c6_P1_10;
        C6_P1_11 = c6_P1_11;
        C6_P1_12 = c6_P1_12;
        C6_P1_13 = c6_P1_13;
        C6_P1_14 = c6_P1_14;
        C6_P1_15 = c6_P1_15;
        C6_P2_1 = c6_P2_1;
        C6_P2_2 = c6_P2_2;
        C6_P2_3 = c6_P2_3;
        C6_P2_4 = c6_P2_4;
        C6_P2_5 = c6_P2_5;
    }

    public String getCONTROL6_ID() {
        return CONTROL6_ID;
    }

    public void setCONTROL6_ID(String CONTROL6_ID) {
        this.CONTROL6_ID = CONTROL6_ID;
    }

    public String getC6_P1_1() {
        return C6_P1_1;
    }

    public void setC6_P1_1(String c6_P1_1) {
        C6_P1_1 = c6_P1_1;
    }

    public String getC6_P1_2() {
        return C6_P1_2;
    }

    public void setC6_P1_2(String c6_P1_2) {
        C6_P1_2 = c6_P1_2;
    }

    public String getC6_P1_3() {
        return C6_P1_3;
    }

    public void setC6_P1_3(String c6_P1_3) {
        C6_P1_3 = c6_P1_3;
    }

    public String getC6_P1_4() {
        return C6_P1_4;
    }

    public void setC6_P1_4(String c6_P1_4) {
        C6_P1_4 = c6_P1_4;
    }

    public String getC6_P1_5() {
        return C6_P1_5;
    }

    public void setC6_P1_5(String c6_P1_5) {
        C6_P1_5 = c6_P1_5;
    }

    public String getC6_P1_6() {
        return C6_P1_6;
    }

    public void setC6_P1_6(String c6_P1_6) {
        C6_P1_6 = c6_P1_6;
    }

    public String getC6_P1_7() {
        return C6_P1_7;
    }

    public void setC6_P1_7(String c6_P1_7) {
        C6_P1_7 = c6_P1_7;
    }

    public String getC6_P1_8() {
        return C6_P1_8;
    }

    public void setC6_P1_8(String c6_P1_8) {
        C6_P1_8 = c6_P1_8;
    }

    public String getC6_P1_9() {
        return C6_P1_9;
    }

    public void setC6_P1_9(String c6_P1_9) {
        C6_P1_9 = c6_P1_9;
    }

    public String getC6_P1_10() {
        return C6_P1_10;
    }

    public void setC6_P1_10(String c6_P1_10) {
        C6_P1_10 = c6_P1_10;
    }

    public String getC6_P1_11() {
        return C6_P1_11;
    }

    public void setC6_P1_11(String c6_P1_11) {
        C6_P1_11 = c6_P1_11;
    }

    public String getC6_P1_12() {
        return C6_P1_12;
    }

    public void setC6_P1_12(String c6_P1_12) {
        C6_P1_12 = c6_P1_12;
    }

    public String getC6_P1_13() {
        return C6_P1_13;
    }

    public void setC6_P1_13(String c6_P1_13) {
        C6_P1_13 = c6_P1_13;
    }

    public String getC6_P1_14() {
        return C6_P1_14;
    }

    public void setC6_P1_14(String c6_P1_14) {
        C6_P1_14 = c6_P1_14;
    }

    public String getC6_P1_15() {
        return C6_P1_15;
    }

    public void setC6_P1_15(String c6_P1_15) {
        C6_P1_15 = c6_P1_15;
    }

    public String getC6_P2_1() {
        return C6_P2_1;
    }

    public void setC6_P2_1(String c6_P2_1) {
        C6_P2_1 = c6_P2_1;
    }

    public String getC6_P2_2() {
        return C6_P2_2;
    }

    public void setC6_P2_2(String c6_P2_2) {
        C6_P2_2 = c6_P2_2;
    }

    public String getC6_P2_3() {
        return C6_P2_3;
    }

    public void setC6_P2_3(String c6_P2_3) {
        C6_P2_3 = c6_P2_3;
    }

    public String getC6_P2_4() {
        return C6_P2_4;
    }

    public void setC6_P2_4(String c6_P2_4) {
        C6_P2_4 = c6_P2_4;
    }

    public String getC6_P2_5() {
        return C6_P2_5;
    }

    public void setC6_P2_5(String c6_P2_5) {
        C6_P2_5 = c6_P2_5;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.C6_ID,CONTROL6_ID);
        contentValues.put(SQLConstantes.C6_P1_1,C6_P1_1);
        contentValues.put(SQLConstantes.C6_P1_2,C6_P1_2);
        contentValues.put(SQLConstantes.C6_P1_3,C6_P1_3);
        contentValues.put(SQLConstantes.C6_P1_4,C6_P1_4);
        contentValues.put(SQLConstantes.C6_P1_5,C6_P1_5);
        contentValues.put(SQLConstantes.C6_P1_6,C6_P1_6);
        contentValues.put(SQLConstantes.C6_P1_7,C6_P1_7);
        contentValues.put(SQLConstantes.C6_P1_8,C6_P1_8);
        contentValues.put(SQLConstantes.C6_P1_9,C6_P1_9);
        contentValues.put(SQLConstantes.C6_P1_10,C6_P1_10);
        contentValues.put(SQLConstantes.C6_P1_11,C6_P1_11);
        contentValues.put(SQLConstantes.C6_P1_12,C6_P1_12);
        contentValues.put(SQLConstantes.C6_P1_13,C6_P1_13);
        contentValues.put(SQLConstantes.C6_P1_14,C6_P1_14);
        contentValues.put(SQLConstantes.C6_P1_15,C6_P1_15);
        contentValues.put(SQLConstantes.C6_P2_1,C6_P2_1);
        contentValues.put(SQLConstantes.C6_P2_2,C6_P2_2);
        contentValues.put(SQLConstantes.C6_P2_3,C6_P2_3);
        contentValues.put(SQLConstantes.C6_P2_4,C6_P2_4);
        contentValues.put(SQLConstantes.C6_P2_5,C6_P2_5);
        return contentValues;

    }


}
