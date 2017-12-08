package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control7 {
    private String CONTROL_ID;



    public Control7(){
        CONTROL_ID = "";

    }



    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.C2_ID,CONTROL_ID);

        return contentValues;

    }


}
