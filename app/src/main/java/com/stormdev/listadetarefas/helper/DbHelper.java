package com.stormdev.listadetarefas.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public static int VERSION = 1;
    public static String NOME_DB = "DB_TAREFAS";
    public static String TABELA_TAREFAS = "tarefas";
    public DbHelper(Context context) {
        super(context, NOME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA_TAREFAS +
                " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " nome NOT NULL ); ";

        try{

            db.execSQL(sql
            );
            Log.i("INFO DB", "sucesso ao criar a tabela" );

        }catch (Exception e){
            Log.i("INFO DB", "Error ao criar a tabela" + e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        /**
         * ATUALIZAR TABELAS
        String sql = " ALTER TABLE " + TABELA_TAREFAS + " ADD COLUMN status VARCHAR(1) "  ;

         */

        /**
         * APAGANDO TABELAS
         */
        String sql = " DROP TABLE IF EXISTS " +TABELA_TAREFAS +" ;";
        try{

            db.execSQL(sql
            );
            onCreate(db);
            Log.i("INFO DB", "sucesso ao atualizar APP" );

        }catch (Exception e){
            Log.i("INFO DB", "Error ao atualizar APP" + e.getMessage());
        }

    }
}
