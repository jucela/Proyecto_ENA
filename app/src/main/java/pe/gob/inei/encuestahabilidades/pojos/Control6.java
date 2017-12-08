package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control6 {
    private String CONTROL6_ID;



    public Control6(){
        CONTROL6_ID = "";

    }



    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(22);
        contentValues.put(SQLConstantes.C6_ID,CONTROL6_ID);

        return contentValues;

    }


}
