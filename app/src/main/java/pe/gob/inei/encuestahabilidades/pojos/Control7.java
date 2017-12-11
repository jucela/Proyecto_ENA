package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control7 {
    private String CONTROL7_ID;
    private String C7_P1_1;
    private String C7_P1_2;
    private String C7_P1_3;
    private String C7_P1_4;
    private String C7_P1_5;
    private String C7_P1_6;
    private String C7_P2_1;
    private String C7_P2_2;
    private String C7_P2_3;
    private String C7_P2_4;
    private String C7_P2_5;
    private String C7_P2_6;
    private String C7_P2_7;
    private String C7_P2_8;
    private String C7_P2_9;
    private String C7_P2_10;
    private String C7_P2_11;
    private String C7_P2_12;
    private String C7_P2_13;
    private String C7_P2_14;

    public Control7(){
        CONTROL7_ID = "";
        C7_P1_1 = "";
        C7_P1_2 = "";
        C7_P1_3 = "";
        C7_P1_4 = "";
        C7_P1_5 = "";
        C7_P1_6 = "";
        C7_P2_1 = "";
        C7_P2_2 = "";
        C7_P2_3 = "";
        C7_P2_4 = "";
        C7_P2_5 = "";
        C7_P2_6 = "";
        C7_P2_7 = "";
        C7_P2_8 = "";
        C7_P2_9 = "";
        C7_P2_10 = "";
        C7_P2_11 = "";
        C7_P2_12 = "";
        C7_P2_13 = "";
        C7_P2_14 = "";
   }

    public Control7(String CONTROL7_ID, String c7_P1_1, String c7_P1_2, String c7_P1_3, String c7_P1_4, String c7_P1_5, String c7_P1_6, String c7_P2_1, String c7_P2_2, String c7_P2_3, String c7_P2_4, String c7_P2_5, String c7_P2_6, String c7_P2_7, String c7_P2_8, String c7_P2_9, String c7_P2_10, String c7_P2_11, String c7_P2_12, String c7_P2_13, String c7_P2_14) {
        this.CONTROL7_ID = CONTROL7_ID;
        C7_P1_1 = c7_P1_1;
        C7_P1_2 = c7_P1_2;
        C7_P1_3 = c7_P1_3;
        C7_P1_4 = c7_P1_4;
        C7_P1_5 = c7_P1_5;
        C7_P1_6 = c7_P1_6;
        C7_P2_1 = c7_P2_1;
        C7_P2_2 = c7_P2_2;
        C7_P2_3 = c7_P2_3;
        C7_P2_4 = c7_P2_4;
        C7_P2_5 = c7_P2_5;
        C7_P2_6 = c7_P2_6;
        C7_P2_7 = c7_P2_7;
        C7_P2_8 = c7_P2_8;
        C7_P2_9 = c7_P2_9;
        C7_P2_10 = c7_P2_10;
        C7_P2_11 = c7_P2_11;
        C7_P2_12 = c7_P2_12;
        C7_P2_13 = c7_P2_13;
        C7_P2_14 = c7_P2_14;
    }

    public String getCONTROL7_ID() {
        return CONTROL7_ID;
    }

    public void setCONTROL7_ID(String CONTROL7_ID) {
        this.CONTROL7_ID = CONTROL7_ID;
    }

    public String getC7_P1_1() {
        return C7_P1_1;
    }

    public void setC7_P1_1(String c7_P1_1) {
        C7_P1_1 = c7_P1_1;
    }

    public String getC7_P1_2() {
        return C7_P1_2;
    }

    public void setC7_P1_2(String c7_P1_2) {
        C7_P1_2 = c7_P1_2;
    }

    public String getC7_P1_3() {
        return C7_P1_3;
    }

    public void setC7_P1_3(String c7_P1_3) {
        C7_P1_3 = c7_P1_3;
    }

    public String getC7_P1_4() {
        return C7_P1_4;
    }

    public void setC7_P1_4(String c7_P1_4) {
        C7_P1_4 = c7_P1_4;
    }

    public String getC7_P1_5() {
        return C7_P1_5;
    }

    public void setC7_P1_5(String c7_P1_5) {
        C7_P1_5 = c7_P1_5;
    }

    public String getC7_P1_6() {
        return C7_P1_6;
    }

    public void setC7_P1_6(String c7_P1_6) {
        C7_P1_6 = c7_P1_6;
    }

    public String getC7_P2_1() {
        return C7_P2_1;
    }

    public void setC7_P2_1(String c7_P2_1) {
        C7_P2_1 = c7_P2_1;
    }

    public String getC7_P2_2() {
        return C7_P2_2;
    }

    public void setC7_P2_2(String c7_P2_2) {
        C7_P2_2 = c7_P2_2;
    }

    public String getC7_P2_3() {
        return C7_P2_3;
    }

    public void setC7_P2_3(String c7_P2_3) {
        C7_P2_3 = c7_P2_3;
    }

    public String getC7_P2_4() {
        return C7_P2_4;
    }

    public void setC7_P2_4(String c7_P2_4) {
        C7_P2_4 = c7_P2_4;
    }

    public String getC7_P2_5() {
        return C7_P2_5;
    }

    public void setC7_P2_5(String c7_P2_5) {
        C7_P2_5 = c7_P2_5;
    }

    public String getC7_P2_6() {
        return C7_P2_6;
    }

    public void setC7_P2_6(String c7_P2_6) {
        C7_P2_6 = c7_P2_6;
    }

    public String getC7_P2_7() {
        return C7_P2_7;
    }

    public void setC7_P2_7(String c7_P2_7) {
        C7_P2_7 = c7_P2_7;
    }

    public String getC7_P2_8() {
        return C7_P2_8;
    }

    public void setC7_P2_8(String c7_P2_8) {
        C7_P2_8 = c7_P2_8;
    }

    public String getC7_P2_9() {
        return C7_P2_9;
    }

    public void setC7_P2_9(String c7_P2_9) {
        C7_P2_9 = c7_P2_9;
    }

    public String getC7_P2_10() {
        return C7_P2_10;
    }

    public void setC7_P2_10(String c7_P2_10) {
        C7_P2_10 = c7_P2_10;
    }

    public String getC7_P2_11() {
        return C7_P2_11;
    }

    public void setC7_P2_11(String c7_P2_11) {
        C7_P2_11 = c7_P2_11;
    }

    public String getC7_P2_12() {
        return C7_P2_12;
    }

    public void setC7_P2_12(String c7_P2_12) {
        C7_P2_12 = c7_P2_12;
    }

    public String getC7_P2_13() {
        return C7_P2_13;
    }

    public void setC7_P2_13(String c7_P2_13) {
        C7_P2_13 = c7_P2_13;
    }

    public String getC7_P2_14() {
        return C7_P2_14;
    }

    public void setC7_P2_14(String c7_P2_14) {
        C7_P2_14 = c7_P2_14;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.C7_ID,CONTROL7_ID);
        contentValues.put(SQLConstantes.C7_P1_1,C7_P1_1);
        contentValues.put(SQLConstantes.C7_P1_2,C7_P1_2);
        contentValues.put(SQLConstantes.C7_P1_3,C7_P1_3);
        contentValues.put(SQLConstantes.C7_P1_4,C7_P1_4);
        contentValues.put(SQLConstantes.C7_P1_5,C7_P1_5);
        contentValues.put(SQLConstantes.C7_P1_6,C7_P1_6);
        contentValues.put(SQLConstantes.C7_P2_1,C7_P2_1);
        contentValues.put(SQLConstantes.C7_P2_2,C7_P2_2);
        contentValues.put(SQLConstantes.C7_P2_3,C7_P2_3);
        contentValues.put(SQLConstantes.C7_P2_4,C7_P2_4);
        contentValues.put(SQLConstantes.C7_P2_5,C7_P2_5);
        contentValues.put(SQLConstantes.C7_P2_6,C7_P2_6);
        contentValues.put(SQLConstantes.C7_P2_7,C7_P2_7);
        contentValues.put(SQLConstantes.C7_P2_8,C7_P2_8);
        contentValues.put(SQLConstantes.C7_P2_9,C7_P2_9);
        contentValues.put(SQLConstantes.C7_P2_10,C7_P2_10);
        contentValues.put(SQLConstantes.C7_P2_11,C7_P2_11);
        contentValues.put(SQLConstantes.C7_P2_12,C7_P2_12);
        contentValues.put(SQLConstantes.C7_P2_13,C7_P2_13);
        contentValues.put(SQLConstantes.C7_P2_14,C7_P2_14);
        return contentValues;

    }


}
