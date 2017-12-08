package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control2 {
    private String CONTROL2_ID;
    private String C2_P1_1;
    private String C2_P1_2;
    private String C2_P1_3;
    private String C2_P1_4;
    private String C2_P1_5;
    private String C2_P1_6;
    private String C2_P1_7;
    private String C2_P1_8;
    private String C2_P1_9;
    private String C2_P1_10;
    private String C2_P1_11;
    private String C2_P1_12;
    private String C2_P1_13;
    private String C2_P2_1;
    private String C2_P2_2;
    private String C2_P2_3;
    private String C2_P2_4;
    private String C2_P2_5;
    private String C2_P2_6;
    private String C2_P2_7;


    public Control2(){
        CONTROL2_ID = "";
        C2_P1_1 = "";
        C2_P1_2 = "";
        C2_P1_3 = "";
        C2_P1_4 = "";
        C2_P1_5 = "";
        C2_P1_6 = "";
        C2_P1_7 = "";
        C2_P1_8 = "";
        C2_P1_9 = "";
        C2_P1_10 = "";
        C2_P1_11 = "";
        C2_P1_12 = "";
        C2_P1_13 = "";
        C2_P2_1 = "";
        C2_P2_2 = "";
        C2_P2_3 = "";
        C2_P2_4 = "";
        C2_P2_5 = "";
        C2_P2_6 = "";
        C2_P2_7 = "";
    }

    public Control2(String CONTROL2_ID, String c2_P1_1, String c2_P1_2, String c2_P1_3, String c2_P1_4, String c2_P1_5, String c2_P1_6, String c2_P1_7, String c2_P1_8, String c2_P1_9, String c2_P1_10, String c2_P1_11, String c2_P1_12, String c2_P1_13, String c2_P2_1, String c2_P2_2, String c2_P2_3, String c2_P2_4, String c2_P2_5, String c2_P2_6, String c2_P2_7) {
        this.CONTROL2_ID = CONTROL2_ID;
        C2_P1_1 = c2_P1_1;
        C2_P1_2 = c2_P1_2;
        C2_P1_3 = c2_P1_3;
        C2_P1_4 = c2_P1_4;
        C2_P1_5 = c2_P1_5;
        C2_P1_6 = c2_P1_6;
        C2_P1_7 = c2_P1_7;
        C2_P1_8 = c2_P1_8;
        C2_P1_9 = c2_P1_9;
        C2_P1_10 = c2_P1_10;
        C2_P1_11 = c2_P1_11;
        C2_P1_12 = c2_P1_12;
        C2_P1_13 = c2_P1_13;
        C2_P2_1 = c2_P2_1;
        C2_P2_2 = c2_P2_2;
        C2_P2_3 = c2_P2_3;
        C2_P2_4 = c2_P2_4;
        C2_P2_5 = c2_P2_5;
        C2_P2_6 = c2_P2_6;
        C2_P2_7 = c2_P2_7;
    }

    public String getCONTROL2_ID() {
        return CONTROL2_ID;
    }

    public void setCONTROL2_ID(String CONTROL2_ID) {
        this.CONTROL2_ID = CONTROL2_ID;
    }

    public String getC2_P1_1() {
        return C2_P1_1;
    }

    public void setC2_P1_1(String c2_P1_1) {
        C2_P1_1 = c2_P1_1;
    }

    public String getC2_P1_2() {
        return C2_P1_2;
    }

    public void setC2_P1_2(String c2_P1_2) {
        C2_P1_2 = c2_P1_2;
    }

    public String getC2_P1_3() {
        return C2_P1_3;
    }

    public void setC2_P1_3(String c2_P1_3) {
        C2_P1_3 = c2_P1_3;
    }

    public String getC2_P1_4() {
        return C2_P1_4;
    }

    public void setC2_P1_4(String c2_P1_4) {
        C2_P1_4 = c2_P1_4;
    }

    public String getC2_P1_5() {
        return C2_P1_5;
    }

    public void setC2_P1_5(String c2_P1_5) {
        C2_P1_5 = c2_P1_5;
    }

    public String getC2_P1_6() {
        return C2_P1_6;
    }

    public void setC2_P1_6(String c2_P1_6) {
        C2_P1_6 = c2_P1_6;
    }

    public String getC2_P1_7() {
        return C2_P1_7;
    }

    public void setC2_P1_7(String c2_P1_7) {
        C2_P1_7 = c2_P1_7;
    }

    public String getC2_P1_8() {
        return C2_P1_8;
    }

    public void setC2_P1_8(String c2_P1_8) {
        C2_P1_8 = c2_P1_8;
    }

    public String getC2_P1_9() {
        return C2_P1_9;
    }

    public void setC2_P1_9(String c2_P1_9) {
        C2_P1_9 = c2_P1_9;
    }

    public String getC2_P1_10() {
        return C2_P1_10;
    }

    public void setC2_P1_10(String c2_P1_10) {
        C2_P1_10 = c2_P1_10;
    }

    public String getC2_P1_11() {
        return C2_P1_11;
    }

    public void setC2_P1_11(String c2_P1_11) {
        C2_P1_11 = c2_P1_11;
    }

    public String getC2_P1_12() {
        return C2_P1_12;
    }

    public void setC2_P1_12(String c2_P1_12) {
        C2_P1_12 = c2_P1_12;
    }

    public String getC2_P1_13() {
        return C2_P1_13;
    }

    public void setC2_P1_13(String c2_P1_13) {
        C2_P1_13 = c2_P1_13;
    }

    public String getC2_P2_1() {
        return C2_P2_1;
    }

    public void setC2_P2_1(String c2_P2_1) {
        C2_P2_1 = c2_P2_1;
    }

    public String getC2_P2_2() {
        return C2_P2_2;
    }

    public void setC2_P2_2(String c2_P2_2) {
        C2_P2_2 = c2_P2_2;
    }

    public String getC2_P2_3() {
        return C2_P2_3;
    }

    public void setC2_P2_3(String c2_P2_3) {
        C2_P2_3 = c2_P2_3;
    }

    public String getC2_P2_4() {
        return C2_P2_4;
    }

    public void setC2_P2_4(String c2_P2_4) {
        C2_P2_4 = c2_P2_4;
    }

    public String getC2_P2_5() {
        return C2_P2_5;
    }

    public void setC2_P2_5(String c2_P2_5) {
        C2_P2_5 = c2_P2_5;
    }

    public String getC2_P2_6() {
        return C2_P2_6;
    }

    public void setC2_P2_6(String c2_P2_6) {
        C2_P2_6 = c2_P2_6;
    }

    public String getC2_P2_7() {
        return C2_P2_7;
    }

    public void setC2_P2_7(String c2_P2_7) {
        C2_P2_7 = c2_P2_7;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.C2_ID,CONTROL2_ID);
        contentValues.put(SQLConstantes.C2_P1_1,C2_P1_1);
        contentValues.put(SQLConstantes.C2_P1_2,C2_P1_2);
        contentValues.put(SQLConstantes.C2_P1_3,C2_P1_3);
        contentValues.put(SQLConstantes.C2_P1_4,C2_P1_4);
        contentValues.put(SQLConstantes.C2_P1_5,C2_P1_5);
        contentValues.put(SQLConstantes.C2_P1_6,C2_P1_6);
        contentValues.put(SQLConstantes.C2_P1_7,C2_P1_7);
        contentValues.put(SQLConstantes.C2_P1_8,C2_P1_8);
        contentValues.put(SQLConstantes.C2_P1_9,C2_P1_9);
        contentValues.put(SQLConstantes.C2_P1_10,C2_P1_10);
        contentValues.put(SQLConstantes.C2_P1_11,C2_P1_11);
        contentValues.put(SQLConstantes.C2_P1_12,C2_P1_12);
        contentValues.put(SQLConstantes.C2_P1_13,C2_P1_13);
        contentValues.put(SQLConstantes.C2_P2_1,C2_P2_1);
        contentValues.put(SQLConstantes.C2_P2_2,C2_P2_2);
        contentValues.put(SQLConstantes.C2_P2_3,C2_P2_3);
        contentValues.put(SQLConstantes.C2_P2_4,C2_P2_4);
        contentValues.put(SQLConstantes.C2_P2_5,C2_P2_5);
        contentValues.put(SQLConstantes.C2_P2_6,C2_P2_6);
        contentValues.put(SQLConstantes.C2_P2_7,C2_P2_7);
        return contentValues;

    }


}
