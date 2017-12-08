package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control5 {
    private String CONTROL5_ID;
    private String C5_P1_1;
    private String C5_P1_2;
    private String C5_P1_3;
    private String C5_P1_4;
    private String C5_P1_5;
    private String C5_P2_1;
    private String C5_P2_2;
    private String C5_P2_3;
    private String C5_P2_4;
    private String C5_P2_5;
    private String C5_P2_6;
    private String C5_P2_7;
    private String C5_P2_8;
    private String C5_P2_9;
    private String C5_P2_10;
    private String C5_P2_11;
    private String C5_P2_12;
    private String C5_P2_13;
    private String C5_P2_14;
    private String C5_P2_15;



    public Control5(){
        CONTROL5_ID = "";
        C5_P1_1 = "";
        C5_P1_2 = "";
        C5_P1_3 = "";
        C5_P1_4 = "";
        C5_P1_5 = "";
        C5_P2_1 = "";
        C5_P2_2 = "";
        C5_P2_3 = "";
        C5_P2_4 = "";
        C5_P2_5 = "";
        C5_P2_6 = "";
        C5_P2_7 = "";
        C5_P2_8 = "";
        C5_P2_9 = "";
        C5_P2_10 = "";
        C5_P2_11 = "";
        C5_P2_12 = "";
        C5_P2_13 = "";
        C5_P2_14 = "";
        C5_P2_15 = "";

    }

    public Control5(String CONTROL5_ID, String c5_P1_1, String c5_P1_2, String c5_P1_3, String c5_P1_4, String c5_P1_5, String c5_P2_1, String c5_P2_2, String c5_P2_3, String c5_P2_4, String c5_P2_5, String c5_P2_6, String c5_P2_7, String c5_P2_8, String c5_P2_9, String c5_P2_10, String c5_P2_11, String c5_P2_12, String c5_P2_13, String c5_P2_14, String c5_P2_15) {
        this.CONTROL5_ID = CONTROL5_ID;
        C5_P1_1 = c5_P1_1;
        C5_P1_2 = c5_P1_2;
        C5_P1_3 = c5_P1_3;
        C5_P1_4 = c5_P1_4;
        C5_P1_5 = c5_P1_5;
        C5_P2_1 = c5_P2_1;
        C5_P2_2 = c5_P2_2;
        C5_P2_3 = c5_P2_3;
        C5_P2_4 = c5_P2_4;
        C5_P2_5 = c5_P2_5;
        C5_P2_6 = c5_P2_6;
        C5_P2_7 = c5_P2_7;
        C5_P2_8 = c5_P2_8;
        C5_P2_9 = c5_P2_9;
        C5_P2_10 = c5_P2_10;
        C5_P2_11 = c5_P2_11;
        C5_P2_12 = c5_P2_12;
        C5_P2_13 = c5_P2_13;
        C5_P2_14 = c5_P2_14;
        C5_P2_15 = c5_P2_15;
    }

    public String getCONTROL5_ID() {
        return CONTROL5_ID;
    }

    public void setCONTROL5_ID(String CONTROL5_ID) {
        this.CONTROL5_ID = CONTROL5_ID;
    }

    public String getC5_P1_1() {
        return C5_P1_1;
    }

    public void setC5_P1_1(String c5_P1_1) {
        C5_P1_1 = c5_P1_1;
    }

    public String getC5_P1_2() {
        return C5_P1_2;
    }

    public void setC5_P1_2(String c5_P1_2) {
        C5_P1_2 = c5_P1_2;
    }

    public String getC5_P1_3() {
        return C5_P1_3;
    }

    public void setC5_P1_3(String c5_P1_3) {
        C5_P1_3 = c5_P1_3;
    }

    public String getC5_P1_4() {
        return C5_P1_4;
    }

    public void setC5_P1_4(String c5_P1_4) {
        C5_P1_4 = c5_P1_4;
    }

    public String getC5_P1_5() {
        return C5_P1_5;
    }

    public void setC5_P1_5(String c5_P1_5) {
        C5_P1_5 = c5_P1_5;
    }

    public String getC5_P2_1() {
        return C5_P2_1;
    }

    public void setC5_P2_1(String c5_P2_1) {
        C5_P2_1 = c5_P2_1;
    }

    public String getC5_P2_2() {
        return C5_P2_2;
    }

    public void setC5_P2_2(String c5_P2_2) {
        C5_P2_2 = c5_P2_2;
    }

    public String getC5_P2_3() {
        return C5_P2_3;
    }

    public void setC5_P2_3(String c5_P2_3) {
        C5_P2_3 = c5_P2_3;
    }

    public String getC5_P2_4() {
        return C5_P2_4;
    }

    public void setC5_P2_4(String c5_P2_4) {
        C5_P2_4 = c5_P2_4;
    }

    public String getC5_P2_5() {
        return C5_P2_5;
    }

    public void setC5_P2_5(String c5_P2_5) {
        C5_P2_5 = c5_P2_5;
    }

    public String getC5_P2_6() {
        return C5_P2_6;
    }

    public void setC5_P2_6(String c5_P2_6) {
        C5_P2_6 = c5_P2_6;
    }

    public String getC5_P2_7() {
        return C5_P2_7;
    }

    public void setC5_P2_7(String c5_P2_7) {
        C5_P2_7 = c5_P2_7;
    }

    public String getC5_P2_8() {
        return C5_P2_8;
    }

    public void setC5_P2_8(String c5_P2_8) {
        C5_P2_8 = c5_P2_8;
    }

    public String getC5_P2_9() {
        return C5_P2_9;
    }

    public void setC5_P2_9(String c5_P2_9) {
        C5_P2_9 = c5_P2_9;
    }

    public String getC5_P2_10() {
        return C5_P2_10;
    }

    public void setC5_P2_10(String c5_P2_10) {
        C5_P2_10 = c5_P2_10;
    }

    public String getC5_P2_11() {
        return C5_P2_11;
    }

    public void setC5_P2_11(String c5_P2_11) {
        C5_P2_11 = c5_P2_11;
    }

    public String getC5_P2_12() {
        return C5_P2_12;
    }

    public void setC5_P2_12(String c5_P2_12) {
        C5_P2_12 = c5_P2_12;
    }

    public String getC5_P2_13() {
        return C5_P2_13;
    }

    public void setC5_P2_13(String c5_P2_13) {
        C5_P2_13 = c5_P2_13;
    }

    public String getC5_P2_14() {
        return C5_P2_14;
    }

    public void setC5_P2_14(String c5_P2_14) {
        C5_P2_14 = c5_P2_14;
    }

    public String getC5_P2_15() {
        return C5_P2_15;
    }

    public void setC5_P2_15(String c5_P2_15) {
        C5_P2_15 = c5_P2_15;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.C5_ID,CONTROL5_ID);
        contentValues.put(SQLConstantes.C5_P1_1,C5_P1_1);
        contentValues.put(SQLConstantes.C5_P1_2,C5_P1_2);
        contentValues.put(SQLConstantes.C5_P1_3,C5_P1_3);
        contentValues.put(SQLConstantes.C5_P1_4,C5_P1_4);
        contentValues.put(SQLConstantes.C5_P1_5,C5_P1_5);
        contentValues.put(SQLConstantes.C5_P2_1,C5_P2_1);
        contentValues.put(SQLConstantes.C5_P2_2,C5_P2_2);
        contentValues.put(SQLConstantes.C5_P2_3,C5_P2_3);
        contentValues.put(SQLConstantes.C5_P2_4,C5_P2_4);
        contentValues.put(SQLConstantes.C5_P2_5,C5_P2_5);
        contentValues.put(SQLConstantes.C5_P2_6,C5_P2_6);
        contentValues.put(SQLConstantes.C5_P2_7,C5_P2_7);
        contentValues.put(SQLConstantes.C5_P2_8,C5_P2_8);
        contentValues.put(SQLConstantes.C5_P2_9,C5_P2_9);
        contentValues.put(SQLConstantes.C5_P2_10,C5_P2_10);
        contentValues.put(SQLConstantes.C5_P2_11,C5_P2_11);
        contentValues.put(SQLConstantes.C5_P2_12,C5_P2_12);
        contentValues.put(SQLConstantes.C5_P2_13,C5_P2_13);
        contentValues.put(SQLConstantes.C5_P2_14,C5_P2_14);
        contentValues.put(SQLConstantes.C5_P2_15,C5_P2_15);
        return contentValues;

    }


}
