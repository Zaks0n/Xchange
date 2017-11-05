package com.zaksontech.www.xchange.data.remote;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ExchangeService {
    @GET("price")
    Single<ResponseBody> getExchangeRate(@Query("fsym") String cryptoCurrency,
                                         @Query("tsyms") String exchangeCurrency);
}
