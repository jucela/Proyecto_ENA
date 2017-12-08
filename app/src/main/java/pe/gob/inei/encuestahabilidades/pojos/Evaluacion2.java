package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Evaluacion2 {
    private String EVALUACION_ID;



    public Evaluacion2(){
        EVALUACION_ID = "";

    }



    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.EVALUACION_ID,EVALUACION_ID);

        return contentValues;

    }


}
