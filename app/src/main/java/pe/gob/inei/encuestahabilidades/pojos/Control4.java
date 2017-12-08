package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control4 {
    private String CONTROL4_ID;
    private String C4_P1_1;
    private String C4_P1_2;
    private String C4_P1_3;
    private String C4_P1_4;
    private String C4_P1_5;
    private String C4_P2_1;
    private String C4_P2_2;
    private String C4_P2_3;
    private String C4_P2_4;
    private String C4_P2_5;
    private String C4_P2_6;
    private String C4_P2_7;
    private String C4_P2_8;
    private String C4_P2_9;
    private String C4_P2_10;
    private String C4_P2_11;
    private String C4_P2_12;
    private String C4_P2_13;
    private String C4_P2_14;
    private String C4_P2_15;





    public Control4(){
        CONTROL4_ID = "";
        C4_P1_1 = "";
        C4_P1_2 = "";
        C4_P1_3 = "";
        C4_P1_4 = "";
        C4_P1_5 = "";
        C4_P2_1 = "";
        C4_P2_2 = "";
        C4_P2_3 = "";
        C4_P2_4 = "";
        C4_P2_5 = "";
        C4_P2_6 = "";
        C4_P2_7 = "";
        C4_P2_8 = "";
        C4_P2_9 = "";
        C4_P2_10 = "";
        C4_P2_11 = "";
        C4_P2_12 = "";
        C4_P2_13 = "";
        C4_P2_14 = "";
        C4_P2_15 = "";



    }

    public Control4(String CONTROL4_ID, String c4_P1_1, String c4_P1_2, String c4_P1_3, String c4_P1_4, String c4_P1_5, String c4_P2_1, String c4_P2_2, String c4_P2_3, String c4_P2_4, String c4_P2_5, String c4_P2_6, String c4_P2_7, String c4_P2_8, String c4_P2_9, String c4_P2_10, String c4_P2_11, String c4_P2_12, String c4_P2_13, String c4_P2_14, String c4_P2_15) {
        this.CONTROL4_ID = CONTROL4_ID;
        C4_P1_1 = c4_P1_1;
        C4_P1_2 = c4_P1_2;
        C4_P1_3 = c4_P1_3;
        C4_P1_4 = c4_P1_4;
        C4_P1_5 = c4_P1_5;
        C4_P2_1 = c4_P2_1;
        C4_P2_2 = c4_P2_2;
        C4_P2_3 = c4_P2_3;
        C4_P2_4 = c4_P2_4;
        C4_P2_5 = c4_P2_5;
        C4_P2_6 = c4_P2_6;
        C4_P2_7 = c4_P2_7;
        C4_P2_8 = c4_P2_8;
        C4_P2_9 = c4_P2_9;
        C4_P2_10 = c4_P2_10;
        C4_P2_11 = c4_P2_11;
        C4_P2_12 = c4_P2_12;
        C4_P2_13 = c4_P2_13;
        C4_P2_14 = c4_P2_14;
        C4_P2_15 = c4_P2_15;
    }

    public String getCONTROL4_ID() {
        return CONTROL4_ID;
    }

    public void setCONTROL4_ID(String CONTROL4_ID) {
        this.CONTROL4_ID = CONTROL4_ID;
    }

    public String getC4_P1_1() {
        return C4_P1_1;
    }

    public void setC4_P1_1(String c4_P1_1) {
        C4_P1_1 = c4_P1_1;
    }

    public String getC4_P1_2() {
        return C4_P1_2;
    }

    public void setC4_P1_2(String c4_P1_2) {
        C4_P1_2 = c4_P1_2;
    }

    public String getC4_P1_3() {
        return C4_P1_3;
    }

    public void setC4_P1_3(String c4_P1_3) {
        C4_P1_3 = c4_P1_3;
    }

    public String getC4_P1_4() {
        return C4_P1_4;
    }

    public void setC4_P1_4(String c4_P1_4) {
        C4_P1_4 = c4_P1_4;
    }

    public String getC4_P1_5() {
        return C4_P1_5;
    }

    public void setC4_P1_5(String c4_P1_5) {
        C4_P1_5 = c4_P1_5;
    }

    public String getC4_P2_1() {
        return C4_P2_1;
    }

    public void setC4_P2_1(String c4_P2_1) {
        C4_P2_1 = c4_P2_1;
    }

    public String getC4_P2_2() {
        return C4_P2_2;
    }

    public void setC4_P2_2(String c4_P2_2) {
        C4_P2_2 = c4_P2_2;
    }

    public String getC4_P2_3() {
        return C4_P2_3;
    }

    public void setC4_P2_3(String c4_P2_3) {
        C4_P2_3 = c4_P2_3;
    }

    public String getC4_P2_4() {
        return C4_P2_4;
    }

    public void setC4_P2_4(String c4_P2_4) {
        C4_P2_4 = c4_P2_4;
    }

    public String getC4_P2_5() {
        return C4_P2_5;
    }

    public void setC4_P2_5(String c4_P2_5) {
        C4_P2_5 = c4_P2_5;
    }

    public String getC4_P2_6() {
        return C4_P2_6;
    }

    public void setC4_P2_6(String c4_P2_6) {
        C4_P2_6 = c4_P2_6;
    }

    public String getC4_P2_7() {
        return C4_P2_7;
    }

    public void setC4_P2_7(String c4_P2_7) {
        C4_P2_7 = c4_P2_7;
    }

    public String getC4_P2_8() {
        return C4_P2_8;
    }

    public void setC4_P2_8(String c4_P2_8) {
        C4_P2_8 = c4_P2_8;
    }

    public String getC4_P2_9() {
        return C4_P2_9;
    }

    public void setC4_P2_9(String c4_P2_9) {
        C4_P2_9 = c4_P2_9;
    }

    public String getC4_P2_10() {
        return C4_P2_10;
    }

    public void setC4_P2_10(String c4_P2_10) {
        C4_P2_10 = c4_P2_10;
    }

    public String getC4_P2_11() {
        return C4_P2_11;
    }

    public void setC4_P2_11(String c4_P2_11) {
        C4_P2_11 = c4_P2_11;
    }

    public String getC4_P2_12() {
        return C4_P2_12;
    }

    public void setC4_P2_12(String c4_P2_12) {
        C4_P2_12 = c4_P2_12;
    }

    public String getC4_P2_13() {
        return C4_P2_13;
    }

    public void setC4_P2_13(String c4_P2_13) {
        C4_P2_13 = c4_P2_13;
    }

    public String getC4_P2_14() {
        return C4_P2_14;
    }

    public void setC4_P2_14(String c4_P2_14) {
        C4_P2_14 = c4_P2_14;
    }

    public String getC4_P2_15() {
        return C4_P2_15;
    }

    public void setC4_P2_15(String c4_P2_15) {
        C4_P2_15 = c4_P2_15;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.C4_ID,CONTROL4_ID);
        contentValues.put(SQLConstantes.C4_P1_1,C4_P1_1);
        contentValues.put(SQLConstantes.C4_P1_2,C4_P1_2);
        contentValues.put(SQLConstantes.C4_P1_3,C4_P1_3);
        contentValues.put(SQLConstantes.C4_P1_4,C4_P1_4);
        contentValues.put(SQLConstantes.C4_P1_5,C4_P1_5);
        contentValues.put(SQLConstantes.C4_P2_1,C4_P2_1);
        contentValues.put(SQLConstantes.C4_P2_2,C4_P2_2);
        contentValues.put(SQLConstantes.C4_P2_3,C4_P2_3);
        contentValues.put(SQLConstantes.C4_P2_4,C4_P2_4);
        contentValues.put(SQLConstantes.C4_P2_5,C4_P2_5);
        contentValues.put(SQLConstantes.C4_P2_6,C4_P2_6);
        contentValues.put(SQLConstantes.C4_P2_7,C4_P2_7);
        contentValues.put(SQLConstantes.C4_P2_8,C4_P2_8);
        contentValues.put(SQLConstantes.C4_P2_9,C4_P2_9);
        contentValues.put(SQLConstantes.C4_P2_10,C4_P2_10);
        contentValues.put(SQLConstantes.C4_P2_11,C4_P2_11);
        contentValues.put(SQLConstantes.C4_P2_12,C4_P2_12);
        contentValues.put(SQLConstantes.C4_P2_13,C4_P2_13);
        contentValues.put(SQLConstantes.C4_P2_14,C4_P2_14);
        contentValues.put(SQLConstantes.C4_P2_15,C4_P2_15);



        return contentValues;

    }


}
