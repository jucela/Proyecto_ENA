package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class EvaluacionFinal {
    private String EVALUACIONFINAL_ID;
    private String EF_P1_1;
    private String EF_P1_2;
    private String EF_P1_3;
    private String EF_P1_4;
    private String EF_P1_5;
    private String EF_P1_6;
    private String EF_P1_7;
    private String EF_P1_8;
    private String EF_P1_9;
    private String EF_P1_10;
    private String EF_P1_11;
    private String EF_P1_12;
    private String EF_P1_13;
    private String EF_P2;
    private String EF_P3_1;
    private String EF_P3_2;
    private String EF_P3_3;
    private String EF_P3_4;
    private String EF_P3_5;



    public EvaluacionFinal(){
        EVALUACIONFINAL_ID = "";
        EF_P1_1 = "";
        EF_P1_2 = "";
        EF_P1_3 = "";
        EF_P1_4 = "";
        EF_P1_5 = "";
        EF_P1_6 = "";
        EF_P1_7 = "";
        EF_P1_8 = "";
        EF_P1_9 = "";
        EF_P1_10 = "";
        EF_P1_11 = "";
        EF_P1_12 = "";
        EF_P1_13 = "";
        EF_P2 = "";
        EF_P3_1 = "";
        EF_P3_2 = "";
        EF_P3_3 = "";
        EF_P3_4 = "";
        EF_P3_5 = "";
    }

    public EvaluacionFinal(String EVALUACIONFINAL_ID, String EF_P1_1, String EF_P1_2, String EF_P1_3, String EF_P1_4, String EF_P1_5, String EF_P1_6, String EF_P1_7, String EF_P1_8, String EF_P1_9, String EF_P1_10, String EF_P1_11, String EF_P1_12, String EF_P1_13, String EF_P2, String EF_P3_1, String EF_P3_2, String EF_P3_3, String EF_P3_4, String EF_P3_5) {
        this.EVALUACIONFINAL_ID = EVALUACIONFINAL_ID;
        this.EF_P1_1 = EF_P1_1;
        this.EF_P1_2 = EF_P1_2;
        this.EF_P1_3 = EF_P1_3;
        this.EF_P1_4 = EF_P1_4;
        this.EF_P1_5 = EF_P1_5;
        this.EF_P1_6 = EF_P1_6;
        this.EF_P1_7 = EF_P1_7;
        this.EF_P1_8 = EF_P1_8;
        this.EF_P1_9 = EF_P1_9;
        this.EF_P1_10 = EF_P1_10;
        this.EF_P1_11 = EF_P1_11;
        this.EF_P1_12 = EF_P1_12;
        this.EF_P1_13 = EF_P1_13;
        this.EF_P2 = EF_P2;
        this.EF_P3_1 = EF_P3_1;
        this.EF_P3_2 = EF_P3_2;
        this.EF_P3_3 = EF_P3_3;
        this.EF_P3_4 = EF_P3_4;
        this.EF_P3_5 = EF_P3_5;
    }

    public String getEVALUACIONFINAL_ID() {
        return EVALUACIONFINAL_ID;
    }

    public void setEVALUACIONFINAL_ID(String EVALUACIONFINAL_ID) {
        this.EVALUACIONFINAL_ID = EVALUACIONFINAL_ID;
    }

    public String getEF_P1_1() {
        return EF_P1_1;
    }

    public void setEF_P1_1(String EF_P1_1) {
        this.EF_P1_1 = EF_P1_1;
    }

    public String getEF_P1_2() {
        return EF_P1_2;
    }

    public void setEF_P1_2(String EF_P1_2) {
        this.EF_P1_2 = EF_P1_2;
    }

    public String getEF_P1_3() {
        return EF_P1_3;
    }

    public void setEF_P1_3(String EF_P1_3) {
        this.EF_P1_3 = EF_P1_3;
    }

    public String getEF_P1_4() {
        return EF_P1_4;
    }

    public void setEF_P1_4(String EF_P1_4) {
        this.EF_P1_4 = EF_P1_4;
    }

    public String getEF_P1_5() {
        return EF_P1_5;
    }

    public void setEF_P1_5(String EF_P1_5) {
        this.EF_P1_5 = EF_P1_5;
    }

    public String getEF_P1_6() {
        return EF_P1_6;
    }

    public void setEF_P1_6(String EF_P1_6) {
        this.EF_P1_6 = EF_P1_6;
    }

    public String getEF_P1_7() {
        return EF_P1_7;
    }

    public void setEF_P1_7(String EF_P1_7) {
        this.EF_P1_7 = EF_P1_7;
    }

    public String getEF_P1_8() {
        return EF_P1_8;
    }

    public void setEF_P1_8(String EF_P1_8) {
        this.EF_P1_8 = EF_P1_8;
    }

    public String getEF_P1_9() {
        return EF_P1_9;
    }

    public void setEF_P1_9(String EF_P1_9) {
        this.EF_P1_9 = EF_P1_9;
    }

    public String getEF_P1_10() {
        return EF_P1_10;
    }

    public void setEF_P1_10(String EF_P1_10) {
        this.EF_P1_10 = EF_P1_10;
    }

    public String getEF_P1_11() {
        return EF_P1_11;
    }

    public void setEF_P1_11(String EF_P1_11) {
        this.EF_P1_11 = EF_P1_11;
    }

    public String getEF_P1_12() {
        return EF_P1_12;
    }

    public void setEF_P1_12(String EF_P1_12) {
        this.EF_P1_12 = EF_P1_12;
    }

    public String getEF_P1_13() {
        return EF_P1_13;
    }

    public void setEF_P1_13(String EF_P1_13) {
        this.EF_P1_13 = EF_P1_13;
    }

    public String getEF_P2() {
        return EF_P2;
    }

    public void setEF_P2(String EF_P2) {
        this.EF_P2 = EF_P2;
    }

    public String getEF_P3_1() {
        return EF_P3_1;
    }

    public void setEF_P3_1(String EF_P3_1) {
        this.EF_P3_1 = EF_P3_1;
    }

    public String getEF_P3_2() {
        return EF_P3_2;
    }

    public void setEF_P3_2(String EF_P3_2) {
        this.EF_P3_2 = EF_P3_2;
    }

    public String getEF_P3_3() {
        return EF_P3_3;
    }

    public void setEF_P3_3(String EF_P3_3) {
        this.EF_P3_3 = EF_P3_3;
    }

    public String getEF_P3_4() {
        return EF_P3_4;
    }

    public void setEF_P3_4(String EF_P3_4) {
        this.EF_P3_4 = EF_P3_4;
    }

    public String getEF_P3_5() {
        return EF_P3_5;
    }

    public void setEF_P3_5(String EF_P3_5) {
        this.EF_P3_5 = EF_P3_5;
    }

    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.EF_ID,EVALUACIONFINAL_ID);
        contentValues.put(SQLConstantes.EF_P1_1,EF_P1_1);
        contentValues.put(SQLConstantes.EF_P1_2,EF_P1_2);
        contentValues.put(SQLConstantes.EF_P1_3,EF_P1_3);
        contentValues.put(SQLConstantes.EF_P1_4,EF_P1_4);
        contentValues.put(SQLConstantes.EF_P1_5,EF_P1_5);
        contentValues.put(SQLConstantes.EF_P1_6,EF_P1_6);
        contentValues.put(SQLConstantes.EF_P1_7,EF_P1_7);
        contentValues.put(SQLConstantes.EF_P1_8,EF_P1_8);
        contentValues.put(SQLConstantes.EF_P1_9,EF_P1_9);
        contentValues.put(SQLConstantes.EF_P1_10,EF_P1_10);
        contentValues.put(SQLConstantes.EF_P1_11,EF_P1_11);
        contentValues.put(SQLConstantes.EF_P1_12,EF_P1_12);
        contentValues.put(SQLConstantes.EF_P1_13,EF_P1_13);
        contentValues.put(SQLConstantes.EF_P2,EF_P2);
        contentValues.put(SQLConstantes.EF_P3_1,EF_P3_1);
        contentValues.put(SQLConstantes.EF_P3_2,EF_P3_2);
        contentValues.put(SQLConstantes.EF_P3_3,EF_P3_3);
        contentValues.put(SQLConstantes.EF_P3_4,EF_P3_4);
        contentValues.put(SQLConstantes.EF_P3_5,EF_P3_5);
        return contentValues;

    }


}
