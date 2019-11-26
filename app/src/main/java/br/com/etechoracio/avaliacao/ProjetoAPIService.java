package br.com.etechoracio.avaliacao;

import android.widget.EditText;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProjetoAPIService {

    @GET(".")
     Call<String> executar(@Query("num1") String num1, @Query("num2") String num2);
}
